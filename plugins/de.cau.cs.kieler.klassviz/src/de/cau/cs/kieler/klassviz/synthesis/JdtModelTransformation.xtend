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
package de.cau.cs.kieler.klassviz.synthesis

import com.google.inject.Inject
import de.cau.cs.kieler.klassviz.model.classdata.ClassdataFactory
import de.cau.cs.kieler.klassviz.model.classdata.KClass
import de.cau.cs.kieler.klassviz.model.classdata.KClassModel
import de.cau.cs.kieler.klassviz.model.classdata.KField
import de.cau.cs.kieler.klassviz.model.classdata.KInterface
import de.cau.cs.kieler.klassviz.model.classdata.KMethod
import de.cau.cs.kieler.klassviz.model.classdata.KType
import de.cau.cs.kieler.klassviz.model.classdata.KTypeReference
import de.cau.cs.kieler.klassviz.model.classdata.KVisibility
import java.util.HashSet
import java.util.LinkedHashMap
import java.util.LinkedList
import java.util.Set
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.jdt.core.Flags
import org.eclipse.jdt.core.IField
import org.eclipse.jdt.core.IJavaElement
import org.eclipse.jdt.core.IJavaProject
import org.eclipse.jdt.core.IMethod
import org.eclipse.jdt.core.IType
import org.eclipse.jdt.core.ITypeRoot
import org.eclipse.jdt.core.JavaCore
import org.eclipse.jdt.core.JavaModelException
import org.eclipse.jdt.core.Signature
import org.eclipse.jface.viewers.IStructuredSelection
import org.eclipse.jdt.core.IPackageFragment

/**
 * Transformation class between the JDT model and our own class model.
 */
final class JdtModelTransformation {
    
    @Inject extension ClassDataExtensions

    /** The types contained in the current selection. */
    private final Set<IType> selectedTypes = new HashSet<IType>
    
    /**
     * Transform a selection of JDT elements to a class model instance.
     */
    def KClassModel transform(IStructuredSelection selection) throws JavaModelException {
        val selectedElements = selection.toArray()
        
        // Gather all types in the current selection.
        selectedTypes.clear
        selectedTypes += selectedElements.filter(IType)
        selectedTypes += selectedElements.filter(ITypeRoot).map[it.findPrimaryType]
        selectedTypes += selectedElements.filter(IPackageFragment).map[ pf |
            pf.classFiles.map(cf | cf.findPrimaryType)
                + pf.compilationUnits.map[cu | cu.findPrimaryType]
        ].flatten
        
        // Create a class model instance based on the metamodel with the factory.
        val classModel = ClassdataFactory.eINSTANCE.createKClassModel()
        
        // For each selected element, check if it's an IJavaElement. If it is
        // so extract the wanted information of the classes.
        selectedElements.forEach[ e |
            if (e instanceof IJavaElement) {
                val je = e as IJavaElement
                switch (je.getElementType()) {
                    case IJavaElement::PACKAGE_FRAGMENT: {
                        val pf = je as IPackageFragment
                        pf.classFiles.forEach[cf |
                            createType((cf as ITypeRoot).findPrimaryType(), classModel).selected = true
                        ]
                        pf.compilationUnits.forEach[ cu |
                            createType((cu as ITypeRoot).findPrimaryType(), classModel).selected = true
                        ]
                    }
                    case IJavaElement::COMPILATION_UNIT: {
                        createType((je as ITypeRoot).findPrimaryType(), classModel).selected = true
                    }
                    case IJavaElement::CLASS_FILE: {
                        createType((je as ITypeRoot).findPrimaryType(), classModel).selected = true
                    }
                    case IJavaElement::TYPE: {
                        createType(je as IType, classModel).selected = true
                    }
                    case IJavaElement::FIELD: {
                        findField(je as IField, classModel)?.setSelected(true)
                    }
                    case IJavaElement::METHOD: {
                        findMethod(je as IMethod, classModel)?.setSelected(true)
                    }
                }
            }
        ]
        
        // This flag tells the diagram synthesis not to resolve any types, since we have done it here.
        classModel.resolved = true
        return classModel
    }
    
