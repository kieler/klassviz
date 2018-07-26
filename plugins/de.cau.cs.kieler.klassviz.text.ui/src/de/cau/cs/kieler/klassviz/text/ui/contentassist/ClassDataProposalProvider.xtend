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
package de.cau.cs.kieler.klassviz.text.ui.contentassist

import com.google.inject.Inject
import de.cau.cs.kieler.klassviz.model.classdata.KClassModel
import de.cau.cs.kieler.klassviz.model.classdata.KOption
import de.cau.cs.kieler.klassviz.model.classdata.KPackage
import de.cau.cs.kieler.klassviz.model.classdata.KType
import de.cau.cs.kieler.klassviz.synthesis.ClassDataDiagramSynthesis
import de.cau.cs.kieler.klassviz.synthesis.ClassDataExtensions
import de.cau.cs.kieler.klassviz.text.services.ClassDataGrammarAccess
import de.cau.cs.kieler.klassviz.text.ui.ClassDataUiModule
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.Platform
import org.eclipse.elk.core.data.LayoutMetaDataService
import org.eclipse.elk.core.options.CoreOptions
import org.eclipse.elk.graph.properties.IProperty
import org.eclipse.emf.ecore.EObject
import org.eclipse.jdt.core.JavaCore
import org.eclipse.jdt.core.Signature
import org.eclipse.osgi.util.ManifestElement
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor

/**
 * Custom content assist proposals.
 * 
 * @see http://www.eclipse.org/Xtext/documentation.html#contentAssist
 * @author msp
 */
class ClassDataProposalProvider extends AbstractClassDataProposalProvider {
    
