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
package de.cau.cs.kieler.klassviz.synthesis

import org.eclipse.jdt.core.IType
import de.cau.cs.kieler.klassviz.model.classdata.KTypeSelection
import de.cau.cs.kieler.klassviz.model.classdata.KType
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.CoreException
import org.eclipse.jdt.core.JavaCore

/**
 * @author msp
 * 
 * @containsExtensions
 */
class ClassDataExtensions {
    
    /**
     * Retrieve a JDT type from all referenced projects and bundles.
     */
    def IType getJdtType(KTypeSelection data, KType type) {
        for (projectName : data.javaProjects) {
            val result = getJdtType(projectName, type)
            if (result != null) {
                return result
            }
        }
    }
    
    /**
     * Retrieve a JDT type from a Java project.
     */
    def private IType getJdtType(String projectName, KType type) {
        val project = ResourcesPlugin.workspace.root.getProject(projectName)
        try {
            if (project.open && project.hasNature(JavaCore.NATURE_ID)) {
                val javaProject = JavaCore.create(project)
                val result = javaProject.findType(type.qualifiedName)
                if (result != null) {
                    return result
                }
            }
        } catch (CoreException e) {}
    }
    
}