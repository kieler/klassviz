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
import de.cau.cs.kieler.klassviz.model.classdata.KType
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.CoreException
import org.eclipse.jdt.core.JavaCore
import org.eclipse.jdt.core.IMethod
import de.cau.cs.kieler.klassviz.model.classdata.KMethod
import de.cau.cs.kieler.klassviz.model.classdata.KClassModel
import de.cau.cs.kieler.klassviz.model.classdata.KPackage
import org.eclipse.jdt.core.Signature
import org.eclipse.jdt.core.IPackageFragment

/**
 * @author msp
 * 
 * @containsExtensions
 */
class ClassDataExtensions {
    
    /**
     * Build a qualified name for the given type.
     */
    def String getQualifiedName(KType type) {
        val result = new StringBuilder(type.name)
        var container = type.eContainer
        while (!(container instanceof KPackage) && container != null) {
            if (container instanceof KType) {
                result.insert(0, '$')
                result.insert(0, (container as KType).name)
            }
            container = container.eContainer
        }
        if (container instanceof KPackage) {
            result.insert(0, '.')
            result.insert(0, (container as KPackage).name)
        }
        return result.toString
    }
    
    /**
     * Retrieve a JDT type from all referenced projects and bundles.
     */
    def IType getJdtType(KClassModel classModel, KType type) {
        for (projectName : classModel.javaProjects) {
            val result = getJdtType(projectName, type)
            if (result != null) {
                return result
            }
        }
    }
    
    /**
     * Retrieve a JDT type from a Java project.
     */
    def IType getJdtType(String projectName, KType type) {
        val project = ResourcesPlugin.workspace.root.getProject(projectName)
        try {
            if (project.open && project.hasNature(JavaCore.NATURE_ID)) {
                val javaProject = JavaCore.create(project)
                return javaProject.findType(type.qualifiedName)
            }
        } catch (CoreException e) {}
    }
    
    /**
     * Get all packages defined in the Java project with the given name.
     */
    def IPackageFragment[] getJdtPackages(String projectName) {
        val project = ResourcesPlugin.workspace.root.getProject(projectName)
        try {
            if (project.open && project.hasNature(JavaCore.NATURE_ID)) {
                return JavaCore.create(project).packageFragments
            }
        } catch (CoreException e) {}
        return #[]
    }
    
    /**
     * Retrieve a JDT package from a Java project.
     */
    def IPackageFragment getJdtPackage(String projectName, KPackage pack) {
        val project = ResourcesPlugin.workspace.root.getProject(projectName)
        try {
            if (project.open && project.hasNature(JavaCore.NATURE_ID)) {
                val javaProject = JavaCore.create(project)
                return javaProject.packageFragments.findFirst[it.elementName == pack.name]
            }
        } catch (CoreException e) {}
    }
    
    /**
     * Determine whether the signature of the given JDT method equals that of the KMethod.
     */
    def boolean equalSignature(IMethod jdtMethod, KMethod kMethod) {
        if (jdtMethod.elementName != kMethod.name
                || jdtMethod.numberOfParameters != kMethod.parameters.size) {
            return false
        }
        var int i = 0
        while (i < jdtMethod.numberOfParameters) {
            val jdtSignature = Signature.toString(jdtMethod.parameterTypes.get(i))
            val kSignature = kMethod.parameters.get(i).signature
            if (jdtSignature != kSignature && jdtSignature != Signature.getSimpleName(kSignature)) {
                return false
            }
            i = i + 1
        }
        return true
    }
    
}