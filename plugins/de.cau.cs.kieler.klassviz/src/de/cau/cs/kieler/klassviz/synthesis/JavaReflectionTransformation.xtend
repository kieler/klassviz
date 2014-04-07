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
import java.lang.reflect.Field
import java.lang.reflect.GenericArrayType
import java.lang.reflect.Method
import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type
import java.lang.reflect.TypeVariable
import java.lang.reflect.WildcardType
import java.util.HashMap
import org.eclipse.core.runtime.Platform
import org.eclipse.jdt.core.Flags

/**
 * Transformation class between the Java reflection interface and our own class model.
 * 
 * @author msp
 */
class JavaReflectionTransformation {
    
    @Inject extension ClassDataExtensions
    
    /**
     * Resolve all types in the given class model that refer to Eclipse bundles.
     */
    def resolve(KClassModel classModel) throws SecurityException {
        // Gather the Java projects declared in the class model
        val bundles = classModel.bundles.map[Platform.getBundle(it)].filterNull.toList
        
        // Gather the selected types
        val typeMap = new HashMap<Class<?>, KType>
        for (pack : classModel.packages) {
            for (kType : pack.types) {
                val clazz = bundles.map[
                    try {
                        it.loadClass(kType.qualifiedName)
                    } catch (ClassNotFoundException exception) { null }
                ].findFirst[it != null]
                if (clazz != null) {
                    typeMap.put(clazz, kType)
                }
            }
        }
        
        val typeFunc = [ typeMap.get(it) ]
        for (entry : typeMap.entrySet) {
            val clazz = entry.key
            val kType = entry.value
            kType.selected = true
            
            // Extract type data
            extractTypeData(kType, clazz, typeFunc)
        
            // Extract field data.
            for (field : clazz.fields.filter[ f | f.declaringClass == clazz && !f.synthetic]) {
                var kField = kType.fields.findFirst[f | f.name == field.name]
                if (kField == null) {
                    kField = ClassdataFactory.eINSTANCE.createKField()
                    kField.name = field.name
                    kType.fields += kField
                } else {
                    kField.selected = true
                }
                extractFieldData(kField, field, clazz, typeFunc)
            }
            
            // Extract method data.
            for (method : clazz.methods.filter[ m | m.declaringClass == clazz && !m.synthetic]) {
                var kMethod = kType.methods.findFirst[m | method.equalSignature(m)]
                if (kMethod == null) {
                    kMethod = ClassdataFactory.eINSTANCE.createKMethod()
                    kMethod.name = method.name
                    kType.methods += kMethod
                    for (genericParam : method.genericParameterTypes) {
                        kMethod.parameters += ClassdataFactory.eINSTANCE.createKTypeReference => [ tr |
                            genericParam.resolveReference(tr, typeFunc)
                        ]
                    }
                } else {
                    kMethod.selected = true
                    kMethod.parameters.forEach[ kparam, i |
                        val genericParam = method.genericParameterTypes.get(i)
                        genericParam.resolveReference(kparam, typeFunc)
                    ]
                }
                extractMethodData(kMethod, method, clazz, typeFunc)
            }
        }
        
        return classModel
    }
    
    /**
     * Extract data on the given class into the KType instance.
     */
    def private extractTypeData(KType kType, Class<?> clazz, (Class<?>)=>KType typeFunc) {
        kType.visibility = clazz.modifiers.visibility
        kType.static = Flags.isStatic(clazz.modifiers)
        if (kType instanceof KClass) {
            val kClazz = kType as KClass
            kClazz.final = Flags.isFinal(clazz.modifiers)
            kClazz.abstract = Flags.isAbstract(clazz.modifiers)
            if (clazz.superclass != null) {
                kClazz.superClass = typeFunc.apply(clazz.superclass) as KClass
            }
            for (superInterface : clazz.interfaces) {
                val kInterface = typeFunc.apply(superInterface) as KInterface
                if (kInterface != null) {
                    kClazz.interfaces += kInterface
                }
            }
        } else if (kType instanceof KInterface) {
            val kInterface = kType as KInterface
            for (superInterface : clazz.interfaces) {
                val kSuperInterface = typeFunc.apply(superInterface) as KInterface
                if (kSuperInterface != null) {
                    kInterface.superInterfaces += kSuperInterface
                }
            }
        }
    }
    
    /**
     * Extract data on the given Java field into the KField instance
     */
    def private extractFieldData(KField kField, Field field, Class<?> clazz,
            (Class<?>)=>KType typeFunc) {
        kField.type = ClassdataFactory.eINSTANCE.createKTypeReference() => [ tr |
            field.genericType.resolveReference(tr, typeFunc)
        ]
        if (clazz.isInterface) {
            kField.visibility = KVisibility::PUBLIC
            kField.static = true
            kField.final = true
        } else {
            kField.visibility = field.modifiers.visibility
            kField.static = field.isStatic
            kField.final = field.isFinal
        }
    }
    
    /**
     * Extract data on the given Java method into the KMethod instance.
     */
    def private extractMethodData(KMethod kMethod, Method method, Class<?> clazz,
            (Class<?>)=>KType typeFunc) {
        kMethod.returnType = ClassdataFactory.eINSTANCE.createKTypeReference => [ tr |
            method.genericReturnType.resolveReference(tr, typeFunc)
        ]
        if (clazz.isInterface) {
            kMethod.visibility = KVisibility::PUBLIC
            kMethod.abstract = true
        } else {
            kMethod.visibility = method.modifiers.visibility
            kMethod.static = method.isStatic
            kMethod.final = method.isFinal
            kMethod.abstract = method.isAbstract
        }
    }
    
    /**
     * Resolve the given type reference: set the signature and create a type cross reference.
     */
    def private void resolveReference(Type type, KTypeReference typeRef, (Class<?>)=>KType typeFunc) {
        switch (type) {
            case type instanceof ParameterizedType: {
                val parameterizedType = type as ParameterizedType
                typeRef.referenceType = typeFunc.apply(parameterizedType.rawType as Class<?>)
            }
            case type instanceof WildcardType: {
                val wildcardType = type as WildcardType
                if (wildcardType.upperBounds.length > 0) {
                    resolveReference(wildcardType.upperBounds.get(0), typeRef, typeFunc)
                }
            }
            case type instanceof GenericArrayType: {
                val genericArrayType = type as GenericArrayType
                resolveReference(genericArrayType.genericComponentType, typeRef, typeFunc)
            }
            case type instanceof TypeVariable<?>: {
                val typeVariable = type as TypeVariable<?>
                typeRef.name = typeVariable.name
                if (typeVariable.genericDeclaration instanceof Class<?>) {
                    typeRef.referenceType = typeFunc.apply(typeVariable.genericDeclaration as Class<?>)
                }
            }
            case type instanceof Class<?>: {
                typeRef.referenceType = typeFunc.apply(type as Class<?>)
            }
        }
        typeRef.signature = type.signature.toString
    }
    
}
