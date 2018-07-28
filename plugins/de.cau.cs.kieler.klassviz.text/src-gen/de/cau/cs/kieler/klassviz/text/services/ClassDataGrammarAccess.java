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
package de.cau.cs.kieler.klassviz.text.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ClassDataGrammarAccess extends AbstractGrammarElementFinder {
	
	public class KClassModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cau.cs.kieler.klassviz.text.ClassData.KClassModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cKClassModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cImportKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Alternatives cAlternatives_1_1 = (Alternatives)cGroup_1.eContents().get(1);
		private final Group cGroup_1_1_0 = (Group)cAlternatives_1_1.eContents().get(0);
		private final Keyword cProjectKeyword_1_1_0_0 = (Keyword)cGroup_1_1_0.eContents().get(0);
		private final Assignment cJavaProjectsAssignment_1_1_0_1 = (Assignment)cGroup_1_1_0.eContents().get(1);
		private final RuleCall cJavaProjectsSTRINGTerminalRuleCall_1_1_0_1_0 = (RuleCall)cJavaProjectsAssignment_1_1_0_1.eContents().get(0);
		private final Group cGroup_1_1_1 = (Group)cAlternatives_1_1.eContents().get(1);
		private final Keyword cBundleKeyword_1_1_1_0 = (Keyword)cGroup_1_1_1.eContents().get(0);
		private final Assignment cBundlesAssignment_1_1_1_1 = (Assignment)cGroup_1_1_1.eContents().get(1);
		private final RuleCall cBundlesQualifiedIDParserRuleCall_1_1_1_1_0 = (RuleCall)cBundlesAssignment_1_1_1_1.eContents().get(0);
		private final Assignment cOptionsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cOptionsKOptionParserRuleCall_2_0 = (RuleCall)cOptionsAssignment_2.eContents().get(0);
		private final Assignment cPackagesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPackagesKPackageParserRuleCall_3_0 = (RuleCall)cPackagesAssignment_3.eContents().get(0);
		
		//KClassModel:
		//	{KClassModel} ('import' ('project' javaProjects+=STRING | 'bundle' bundles+=QualifiedID))*
		//	options+=KOption*
		//	packages+=KPackage*;
		@Override public ParserRule getRule() { return rule; }
		
		//{KClassModel} ('import' ('project' javaProjects+=STRING | 'bundle' bundles+=QualifiedID))* options+=KOption*
		//packages+=KPackage*
		public Group getGroup() { return cGroup; }
		
		//{KClassModel}
		public Action getKClassModelAction_0() { return cKClassModelAction_0; }
		
		//('import' ('project' javaProjects+=STRING | 'bundle' bundles+=QualifiedID))*
		public Group getGroup_1() { return cGroup_1; }
		
		//'import'
		public Keyword getImportKeyword_1_0() { return cImportKeyword_1_0; }
		
		//'project' javaProjects+=STRING | 'bundle' bundles+=QualifiedID
		public Alternatives getAlternatives_1_1() { return cAlternatives_1_1; }
		
		//'project' javaProjects+=STRING
		public Group getGroup_1_1_0() { return cGroup_1_1_0; }
		
		//'project'
		public Keyword getProjectKeyword_1_1_0_0() { return cProjectKeyword_1_1_0_0; }
		
		//javaProjects+=STRING
		public Assignment getJavaProjectsAssignment_1_1_0_1() { return cJavaProjectsAssignment_1_1_0_1; }
		
		//STRING
		public RuleCall getJavaProjectsSTRINGTerminalRuleCall_1_1_0_1_0() { return cJavaProjectsSTRINGTerminalRuleCall_1_1_0_1_0; }
		
		//'bundle' bundles+=QualifiedID
		public Group getGroup_1_1_1() { return cGroup_1_1_1; }
		
		//'bundle'
		public Keyword getBundleKeyword_1_1_1_0() { return cBundleKeyword_1_1_1_0; }
		
		//bundles+=QualifiedID
		public Assignment getBundlesAssignment_1_1_1_1() { return cBundlesAssignment_1_1_1_1; }
		
		//QualifiedID
		public RuleCall getBundlesQualifiedIDParserRuleCall_1_1_1_1_0() { return cBundlesQualifiedIDParserRuleCall_1_1_1_1_0; }
		
		//options+=KOption*
		public Assignment getOptionsAssignment_2() { return cOptionsAssignment_2; }
		
		//KOption
		public RuleCall getOptionsKOptionParserRuleCall_2_0() { return cOptionsKOptionParserRuleCall_2_0; }
		
		//packages+=KPackage*
		public Assignment getPackagesAssignment_3() { return cPackagesAssignment_3; }
		
		//KPackage
		public RuleCall getPackagesKPackageParserRuleCall_3_0() { return cPackagesKPackageParserRuleCall_3_0; }
	}
	public class KOptionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cau.cs.kieler.klassviz.text.ClassData.KOption");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cKOptionAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cKeyAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cKeyQualifiedIDParserRuleCall_1_0 = (RuleCall)cKeyAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cValueAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cValuePropertyValueParserRuleCall_3_0 = (RuleCall)cValueAssignment_3.eContents().get(0);
		
		//KOption:
		//	{KOption} key=QualifiedID '=' value=PropertyValue;
		@Override public ParserRule getRule() { return rule; }
		
		//{KOption} key=QualifiedID '=' value=PropertyValue
		public Group getGroup() { return cGroup; }
		
		//{KOption}
		public Action getKOptionAction_0() { return cKOptionAction_0; }
		
		//key=QualifiedID
		public Assignment getKeyAssignment_1() { return cKeyAssignment_1; }
		
		//QualifiedID
		public RuleCall getKeyQualifiedIDParserRuleCall_1_0() { return cKeyQualifiedIDParserRuleCall_1_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }
		
		//value=PropertyValue
		public Assignment getValueAssignment_3() { return cValueAssignment_3; }
		
		//PropertyValue
		public RuleCall getValuePropertyValueParserRuleCall_3_0() { return cValuePropertyValueParserRuleCall_3_0; }
	}
	public class KPackageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cau.cs.kieler.klassviz.text.ClassData.KPackage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPackageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameQualifiedIDParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTypesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTypesKTypeParserRuleCall_3_0 = (RuleCall)cTypesAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//KPackage:
		//	'package' name=QualifiedID '{'
		//	types+=KType*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'package' name=QualifiedID '{' types+=KType* '}'
		public Group getGroup() { return cGroup; }
		
		//'package'
		public Keyword getPackageKeyword_0() { return cPackageKeyword_0; }
		
		//name=QualifiedID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//QualifiedID
		public RuleCall getNameQualifiedIDParserRuleCall_1_0() { return cNameQualifiedIDParserRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//types+=KType*
		public Assignment getTypesAssignment_3() { return cTypesAssignment_3; }
		
		//KType
		public RuleCall getTypesKTypeParserRuleCall_3_0() { return cTypesKTypeParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class KTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cau.cs.kieler.klassviz.text.ClassData.KType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final RuleCall cKClassParserRuleCall_0_0 = (RuleCall)cAlternatives_0.eContents().get(0);
		private final RuleCall cKInterfaceParserRuleCall_0_1 = (RuleCall)cAlternatives_0.eContents().get(1);
		private final RuleCall cKEnumParserRuleCall_0_2 = (RuleCall)cAlternatives_0.eContents().get(2);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Alternatives cAlternatives_1_1 = (Alternatives)cGroup_1.eContents().get(1);
		private final Assignment cFieldsAssignment_1_1_0 = (Assignment)cAlternatives_1_1.eContents().get(0);
		private final RuleCall cFieldsKFieldParserRuleCall_1_1_0_0 = (RuleCall)cFieldsAssignment_1_1_0.eContents().get(0);
		private final Assignment cMethodsAssignment_1_1_1 = (Assignment)cAlternatives_1_1.eContents().get(1);
		private final RuleCall cMethodsKMethodParserRuleCall_1_1_1_0 = (RuleCall)cMethodsAssignment_1_1_1.eContents().get(0);
		private final Assignment cDependenciesAssignment_1_1_2 = (Assignment)cAlternatives_1_1.eContents().get(2);
		private final RuleCall cDependenciesKDependencyParserRuleCall_1_1_2_0 = (RuleCall)cDependenciesAssignment_1_1_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		
		//KType:
		//	(KClass | KInterface | KEnum) ('{' (fields+=KField | methods+=KMethod | dependencies+=KDependency)*
		//	'}')?;
		@Override public ParserRule getRule() { return rule; }
		
		//(KClass | KInterface | KEnum) ('{' (fields+=KField | methods+=KMethod | dependencies+=KDependency)* '}')?
		public Group getGroup() { return cGroup; }
		
		//KClass | KInterface | KEnum
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//KClass
		public RuleCall getKClassParserRuleCall_0_0() { return cKClassParserRuleCall_0_0; }
		
		//KInterface
		public RuleCall getKInterfaceParserRuleCall_0_1() { return cKInterfaceParserRuleCall_0_1; }
		
		//KEnum
		public RuleCall getKEnumParserRuleCall_0_2() { return cKEnumParserRuleCall_0_2; }
		
		//('{' (fields+=KField | methods+=KMethod | dependencies+=KDependency)* '}')?
		public Group getGroup_1() { return cGroup_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1_0() { return cLeftCurlyBracketKeyword_1_0; }
		
		//(fields+=KField | methods+=KMethod | dependencies+=KDependency)*
		public Alternatives getAlternatives_1_1() { return cAlternatives_1_1; }
		
		//fields+=KField
		public Assignment getFieldsAssignment_1_1_0() { return cFieldsAssignment_1_1_0; }
		
		//KField
		public RuleCall getFieldsKFieldParserRuleCall_1_1_0_0() { return cFieldsKFieldParserRuleCall_1_1_0_0; }
		
		//methods+=KMethod
		public Assignment getMethodsAssignment_1_1_1() { return cMethodsAssignment_1_1_1; }
		
		//KMethod
		public RuleCall getMethodsKMethodParserRuleCall_1_1_1_0() { return cMethodsKMethodParserRuleCall_1_1_1_0; }
		
		//dependencies+=KDependency
		public Assignment getDependenciesAssignment_1_1_2() { return cDependenciesAssignment_1_1_2; }
		
		//KDependency
		public RuleCall getDependenciesKDependencyParserRuleCall_1_1_2_0() { return cDependenciesKDependencyParserRuleCall_1_1_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_1_2() { return cRightCurlyBracketKeyword_1_2; }
	}
	public class KClassElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cau.cs.kieler.klassviz.text.ClassData.KClass");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cClassKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//KClass:
		//	'class' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'class' name=ID
		public Group getGroup() { return cGroup; }
		
		//'class'
		public Keyword getClassKeyword_0() { return cClassKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class KInterfaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cau.cs.kieler.klassviz.text.ClassData.KInterface");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInterfaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//KInterface:
		//	'interface' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'interface' name=ID
		public Group getGroup() { return cGroup; }
		
		//'interface'
		public Keyword getInterfaceKeyword_0() { return cInterfaceKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class KEnumElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cau.cs.kieler.klassviz.text.ClassData.KEnum");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEnumKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//KEnum:
		//	'enum' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'enum' name=ID
		public Group getGroup() { return cGroup; }
		
		//'enum'
		public Keyword getEnumKeyword_0() { return cEnumKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class KDependencyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cau.cs.kieler.klassviz.text.ClassData.KDependency");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDependKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cLabelAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cLabelSTRINGTerminalRuleCall_1_0 = (RuleCall)cLabelAssignment_1.eContents().get(0);
		private final Assignment cTargetAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cTargetKTypeCrossReference_2_0 = (CrossReference)cTargetAssignment_2.eContents().get(0);
		private final RuleCall cTargetKTypeIDTerminalRuleCall_2_0_1 = (RuleCall)cTargetKTypeCrossReference_2_0.eContents().get(1);
		
		//KDependency:
		//	'depend' label=STRING? target=[KType];
		@Override public ParserRule getRule() { return rule; }
		
		//'depend' label=STRING? target=[KType]
		public Group getGroup() { return cGroup; }
		
		//'depend'
		public Keyword getDependKeyword_0() { return cDependKeyword_0; }
		
		//label=STRING?
		public Assignment getLabelAssignment_1() { return cLabelAssignment_1; }
		
		//STRING
		public RuleCall getLabelSTRINGTerminalRuleCall_1_0() { return cLabelSTRINGTerminalRuleCall_1_0; }
		
		//target=[KType]
		public Assignment getTargetAssignment_2() { return cTargetAssignment_2; }
		
		//[KType]
		public CrossReference getTargetKTypeCrossReference_2_0() { return cTargetKTypeCrossReference_2_0; }
		
		//ID
		public RuleCall getTargetKTypeIDTerminalRuleCall_2_0_1() { return cTargetKTypeIDTerminalRuleCall_2_0_1; }
	}
	public class KFieldElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cau.cs.kieler.klassviz.text.ClassData.KField");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//KField:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class KMethodElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cau.cs.kieler.klassviz.text.ClassData.KMethod");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cParametersAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cParametersKTypeReferenceParserRuleCall_2_0_0 = (RuleCall)cParametersAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cParametersAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cParametersKTypeReferenceParserRuleCall_2_1_1_0 = (RuleCall)cParametersAssignment_2_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//KMethod:
		//	name=ID '(' (parameters+=KTypeReference ("," parameters+=KTypeReference)*)?
		//	')';
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID '(' (parameters+=KTypeReference ("," parameters+=KTypeReference)*)? ')'
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//(parameters+=KTypeReference ("," parameters+=KTypeReference)*)?
		public Group getGroup_2() { return cGroup_2; }
		
		//parameters+=KTypeReference
		public Assignment getParametersAssignment_2_0() { return cParametersAssignment_2_0; }
		
		//KTypeReference
		public RuleCall getParametersKTypeReferenceParserRuleCall_2_0_0() { return cParametersKTypeReferenceParserRuleCall_2_0_0; }
		
		//("," parameters+=KTypeReference)*
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//","
		public Keyword getCommaKeyword_2_1_0() { return cCommaKeyword_2_1_0; }
		
		//parameters+=KTypeReference
		public Assignment getParametersAssignment_2_1_1() { return cParametersAssignment_2_1_1; }
		
		//KTypeReference
		public RuleCall getParametersKTypeReferenceParserRuleCall_2_1_1_0() { return cParametersKTypeReferenceParserRuleCall_2_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class KTypeReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cau.cs.kieler.klassviz.text.ClassData.KTypeReference");
		private final Assignment cSignatureAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cSignatureIDTerminalRuleCall_0 = (RuleCall)cSignatureAssignment.eContents().get(0);
		
		//KTypeReference:
		//	signature=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//signature=ID
		public Assignment getSignatureAssignment() { return cSignatureAssignment; }
		
		//ID
		public RuleCall getSignatureIDTerminalRuleCall_0() { return cSignatureIDTerminalRuleCall_0; }
	}
	public class QualifiedIDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cau.cs.kieler.klassviz.text.ClassData.QualifiedID");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		////--------------- Terminals ----------------
		//QualifiedID:
		//	ID ('.' ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('.' ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.' ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class PropertyValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cau.cs.kieler.klassviz.text.ClassData.PropertyValue");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cBOOLEANTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSTRINGTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cFloatParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cQualifiedIDParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//PropertyValue:
		//	BOOLEAN | STRING | Float | QualifiedID;
		@Override public ParserRule getRule() { return rule; }
		
		//BOOLEAN | STRING | Float | QualifiedID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//BOOLEAN
		public RuleCall getBOOLEANTerminalRuleCall_0() { return cBOOLEANTerminalRuleCall_0; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_1() { return cSTRINGTerminalRuleCall_1; }
		
		//Float
		public RuleCall getFloatParserRuleCall_2() { return cFloatParserRuleCall_2; }
		
		//QualifiedID
		public RuleCall getQualifiedIDParserRuleCall_3() { return cQualifiedIDParserRuleCall_3; }
	}
	public class FloatElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "de.cau.cs.kieler.klassviz.text.ClassData.Float");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cTFLOATTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cNATURALTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Float ecore::EFloat:
		//	TFLOAT | NATURAL;
		@Override public ParserRule getRule() { return rule; }
		
		//TFLOAT | NATURAL
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//TFLOAT
		public RuleCall getTFLOATTerminalRuleCall_0() { return cTFLOATTerminalRuleCall_0; }
		
		//NATURAL
		public RuleCall getNATURALTerminalRuleCall_1() { return cNATURALTerminalRuleCall_1; }
	}
	
	
	private final KClassModelElements pKClassModel;
	private final KOptionElements pKOption;
	private final KPackageElements pKPackage;
	private final KTypeElements pKType;
	private final KClassElements pKClass;
	private final KInterfaceElements pKInterface;
	private final KEnumElements pKEnum;
	private final KDependencyElements pKDependency;
	private final KFieldElements pKField;
	private final KMethodElements pKMethod;
	private final KTypeReferenceElements pKTypeReference;
	private final QualifiedIDElements pQualifiedID;
	private final PropertyValueElements pPropertyValue;
	private final FloatElements pFloat;
	private final TerminalRule tBOOLEAN;
	private final TerminalRule tTFLOAT;
	private final TerminalRule tNATURAL;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ClassDataGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pKClassModel = new KClassModelElements();
		this.pKOption = new KOptionElements();
		this.pKPackage = new KPackageElements();
		this.pKType = new KTypeElements();
		this.pKClass = new KClassElements();
		this.pKInterface = new KInterfaceElements();
		this.pKEnum = new KEnumElements();
		this.pKDependency = new KDependencyElements();
		this.pKField = new KFieldElements();
		this.pKMethod = new KMethodElements();
		this.pKTypeReference = new KTypeReferenceElements();
		this.pQualifiedID = new QualifiedIDElements();
		this.pPropertyValue = new PropertyValueElements();
		this.pFloat = new FloatElements();
		this.tBOOLEAN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "de.cau.cs.kieler.klassviz.text.ClassData.BOOLEAN");
		this.tTFLOAT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "de.cau.cs.kieler.klassviz.text.ClassData.TFLOAT");
		this.tNATURAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "de.cau.cs.kieler.klassviz.text.ClassData.NATURAL");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("de.cau.cs.kieler.klassviz.text.ClassData".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//KClassModel:
	//	{KClassModel} ('import' ('project' javaProjects+=STRING | 'bundle' bundles+=QualifiedID))*
	//	options+=KOption*
	//	packages+=KPackage*;
	public KClassModelElements getKClassModelAccess() {
		return pKClassModel;
	}
	
	public ParserRule getKClassModelRule() {
		return getKClassModelAccess().getRule();
	}
	
	//KOption:
	//	{KOption} key=QualifiedID '=' value=PropertyValue;
	public KOptionElements getKOptionAccess() {
		return pKOption;
	}
	
	public ParserRule getKOptionRule() {
		return getKOptionAccess().getRule();
	}
	
	//KPackage:
	//	'package' name=QualifiedID '{'
	//	types+=KType*
	//	'}';
	public KPackageElements getKPackageAccess() {
		return pKPackage;
	}
	
	public ParserRule getKPackageRule() {
		return getKPackageAccess().getRule();
	}
	
	//KType:
	//	(KClass | KInterface | KEnum) ('{' (fields+=KField | methods+=KMethod | dependencies+=KDependency)*
	//	'}')?;
	public KTypeElements getKTypeAccess() {
		return pKType;
	}
	
	public ParserRule getKTypeRule() {
		return getKTypeAccess().getRule();
	}
	
	//KClass:
	//	'class' name=ID;
	public KClassElements getKClassAccess() {
		return pKClass;
	}
	
	public ParserRule getKClassRule() {
		return getKClassAccess().getRule();
	}
	
	//KInterface:
	//	'interface' name=ID;
	public KInterfaceElements getKInterfaceAccess() {
		return pKInterface;
	}
	
	public ParserRule getKInterfaceRule() {
		return getKInterfaceAccess().getRule();
	}
	
	//KEnum:
	//	'enum' name=ID;
	public KEnumElements getKEnumAccess() {
		return pKEnum;
	}
	
	public ParserRule getKEnumRule() {
		return getKEnumAccess().getRule();
	}
	
	//KDependency:
	//	'depend' label=STRING? target=[KType];
	public KDependencyElements getKDependencyAccess() {
		return pKDependency;
	}
	
	public ParserRule getKDependencyRule() {
		return getKDependencyAccess().getRule();
	}
	
	//KField:
	//	name=ID;
	public KFieldElements getKFieldAccess() {
		return pKField;
	}
	
	public ParserRule getKFieldRule() {
		return getKFieldAccess().getRule();
	}
	
	//KMethod:
	//	name=ID '(' (parameters+=KTypeReference ("," parameters+=KTypeReference)*)?
	//	')';
	public KMethodElements getKMethodAccess() {
		return pKMethod;
	}
	
	public ParserRule getKMethodRule() {
		return getKMethodAccess().getRule();
	}
	
	//KTypeReference:
	//	signature=ID;
	public KTypeReferenceElements getKTypeReferenceAccess() {
		return pKTypeReference;
	}
	
	public ParserRule getKTypeReferenceRule() {
		return getKTypeReferenceAccess().getRule();
	}
	
	////--------------- Terminals ----------------
	//QualifiedID:
	//	ID ('.' ID)*;
	public QualifiedIDElements getQualifiedIDAccess() {
		return pQualifiedID;
	}
	
	public ParserRule getQualifiedIDRule() {
		return getQualifiedIDAccess().getRule();
	}
	
	//PropertyValue:
	//	BOOLEAN | STRING | Float | QualifiedID;
	public PropertyValueElements getPropertyValueAccess() {
		return pPropertyValue;
	}
	
	public ParserRule getPropertyValueRule() {
		return getPropertyValueAccess().getRule();
	}
	
	//Float ecore::EFloat:
	//	TFLOAT | NATURAL;
	public FloatElements getFloatAccess() {
		return pFloat;
	}
	
	public ParserRule getFloatRule() {
		return getFloatAccess().getRule();
	}
	
	//terminal BOOLEAN returns ecore::EBoolean:
	//	'true' | 'false';
	public TerminalRule getBOOLEANRule() {
		return tBOOLEAN;
	}
	
	//terminal TFLOAT returns ecore::EFloat:
	//	('+' | '-') ('0'..'9'+ ('.' '0'..'9'*)? (('e' | 'E') ('+' | '-')? '0'..'9'+)?
	//	| '.' '0'..'9'+ (('e' | 'E') ('+' | '-')? '0'..'9'+)?) | '0'..'9'+ '.' '0'..'9'* (('e' | 'E') ('+' | '-')? '0'..'9'+)?
	//	| '.' '0'..'9'+ (('e' | 'E') ('+' | '-')? '0'..'9'+)?
	//	| '0'..'9'+ ('e' | 'E') ('+' | '-')? '0'..'9'+;
	public TerminalRule getTFLOATRule() {
		return tTFLOAT;
	}
	
	//terminal NATURAL returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getNATURALRule() {
		return tNATURAL;
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
