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
import de.cau.cs.kieler.klassviz.model.classdata.KTypeSelection
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.jdt.core.JavaCore
import org.eclipse.core.runtime.CoreException
import de.cau.cs.kieler.klassviz.synthesis.ClassDataExtensions
import com.google.inject.Inject
import org.eclipse.xtext.RuleCall
import org.eclipse.jdt.core.Signature

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
     def override completeKTypeSelection_JavaProjects(EObject model, Assignment assignment,
            ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
         for (project : ResourcesPlugin.workspace.root.projects) {
             try {
                 if (project.open && project.hasNature(JavaCore.NATURE_ID)) {
                    acceptor.accept(createCompletionProposal(project.name, context))
                 }
            } catch (CoreException e) {}
         }
     }
    
    /**
     * Provide completion proposals for the name of a type.
     */
    def override completeKType_QualifiedName(EObject model, Assignment assignment,
            ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        val data = (model as KType).eContainer as KTypeSelection
        
        // provide proposals for all referenced Java projects
        for (projectName : data.javaProjects) {
            provideProjectProposals(projectName, context, acceptor)
        }
    }
    
    /**
     * Provide completion proposals for all class files and compilation units in the given project.
     */
    def private provideProjectProposals(String projectName, ContentAssistContext context,
            ICompletionProposalAcceptor acceptor) {
        val project = ResourcesPlugin.workspace.root.getProject(projectName)
        try {
            if (project.open && project.hasNature(JavaCore.NATURE_ID)) {
                val javaProject = JavaCore.create(project)
                for (packFrag : javaProject.packageFragments) {
                    for (compilationUnit : packFrag.compilationUnits) {
                        for (type : compilationUnit.types) {
                            acceptor.accept(createCompletionProposal(type.fullyQualifiedName, context))
                        }
                    }
                }
            }
        } catch (CoreException e) {}
    }
    
    /**
     * Provide completion proposals for the name of a field.
     */
     def override complete_KField(EObject model, RuleCall ruleCall, ContentAssistContext context,
            ICompletionProposalAcceptor acceptor) {
        val type = model as KType
        val data = type.eContainer as KTypeSelection
        val jdtType = data.getJdtType(type)
        if (jdtType != null) {
            for (field : jdtType.fields) {
                if (!type.fields.exists[it.name == field.elementName]) {
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
        val data = type.eContainer as KTypeSelection
        val jdtType = data.getJdtType(type)
        if (jdtType != null) {
            for (method : jdtType.methods) {
                if (!method.constructor) {
                    val paramTypeSign = method.parameterTypes.map[t | Signature.toString(t)]
                    if (!type.methods.exists[it.name == method.elementName
                            && it.parameterTypeSignatures.map[s | s.name].equals(paramTypeSign)]) {
                        val proposal = method.elementName + "(" + paramTypeSign.join(", ") + ")"
                        acceptor.accept(createCompletionProposal(proposal, context))
                    }
                }
            }
        }
    }
    
}
