package de.cau.cs.kieler.klassviz.text.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage;
import de.cau.cs.kieler.klassviz.model.classdata.KField;
import de.cau.cs.kieler.klassviz.model.classdata.KMethod;
import de.cau.cs.kieler.klassviz.model.classdata.KParameterTypeSignature;
import de.cau.cs.kieler.klassviz.model.classdata.KType;
import de.cau.cs.kieler.klassviz.model.classdata.KTypeSelection;
import de.cau.cs.kieler.klassviz.text.services.ClassDataGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractClassDataSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ClassDataGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ClassdataPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ClassdataPackage.KFIELD:
				if(context == grammarAccess.getKFieldRule()) {
					sequence_KField(context, (KField) semanticObject); 
					return; 
				}
				else break;
			case ClassdataPackage.KMETHOD:
				if(context == grammarAccess.getKMethodRule()) {
					sequence_KMethod(context, (KMethod) semanticObject); 
					return; 
				}
				else break;
			case ClassdataPackage.KPARAMETER_TYPE_SIGNATURE:
				if(context == grammarAccess.getKParameterTypeSignatureRule()) {
					sequence_KParameterTypeSignature(context, (KParameterTypeSignature) semanticObject); 
					return; 
				}
				else break;
			case ClassdataPackage.KTYPE:
				if(context == grammarAccess.getKTypeRule()) {
					sequence_KType(context, (KType) semanticObject); 
					return; 
				}
				else break;
			case ClassdataPackage.KTYPE_SELECTION:
				if(context == grammarAccess.getKTypeSelectionRule()) {
					sequence_KTypeSelection(context, (KTypeSelection) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_KField(EObject context, KField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (parameterTypeSignatures+=KParameterTypeSignature parameterTypeSignatures+=KParameterTypeSignature*)?)
	 */
	protected void sequence_KMethod(EObject context, KMethod semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=TypeSignature
	 */
	protected void sequence_KParameterTypeSignature(EObject context, KParameterTypeSignature semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ClassdataPackage.Literals.KPARAMETER_TYPE_SIGNATURE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ClassdataPackage.Literals.KPARAMETER_TYPE_SIGNATURE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getKParameterTypeSignatureAccess().getNameTypeSignatureParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((javaProjects+=QualifiedID | bundles+=QualifiedID)* types+=KType*)
	 */
	protected void sequence_KTypeSelection(EObject context, KTypeSelection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (qualifiedName=QualifiedID (fields+=KField | methods+=KMethod)*)
	 */
	protected void sequence_KType(EObject context, KType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
