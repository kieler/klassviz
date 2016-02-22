/*
 * KlassViz - Kieler Class Diagram Visualization
 * 
 * A part of OpenKieler
 * https://github.com/OpenKieler
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
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.statushandlers.StatusManager;

import com.google.inject.Guice;

import de.cau.cs.kieler.klassviz.model.classdata.ClassdataFactory;
import de.cau.cs.kieler.klassviz.model.classdata.KClassModel;
import de.cau.cs.kieler.klassviz.synthesis.JdtModelTransformation;

/**
 * Handler to generate a KlassViz file from selected java packages, classes and/or classmembers.
 * The save location is queried from the user in a save as dialog and the selected items are serialized
 * into a .klaviz file with then can be visualized as a class diagram.
 */
public final class GenerateKlassVizFileHandler extends AbstractHandler {

    static final String PLUGIN_ID = "de.cau.cs.kieler.klassviz";
    final ClassdataFactory factory = ClassdataFactory.eINSTANCE;

    
    /**
     * {@inheritDoc}
     */
    public Object execute(ExecutionEvent event) throws ExecutionException {
        IStructuredSelection selection = (IStructuredSelection) HandlerUtil.getCurrentSelection(event);
        KClassModel classModel = generateClassModel(selection);
        URI fileUri = URI.createPlatformResourceURI(handleWorkspaceBrowse(), true);
        saveclassModel(classModel, fileUri);
        return null;
    }

    /**
     * Generate a {@link KClassModel} from the given selection.
     * 
     * @param selection
     *            the selected java elements to generate the model from.
     * @return the generated model.
     */
    private KClassModel generateClassModel(IStructuredSelection selection) {
        
        // Transform the model
        JdtModelTransformation transformation = Guice.createInjector().getInstance(
                JdtModelTransformation.class);
        KClassModel classModel;
        try {
            classModel = transformation.transform(selection);
        } catch (JavaModelException exception) {
            IStatus status = new Status(IStatus.ERROR, PLUGIN_ID,
                    "Error while transforming Java model.", exception);
            StatusManager.getManager().handle(status, StatusManager.SHOW);
            return null;
        }

        // When the List is still empty, there was no IJavaElement in the
        // Selection and nothing can be serialized.
        if (!classModel.getPackages().isEmpty()) {
            // Save the selection.
            HashSet<IJavaProject> projects = new HashSet<IJavaProject>();
            Iterator<?> selectionIter = selection.iterator();
            while (selectionIter.hasNext()) {
                Object obj = selectionIter.next();
                if (obj instanceof IJavaElement) {
                    projects.add(((IJavaElement) obj).getJavaProject());
                }
            }
            for (IJavaProject project : projects) {
                classModel.getJavaProjects().add(project.getElementName());
            }
        }
        return classModel;
    }

    /**
     * Save the given class model at the given URI.
     * 
     * @param classModel
     *            the classmodel to save.
     * @param fileUri
     *            the URI to save the model to.
     */
    private void saveclassModel(KClassModel classModel, URI fileUri) {
        if (classModel == null || fileUri == null) {
            return;
        }

        // Create a resource set.
        ResourceSet resourceSet = new ResourceSetImpl();
//        ResourceSet testResourceSet = new ResourceSetImpl();
        // Create a resource for this file.
        Resource resource = resourceSet.createResource(fileUri);
//        Resource testResource = testResourceSet.createResource(URI.createFileURI("asdf/model.xmi"));
        // Add the model object to the contents.
        resource.getContents().add(classModel);
//        testResource.getContents().add(classModel);

        // Save the contents of the resource to the file system.
        try {
            resource.save(Collections.EMPTY_MAP);
//            testResource.save(Collections.EMPTY_MAP);
        } catch (IOException exception) {
            IStatus status = new Status(IStatus.ERROR, PLUGIN_ID,
                    "Could not save selection to project meta data.", exception);
            StatusManager.getManager().handle(status);
        }
    }

    /**
     * Query the user for a file path and name.
     * 
     * @return the file URI as a string with extension {@code ".klaviz"}.
     */
    private String handleWorkspaceBrowse() {
        // TODO a better workspace selection dialog would be good, but it seems
        // such a thing does not exist in Eclipse for some reason
        final SaveAsDialog fileDialog =
                new SaveAsDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
        final int status = fileDialog.open();
        if (status == SaveAsDialog.OK) {
            final IPath filePath = fileDialog.getResult();
            return filePath.removeFileExtension().addFileExtension("klaviz").toString();
        } else {
            return null;
        }
    }
}
