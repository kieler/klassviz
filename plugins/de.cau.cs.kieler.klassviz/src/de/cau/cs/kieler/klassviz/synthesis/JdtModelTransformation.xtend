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
import java.util.Set
import org.eclipse.core.runtime.NullProgressMonitor
import org.eclipse.jdt.core.Flags
import org.eclipse.jdt.core.IField
import org.eclipse.jdt.core.IJavaElement
import org.eclipse.jdt.core.IMethod
import org.eclipse.jdt.core.IType
import org.eclipse.jdt.core.ITypeRoot
import org.eclipse.jdt.core.JavaModelException
import org.eclipse.jdt.core.Signature
import org.eclipse.jface.viewers.IStructuredSelection

/**
 * Transformation class between the JDT model and our own class model.
 * 
 * @author msp
 */
class JdtModelTransformation {
    
    @Inject
    extension ClassDataExtensions

    /** The types contained in the current selection. */
    private final Set<IType> selectedTypes = new HashSet<IType>
    
    /**
     * Transform a selection of JDT elements to a class model instance.
     */
    def KClassModel transform(IStructuredSelection selection) throws JavaModelException {
        val selectedElements = selection.toArray()
        
        // Gather all types in the current selection.
        selectedTypes.clear
        selectedTypes += selectedElements.filter[it instanceof IType]
        selectedTypes += selectedElements.filter[it instanceof ITypeRoot]
                .map[(it as ITypeRoot).findPrimaryType]
        
        // Create a class model instance based on the metamodel with the factory.
        val classModel = ClassdataFactory.eINSTANCE.createKClassModel()
        
        // For each selected element, check if it's an IJavaElement. If it is
        // so extract the wanted information of the classes.
        var int i = 0
        while (i < selectedElements.length) {
            if (selectedElements.get(i) instanceof IJavaElement) {
                val je = selectedElements.get(i) as IJavaElement
                switch (je.getElementType()) {
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
            i = i + 1
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
        
        // Extract type data.
        kPackage.types += kType
        kType.name = jdtType.elementName;
        kType.visibility = jdtType.flags.visibility
        val typeHierarchy = jdtType.newSupertypeHierarchy(new NullProgressMonitor)
        if (kType instanceof KClass) {
            val kClazz = kType as KClass
            if (Flags.isAbstract(jdtType.flags)) {
                kClazz.abstract = true;
            }
            if (jdtType.superclassName != null) {
                val superClazz = typeHierarchy.getSuperclass(jdtType)
                if (superClazz != null && selectedTypes.contains(superClazz)) {
                    kClazz.superClass = createType(superClazz, classModel) as KClass
                }
            }
            for (superInterface : typeHierarchy.getSuperInterfaces(jdtType)) {
                if (selectedTypes.contains(superInterface)) {
                    kClazz.interfaces += createType(superInterface, classModel) as KInterface
                }
            }
        } else if (kType instanceof KInterface) {
            val kInterface = kType as KInterface
            for (superInterface : typeHierarchy.getSuperInterfaces(jdtType)) {
                if (selectedTypes.contains(superInterface)) {
                    kInterface.superInterfaces += createType(superInterface, classModel) as KInterface
                }
            }
        }
        
        // Extract field data.
        for (jdtField : jdtType.fields) {
            val kField = ClassdataFactory.eINSTANCE.createKField()
            kField.name = jdtField.elementName
            kField.type = ClassdataFactory.eINSTANCE.createKTypeReference() => [ tr |
                tr.signature = Signature.toString(jdtField.typeSignature)
                jdtType.resolveReference(tr, classModel)
            ]
            kField.visibility = jdtField.flags.visibility
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
                    jdtType.resolveReference(tr, classModel)
                ]
            }
            kMethod.returnType = ClassdataFactory.eINSTANCE.createKTypeReference => [ tr |
                tr.signature = Signature.toString(jdtMethod.returnType)
                jdtType.resolveReference(tr, classModel)
            ]
            kMethod.visibility = jdtMethod.flags.visibility
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
            ?.methods?.findFirst[f | jdtMethod.equalSignature(f)]
    }
    
    /**
     * Determine the visibility of the given type flags.
     */
    def private KVisibility getVisibility(int flags) {
        if (Flags.isPublic(flags)) {
            KVisibility::PUBLIC
        } else if (Flags.isProtected(flags)) {
            KVisibility::PROTECTED
        } else if (Flags.isPrivate(flags)) {
            KVisibility::PRIVATE
        } else {
            KVisibility::PACKAGE
        }
    }
    
    /**
     * Resolve the given type reference: make its signature qualified, create a type cross reference,
     * and find type arguments.
     */
    def private resolveReference(IType jdtType, KTypeReference typeRef, KClassModel classModel) {
        val res = jdtType.resolveType(typeRef.signature)
        if (!res.nullOrEmpty) {
            val qualifiedName = res.get(0).get(0) + "." + res.get(0).get(1)
            val referencedType = jdtType.javaProject.findType(qualifiedName)
            if (referencedType != null && selectedTypes.contains(referencedType)) {
                typeRef.referenceType = createType(referencedType, classModel)
            }
            if (!typeRef.signature.startsWith(res.get(0).get(0))) {
                typeRef.signature = res.get(0).get(0) + "." + typeRef.signature
            }
        }
        val genericStart = typeRef.signature.indexOf('<')
        val genericEnd = typeRef.signature.lastIndexOf('>')
        if (genericStart > 0 && genericEnd > 0) {
            for (token : typeRef.signature.substring(genericStart + 1, genericEnd).split(",")) {
                typeRef.typeArguments += token.trim
            }
        }
    }
    
}