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
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package de.cau.cs.kieler.klassviz.text.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package de.cau.cs.kieler.klassviz.text.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.cau.cs.kieler.klassviz.text.services.ClassDataGrammarAccess;

}

@parser::members {

 	private ClassDataGrammarAccess grammarAccess;

    public InternalClassDataParser(TokenStream input, ClassDataGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "KClassModel";
   	}

   	@Override
   	protected ClassDataGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleKClassModel
entryRuleKClassModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getKClassModelRule()); }
	iv_ruleKClassModel=ruleKClassModel
	{ $current=$iv_ruleKClassModel.current; }
	EOF;

// Rule KClassModel
ruleKClassModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getKClassModelAccess().getKClassModelAction_0(),
					$current);
			}
		)
		(
			otherlv_1='import'
			{
				newLeafNode(otherlv_1, grammarAccess.getKClassModelAccess().getImportKeyword_1_0());
			}
			(
				(
					otherlv_2='project'
					{
						newLeafNode(otherlv_2, grammarAccess.getKClassModelAccess().getProjectKeyword_1_1_0_0());
					}
					(
						(
							lv_javaProjects_3_0=RULE_STRING
							{
								newLeafNode(lv_javaProjects_3_0, grammarAccess.getKClassModelAccess().getJavaProjectsSTRINGTerminalRuleCall_1_1_0_1_0());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getKClassModelRule());
								}
								addWithLastConsumed(
									$current,
									"javaProjects",
									lv_javaProjects_3_0,
									"org.eclipse.xtext.common.Terminals.STRING");
							}
						)
					)
				)
				    |
				(
					otherlv_4='bundle'
					{
						newLeafNode(otherlv_4, grammarAccess.getKClassModelAccess().getBundleKeyword_1_1_1_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getKClassModelAccess().getBundlesQualifiedIDParserRuleCall_1_1_1_1_0());
							}
							lv_bundles_5_0=ruleQualifiedID
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getKClassModelRule());
								}
								add(
									$current,
									"bundles",
									lv_bundles_5_0,
									"de.cau.cs.kieler.klassviz.text.ClassData.QualifiedID");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getKClassModelAccess().getOptionsKOptionParserRuleCall_2_0());
				}
				lv_options_6_0=ruleKOption
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getKClassModelRule());
					}
					add(
						$current,
						"options",
						lv_options_6_0,
						"de.cau.cs.kieler.klassviz.text.ClassData.KOption");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getKClassModelAccess().getPackagesKPackageParserRuleCall_3_0());
				}
				lv_packages_7_0=ruleKPackage
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getKClassModelRule());
					}
					add(
						$current,
						"packages",
						lv_packages_7_0,
						"de.cau.cs.kieler.klassviz.text.ClassData.KPackage");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleKOption
entryRuleKOption returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getKOptionRule()); }
	iv_ruleKOption=ruleKOption
	{ $current=$iv_ruleKOption.current; }
	EOF;

// Rule KOption
ruleKOption returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getKOptionAccess().getKOptionAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getKOptionAccess().getKeyQualifiedIDParserRuleCall_1_0());
				}
				lv_key_1_0=ruleQualifiedID
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getKOptionRule());
					}
					set(
						$current,
						"key",
						lv_key_1_0,
						"de.cau.cs.kieler.klassviz.text.ClassData.QualifiedID");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='='
		{
			newLeafNode(otherlv_2, grammarAccess.getKOptionAccess().getEqualsSignKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getKOptionAccess().getValuePropertyValueParserRuleCall_3_0());
				}
				lv_value_3_0=rulePropertyValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getKOptionRule());
					}
					set(
						$current,
						"value",
						lv_value_3_0,
						"de.cau.cs.kieler.klassviz.text.ClassData.PropertyValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleKPackage
entryRuleKPackage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getKPackageRule()); }
	iv_ruleKPackage=ruleKPackage
	{ $current=$iv_ruleKPackage.current; }
	EOF;

// Rule KPackage
ruleKPackage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='package'
		{
			newLeafNode(otherlv_0, grammarAccess.getKPackageAccess().getPackageKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getKPackageAccess().getNameQualifiedIDParserRuleCall_1_0());
				}
				lv_name_1_0=ruleQualifiedID
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getKPackageRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"de.cau.cs.kieler.klassviz.text.ClassData.QualifiedID");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getKPackageAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getKPackageAccess().getTypesKTypeParserRuleCall_3_0());
				}
				lv_types_3_0=ruleKType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getKPackageRule());
					}
					add(
						$current,
						"types",
						lv_types_3_0,
						"de.cau.cs.kieler.klassviz.text.ClassData.KType");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getKPackageAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleKType
