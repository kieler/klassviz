/*
 * KlassViz - Kieler Class Diagram Visualization
 * 
 * A part of OpenKieler
 * https://github.com/OpenKieler
 * 
 * Copyright 2014, 2018 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
grammar InternalClassData;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package de.cau.cs.kieler.klassviz.text.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package de.cau.cs.kieler.klassviz.text.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.cau.cs.kieler.klassviz.text.services.ClassDataGrammarAccess;

}
@parser::members {
	private ClassDataGrammarAccess grammarAccess;

	public void setGrammarAccess(ClassDataGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleKClassModel
entryRuleKClassModel
:
{ before(grammarAccess.getKClassModelRule()); }
	 ruleKClassModel
{ after(grammarAccess.getKClassModelRule()); } 
	 EOF 
;

// Rule KClassModel
ruleKClassModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getKClassModelAccess().getGroup()); }
		(rule__KClassModel__Group__0)
		{ after(grammarAccess.getKClassModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleKOption
entryRuleKOption
:
{ before(grammarAccess.getKOptionRule()); }
	 ruleKOption
{ after(grammarAccess.getKOptionRule()); } 
	 EOF 
;

// Rule KOption
ruleKOption 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getKOptionAccess().getGroup()); }
		(rule__KOption__Group__0)
		{ after(grammarAccess.getKOptionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleKPackage
entryRuleKPackage
:
{ before(grammarAccess.getKPackageRule()); }
	 ruleKPackage
{ after(grammarAccess.getKPackageRule()); } 
	 EOF 
;

// Rule KPackage
ruleKPackage 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getKPackageAccess().getGroup()); }
		(rule__KPackage__Group__0)
		{ after(grammarAccess.getKPackageAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleKType
entryRuleKType
:
{ before(grammarAccess.getKTypeRule()); }
	 ruleKType
{ after(grammarAccess.getKTypeRule()); } 
	 EOF 
;

// Rule KType
ruleKType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getKTypeAccess().getGroup()); }
		(rule__KType__Group__0)
		{ after(grammarAccess.getKTypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleKClass
entryRuleKClass
:
{ before(grammarAccess.getKClassRule()); }
	 ruleKClass
{ after(grammarAccess.getKClassRule()); } 
	 EOF 
;

// Rule KClass
ruleKClass 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getKClassAccess().getGroup()); }
		(rule__KClass__Group__0)
		{ after(grammarAccess.getKClassAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleKInterface
entryRuleKInterface
:
{ before(grammarAccess.getKInterfaceRule()); }
	 ruleKInterface
{ after(grammarAccess.getKInterfaceRule()); } 
	 EOF 
;

// Rule KInterface
ruleKInterface 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getKInterfaceAccess().getGroup()); }
		(rule__KInterface__Group__0)
		{ after(grammarAccess.getKInterfaceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleKEnum
entryRuleKEnum
:
{ before(grammarAccess.getKEnumRule()); }
	 ruleKEnum
{ after(grammarAccess.getKEnumRule()); } 
	 EOF 
;

// Rule KEnum
ruleKEnum 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getKEnumAccess().getGroup()); }
		(rule__KEnum__Group__0)
		{ after(grammarAccess.getKEnumAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleKDependency
entryRuleKDependency
:
{ before(grammarAccess.getKDependencyRule()); }
	 ruleKDependency
{ after(grammarAccess.getKDependencyRule()); } 
	 EOF 
;

// Rule KDependency
ruleKDependency 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getKDependencyAccess().getGroup()); }
		(rule__KDependency__Group__0)
		{ after(grammarAccess.getKDependencyAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleKField
entryRuleKField
:
{ before(grammarAccess.getKFieldRule()); }
	 ruleKField
{ after(grammarAccess.getKFieldRule()); } 
	 EOF 
;

// Rule KField
ruleKField 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getKFieldAccess().getNameAssignment()); }
		(rule__KField__NameAssignment)
		{ after(grammarAccess.getKFieldAccess().getNameAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleKMethod
entryRuleKMethod
:
{ before(grammarAccess.getKMethodRule()); }
	 ruleKMethod
{ after(grammarAccess.getKMethodRule()); } 
	 EOF 
;

// Rule KMethod
ruleKMethod 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getKMethodAccess().getGroup()); }
		(rule__KMethod__Group__0)
		{ after(grammarAccess.getKMethodAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleKTypeReference
entryRuleKTypeReference
:
{ before(grammarAccess.getKTypeReferenceRule()); }
	 ruleKTypeReference
{ after(grammarAccess.getKTypeReferenceRule()); } 
	 EOF 
;

// Rule KTypeReference
ruleKTypeReference 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getKTypeReferenceAccess().getSignatureAssignment()); }
		(rule__KTypeReference__SignatureAssignment)
		{ after(grammarAccess.getKTypeReferenceAccess().getSignatureAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQualifiedID
entryRuleQualifiedID
:
{ before(grammarAccess.getQualifiedIDRule()); }
	 ruleQualifiedID
{ after(grammarAccess.getQualifiedIDRule()); } 
	 EOF 
;

// Rule QualifiedID
ruleQualifiedID 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQualifiedIDAccess().getGroup()); }
		(rule__QualifiedID__Group__0)
		{ after(grammarAccess.getQualifiedIDAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePropertyValue
entryRulePropertyValue
:
{ before(grammarAccess.getPropertyValueRule()); }
	 rulePropertyValue
{ after(grammarAccess.getPropertyValueRule()); } 
	 EOF 
;

// Rule PropertyValue
rulePropertyValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPropertyValueAccess().getAlternatives()); }
		(rule__PropertyValue__Alternatives)
		{ after(grammarAccess.getPropertyValueAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFloat
entryRuleFloat
:
{ before(grammarAccess.getFloatRule()); }
	 ruleFloat
{ after(grammarAccess.getFloatRule()); } 
	 EOF 
;

// Rule Float
ruleFloat 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFloatAccess().getAlternatives()); }
		(rule__Float__Alternatives)
		{ after(grammarAccess.getFloatAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__KClassModel__Alternatives_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getKClassModelAccess().getGroup_1_1_0()); }
		(rule__KClassModel__Group_1_1_0__0)
		{ after(grammarAccess.getKClassModelAccess().getGroup_1_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getKClassModelAccess().getGroup_1_1_1()); }
		(rule__KClassModel__Group_1_1_1__0)
		{ after(grammarAccess.getKClassModelAccess().getGroup_1_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__KType__Alternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getKTypeAccess().getKClassParserRuleCall_0_0()); }
		ruleKClass
		{ after(grammarAccess.getKTypeAccess().getKClassParserRuleCall_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getKTypeAccess().getKInterfaceParserRuleCall_0_1()); }
		ruleKInterface
		{ after(grammarAccess.getKTypeAccess().getKInterfaceParserRuleCall_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getKTypeAccess().getKEnumParserRuleCall_0_2()); }
		ruleKEnum
		{ after(grammarAccess.getKTypeAccess().getKEnumParserRuleCall_0_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__KType__Alternatives_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getKTypeAccess().getFieldsAssignment_1_1_0()); }
		(rule__KType__FieldsAssignment_1_1_0)
		{ after(grammarAccess.getKTypeAccess().getFieldsAssignment_1_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getKTypeAccess().getMethodsAssignment_1_1_1()); }
		(rule__KType__MethodsAssignment_1_1_1)
		{ after(grammarAccess.getKTypeAccess().getMethodsAssignment_1_1_1()); }
	)
	|
	(
		{ before(grammarAccess.getKTypeAccess().getDependenciesAssignment_1_1_2()); }
		(rule__KType__DependenciesAssignment_1_1_2)
		{ after(grammarAccess.getKTypeAccess().getDependenciesAssignment_1_1_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyValue__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyValueAccess().getBOOLEANTerminalRuleCall_0()); }
		RULE_BOOLEAN
		{ after(grammarAccess.getPropertyValueAccess().getBOOLEANTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyValueAccess().getSTRINGTerminalRuleCall_1()); }
		RULE_STRING
		{ after(grammarAccess.getPropertyValueAccess().getSTRINGTerminalRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyValueAccess().getFloatParserRuleCall_2()); }
		ruleFloat
		{ after(grammarAccess.getPropertyValueAccess().getFloatParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyValueAccess().getQualifiedIDParserRuleCall_3()); }
		ruleQualifiedID
		{ after(grammarAccess.getPropertyValueAccess().getQualifiedIDParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Float__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFloatAccess().getTFLOATTerminalRuleCall_0()); }
		RULE_TFLOAT
		{ after(grammarAccess.getFloatAccess().getTFLOATTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getFloatAccess().getNATURALTerminalRuleCall_1()); }
		RULE_NATURAL
		{ after(grammarAccess.getFloatAccess().getNATURALTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__KClassModel__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KClassModel__Group__0__Impl
	rule__KClassModel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__KClassModel__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKClassModelAccess().getKClassModelAction_0()); }
	()
	{ after(grammarAccess.getKClassModelAccess().getKClassModelAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__KClassModel__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KClassModel__Group__1__Impl
	rule__KClassModel__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__KClassModel__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKClassModelAccess().getGroup_1()); }
	(rule__KClassModel__Group_1__0)*
	{ after(grammarAccess.getKClassModelAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__KClassModel__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KClassModel__Group__2__Impl
	rule__KClassModel__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__KClassModel__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKClassModelAccess().getOptionsAssignment_2()); }
	(rule__KClassModel__OptionsAssignment_2)*
	{ after(grammarAccess.getKClassModelAccess().getOptionsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__KClassModel__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KClassModel__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__KClassModel__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKClassModelAccess().getPackagesAssignment_3()); }
	(rule__KClassModel__PackagesAssignment_3)*
	{ after(grammarAccess.getKClassModelAccess().getPackagesAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__KClassModel__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KClassModel__Group_1__0__Impl
	rule__KClassModel__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__KClassModel__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKClassModelAccess().getImportKeyword_1_0()); }
	'import'
	{ after(grammarAccess.getKClassModelAccess().getImportKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__KClassModel__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KClassModel__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__KClassModel__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKClassModelAccess().getAlternatives_1_1()); }
	(rule__KClassModel__Alternatives_1_1)
	{ after(grammarAccess.getKClassModelAccess().getAlternatives_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__KClassModel__Group_1_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KClassModel__Group_1_1_0__0__Impl
	rule__KClassModel__Group_1_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__KClassModel__Group_1_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKClassModelAccess().getProjectKeyword_1_1_0_0()); }
	'project'
	{ after(grammarAccess.getKClassModelAccess().getProjectKeyword_1_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__KClassModel__Group_1_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KClassModel__Group_1_1_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__KClassModel__Group_1_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKClassModelAccess().getJavaProjectsAssignment_1_1_0_1()); }
	(rule__KClassModel__JavaProjectsAssignment_1_1_0_1)
	{ after(grammarAccess.getKClassModelAccess().getJavaProjectsAssignment_1_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__KClassModel__Group_1_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KClassModel__Group_1_1_1__0__Impl
	rule__KClassModel__Group_1_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__KClassModel__Group_1_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKClassModelAccess().getBundleKeyword_1_1_1_0()); }
	'bundle'
	{ after(grammarAccess.getKClassModelAccess().getBundleKeyword_1_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__KClassModel__Group_1_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KClassModel__Group_1_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__KClassModel__Group_1_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKClassModelAccess().getBundlesAssignment_1_1_1_1()); }
	(rule__KClassModel__BundlesAssignment_1_1_1_1)
	{ after(grammarAccess.getKClassModelAccess().getBundlesAssignment_1_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__KOption__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KOption__Group__0__Impl
	rule__KOption__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__KOption__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKOptionAccess().getKOptionAction_0()); }
	()
	{ after(grammarAccess.getKOptionAccess().getKOptionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__KOption__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KOption__Group__1__Impl
	rule__KOption__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__KOption__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKOptionAccess().getKeyAssignment_1()); }
	(rule__KOption__KeyAssignment_1)
	{ after(grammarAccess.getKOptionAccess().getKeyAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__KOption__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KOption__Group__2__Impl
	rule__KOption__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__KOption__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKOptionAccess().getEqualsSignKeyword_2()); }
	'='
	{ after(grammarAccess.getKOptionAccess().getEqualsSignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__KOption__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KOption__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__KOption__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKOptionAccess().getValueAssignment_3()); }
	(rule__KOption__ValueAssignment_3)
	{ after(grammarAccess.getKOptionAccess().getValueAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__KPackage__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KPackage__Group__0__Impl
	rule__KPackage__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__KPackage__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKPackageAccess().getPackageKeyword_0()); }
	'package'
	{ after(grammarAccess.getKPackageAccess().getPackageKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__KPackage__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KPackage__Group__1__Impl
	rule__KPackage__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__KPackage__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKPackageAccess().getNameAssignment_1()); }
	(rule__KPackage__NameAssignment_1)
	{ after(grammarAccess.getKPackageAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__KPackage__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KPackage__Group__2__Impl
	rule__KPackage__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__KPackage__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKPackageAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getKPackageAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__KPackage__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KPackage__Group__3__Impl
	rule__KPackage__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__KPackage__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKPackageAccess().getTypesAssignment_3()); }
	(rule__KPackage__TypesAssignment_3)*
	{ after(grammarAccess.getKPackageAccess().getTypesAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__KPackage__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KPackage__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__KPackage__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKPackageAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getKPackageAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__KType__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KType__Group__0__Impl
	rule__KType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__KType__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKTypeAccess().getAlternatives_0()); }
	(rule__KType__Alternatives_0)
	{ after(grammarAccess.getKTypeAccess().getAlternatives_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__KType__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KType__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__KType__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKTypeAccess().getGroup_1()); }
	(rule__KType__Group_1__0)?
	{ after(grammarAccess.getKTypeAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__KType__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KType__Group_1__0__Impl
	rule__KType__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__KType__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKTypeAccess().getLeftCurlyBracketKeyword_1_0()); }
	'{'
	{ after(grammarAccess.getKTypeAccess().getLeftCurlyBracketKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__KType__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KType__Group_1__1__Impl
	rule__KType__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__KType__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKTypeAccess().getAlternatives_1_1()); }
	(rule__KType__Alternatives_1_1)*
	{ after(grammarAccess.getKTypeAccess().getAlternatives_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__KType__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KType__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__KType__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKTypeAccess().getRightCurlyBracketKeyword_1_2()); }
	'}'
	{ after(grammarAccess.getKTypeAccess().getRightCurlyBracketKeyword_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__KClass__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KClass__Group__0__Impl
	rule__KClass__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__KClass__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKClassAccess().getClassKeyword_0()); }
	'class'
	{ after(grammarAccess.getKClassAccess().getClassKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__KClass__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KClass__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__KClass__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKClassAccess().getNameAssignment_1()); }
	(rule__KClass__NameAssignment_1)
	{ after(grammarAccess.getKClassAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__KInterface__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KInterface__Group__0__Impl
	rule__KInterface__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__KInterface__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKInterfaceAccess().getInterfaceKeyword_0()); }
	'interface'
	{ after(grammarAccess.getKInterfaceAccess().getInterfaceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__KInterface__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KInterface__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__KInterface__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKInterfaceAccess().getNameAssignment_1()); }
	(rule__KInterface__NameAssignment_1)
	{ after(grammarAccess.getKInterfaceAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__KEnum__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KEnum__Group__0__Impl
	rule__KEnum__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__KEnum__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKEnumAccess().getEnumKeyword_0()); }
	'enum'
	{ after(grammarAccess.getKEnumAccess().getEnumKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__KEnum__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KEnum__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__KEnum__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKEnumAccess().getNameAssignment_1()); }
	(rule__KEnum__NameAssignment_1)
	{ after(grammarAccess.getKEnumAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__KDependency__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KDependency__Group__0__Impl
	rule__KDependency__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__KDependency__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKDependencyAccess().getDependKeyword_0()); }
	'depend'
	{ after(grammarAccess.getKDependencyAccess().getDependKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__KDependency__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KDependency__Group__1__Impl
	rule__KDependency__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__KDependency__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKDependencyAccess().getLabelAssignment_1()); }
	(rule__KDependency__LabelAssignment_1)?
	{ after(grammarAccess.getKDependencyAccess().getLabelAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__KDependency__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KDependency__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__KDependency__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKDependencyAccess().getTargetAssignment_2()); }
	(rule__KDependency__TargetAssignment_2)
	{ after(grammarAccess.getKDependencyAccess().getTargetAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__KMethod__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KMethod__Group__0__Impl
	rule__KMethod__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__KMethod__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKMethodAccess().getNameAssignment_0()); }
	(rule__KMethod__NameAssignment_0)
	{ after(grammarAccess.getKMethodAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__KMethod__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KMethod__Group__1__Impl
	rule__KMethod__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__KMethod__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKMethodAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getKMethodAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__KMethod__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KMethod__Group__2__Impl
	rule__KMethod__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__KMethod__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKMethodAccess().getGroup_2()); }
	(rule__KMethod__Group_2__0)?
	{ after(grammarAccess.getKMethodAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__KMethod__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KMethod__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__KMethod__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKMethodAccess().getRightParenthesisKeyword_3()); }
	')'
	{ after(grammarAccess.getKMethodAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__KMethod__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KMethod__Group_2__0__Impl
	rule__KMethod__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__KMethod__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKMethodAccess().getParametersAssignment_2_0()); }
	(rule__KMethod__ParametersAssignment_2_0)
	{ after(grammarAccess.getKMethodAccess().getParametersAssignment_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__KMethod__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KMethod__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__KMethod__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKMethodAccess().getGroup_2_1()); }
	(rule__KMethod__Group_2_1__0)*
	{ after(grammarAccess.getKMethodAccess().getGroup_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__KMethod__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KMethod__Group_2_1__0__Impl
	rule__KMethod__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__KMethod__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKMethodAccess().getCommaKeyword_2_1_0()); }
	','
	{ after(grammarAccess.getKMethodAccess().getCommaKeyword_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__KMethod__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__KMethod__Group_2_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__KMethod__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getKMethodAccess().getParametersAssignment_2_1_1()); }
	(rule__KMethod__ParametersAssignment_2_1_1)
	{ after(grammarAccess.getKMethodAccess().getParametersAssignment_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedID__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedID__Group__0__Impl
	rule__QualifiedID__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedID__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedID__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedID__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedID__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedIDAccess().getGroup_1()); }
	(rule__QualifiedID__Group_1__0)*
	{ after(grammarAccess.getQualifiedIDAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifiedID__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedID__Group_1__0__Impl
	rule__QualifiedID__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedID__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0()); }
	'.'
	{ after(grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedID__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifiedID__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifiedID__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__KClassModel__JavaProjectsAssignment_1_1_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getKClassModelAccess().getJavaProjectsSTRINGTerminalRuleCall_1_1_0_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getKClassModelAccess().getJavaProjectsSTRINGTerminalRuleCall_1_1_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__KClassModel__BundlesAssignment_1_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getKClassModelAccess().getBundlesQualifiedIDParserRuleCall_1_1_1_1_0()); }
		ruleQualifiedID
		{ after(grammarAccess.getKClassModelAccess().getBundlesQualifiedIDParserRuleCall_1_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__KClassModel__OptionsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getKClassModelAccess().getOptionsKOptionParserRuleCall_2_0()); }
		ruleKOption
		{ after(grammarAccess.getKClassModelAccess().getOptionsKOptionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__KClassModel__PackagesAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getKClassModelAccess().getPackagesKPackageParserRuleCall_3_0()); }
		ruleKPackage
		{ after(grammarAccess.getKClassModelAccess().getPackagesKPackageParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__KOption__KeyAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getKOptionAccess().getKeyQualifiedIDParserRuleCall_1_0()); }
		ruleQualifiedID
		{ after(grammarAccess.getKOptionAccess().getKeyQualifiedIDParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__KOption__ValueAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getKOptionAccess().getValuePropertyValueParserRuleCall_3_0()); }
		rulePropertyValue
		{ after(grammarAccess.getKOptionAccess().getValuePropertyValueParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__KPackage__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getKPackageAccess().getNameQualifiedIDParserRuleCall_1_0()); }
		ruleQualifiedID
		{ after(grammarAccess.getKPackageAccess().getNameQualifiedIDParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__KPackage__TypesAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getKPackageAccess().getTypesKTypeParserRuleCall_3_0()); }
		ruleKType
		{ after(grammarAccess.getKPackageAccess().getTypesKTypeParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__KType__FieldsAssignment_1_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getKTypeAccess().getFieldsKFieldParserRuleCall_1_1_0_0()); }
		ruleKField
		{ after(grammarAccess.getKTypeAccess().getFieldsKFieldParserRuleCall_1_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__KType__MethodsAssignment_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getKTypeAccess().getMethodsKMethodParserRuleCall_1_1_1_0()); }
		ruleKMethod
		{ after(grammarAccess.getKTypeAccess().getMethodsKMethodParserRuleCall_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__KType__DependenciesAssignment_1_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getKTypeAccess().getDependenciesKDependencyParserRuleCall_1_1_2_0()); }
		ruleKDependency
		{ after(grammarAccess.getKTypeAccess().getDependenciesKDependencyParserRuleCall_1_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__KClass__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getKClassAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getKClassAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__KInterface__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getKInterfaceAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getKInterfaceAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__KEnum__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getKEnumAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getKEnumAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__KDependency__LabelAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getKDependencyAccess().getLabelSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getKDependencyAccess().getLabelSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__KDependency__TargetAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getKDependencyAccess().getTargetKTypeCrossReference_2_0()); }
		(
			{ before(grammarAccess.getKDependencyAccess().getTargetKTypeIDTerminalRuleCall_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getKDependencyAccess().getTargetKTypeIDTerminalRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getKDependencyAccess().getTargetKTypeCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__KField__NameAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getKFieldAccess().getNameIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getKFieldAccess().getNameIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__KMethod__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getKMethodAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getKMethodAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__KMethod__ParametersAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getKMethodAccess().getParametersKTypeReferenceParserRuleCall_2_0_0()); }
		ruleKTypeReference
		{ after(grammarAccess.getKMethodAccess().getParametersKTypeReferenceParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__KMethod__ParametersAssignment_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getKMethodAccess().getParametersKTypeReferenceParserRuleCall_2_1_1_0()); }
		ruleKTypeReference
		{ after(grammarAccess.getKMethodAccess().getParametersKTypeReferenceParserRuleCall_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__KTypeReference__SignatureAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getKTypeReferenceAccess().getSignatureIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getKTypeReferenceAccess().getSignatureIDTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_BOOLEAN : ('true'|'false');

RULE_TFLOAT : (('+'|'-') (('0'..'9')+ ('.' ('0'..'9')*)? (('e'|'E') ('+'|'-')? ('0'..'9')+)?|'.' ('0'..'9')+ (('e'|'E') ('+'|'-')? ('0'..'9')+)?)|('0'..'9')+ '.' ('0'..'9')* (('e'|'E') ('+'|'-')? ('0'..'9')+)?|'.' ('0'..'9')+ (('e'|'E') ('+'|'-')? ('0'..'9')+)?|('0'..'9')+ ('e'|'E') ('+'|'-')? ('0'..'9')+);

RULE_NATURAL : ('0'..'9')+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;