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

import de.cau.cs.kieler.klassviz.model.classdata.KClassModel
import de.cau.cs.kieler.klassviz.model.classdata.KMethod
import de.cau.cs.kieler.klassviz.model.classdata.KPackage
import de.cau.cs.kieler.klassviz.model.classdata.KType
import de.cau.cs.kieler.klassviz.model.classdata.KVisibility
import java.lang.reflect.GenericArrayType
import java.lang.reflect.Member
import java.lang.reflect.Method
import java.lang.reflect.ParameterizedType
import java.lang.reflect.TypeVariable
import java.lang.reflect.WildcardType
import java.util.Collections
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.Platform
import org.eclipse.jdt.core.Flags
import org.eclipse.jdt.core.IMethod
import org.eclipse.jdt.core.IPackageFragment
import org.eclipse.jdt.core.IType
import org.eclipse.jdt.core.JavaCore
import org.eclipse.jdt.core.Signature
import org.osgi.framework.wiring.BundleWiring

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
     * Retrieve a JDT type from one of the referenced projects.
     */
    def IType getJdtType(KClassModel classModel, KType type) {
        for (projectName : classModel.javaProjects) {
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
        null
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
     * Retrieve a class from one of the referenced bundles.
     */
    def Class<?> getBundleClass(KClassModel classModel, KType type) {
        for (bundleName : classModel.bundles) {
            try {
                val result = Platform.getBundle(bundleName)?.loadClass(type.qualifiedName)
                if (result != null) {
                    return result
                }
            } catch (ClassNotFoundException e) {}
        }
        null
    }
    
    /**
     * Get the names of all classes that can be loaded by the bundle with given name.
     */
    def Iterable<Class<?>> getBundleClasses(String bundleName, String packageName) {
        val bundle = Platform.getBundle(bundleName)
        if (bundle == null) {
            return Collections.emptyList
        }
        bundle.adapt(BundleWiring)
            .listResources("/" + packageName.replace('.', '/'), "*.class",
                BundleWiring.LISTRESOURCES_LOCAL)
            .map[try {
                bundle.loadClass(it.substring(0, it.length - ".class".length).replace('/', '.'))
            } catch (ClassNotFoundException e) {null}].filterNull
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
            val jdtSignature = Signature.getSimpleName(Signature.toString(Signature.getTypeErasure(
                    jdtMethod.parameterTypes.get(i))))
            val kSignature = kMethod.parameters.get(i).signature
            if (jdtSignature != kSignature && jdtSignature != Signature.getSimpleName(kSignature)) {
                return false
            }
            i = i + 1
        }
        return true
    }
    
    /**
     * Determine whether the signature of the given Java method equals that of the KMethod.
     */
    def boolean equalSignature(Method method, KMethod kMethod) {
        if (method.name != kMethod.name
                || method.parameterTypes.length != kMethod.parameters.size) {
            return false
        }
        var int i = 0
        while (i < method.parameterTypes.length) {
            val clazz = method.parameterTypes.get(i)
            val kSignature = kMethod.parameters.get(i).signature
            if (clazz.simpleName != kSignature && clazz.name != kSignature) {
                return false
            }
            i = i + 1
        }
        return true
    }
    
    /**
     * Determine the visibility of the given type flags.
     */
    def KVisibility getVisibility(int flags) {
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
     * Determine whether the given member is declared static.
     */
    def isStatic(Member member) {
        Flags.isStatic(member.modifiers)
    }
    
    /**
     * Determine whether the given member is declared static.
     */
    def isFinal(Member member) {
        Flags.isFinal(member.modifiers)
    }
    
    /**
     * Determine whether the given member is declared static.
     */
    def isAbstract(Member member) {
        Flags.isAbstract(member.modifiers)
    }
    
    /**
     * Compute a signature for the given parameterized type.
     */
    def dispatch CharSequence getSignature(ParameterizedType type) {
        '''«IF type.ownerType != null
            »«type.ownerType.signature».«
        ENDIF»«
        type.rawType.signature
        »«IF type.actualTypeArguments.length > 0
            »<«type.actualTypeArguments.map[it.signature].join(", ")»>«
        ENDIF»'''
    }
    
    /**
     * Compute a signature for the given wildcard type.
     */
    def dispatch CharSequence getSignature(WildcardType type) {
        '''?«IF type.lowerBounds.length > 0
            » super «type.lowerBounds.map[it.signature].join(" | ")»«
        ENDIF»«IF type.upperBounds.length > 0
            » extends «type.upperBounds.map[it.signature].join(" | ")»«
        ENDIF»'''
    }
    
    /**
     * Compute a signature for the given generic array type.
     */
    def dispatch CharSequence getSignature(GenericArrayType type) {
        '''«type.genericComponentType.signature»[]'''
    }
    
    /**
     * Compute a signature for the given type variable.
     */
    def dispatch CharSequence getSignature(TypeVariable<?> typeVariable) {
        '''«typeVariable.name»«IF typeVariable.bounds.length > 0
            » extends «typeVariable.bounds.map[it.signature].join(" | ")»«
        ENDIF»'''
    }
    
    /**
     * Compute a signature for the given class or interface.
     */
    def dispatch CharSequence getSignature(Class<?> clazz) {
        clazz.name
    }
    
}