entryRuleKType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getKTypeRule()); }
	iv_ruleKType=ruleKType
	{ $current=$iv_ruleKType.current; }
	EOF;

// Rule KType
ruleKType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getKTypeAccess().getKClassParserRuleCall_0_0());
			}
			this_KClass_0=ruleKClass
			{
				$current = $this_KClass_0.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getKTypeAccess().getKInterfaceParserRuleCall_0_1());
			}
			this_KInterface_1=ruleKInterface
			{
				$current = $this_KInterface_1.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getKTypeAccess().getKEnumParserRuleCall_0_2());
			}
			this_KEnum_2=ruleKEnum
			{
				$current = $this_KEnum_2.current;
				afterParserOrEnumRuleCall();
			}
		)
		(
			otherlv_3='{'
			{
				newLeafNode(otherlv_3, grammarAccess.getKTypeAccess().getLeftCurlyBracketKeyword_1_0());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getKTypeAccess().getFieldsKFieldParserRuleCall_1_1_0_0());
						}
						lv_fields_4_0=ruleKField
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getKTypeRule());
							}
							add(
								$current,
								"fields",
								lv_fields_4_0,
								"de.cau.cs.kieler.klassviz.text.ClassData.KField");
							afterParserOrEnumRuleCall();
						}
					)
				)
				    |
				(
					(
						{
							newCompositeNode(grammarAccess.getKTypeAccess().getMethodsKMethodParserRuleCall_1_1_1_0());
						}
						lv_methods_5_0=ruleKMethod
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getKTypeRule());
							}
							add(
								$current,
								"methods",
								lv_methods_5_0,
								"de.cau.cs.kieler.klassviz.text.ClassData.KMethod");
							afterParserOrEnumRuleCall();
						}
					)
				)
				    |
				(
					(
						{
							newCompositeNode(grammarAccess.getKTypeAccess().getDependenciesKDependencyParserRuleCall_1_1_2_0());
						}
						lv_dependencies_6_0=ruleKDependency
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getKTypeRule());
							}
							add(
								$current,
								"dependencies",
								lv_dependencies_6_0,
								"de.cau.cs.kieler.klassviz.text.ClassData.KDependency");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_7='}'
			{
				newLeafNode(otherlv_7, grammarAccess.getKTypeAccess().getRightCurlyBracketKeyword_1_2());
			}
		)?
	)
;

// Entry rule entryRuleKClass
entryRuleKClass returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getKClassRule()); }
	iv_ruleKClass=ruleKClass
	{ $current=$iv_ruleKClass.current; }
	EOF;

// Rule KClass
ruleKClass returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='class'
		{
			newLeafNode(otherlv_0, grammarAccess.getKClassAccess().getClassKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getKClassAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getKClassRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleKInterface
entryRuleKInterface returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getKInterfaceRule()); }
	iv_ruleKInterface=ruleKInterface
	{ $current=$iv_ruleKInterface.current; }
	EOF;

// Rule KInterface
ruleKInterface returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='interface'
		{
			newLeafNode(otherlv_0, grammarAccess.getKInterfaceAccess().getInterfaceKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getKInterfaceAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getKInterfaceRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleKEnum
entryRuleKEnum returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getKEnumRule()); }
	iv_ruleKEnum=ruleKEnum
	{ $current=$iv_ruleKEnum.current; }
	EOF;

// Rule KEnum
ruleKEnum returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='enum'
		{
			newLeafNode(otherlv_0, grammarAccess.getKEnumAccess().getEnumKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getKEnumAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getKEnumRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleKDependency
entryRuleKDependency returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getKDependencyRule()); }
	iv_ruleKDependency=ruleKDependency
	{ $current=$iv_ruleKDependency.current; }
	EOF;

// Rule KDependency
ruleKDependency returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='depend'
		{
			newLeafNode(otherlv_0, grammarAccess.getKDependencyAccess().getDependKeyword_0());
		}
		(
			(
				lv_label_1_0=RULE_STRING
				{
					newLeafNode(lv_label_1_0, grammarAccess.getKDependencyAccess().getLabelSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getKDependencyRule());
					}
					setWithLastConsumed(
						$current,
						"label",
						lv_label_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)?
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getKDependencyRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getKDependencyAccess().getTargetKTypeCrossReference_2_0());
				}
			)
		)
	)
