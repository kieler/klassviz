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
package de.cau.cs.kieler.klassviz.text.ui.contentassist

import de.cau.cs.kieler.klassviz.text.ui.contentassist.AbstractClassDataProposalProvider
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import de.cau.cs.kieler.klassviz.model.classdata.KType
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.jdt.core.JavaCore
import org.eclipse.core.runtime.CoreException
import de.cau.cs.kieler.klassviz.synthesis.ClassDataExtensions
import com.google.inject.Inject
import org.eclipse.xtext.RuleCall
import org.eclipse.jdt.core.Signature
import de.cau.cs.kieler.klassviz.model.classdata.KClassModel
import de.cau.cs.kieler.klassviz.model.classdata.KPackage

/**
 * Custom content assist proposals.
 * 
 * @see http://www.eclipse.org/Xtext/documentation.html#contentAssist
 * @author msp
 */
class ClassDataProposalProvider extends AbstractClassDataProposalProvider {
    
    @Inject
    extension ClassDataExtensions
    
    /**
     * Provide completion proposals for the name of an imported project.
     */
     def override completeKClassModel_JavaProjects(EObject model, Assignment assignment,
            ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
         val classModel = model as KClassModel
         for (project : ResourcesPlugin.workspace.root.projects.filter[
                !classModel.javaProjects.contains(it.name)]) {
             try {
                 if (project.open && project.hasNature(JavaCore.NATURE_ID)) {
                    acceptor.accept(createCompletionProposal(project.name, context))
                 }
            } catch (CoreException e) {}
         }
     }
     
     /**
      * Provide completion proposals for the name of a package.
      */
     def override completeKPackage_Name(EObject model, Assignment assignment,
            ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
         val classModel = (model as KPackage).eContainer as KClassModel
         
         // provide proposals for all referenced Java projects
         for (projectName : classModel.javaProjects) {
             for (packFrag : projectName.jdtPackages.filter[it.compilationUnits.length > 0
                    && classModel.packages.forall[p | p.name != it.elementName]]) {
                 acceptor.accept(createCompletionProposal(packFrag.elementName, context))
             }
         }
     }
    
    /**
     * Provide completion proposals for the name of a class.
     */
    def override completeKClass_Name(EObject model, Assignment assignment,
            ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        val pack = model as KPackage
        val classModel = pack.eContainer as KClassModel
        
        // provide proposals for all referenced Java projects
        for (projectName : classModel.javaProjects) {
            val packFrag = projectName.getJdtPackage(pack)
            if (packFrag != null) {
                for (compilationUnit : packFrag.compilationUnits) {
                    for (type : compilationUnit.types.filter[it.isClass
                            && pack.types.forall[t | t.name != it.elementName]]) {
                        acceptor.accept(createCompletionProposal(type.elementName, context))
                    }
                }
            }
        }
    }
    
    /**
     * Provide completion proposals for the name of an interface.
     */
    def override completeKInterface_Name(EObject model, Assignment assignment,
            ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        val pack = model as KPackage
        val classModel = pack.eContainer as KClassModel
        
        // provide proposals for all referenced Java projects
        for (projectName : classModel.javaProjects) {
            val packFrag = projectName.getJdtPackage(pack)
            if (packFrag != null) {
                for (compilationUnit : packFrag.compilationUnits) {
                    for (type : compilationUnit.types.filter[it.isInterface
                            && pack.types.forall[t | t.name != it.elementName]]) {
                        acceptor.accept(createCompletionProposal(type.elementName, context))
                    }
                }
            }
        }
    }
    
    /**
     * Provide completion proposals for the name of an enumeration.
     */
    def override completeKEnum_Name(EObject model, Assignment assignment,
            ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        val pack = model as KPackage
        val classModel = pack.eContainer as KClassModel
        
        // provide proposals for all referenced Java projects
        for (projectName : classModel.javaProjects) {
            val packFrag = projectName.getJdtPackage(pack)
            if (packFrag != null) {
                for (compilationUnit : packFrag.compilationUnits) {
                    for (type : compilationUnit.types.filter[it.isEnum
                            && pack.types.forall[t | t.name != it.elementName]]) {
                        acceptor.accept(createCompletionProposal(type.elementName, context))
                    }
                }
            }
        }
    }
    
    /**
     * Provide completion proposals for the name of a field.
     */
     def override complete_KField(EObject model, RuleCall ruleCall, ContentAssistContext context,
            ICompletionProposalAcceptor acceptor) {
        val type = model as KType
        val pack = type.eContainer as KPackage
        val classModel = pack.eContainer as KClassModel
        val jdtType = classModel.getJdtType(type)
        if (jdtType != null) {
            for (field : jdtType.fields) {
                if (type.fields.forall[it.name != field.elementName]) {
                    acceptor.accept(createCompletionProposal(field.elementName, context))
                }
            }
        }
    }
    
    /**
     * Provide completion proposals for the signature of a method.
     */
     def override complete_KMethod(EObject model, RuleCall ruleCall, ContentAssistContext context,
             ICompletionProposalAcceptor acceptor) {
        val type = model as KType
        val pack = type.eContainer as KPackage
        val classModel = pack.eContainer as KClassModel
        val jdtType = classModel.getJdtType(type)
        if (jdtType != null) {
            for (method : jdtType.methods) {
                if (!method.constructor) {
                    val paramTypeSign = method.parameterTypes.map[t | Signature.toString(t)]
                    if (type.methods.forall[it.name != method.elementName
                            || !it.parameters.map[s | s.signature].equals(paramTypeSign)]) {
                        val proposal = method.elementName + "(" + paramTypeSign.join(", ") + ")"
                        acceptor.accept(createCompletionProposal(proposal, context))
                    }
                }
            }
        }
    }
    
}
