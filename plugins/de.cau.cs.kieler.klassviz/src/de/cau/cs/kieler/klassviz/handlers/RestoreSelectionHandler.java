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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.statushandlers.StatusManager;

import de.cau.cs.kieler.klassviz.model.classdata.KClassModel;
import de.cau.cs.kieler.klassviz.model.classdata.KField;
import de.cau.cs.kieler.klassviz.model.classdata.KMethod;
import de.cau.cs.kieler.klassviz.model.classdata.KPackage;
import de.cau.cs.kieler.klassviz.model.classdata.KType;
import de.cau.cs.kieler.klassviz.model.classdata.KTypeReference;
import de.cau.cs.kieler.klighd.ui.DiagramViewManager;

/**
 * This class checks which element is selected to restore the selection of the java-project that
 * contains this element. The data is taken from the XMI-file referred to this project. After that
 * it also starts a diagramsynthesis in Xtend.
 * 
 * @author ems
 * 
 */
public class RestoreSelectionHandler extends AbstractHandler {

    String PLUGIN_ID = "de.cau.cs.kieler.klassviz";

    public Object execute(ExecutionEvent event) throws ExecutionException {
        // Get the Java-Project of the first item in the selection.
        ISelection selection = HandlerUtil.getCurrentSelection(event);
        IStructuredSelection sSelection = (IStructuredSelection) selection;
        Object[] selectedElements = sSelection.toArray();
        IPath projectPath = null;
        IJavaProject javaProject = null;
        if (selectedElements[0] instanceof IProject) {
            IProject project = ((IProject) selectedElements[0]);
            projectPath = project.getFullPath();
            try {
                if (project.hasNature(JavaCore.NATURE_ID)) {
                    javaProject = JavaCore.create(project);
                }
            } catch (CoreException e) {
                e.printStackTrace();
            }
        }
        if (selectedElements[0] instanceof IJavaElement) {
            projectPath = ((IJavaElement) selectedElements[0]).getJavaProject().getPath();
            javaProject = ((IJavaElement) selectedElements[0]).getJavaProject();
        }
        if (projectPath == null) {
            return null;
        }
        // Load the classdata of the URI referred to the project.
        ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
                .put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
        URI platformURI = URI.createURI("platform:/meta/" + PLUGIN_ID + projectPath
                + "/selection.xmi");
        Resource resource = resourceSet.getResource(platformURI, true);
        EObject modelObject = resource.getContents().get(0);
        if (modelObject instanceof KClassModel) {
            KClassModel classDataSelection = (KClassModel) modelObject;
            List<Object> toBeSelectedElements = new ArrayList<Object>();
            try {
                // Restore the full data of the previously selected types,
                // including their fields and methods in the model. Also add the
                // the previously selected types, fields and methods to
                // 'toBeSelectedElements'.
                for (KPackage kPackage : classDataSelection.getPackages()) {
                    for (KType kType : kPackage.getTypes()) {
                        if (kType.isSelected()) {
                            IType jdtType = javaProject.findType(getQualifiedName(kType));
                            if (jdtType != null) {
                                toBeSelectedElements.add(jdtType);
                                for (KField kField : kType.getFields()) {
                                    // If field was previously selected add it to
                                    // 'toBeSelectedElements'.
                                    if (kField.isSelected()) {
                                        toBeSelectedElements.add(jdtType.getField(kField.getName()));
                                    }
                                }
                                for (KMethod kMethod : kType.getMethods()) {
                                    // Get method based on name and parametertypes.
                                    // If method was previously selected add it to
                                    // 'toBeSelectedElements'.
                                    if (kMethod.isSelected()) {
                                        toBeSelectedElements.add(jdtType.getMethod(kMethod.getName(),
                                                getMethodParameters(kMethod)));
                                    }
                                }
                            }
                        }
                    }
                }
                ISelection newSelection = new StructuredSelection(toBeSelectedElements.toArray());

                // restore the selection respectively which view is focused
                // right now (package explorer or project explorer)
                IWorkbenchPage wbp = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                        .getActivePage();
                String id = wbp.getActivePartReference().getId();

                IViewPart view = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                        .getActivePage().showView(id);

                view.getSite().getSelectionProvider().setSelection(newSelection);

                // Start the synthesis with Xtend and visualize with KlighD.
                DiagramViewManager.getInstance().createView(
                        "de.cau.cs.kieler.klassviz.ClassDataDiagramSynthesis",
                        javaProject.getElementName(), classDataSelection, null);
            } catch (JavaModelException exception) {
                IStatus status = new Status(IStatus.ERROR, PLUGIN_ID,
                        "Error while restoring previous selection.", exception);
                StatusManager.getManager().handle(status, StatusManager.SHOW);
            } catch (PartInitException exception) {
                IStatus status = new Status(IStatus.ERROR, PLUGIN_ID,
                        "Error while activating view.", exception);
                StatusManager.getManager().handle(status, StatusManager.SHOW);
                return null;
            }
        }

        return null;
    }

    /**
     * Get all method parameters based on the fully qualified name of the type of each parameter. So
     * the method can be unmistakely identified.
     * 
     * @param eMethod a method
     * @return an array of parameter type signatures
     */
    private String[] getMethodParameters(KMethod eMethod) {
        List<String> parameterSignatureTypes = new ArrayList<String>();
        for (KTypeReference typeReference : eMethod.getParameters()) {
            parameterSignatureTypes.add(Signature.createTypeSignature(
                    Signature.getSimpleName(typeReference.getSignature()), false));
        }
        return parameterSignatureTypes.toArray(new String[0]);
    }
    
    /**
     * Create a qualified name for the given type.
     * 
     * @param type a type
     * @return a qualified name for the type
     */
    private String getQualifiedName(KType type) {
        StringBuilder result = new StringBuilder(type.getName());
        EObject container = type.eContainer();
        while (!(container instanceof KPackage) && container != null) {
            if (container instanceof KType) {
                result.insert(0, '$');
                result.insert(0, ((KType) container).getName());
            }
            container = container.eContainer();
        }
        if (container instanceof KPackage) {
            result.insert(0, '.');
            result.insert(0, ((KPackage) container).getName());
        }
        return result.toString();
    }

}
