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

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jdt.core.JavaCore;

/**
 * A property tester that checks whether a selection has been stored in the project.
 * 
 * @author msp
 */
public class ContainsStoredSelectionTester extends PropertyTester {

    /**
     * {@inheritDoc}
     */
    public boolean test(Object receiver, String property, Object[] args, Object expectedValue) {
        if (receiver instanceof IProject) {
            IProject project = (IProject) receiver;
            try {
                if (project.hasNature(JavaCore.NATURE_ID)) {
                    IPath projectPath = project.getFullPath();
                    ResourceSet resourceSet = new ResourceSetImpl();
                    URI platformURI = RestoreSelectionHandler.getStoredSelectionURI(projectPath);
                    try {
                        resourceSet.getResource(platformURI, true);
                        return true;
                    } catch (RuntimeException exception) {
                        // ignore exception and fail the test
                    }
                }
            } catch (CoreException exception) {
                // ignore exception and fail the test
            }
        }
        return false;
    }

}
