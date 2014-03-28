/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.klassviz.handlers;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeRoot;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import de.cau.cs.kieler.klassviz.model.classdata.ClassdataFactory;
import de.cau.cs.kieler.klassviz.model.classdata.KField;
import de.cau.cs.kieler.klassviz.model.classdata.KMethod;
import de.cau.cs.kieler.klassviz.model.classdata.KParameterTypeSignature;
import de.cau.cs.kieler.klassviz.model.classdata.KType;
import de.cau.cs.kieler.klassviz.model.classdata.KTypeSelection;
import de.cau.cs.kieler.klighd.ui.DiagramViewManager;

/**
 * This class initiates the classdiagram synthesis. Therefore a selection of
 * classes, fields and methods, that is made via the package or project explorer
 * is transferred to a metamodel. After that is done the selection is saved in
 * the metadata of the plug-in. Then it starts a diagramsynthesis in Xtend.
 * 
 * @author ems
 * 
 */
public class SynthesizeClassDiagramHandler extends AbstractHandler {

	String PLUGIN_ID = "de.cau.cs.kieler.klassviz";
	ClassdataFactory factory = ClassdataFactory.eINSTANCE;

	/**
	 * Initiates the classdiagram synthesis. Therefore a selection of classes,
	 * fields and methods, that is made via the package or project explorer is
	 * transferred to a metamodel. After that is done the selection is saved in
	 * the metadata of the plug-in. Then it starts a diagramsynthesis in Xtend.
	 */
	public Object execute(ExecutionEvent event) throws ExecutionException {

		// Get the Selection
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		IStructuredSelection sSelection = (IStructuredSelection) selection;
		Object[] selectedElements = sSelection.toArray();
		// Instantiate the factory of the metamodel.
		ClassdataFactory factory = ClassdataFactory.eINSTANCE;
		// Create a ClassDataSelection based on the metamodel with the factory.
		KTypeSelection classDataSelection = factory
				.createKTypeSelection();
		// This index is needed to check if only the class-file/compilation unit
		// of a class is selected or the containing type or even both.
		int classIndexToBeEdited = 0;
		try {
			// For all selected elements check if its an IJavaElement. If it is
			// so extract the wanted information of the classes.
			for (int i = 0; i < selectedElements.length; i++) {
				if (!(selectedElements[i] instanceof IJavaElement)) {
				} else {
					IJavaElement je = (IJavaElement) selectedElements[i];
					switch (je.getElementType()) {
					case IJavaElement.JAVA_MODEL: // (1)
						// not supported
						break;
					case IJavaElement.JAVA_PROJECT: // (2)
						// TODO: not supported
						break;
					case IJavaElement.PACKAGE_FRAGMENT_ROOT: // (3) (src-Folder)
						// TODO: not supported
						break;
					case IJavaElement.PACKAGE_FRAGMENT: // (4)
						// TODO: not supported
						break;
					case IJavaElement.COMPILATION_UNIT: // (5)
					case IJavaElement.CLASS_FILE: // (6)
						IType typeOfTypeRoot = ((ITypeRoot) je)
								.findPrimaryType();
						// Anonymous classes are not supported yet.
						if (typeOfTypeRoot.isAnonymous()) {
							break;
						}
						if (classDataSelection.getTypes().isEmpty()) {
							// If the list is empty get EType of the IType and
							// add it.
							classDataSelection.getTypes().add(
									createKTypeOfType(typeOfTypeRoot));
						} else {
							// If the list isn't empty we know that the next
							// class must be added. So increment the index and
							// add the next EType.
							classIndexToBeEdited++;
							classDataSelection.getTypes().add(
									createKTypeOfType(typeOfTypeRoot));
						}
						break;
					case IJavaElement.TYPE: // (7)
						IType type = (IType) je;
						// TODO: Anonymous classes are not supported yet.
						if (((IType) je).isAnonymous()) {
							break;
						}
						if (classDataSelection.getTypes().isEmpty()) {
							// If the list is empty get EType of the IType and
							// add it.
							classDataSelection.getTypes().add(
									createKTypeOfType(type));
						} else {
							if (classDataSelection.getTypes()
									.get(classIndexToBeEdited).getType()
									.getFullyQualifiedName()
									.equals(type.getFullyQualifiedName())) {
								// When already added because TypeRoot was
								// selected, do nothing.
							} else {
								// If the list isn't empty we know that the next
								// class must be added. So increment the index
								// and
								// add the next EType.
								classIndexToBeEdited++;
								classDataSelection.getTypes().add(
										createKTypeOfType(type));
							}
						}
						break;
					case IJavaElement.FIELD: // (8)
						// For each selected field set the selected-boolean of
						// the model 'true'.
						for (int j = 0; j < classDataSelection.getTypes()
								.size(); j++) {
							// Find the class that contains this field.
							if (((IType) (((IField) je).getParent()))
									.getFullyQualifiedName().equals(
											classDataSelection.getTypes()
													.get(j)
													.getQualifiedName())) {
								// Get the index of the field 
								// where it is in the model.
								int indexOfFieldInType = Arrays.asList(
										((IType) je.getParent()).getFields())
										.indexOf(je);
								// Set it's boolean 'true'.
								classDataSelection.getTypes().get(j)
										.getFields().get(indexOfFieldInType)
										.setSelected(true);
							}
						}
						break;
					case IJavaElement.METHOD: // (9)
						// For each selected method set the selected-boolean of
						// the model 'true'.
						for (int j = 0; j < classDataSelection.getTypes()
								.size(); j++) {
							// Find the class that contains this method.
							if (((IType) (((IMethod) je).getParent()))
									.getFullyQualifiedName().equals(
											classDataSelection.getTypes()
													.get(j)
													.getQualifiedName())) {
								// Get the index of the method 
								// where it is in the model.
								int indexOfMethodInType = Arrays.asList(
										((IType) je.getParent()).getMethods())
										.indexOf(je);
								// Set it's boolean 'true'.
								classDataSelection.getTypes().get(j)
										.getMethods().get(indexOfMethodInType)
										.setSelected(true);
							}
						}
						break;
					case IJavaElement.INITIALIZER: // (10)
						// not supported
						break;
					case IJavaElement.PACKAGE_DECLARATION: // (11)
						// not supported
						break;
					case IJavaElement.IMPORT_CONTAINER: // (12)
						// not supported
						break;
					case IJavaElement.IMPORT_DECLARATION: // (13)
						// not supported
						break;
					case IJavaElement.LOCAL_VARIABLE: // (14)
						// not supported
						break;
					case IJavaElement.TYPE_PARAMETER: // (15)
						// not supported
						break;
					case IJavaElement.ANNOTATION: // (16)
						// not supported
						break;
					default:
						break;
					}
				}
			}
		} catch (JavaModelException e) {
			System.out.println(e.getStackTrace());
		}

		// When the List is still empty, there was no IJavaElement in the
		// Selection and nothing can be visualized.
		if (classDataSelection.getTypes().isEmpty()) {
			System.out.println("No valid Selection!");
			return null;
		}

		// Save the selection that will be visualized.
		saveSelection(classDataSelection);
		// Start synthesis with Xtend and visualize with KlighD.
		DiagramViewManager
				.getInstance()
				.createView(
						"de.cau.cs.kieler.klassviz.ClassDataDiagramSynthesis",
						classDataSelection.getTypes().get(0).getType()
								.getJavaProject().getElementName(),
						classDataSelection, null);
		System.out.println("Visualization completed!");

		return null;
	}

