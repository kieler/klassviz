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
package de.cau.cs.kieler.klassviz.text.serializer;

import com.google.inject.Inject;
import de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage;
import de.cau.cs.kieler.klassviz.model.classdata.KClass;
import de.cau.cs.kieler.klassviz.model.classdata.KClassModel;
import de.cau.cs.kieler.klassviz.model.classdata.KDependency;
import de.cau.cs.kieler.klassviz.model.classdata.KEnum;
import de.cau.cs.kieler.klassviz.model.classdata.KField;
import de.cau.cs.kieler.klassviz.model.classdata.KInterface;
import de.cau.cs.kieler.klassviz.model.classdata.KMethod;
import de.cau.cs.kieler.klassviz.model.classdata.KOption;
import de.cau.cs.kieler.klassviz.model.classdata.KPackage;
import de.cau.cs.kieler.klassviz.model.classdata.KTypeReference;
import de.cau.cs.kieler.klassviz.text.services.ClassDataGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractClassDataSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ClassDataGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ClassdataPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ClassdataPackage.KCLASS:
				if (rule == grammarAccess.getKClassRule()) {
					sequence_KClass(context, (KClass) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getKTypeRule()) {
					sequence_KClass_KType(context, (KClass) semanticObject); 
					return; 
				}
				else break;
			case ClassdataPackage.KCLASS_MODEL:
				sequence_KClassModel(context, (KClassModel) semanticObject); 
				return; 
			case ClassdataPackage.KDEPENDENCY:
				sequence_KDependency(context, (KDependency) semanticObject); 
				return; 
			case ClassdataPackage.KENUM:
				if (rule == grammarAccess.getKEnumRule()) {
					sequence_KEnum(context, (KEnum) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getKTypeRule()) {
					sequence_KEnum_KType(context, (KEnum) semanticObject); 
					return; 
				}
				else break;
			case ClassdataPackage.KFIELD:
				sequence_KField(context, (KField) semanticObject); 
				return; 
			case ClassdataPackage.KINTERFACE:
				if (rule == grammarAccess.getKInterfaceRule()) {
					sequence_KInterface(context, (KInterface) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getKTypeRule()) {
					sequence_KInterface_KType(context, (KInterface) semanticObject); 
					return; 
				}
				else break;
			case ClassdataPackage.KMETHOD:
				sequence_KMethod(context, (KMethod) semanticObject); 
				return; 
			case ClassdataPackage.KOPTION:
				sequence_KOption(context, (KOption) semanticObject); 
				return; 
			case ClassdataPackage.KPACKAGE:
				sequence_KPackage(context, (KPackage) semanticObject); 
				return; 
			case ClassdataPackage.KTYPE_REFERENCE:
				sequence_KTypeReference(context, (KTypeReference) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     KClassModel returns KClassModel
	 *
	 * Constraint:
	 *     ((javaProjects+=STRING | bundles+=QualifiedID)* options+=KOption* packages+=KPackage*)
	 */
	protected void sequence_KClassModel(ISerializationContext context, KClassModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     KClass returns KClass
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_KClass(ISerializationContext context, KClass semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ClassdataPackage.Literals.KTYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ClassdataPackage.Literals.KTYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getKClassAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     KType returns KClass
	 *
	 * Constraint:
	 *     (name=ID (fields+=KField | methods+=KMethod | dependencies+=KDependency)*)
	 */
	protected void sequence_KClass_KType(ISerializationContext context, KClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     KDependency returns KDependency
	 *
	 * Constraint:
	 *     (label=STRING? target=[KType|ID])
	 */
	protected void sequence_KDependency(ISerializationContext context, KDependency semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     KEnum returns KEnum
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_KEnum(ISerializationContext context, KEnum semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ClassdataPackage.Literals.KTYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ClassdataPackage.Literals.KTYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getKEnumAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     KType returns KEnum
	 *
	 * Constraint:
	 *     (name=ID (fields+=KField | methods+=KMethod | dependencies+=KDependency)*)
	 */
	protected void sequence_KEnum_KType(ISerializationContext context, KEnum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     KField returns KField
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_KField(ISerializationContext context, KField semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ClassdataPackage.Literals.KMEMBER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ClassdataPackage.Literals.KMEMBER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getKFieldAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     KInterface returns KInterface
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_KInterface(ISerializationContext context, KInterface semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ClassdataPackage.Literals.KTYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ClassdataPackage.Literals.KTYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getKInterfaceAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     KType returns KInterface
	 *
	 * Constraint:
	 *     (name=ID (fields+=KField | methods+=KMethod | dependencies+=KDependency)*)
	 */
	protected void sequence_KInterface_KType(ISerializationContext context, KInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     KMethod returns KMethod
	 *
	 * Constraint:
	 *     (name=ID (parameters+=KTypeReference parameters+=KTypeReference*)?)
	 */
	protected void sequence_KMethod(ISerializationContext context, KMethod semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     KOption returns KOption
	 *
	 * Constraint:
	 *     (key=QualifiedID value=PropertyValue)
	 */
	protected void sequence_KOption(ISerializationContext context, KOption semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ClassdataPackage.Literals.KOPTION__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ClassdataPackage.Literals.KOPTION__KEY));
			if (transientValues.isValueTransient(semanticObject, ClassdataPackage.Literals.KOPTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ClassdataPackage.Literals.KOPTION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getKOptionAccess().getKeyQualifiedIDParserRuleCall_1_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getKOptionAccess().getValuePropertyValueParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     KPackage returns KPackage
	 *
	 * Constraint:
	 *     (name=QualifiedID types+=KType*)
	 */
	protected void sequence_KPackage(ISerializationContext context, KPackage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     KTypeReference returns KTypeReference
	 *
	 * Constraint:
	 *     signature=ID
	 */
	protected void sequence_KTypeReference(ISerializationContext context, KTypeReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ClassdataPackage.Literals.KTYPE_REFERENCE__SIGNATURE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ClassdataPackage.Literals.KTYPE_REFERENCE__SIGNATURE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getKTypeReferenceAccess().getSignatureIDTerminalRuleCall_0(), semanticObject.getSignature());
		feeder.finish();
	}
	
	
}