    /**
     * Resolve all types in the given class model that refer to Java projects.
     */
    def resolve(KClassModel classModel) throws JavaModelException {
        // Gather the Java projects declared in the class model
        val projects = new LinkedList<IJavaProject>
        for (projectName : classModel.javaProjects) {
            val project = ResourcesPlugin.workspace.root.getProject(projectName)
            try {
                if (project.open && project.hasNature(JavaCore.NATURE_ID)) {
                    projects += JavaCore.create(project)
                }
            } catch (CoreException e) {}
        }
        
        // Gather the selected types
        val typeMap = new LinkedHashMap<IType, KType>
        for (pack : classModel.packages) {
            for (kType : pack.types) {
                val jdtType = projects.map[it.findType(kType.qualifiedName)].findFirst[it != null]
                if (jdtType != null) {
                    typeMap.put(jdtType, kType)
                }
            }
        }
        
        val typeFunc = [ IType type |
                if (typeMap.containsKey(type))
                    typeMap.get(type)
                else
                    typeMap.entrySet.findFirst[it.key.fullyQualifiedName == type.fullyQualifiedName]?.value
            ]
        val typeNameFunc = [ String name |
                typeMap.entrySet.findFirst[it.key.elementName == name || it.key.fullyQualifiedName == name]?.value
            ]
        
        for (entry : typeMap.entrySet) {
            val jdtType = entry.key
            val kType = entry.value
            kType.selected = true
            
            // Extract type data
            extractTypeData(kType, jdtType, typeFunc, typeNameFunc)
        
            // Extract field data.
            for (jdtField : jdtType.fields) {
                var kField = kType.fields.findFirst[f | f.name == jdtField.elementName]
                if (kField == null) {
                    kField = ClassdataFactory.eINSTANCE.createKField()
                    kField.name = jdtField.elementName
                    kType.fields += kField
                } else {
                    kField.selected = true
                }
                extractFieldData(kField, jdtField, jdtType, typeNameFunc)
            }
            
            // Extract method data.
            for (jdtMethod : jdtType.methods) {
                var kMethod = kType.methods.findFirst[m | jdtMethod.equalSignature(m)]
                if (kMethod == null) {
                    kMethod = ClassdataFactory.eINSTANCE.createKMethod()
                    kMethod.name = jdtMethod.elementName
                    kType.methods += kMethod
                    for (jdtparam : jdtMethod.parameters) {
                        kMethod.parameters += ClassdataFactory.eINSTANCE.createKTypeReference => [ tr |
                            tr.name = jdtparam.elementName
                            tr.signature = Signature.toString(jdtparam.typeSignature)
                            jdtType.resolveReference(tr, typeNameFunc)
                        ]
                    }
                } else {
                    kMethod.selected = true
                    kMethod.parameters.forEach[ kparam, i |
                        val jdtparam = jdtMethod.parameters.get(i)
                        kparam.name = jdtparam.elementName
                        kparam.signature = Signature.toString(jdtparam.typeSignature)
                        jdtType.resolveReference(kparam, typeNameFunc)
                    ]
                }
                extractMethodData(kMethod, jdtMethod, jdtType, typeNameFunc)
            }
        }
        
        return classModel
    }
    