	/**
	 * Extracts all needed information of the selected type including its fields
	 * and methods. Initially sets the selected-boolean of methods and
	 * attributes 'false'.
	 * 
	 * @param type
	 *            the selected type
	 * @return
	 * @throws JavaModelException
	 */
	private KType createKTypeOfType(IType type) throws JavaModelException {
		// Extract type-data needed for the metamodel.
		KType eType = factory.createKType();
		eType.setType(type);
		eType.setQualifiedName(type.getFullyQualifiedName());
		// Extract field-data needed for the metamodel, but initially set the
		// selected-boolean 'false'.
		for (int j = 0; j < type.getFields().length; j++) {
			KField field = factory.createKField();
			field.setField(type.getFields()[j]);
			field.setName(type.getFields()[j].getElementName());
			field.setSelected(false);
			eType.getFields().add(field);
		}
		// Extract method-data needed for the metamodel, but initially set the
		// selected-boolean 'false'.
		for (int j = 0; j < type.getMethods().length; j++) {
			KMethod method = factory.createKMethod();
			method.setMethod(type.getMethods()[j]);
			method.setName(type.getMethods()[j].getElementName());
			for (int k = 0; k < type.getMethods()[j].getParameterTypes().length; k++) {
				KParameterTypeSignature signature = factory
						.createKParameterTypeSignature();
				signature.setName(type.getMethods()[j].getParameterTypes()[k]);
				method.getParameterTypeSignatures().add(signature);
			}
			method.setSelected(false);
			eType.getMethods().add(method);
		}
		return eType;
	}

	/**
	 * Save the selection in the plug-ins folder of the projects that has an selected element.
	 * @param classDataSelection
	 */
	private void saveSelection(KTypeSelection classDataSelection) {
		HashSet<IJavaProject> projects = new HashSet<IJavaProject>();
		for (int i = 0; i < classDataSelection.getTypes().size(); i++) {
			KType type = classDataSelection.getTypes().get(i);
			projects.add(type.getType().getJavaProject());
		}
		// Create a resource set.
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		// this tells EMF to use XML to save the model
		resourceSet
				.getResourceFactoryRegistry()
				.getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new XMIResourceFactoryImpl());
		// Get the URI of the model file.
		for (IJavaProject javaProject : projects) {
			System.out.println(javaProject.getPath());
			// Path is: /metadata of the plugin/javaproject/selection.xmi
			URI platformURI = URI.createURI("platform:/meta/" + PLUGIN_ID
					+ javaProject.getPath() + "/selection.xmi");

			System.out.println(platformURI);

			// Create a resource for this file.
			Resource resource = resourceSet.createResource(platformURI);

			// Add the model objects to the contents.
			resource.getContents().add(classDataSelection);

			// Save the contents of the resource to the file system.
			try {
				resource.save(Collections.EMPTY_MAP);
			} catch (IOException e) {
				/* error handling */
			}
		}
	}
}
