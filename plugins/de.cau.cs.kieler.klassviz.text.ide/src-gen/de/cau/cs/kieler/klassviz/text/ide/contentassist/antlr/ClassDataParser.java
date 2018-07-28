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
package de.cau.cs.kieler.klassviz.text.ide.contentassist.antlr;

import com.google.inject.Inject;
import de.cau.cs.kieler.klassviz.text.ide.contentassist.antlr.internal.InternalClassDataParser;
import de.cau.cs.kieler.klassviz.text.services.ClassDataGrammarAccess;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class ClassDataParser extends AbstractContentAssistParser {

	@Inject
	private ClassDataGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalClassDataParser createParser() {
		InternalClassDataParser result = new InternalClassDataParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getKClassModelAccess().getAlternatives_1_1(), "rule__KClassModel__Alternatives_1_1");
					put(grammarAccess.getKTypeAccess().getAlternatives_0(), "rule__KType__Alternatives_0");
					put(grammarAccess.getKTypeAccess().getAlternatives_1_1(), "rule__KType__Alternatives_1_1");
					put(grammarAccess.getPropertyValueAccess().getAlternatives(), "rule__PropertyValue__Alternatives");
					put(grammarAccess.getFloatAccess().getAlternatives(), "rule__Float__Alternatives");
					put(grammarAccess.getKClassModelAccess().getGroup(), "rule__KClassModel__Group__0");
					put(grammarAccess.getKClassModelAccess().getGroup_1(), "rule__KClassModel__Group_1__0");
					put(grammarAccess.getKClassModelAccess().getGroup_1_1_0(), "rule__KClassModel__Group_1_1_0__0");
					put(grammarAccess.getKClassModelAccess().getGroup_1_1_1(), "rule__KClassModel__Group_1_1_1__0");
					put(grammarAccess.getKOptionAccess().getGroup(), "rule__KOption__Group__0");
					put(grammarAccess.getKPackageAccess().getGroup(), "rule__KPackage__Group__0");
					put(grammarAccess.getKTypeAccess().getGroup(), "rule__KType__Group__0");
					put(grammarAccess.getKTypeAccess().getGroup_1(), "rule__KType__Group_1__0");
					put(grammarAccess.getKClassAccess().getGroup(), "rule__KClass__Group__0");
					put(grammarAccess.getKInterfaceAccess().getGroup(), "rule__KInterface__Group__0");
					put(grammarAccess.getKEnumAccess().getGroup(), "rule__KEnum__Group__0");
					put(grammarAccess.getKDependencyAccess().getGroup(), "rule__KDependency__Group__0");
					put(grammarAccess.getKMethodAccess().getGroup(), "rule__KMethod__Group__0");
					put(grammarAccess.getKMethodAccess().getGroup_2(), "rule__KMethod__Group_2__0");
					put(grammarAccess.getKMethodAccess().getGroup_2_1(), "rule__KMethod__Group_2_1__0");
					put(grammarAccess.getQualifiedIDAccess().getGroup(), "rule__QualifiedID__Group__0");
					put(grammarAccess.getQualifiedIDAccess().getGroup_1(), "rule__QualifiedID__Group_1__0");
					put(grammarAccess.getKClassModelAccess().getJavaProjectsAssignment_1_1_0_1(), "rule__KClassModel__JavaProjectsAssignment_1_1_0_1");
					put(grammarAccess.getKClassModelAccess().getBundlesAssignment_1_1_1_1(), "rule__KClassModel__BundlesAssignment_1_1_1_1");
					put(grammarAccess.getKClassModelAccess().getOptionsAssignment_2(), "rule__KClassModel__OptionsAssignment_2");
					put(grammarAccess.getKClassModelAccess().getPackagesAssignment_3(), "rule__KClassModel__PackagesAssignment_3");
					put(grammarAccess.getKOptionAccess().getKeyAssignment_1(), "rule__KOption__KeyAssignment_1");
					put(grammarAccess.getKOptionAccess().getValueAssignment_3(), "rule__KOption__ValueAssignment_3");
					put(grammarAccess.getKPackageAccess().getNameAssignment_1(), "rule__KPackage__NameAssignment_1");
					put(grammarAccess.getKPackageAccess().getTypesAssignment_3(), "rule__KPackage__TypesAssignment_3");
					put(grammarAccess.getKTypeAccess().getFieldsAssignment_1_1_0(), "rule__KType__FieldsAssignment_1_1_0");
					put(grammarAccess.getKTypeAccess().getMethodsAssignment_1_1_1(), "rule__KType__MethodsAssignment_1_1_1");
					put(grammarAccess.getKTypeAccess().getDependenciesAssignment_1_1_2(), "rule__KType__DependenciesAssignment_1_1_2");
					put(grammarAccess.getKClassAccess().getNameAssignment_1(), "rule__KClass__NameAssignment_1");
					put(grammarAccess.getKInterfaceAccess().getNameAssignment_1(), "rule__KInterface__NameAssignment_1");
					put(grammarAccess.getKEnumAccess().getNameAssignment_1(), "rule__KEnum__NameAssignment_1");
					put(grammarAccess.getKDependencyAccess().getLabelAssignment_1(), "rule__KDependency__LabelAssignment_1");
					put(grammarAccess.getKDependencyAccess().getTargetAssignment_2(), "rule__KDependency__TargetAssignment_2");
					put(grammarAccess.getKFieldAccess().getNameAssignment(), "rule__KField__NameAssignment");
					put(grammarAccess.getKMethodAccess().getNameAssignment_0(), "rule__KMethod__NameAssignment_0");
					put(grammarAccess.getKMethodAccess().getParametersAssignment_2_0(), "rule__KMethod__ParametersAssignment_2_0");
					put(grammarAccess.getKMethodAccess().getParametersAssignment_2_1_1(), "rule__KMethod__ParametersAssignment_2_1_1");
					put(grammarAccess.getKTypeReferenceAccess().getSignatureAssignment(), "rule__KTypeReference__SignatureAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ClassDataGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ClassDataGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