    @Inject extension ClassDataExtensions
    @Inject private ClassDataGrammarAccess grammmarAccess;
    
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
                     val proposal = valueConverter.toString(project.name, grammmarAccess.qualifiedIDRule.name)
                     acceptor.accept(createCompletionProposal(proposal, context))
                 }
            } catch (CoreException e) {}
         }
     }
     
     /**
      * Provide completion proposals for the name of an imported bundle.
      */
     def override completeKClassModel_Bundles(EObject model, Assignment assignment,
            ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
         val classModel = model as KClassModel
         for (bundle : Platform.getBundle(ClassDataUiModule.PLUGIN_ID).bundleContext.bundles.filter[
                !classModel.bundles.contains(it.symbolicName)]) {
             val proposal = valueConverter.toString(bundle.symbolicName, grammmarAccess.qualifiedIDRule.name)
             acceptor.accept(createCompletionProposal(proposal, context))
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
                 val proposal = valueConverter.toString(packFrag.elementName, grammmarAccess.qualifiedIDRule.name)
                 acceptor.accept(createCompletionProposal(proposal, context))
             }
         }
         
         // provide proposals for all referenced bundles
         for (bundleName : classModel.bundles) {
             val packagesString = Platform.getBundle(bundleName)?.headers?.get("Export-Package")
             if (packagesString !== null) {
                 for (element : ManifestElement.parseHeader("Export-Package", packagesString)) {
                     val proposal = valueConverter.toString(element.value, grammmarAccess.qualifiedIDRule.name)
                     acceptor.accept(createCompletionProposal(proposal, context))
                 }
             }
         }
     }
    
    /**
     * Provide completion proposals for the name of a class.
     */
    def override completeKClass_Name(EObject model, Assignment assignment,
            ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        val pack =
            if (model instanceof KPackage) {
                model as KPackage
            } else {
                model.eContainer as KPackage
            }
        val classModel = pack.eContainer as KClassModel
        
        // provide proposals for all referenced Java projects
        for (projectName : classModel.javaProjects) {
            val packFrag = projectName.getJdtPackage(pack)
            if (packFrag !== null) {
                for (compilationUnit : packFrag.compilationUnits) {
                    for (type : compilationUnit.types.filter[it.isClass
                            && pack.types.forall[t | t.name != it.elementName]]) {
                        acceptor.accept(createCompletionProposal(type.elementName, context))
                    }
                }
            }
        }
        
        // provide proposals for all referenced bundles
        for (bundleName : classModel.bundles) {
            for (clazz : bundleName.getBundleClasses(pack.name).filter[
                    !it.localClass && !it.memberClass && !it.anonymousClass && !it.isInterface
                    && !it.isEnum && !it.array && !it.annotation && !it.synthetic && !it.primitive
                    && pack.types.forall[t | t.name != it.simpleName]]) {
                acceptor.accept(createCompletionProposal(clazz.simpleName, context))
            }
        }
    }
    
    /**
     * Provide completion proposals for the name of an interface.
     */
    def override completeKInterface_Name(EObject model, Assignment assignment,
            ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        val pack =
            if (model instanceof KPackage) {
                model as KPackage
            } else {
                model.eContainer as KPackage
            }
        val classModel = pack.eContainer as KClassModel
        
        // provide proposals for all referenced Java projects
        for (projectName : classModel.javaProjects) {
            val packFrag = projectName.getJdtPackage(pack)
            if (packFrag !== null) {
                for (compilationUnit : packFrag.compilationUnits) {
                    for (type : compilationUnit.types.filter[it.isInterface
                            && pack.types.forall[t | t.name != it.elementName]]) {
                        acceptor.accept(createCompletionProposal(type.elementName, context))
                    }
                }
            }
        }
        
        // provide proposals for all referenced bundles
        for (bundleName : classModel.bundles) {
            if (pack.name.startsWith(bundleName)) {
                for (clazz : bundleName.getBundleClasses(pack.name).filter[it.isInterface
                        && pack.types.forall[t | t.name != it.simpleName]]) {
                    acceptor.accept(createCompletionProposal(clazz.simpleName, context))
                }
            }
        }
    }
    
    /**
     * Provide completion proposals for the name of an enumeration.
     */
    def override completeKEnum_Name(EObject model, Assignment assignment,
            ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        val pack =
            if (model instanceof KPackage) {
                model as KPackage
            } else {
                model.eContainer as KPackage
            }
        val classModel = pack.eContainer as KClassModel
        
        // provide proposals for all referenced Java projects
        for (projectName : classModel.javaProjects) {
            val packFrag = projectName.getJdtPackage(pack)
            if (packFrag !== null) {
                for (compilationUnit : packFrag.compilationUnits) {
                    for (type : compilationUnit.types.filter[it.isEnum
                            && pack.types.forall[t | t.name != it.elementName]]) {
                        acceptor.accept(createCompletionProposal(type.elementName, context))
                    }
                }
            }
        }
        
        // provide proposals for all referenced bundles
        for (bundleName : classModel.bundles) {
            if (pack.name.startsWith(bundleName)) {
                for (clazz : bundleName.getBundleClasses(pack.name).filter[it.isEnum
                        && pack.types.forall[t | t.name != it.simpleName]]) {
                    acceptor.accept(createCompletionProposal(clazz.simpleName, context))
                }
            }
        }
    }
    
    /**
     * Provide completion proposals for the name of a field.
     */
     def override complete_KField(EObject model, RuleCall ruleCall, ContentAssistContext context,
            ICompletionProposalAcceptor acceptor) {
        if (!(model instanceof KType)) {
            super.complete_KField(model, ruleCall, context, acceptor)
            return;
        }
        val type = model as KType
        val pack = type.eContainer as KPackage
        val classModel = pack.eContainer as KClassModel
        val jdtType = classModel.getJdtType(type)
        if (jdtType !== null) {
            // get the proposals from a JDT type
            for (field : jdtType.fields.filter[f | type.fields.forall[it.name != f.elementName]]) {
                acceptor.accept(createCompletionProposal(field.elementName, context))
            }
        } else {
            val clazz = classModel.getBundleClass(type)
            if (clazz !== null) {
                // get the proposals from a reflection class
                for (field : clazz.fields.filter[f | f.declaringClass == clazz && !f.synthetic
                        && type.fields.forall[it.name != f.name]]) {
                    acceptor.accept(createCompletionProposal(field.name, context))
                }
            }
        }
    }
    
    /**
     * Provide completion proposals for the signature of a method.
     */
     def override complete_KMethod(EObject model, RuleCall ruleCall, ContentAssistContext context,
             ICompletionProposalAcceptor acceptor) {
        if (!(model instanceof KType)) {
            super.complete_KMethod(model, ruleCall, context, acceptor)
            return;
        }
        val type = model as KType
        val pack = type.eContainer as KPackage
        val classModel = pack.eContainer as KClassModel
        val jdtType = classModel.getJdtType(type)
        if (jdtType !== null) {
            // get the proposals from a JDT type
            for (method : jdtType.methods.filter[!it.constructor]) {
                val paramTypeSign = method.parameterTypes.map[t |
                    Signature.getSimpleName(Signature.toString(Signature.getTypeErasure(t)))
                ].toList
                if (type.methods.forall[it.name != method.elementName
                        || !it.parameters.map[s | s.signature].equals(paramTypeSign)]) {
                    val proposal = method.elementName + "(" + paramTypeSign.join(", ") + ")"
                    acceptor.accept(createCompletionProposal(proposal, context))
                }
            }
        } else {
            val clazz = classModel.getBundleClass(type)
            if (clazz !== null) {
                // get the proposals from a reflection class
                for (method : clazz.methods.filter[m | m.declaringClass == clazz && !m.synthetic]) {
                    val paramTypeSign = method.parameterTypes.map[t | t.simpleName].toList
                    if (type.methods.forall[it.name != method.name
                            || !it.parameters.map[s | s.signature].equals(paramTypeSign)]) {
                        val proposal = method.name + "(" + paramTypeSign.join(", ") + ")"
                        acceptor.accept(createCompletionProposal(proposal, context))
                    }
                }
            }
        }
    }
    
    /**
     * Provide completion proposals for the key of an option.
     */
    def override completeKOption_Key(EObject model, Assignment assignment, ContentAssistContext context,
            ICompletionProposalAcceptor acceptor) {
        val classModel = model as KClassModel
        
        // add proposals for synthesis options
        for (field : typeof(ClassDataDiagramSynthesis).fields.filter[
                it.isStatic && typeof(IProperty).isAssignableFrom(it.type)]) {
            val property = field.get(null) as IProperty<?>
            if (classModel.options.forall[it.key != property.id]) {
                val proposal = valueConverter.toString(property.id, grammmarAccess.qualifiedIDRule.name)
                acceptor.accept(createCompletionProposal(proposal, context))
            }
        }
        
        // add proposals for layout options
        val activeAlgoId = classModel.options.findFirst[it.key == CoreOptions.ALGORITHM.id]?.value
        val activeAlgo = if (activeAlgoId !== null) {
                LayoutMetaDataService.instance.getAlgorithmData(activeAlgoId)
            }
        for (optionData : LayoutMetaDataService.instance.optionData.filter[
            activeAlgo === null || activeAlgo.knowsOption(it)
        ]) {
            if (classModel.options.forall[it.key != optionData.id]) {
                val proposal = valueConverter.toString(optionData.id, grammmarAccess.qualifiedIDRule.name)
                val displayString = optionData.id + " (" + optionData.name + ")"
                acceptor.accept(createCompletionProposal(proposal, displayString, null, context))
            }
        }
    }

    /**
     * Provide completion proposals for the value of an option.
     */    
    def override completeKOption_Value(EObject model, Assignment assignment, ContentAssistContext context,
            ICompletionProposalAcceptor acceptor) {
        val optionKey = (model as KOption).key
        if (!optionKey.nullOrEmpty) {
            val optionData = LayoutMetaDataService.instance.getOptionDataBySuffix(optionKey)
            if (optionData === null) {
                return
            }
            
            if (optionKey == CoreOptions.ALGORITHM.id) {
                for (algorithmData : LayoutMetaDataService.instance.algorithmData) {
                    val proposal = '"' + algorithmData.id+ '"'
                    val displayString = algorithmData.id + " (" + algorithmData.name + ")"
                    acceptor.accept(createCompletionProposal(proposal, displayString, null, context))
                }
            } else {
                for (proposal : optionData.choices) {
                    acceptor.accept(createCompletionProposal(proposal, context))
                }
            }
        }
    }
    
}