;

// Entry rule entryRuleKField
entryRuleKField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getKFieldRule()); }
	iv_ruleKField=ruleKField
	{ $current=$iv_ruleKField.current; }
	EOF;

// Rule KField
ruleKField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getKFieldAccess().getNameIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getKFieldRule());
				}
				setWithLastConsumed(
					$current,
					"name",
					lv_name_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleKMethod
entryRuleKMethod returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getKMethodRule()); }
	iv_ruleKMethod=ruleKMethod
	{ $current=$iv_ruleKMethod.current; }
	EOF;

// Rule KMethod
ruleKMethod returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getKMethodAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getKMethodRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getKMethodAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getKMethodAccess().getParametersKTypeReferenceParserRuleCall_2_0_0());
					}
					lv_parameters_2_0=ruleKTypeReference
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getKMethodRule());
						}
						add(
							$current,
							"parameters",
							lv_parameters_2_0,
							"de.cau.cs.kieler.klassviz.text.ClassData.KTypeReference");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_3=','
				{
					newLeafNode(otherlv_3, grammarAccess.getKMethodAccess().getCommaKeyword_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getKMethodAccess().getParametersKTypeReferenceParserRuleCall_2_1_1_0());
						}
						lv_parameters_4_0=ruleKTypeReference
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getKMethodRule());
							}
							add(
								$current,
								"parameters",
								lv_parameters_4_0,
								"de.cau.cs.kieler.klassviz.text.ClassData.KTypeReference");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getKMethodAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleKTypeReference
entryRuleKTypeReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getKTypeReferenceRule()); }
	iv_ruleKTypeReference=ruleKTypeReference
	{ $current=$iv_ruleKTypeReference.current; }
	EOF;

// Rule KTypeReference
ruleKTypeReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_signature_0_0=RULE_ID
			{
				newLeafNode(lv_signature_0_0, grammarAccess.getKTypeReferenceAccess().getSignatureIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getKTypeReferenceRule());
				}
				setWithLastConsumed(
					$current,
					"signature",
					lv_signature_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleQualifiedID
entryRuleQualifiedID returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedIDRule()); }
	iv_ruleQualifiedID=ruleQualifiedID
	{ $current=$iv_ruleQualifiedID.current.getText(); }
	EOF;

// Rule QualifiedID
ruleQualifiedID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedIDAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getQualifiedIDAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRulePropertyValue
entryRulePropertyValue returns [String current=null]:
	{ newCompositeNode(grammarAccess.getPropertyValueRule()); }
	iv_rulePropertyValue=rulePropertyValue
	{ $current=$iv_rulePropertyValue.current.getText(); }
	EOF;

// Rule PropertyValue
rulePropertyValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_BOOLEAN_0=RULE_BOOLEAN
		{
			$current.merge(this_BOOLEAN_0);
		}
		{
			newLeafNode(this_BOOLEAN_0, grammarAccess.getPropertyValueAccess().getBOOLEANTerminalRuleCall_0());
		}
		    |
		this_STRING_1=RULE_STRING
		{
			$current.merge(this_STRING_1);
		}
		{
			newLeafNode(this_STRING_1, grammarAccess.getPropertyValueAccess().getSTRINGTerminalRuleCall_1());
		}
		    |
		{
			newCompositeNode(grammarAccess.getPropertyValueAccess().getFloatParserRuleCall_2());
		}
		this_Float_2=ruleFloat
		{
			$current.merge(this_Float_2);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPropertyValueAccess().getQualifiedIDParserRuleCall_3());
		}
		this_QualifiedID_3=ruleQualifiedID
		{
			$current.merge(this_QualifiedID_3);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleFloat
entryRuleFloat returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFloatRule()); }
	iv_ruleFloat=ruleFloat
	{ $current=$iv_ruleFloat.current.getText(); }
	EOF;

// Rule Float
ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_TFLOAT_0=RULE_TFLOAT
		{
			$current.merge(this_TFLOAT_0);
		}
		{
			newLeafNode(this_TFLOAT_0, grammarAccess.getFloatAccess().getTFLOATTerminalRuleCall_0());
		}
		    |
		this_NATURAL_1=RULE_NATURAL
		{
			$current.merge(this_NATURAL_1);
		}
		{
			newLeafNode(this_NATURAL_1, grammarAccess.getFloatAccess().getNATURALTerminalRuleCall_1());
		}
	)
;

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
