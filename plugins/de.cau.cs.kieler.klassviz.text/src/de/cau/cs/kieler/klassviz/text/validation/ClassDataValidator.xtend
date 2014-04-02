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
package de.cau.cs.kieler.klassviz.text.validation

import com.google.inject.Inject
import de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage
import de.cau.cs.kieler.klassviz.model.classdata.KClassModel
import de.cau.cs.kieler.klassviz.model.classdata.KField
import de.cau.cs.kieler.klassviz.model.classdata.KMethod
import de.cau.cs.kieler.klassviz.model.classdata.KType
import de.cau.cs.kieler.klassviz.synthesis.ClassDataExtensions
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.CoreException
import org.eclipse.jdt.core.JavaCore
import org.eclipse.jdt.core.Signature
import org.eclipse.xtext.validation.Check
import de.cau.cs.kieler.klassviz.model.classdata.KPackage

/**
 * Custom validation rules. 
 *
 * @see http://www.eclipse.org/Xtext/documentation.html#validation
 * @author msp
 */
class ClassDataValidator extends AbstractClassDataValidator {
    
    @Inject
    extension ClassDataExtensions
    
    /**
     * Check whether the projects exists in the workspace and they have the Java nature.
     */
     @Check
     def checkProjectsExist(KClassModel classModel) {
         var i = 0
         while (i < classModel.javaProjects.size) {
             val projectName = classModel.javaProjects.get(i)
             if (projectName != null) {
                 val project = ResourcesPlugin.workspace.root.getProject(projectName)
                 try {
                     if (!project.open) {
                         error("Project does not exist or is closed",
                              classModel, ClassdataPackage.eINSTANCE.KClassModel_JavaProjects, i)
                     } else if (!project.hasNature(JavaCore.NATURE_ID)) {
                         error("Project is not a Java project",
                              classModel, ClassdataPackage.eINSTANCE.KClassModel_JavaProjects, i)
                     }
                 } catch (CoreException e) {
                     error("Error while checking project nature: " + e.status.message,
                          classModel, ClassdataPackage.eINSTANCE.KClassModel_JavaProjects, i)                 
                 }
             }
             i = i + 1
         }
     }

    /**
     * Check whether a type exists in one of the referenced projects and bundles.
     */
    @Check
    def checkTypeExists(KType type) {
        val pack = type.eContainer as KPackage
        val classModel = pack.eContainer as KClassModel
        if (classModel.getJdtType(type) == null) {
            error("Type not found in referenced projects and bundles",
                type, ClassdataPackage.eINSTANCE.KType_Name)
        }
    }
    
    /**
     * Check whether a field exists in its containing type.
     */
    @Check
    def checkFieldExists(KField field) {
        val type = field.eContainer as KType
        val pack = type.eContainer as KPackage
        val classModel = pack.eContainer as KClassModel
        val jdtType = classModel.getJdtType(type)
        if (jdtType != null) {
            if (!jdtType.fields.exists[it.elementName == field.name]) {
                error("Field not found in referenced type",
                    field, ClassdataPackage.eINSTANCE.KMember_Name)
            }
        }
    }
    
    /**
     * Check whether a method exists in its containing type.
     */
    @Check
    def checkMethodExists(KMethod method) {
        val type = method.eContainer as KType
        val pack = type.eContainer as KPackage
        val classModel = pack.eContainer as KClassModel
        val jdtType = classModel.getJdtType(type)
        if (jdtType != null) {
            val matchingName = jdtType.methods.filter[it.elementName == method.name]
            if (matchingName.empty) {
                error("Method not found in referenced type",
                    method, ClassdataPackage.eINSTANCE.KMember_Name)
            } else {
                val paramTypeSign = method.parameters.map[s | s.signature]
                if (!matchingName.exists[it.parameterTypes.map[t | Signature.toString(t)]
                        .equals(paramTypeSign)]) {
                    error("Method signature does not match any method of the referenced type",
                        method, ClassdataPackage.eINSTANCE.KMethod_Parameters)
                }
            }
        }
    }

}