    /**
     * Create a class model type for the given JDT type and extract the contained information.
     */
    def private create kType : handleType(jdtType)
            createType(IType jdtType, KClassModel classModel) {

        // Anonymous classes are not supported yet.
        if (kType == null || jdtType.anonymous) {
            return
        }
        
        // Extract package data.
        val packageName = jdtType.packageFragment.elementName
        var kPackage = classModel.packages.findFirst[p | p.name == packageName]
        if (kPackage == null) {
            kPackage = ClassdataFactory.eINSTANCE.createKPackage()
            kPackage.name = packageName
            classModel.packages += kPackage
        }
        
        val typeFunc = [ IType type |
                selectedTypes.findFirst[it == type || it.fullyQualifiedName == type.fullyQualifiedName]
                        ?.createType(classModel)
            ]
        val typeNameFunc = [ String name |
                selectedTypes.findFirst[it.elementName == name || it.fullyQualifiedName == name]?.createType(classModel)
            ]
        
        // Extract type data.
        kPackage.types += kType
        kType.name = jdtType.elementName;
        extractTypeData(kType, jdtType, typeFunc, typeNameFunc)
        
        // Extract field data.
        for (jdtField : jdtType.fields) {
            val kField = ClassdataFactory.eINSTANCE.createKField()
            kField.name = jdtField.elementName
            extractFieldData(kField, jdtField, jdtType, typeNameFunc)
            kType.fields += kField
        }
        
        // Extract method data.
        for (jdtMethod : jdtType.methods) {
            val kMethod = ClassdataFactory.eINSTANCE.createKMethod()
            kMethod.name = jdtMethod.elementName
            for (param : jdtMethod.parameters) {
                kMethod.parameters += ClassdataFactory.eINSTANCE.createKTypeReference => [ tr |
                    tr.name = param.elementName
                    tr.signature = Signature.toString(param.typeSignature)
                    jdtType.resolveReference(tr, typeNameFunc)
                ]
            }
            extractMethodData(kMethod, jdtMethod, jdtType, typeNameFunc)
            kType.methods += kMethod
        }
    }
    
    /**
     * Create a class model type instance according to the given JDT type.
     */
    def private KType handleType(IType jdtType) {
        if (jdtType.isClass()) {
            ClassdataFactory.eINSTANCE.createKClass()
        } else if (jdtType.interface) {
            ClassdataFactory.eINSTANCE.createKInterface()
        } else if (jdtType.enum) {
            ClassdataFactory.eINSTANCE.createKEnum()
        }
    }
    
    /**
     * Find a field in the class model that corresponds to the given JDT field.
     */
    def private KField findField(IField jdtField, KClassModel classModel) {
        // For each selected field set the selected-boolean of the model to 'true'.
        val jdtType = jdtField.declaringType
        val packageName = jdtType.packageFragment.elementName
        classModel.packages.findFirst[p | p.name == packageName]
            ?.types?.findFirst[t | t.name == jdtType.elementName]
            ?.fields?.findFirst[f | f.name == jdtField.elementName]
    }

    /**
     * Find a method in the class model that corresponds to the given JDT method
     * and set its 'selected' status to true.
     */
    def private KMethod findMethod(IMethod jdtMethod, KClassModel classModel) {
        val jdtType = jdtMethod.declaringType
        val packageName = jdtType.packageFragment.elementName
        classModel.packages.findFirst[p | p.name == packageName]
            ?.types?.findFirst[t | t.name == jdtType.elementName]
            ?.methods?.findFirst[m | jdtMethod.equalSignature(m)]
    }
    
