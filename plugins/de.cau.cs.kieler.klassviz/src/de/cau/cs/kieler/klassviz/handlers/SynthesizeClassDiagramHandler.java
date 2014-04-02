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
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.statushandlers.StatusManager;

import com.google.inject.Guice;

import de.cau.cs.kieler.klassviz.model.classdata.ClassdataFactory;
import de.cau.cs.kieler.klassviz.model.classdata.KClassModel;
import de.cau.cs.kieler.klassviz.synthesis.JdtModelTransformation;
import de.cau.cs.kieler.klighd.ui.DiagramViewManager;

/**
 * This class initiates the class diagram synthesis. Therefore a selection of classes, fields and
 * methods, that is made via the package or project explorer is transferred to a metamodel. After
 * that is done the selection is saved in the metadata of the plug-in. Then it starts a
 * diagram synthesis in Xtend.
 * 
 * @author ems
 */
public class SynthesizeClassDiagramHandler extends AbstractHandler {

    String PLUGIN_ID = "de.cau.cs.kieler.klassviz";
    ClassdataFactory factory = ClassdataFactory.eINSTANCE;

    /**
     * Initiates the class diagram synthesis. Therefore a selection of classes, fields and methods,
     * that is made via the package or project explorer is transferred to a metamodel. After that is
     * done the selection is saved in the metadata of the plug-in. Then it starts a diagram synthesis
     * in Xtend.
     */
    public Object execute(ExecutionEvent event) throws ExecutionException {

        // Get the Selection
        ISelection selection = HandlerUtil.getCurrentSelection(event);
        IStructuredSelection sSelection = (IStructuredSelection) selection;
        
        // Transform the model
        JdtModelTransformation transformation = Guice.createInjector().getInstance(
                JdtModelTransformation.class);
        KClassModel classModel;
        try {
            classModel = transformation.transform(sSelection);
        } catch (JavaModelException exception) {
            IStatus status = new Status(IStatus.ERROR, PLUGIN_ID,
                    "Error while transforming Java model.", exception);
            StatusManager.getManager().handle(status, StatusManager.SHOW);
            return null;
        }

        // When the List is still empty, there was no IJavaElement in the
        // Selection and nothing can be visualized.
        if (!classModel.getPackages().isEmpty()) {
            
            // Save the selection that will be visualized.
            HashSet<IJavaProject> projects = new HashSet<IJavaProject>();
            Iterator<?> selectionIter = sSelection.iterator();
            while (selectionIter.hasNext()) {
                Object obj = selectionIter.next();
                if (obj instanceof IJavaElement) {
                    projects.add(((IJavaElement) obj).getJavaProject());
                }
            }
            for (IJavaProject project : projects) {
                classModel.getJavaProjects().add(project.getElementName());
            }
            saveSelection(classModel, projects);
            
            // Start synthesis with Xtend and visualize with KlighD.
            String viewTitle = projects.iterator().next().getElementName();
            DiagramViewManager.getInstance().createView(
                    "de.cau.cs.kieler.klassviz.ClassDataDiagramSynthesis",
                    viewTitle, classModel, null);
        }

        return null;
    }

    /**
     * Save the selection in the plug-ins folder of the projects that has an selected element.
     * 
     * @param classModel the class model
     * @param projects the set of projects that have been selected
     */
    private void saveSelection(KClassModel classModel, Set<IJavaProject> projects) {
        // Create a resource set.
        ResourceSet resourceSet = new ResourceSetImpl();

        for (IJavaProject javaProject : projects) {
            // Path is: /metadata of the plugin/javaproject/selection.xmi
            URI platformURI = URI.createURI("platform:/meta/" + PLUGIN_ID + javaProject.getPath()
                    + "/selection.xmi");

            // Create a resource for this file.
            Resource resource = resourceSet.createResource(platformURI);

            // Add the model objects to the contents.
            resource.getContents().add(classModel);

            // Save the contents of the resource to the file system.
            try {
                resource.save(Collections.EMPTY_MAP);
            } catch (IOException exception) {
                IStatus status = new Status(IStatus.ERROR, PLUGIN_ID,
                        "Could not save selection to project metadata.", exception);
                StatusManager.getManager().handle(status);
            }
        }
    }
}
