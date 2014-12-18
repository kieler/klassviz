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
package de.cau.cs.kieler.klassviz.text.validation

import com.google.inject.Inject
import com.google.inject.name.Named
import de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage
import de.cau.cs.kieler.klassviz.model.classdata.KClassModel
import de.cau.cs.kieler.klassviz.model.classdata.KField
import de.cau.cs.kieler.klassviz.model.classdata.KMethod
import de.cau.cs.kieler.klassviz.model.classdata.KPackage
import de.cau.cs.kieler.klassviz.model.classdata.KType
import de.cau.cs.kieler.klassviz.synthesis.ClassDataExtensions
import de.cau.cs.kieler.klassviz.synthesis.IMetaModelExtensions
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.Platform
import org.eclipse.jdt.core.JavaCore
import org.eclipse.jdt.core.Signature
import org.eclipse.osgi.util.ManifestElement
import org.eclipse.xtext.validation.Check

/**
 * Custom validation rules. 
 *
 * @see http://www.eclipse.org/Xtext/documentation.html#validation
 * @author msp
 */
class ClassDataValidator extends AbstractClassDataValidator {
    
    @Inject extension ClassDataExtensions
    @Named("Xcore")
    @Inject extension IMetaModelExtensions
    
    /**
     * Check whether the projects exists in the workspace and they have the Java nature.
     */
     @Check
     def checkProjectsExist(KClassModel classModel) {
         classModel.javaProjects.forEach[ projectName, i |
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
         ]
     }
     
    /**
     * Check whether the bundles exists in the platform.
     */
    @Check
    def checkBundlesExist(KClassModel classModel) {
        classModel.bundles.forEach[ bundleName, i |
            if (bundleName != null) {
                if (Platform.getBundle(bundleName) == null) {
                    error("Bundle is not available in the current platform",
                        classModel, ClassdataPackage.eINSTANCE.KClassModel_Bundles, i)
                }
            }
        ]
    }
    
    /**
     * Check whether a package exists in one of the referenced projects and bundles.
     */
    @Check
    def checkPackageExists(KPackage pack) {
        val classModel = pack.eContainer as KClassModel

        // first check package is defined in an imported Xcore model
        if (pack.isMetaModelPackage(classModel)) {
            return true
        }
		
        // look for the package in the referenced projects
        for (projectName : classModel.javaProjects) {
             if (projectName.jdtPackages.exists[it.elementName == pack.name]) {
                 return true
             }
         }
         
         // look for the package in the referenced bundles
         for (bundleName : classModel.bundles) {
             val packagesString = Platform.getBundle(bundleName)?.headers?.get("Export-Package")
             if (packagesString != null
                    && ManifestElement.parseHeader("Export-Package", packagesString).exists[
                        it.value.startsWith(pack.name)
                        && (it.value.length == pack.name.length
                            || it.value.charAt(pack.name.length) == 59) // ';' character
                    ]) {
                 return true
             }
         }
         
         error("Package not found in referenced projects and bundles",
             pack, ClassdataPackage.eINSTANCE.KPackage_Name)
    }

    /**
     * Check whether a type exists in one of the referenced projects and bundles.
     */
    @Check
    def checkTypeExists(KType type) {
        val pack = type.eContainer as KPackage
        val classModel = pack.eContainer as KClassModel
        if (classModel.getJdtType(type) == null && classModel.getBundleClass(type) == null &&
			type.getMetaModelType() == null) {

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
        val metaModelType = type.getMetaModelType();
        if (metaModelType != null) {
            if (!field.isMetaModelField) {
                error("Field not found in referenced type " + type.name,
                    field, ClassdataPackage.eINSTANCE.KMember_Name)
            }
        } else if (jdtType != null) {
            if (!jdtType.fields.exists[it.elementName == field.name]) {
                error("Field not found in referenced type",
                    field, ClassdataPackage.eINSTANCE.KMember_Name)
            }
        } else {
            val clazz = classModel.getBundleClass(type)
            if (clazz != null) {
                if (!clazz.fields.exists[it.name == field.name]) {
                    error("Field not found in referenced type",
                        field, ClassdataPackage.eINSTANCE.KMember_Name)
                }
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
        
        if (type.isMetaModelType) {
            if (!method.isMetaModelMethod) {
                error("Method not found in referenced type " + type.name,
                    method, ClassdataPackage.eINSTANCE.KMember_Name)
            }

        } else if (jdtType != null) {
            val matchingName = jdtType.methods.filter[it.elementName == method.name]
            if (matchingName.empty) {
                error("Method not found in referenced type",
                    method, ClassdataPackage.eINSTANCE.KMember_Name)
            } else {
                val paramTypeSign = method.parameters.map[s | s.signature].toList
                if (!matchingName.exists[it.parameterTypes.map[t |
                    Signature.getSimpleName(Signature.toString(Signature.getTypeErasure(t)))
                ].equals(paramTypeSign)]) {
                    error("Method signature does not match any method of the referenced type",
                        method, ClassdataPackage.eINSTANCE.KMethod_Parameters)
                }
            }
        } else {
            val clazz = classModel.getBundleClass(type)
            if (clazz != null) {
                val matchingName = clazz.methods.filter[it.name == method.name]
                if (matchingName.empty) {
                    error("Method not found in referenced type",
                        method, ClassdataPackage.eINSTANCE.KMember_Name)
                } else {
                    val paramTypeSign = method.parameters.map[s | s.signature].toList
                    if (!matchingName.exists[it.parameterTypes.map[t | t.simpleName]
                            .equals(paramTypeSign)]) {
                        error("Method signature does not match any method of the referenced type",
                            method, ClassdataPackage.eINSTANCE.KMethod_Parameters)
                    }
                }
            }
        }
    }

}