    /**
     * Extract data on the given JDT type into the KType instance.
     */
    def private extractTypeData(KType kType, IType jdtType, (IType)=>KType typeFunc,
            (String)=>KType typeNameFunc) {
        kType.visibility = jdtType.flags.visibility
        kType.static = Flags.isStatic(jdtType.flags)
        val typeHierarchy = jdtType.newSupertypeHierarchy(new NullProgressMonitor)
        if (kType instanceof KClass) {
            val kClazz = kType as KClass
            kClazz.final = Flags.isFinal(jdtType.flags)
            kClazz.abstract = Flags.isAbstract(jdtType.flags)
            if (jdtType.superclassName != null) {
                kClazz.superClass = resolveHierarchy(jdtType, typeHierarchy.getSuperclass(jdtType),
                        Signature.getTypeErasure(jdtType.superclassName), typeFunc, typeNameFunc) as KClass
            }
        }
        val superInterfaceTypes = typeHierarchy.getSuperInterfaces(jdtType)
        for (superInterfaceName : jdtType.superInterfaceNames.map[Signature.getTypeErasure(it)]) {
            val resolvedInterface = superInterfaceTypes.findFirst[
                it.elementName == superInterfaceName || it.fullyQualifiedName == superInterfaceName
            ]
            val kSuperInterface = resolveHierarchy(jdtType, resolvedInterface, superInterfaceName,
                    typeFunc, typeNameFunc) as KInterface
            if (kSuperInterface != null) {
                if (kType instanceof KClass) {
                    (kType as KClass).interfaces += kSuperInterface
                } else if (kType instanceof KInterface) {
                    (kType as KInterface).superInterfaces += kSuperInterface
                }
            }
        }
    }
    
    /**
     * Extract data on the given JDT field into the KField instance
     */
    def private extractFieldData(KField kField, IField jdtField, IType jdtType,
            (String)=>KType typeNameFunc) {
        kField.type = ClassdataFactory.eINSTANCE.createKTypeReference() => [ tr |
            tr.signature = Signature.toString(jdtField.typeSignature)
            jdtType.resolveReference(tr, typeNameFunc)
        ]
        if (jdtType.isInterface || jdtField.isEnumConstant) {
            kField.visibility = KVisibility::PUBLIC
            kField.static = true
            kField.final = true
        } else {
            kField.visibility = jdtField.flags.visibility
            kField.static = Flags.isStatic(jdtField.flags)
            kField.final = Flags.isFinal(jdtField.flags)
        }
    }
    
    /**
     * Extract data on the given JDT method into the KMethod instance.
     */
    def private extractMethodData(KMethod kMethod, IMethod jdtMethod, IType jdtType,
            (String)=>KType typeNameFunc) {
        kMethod.returnType = ClassdataFactory.eINSTANCE.createKTypeReference => [ tr |
            tr.signature = Signature.toString(jdtMethod.returnType)
            jdtType.resolveReference(tr, typeNameFunc)
        ]
        if (jdtType.isInterface) {
            kMethod.visibility = KVisibility::PUBLIC
            kMethod.abstract = true
        } else {
            kMethod.visibility = jdtMethod.flags.visibility
            kMethod.static = Flags.isStatic(jdtMethod.flags)
            kMethod.final = Flags.isFinal(jdtMethod.flags)
            kMethod.abstract = Flags.isAbstract(jdtMethod.flags)
        }
    }
    
    /**
     * Resolve the given type reference: make its signature qualified and create a type cross reference.
     */
    def private resolveReference(IType jdtType, KTypeReference typeRef, (String)=>KType typeNameFunc) {
        val res = jdtType.resolveType(typeRef.signature)
        if (!res.nullOrEmpty) {
            val qualifiedName = res.get(0).get(0) + "." + res.get(0).get(1)
            typeRef.referenceType = typeNameFunc.apply(qualifiedName)
            if (!typeRef.signature.startsWith(res.get(0).get(0))) {
                typeRef.signature = res.get(0).get(0) + "." + typeRef.signature
            }
        }
    }
    
    /**
     * Resolve the given hierarchy reference.
     */
    def private resolveHierarchy(IType jdtType, IType resolvedType, String name,
            (IType)=>KType typeFunc, (String)=>KType typeNameFunc) {
        if (resolvedType != null) {
            val typeFuncResult = typeFunc.apply(resolvedType)
            if (typeFuncResult != null) {
                return typeFuncResult
            }
        }
        val res = jdtType.resolveType(name)
        if (!res.nullOrEmpty) {
            return typeNameFunc.apply(res.get(0).get(0) + "." + res.get(0).get(1))
        } else {
            return typeNameFunc.apply(name)
        }
    }
    
}
