package de.cau.cs.kieler.klassviz.text.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage;
import de.cau.cs.kieler.klassviz.model.classdata.KClass;
import de.cau.cs.kieler.klassviz.model.classdata.KClassModel;
import de.cau.cs.kieler.klassviz.model.classdata.KEnum;
import de.cau.cs.kieler.klassviz.model.classdata.KField;
import de.cau.cs.kieler.klassviz.model.classdata.KInterface;
import de.cau.cs.kieler.klassviz.model.classdata.KMethod;
import de.cau.cs.kieler.klassviz.model.classdata.KPackage;
import de.cau.cs.kieler.klassviz.model.classdata.KTypeReference;
import de.cau.cs.kieler.klassviz.text.services.ClassDataGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public abstract class AbstractClassDataSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ClassDataGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ClassdataPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ClassdataPackage.KCLASS:
				if(context == grammarAccess.getKClassRule() ||
				   context == grammarAccess.getKTypeRule()) {
					sequence_KClass(context, (KClass) semanticObject); 
					return; 
				}
				else break;
			case ClassdataPackage.KCLASS_MODEL:
				if(context == grammarAccess.getKClassModelRule()) {
					sequence_KClassModel(context, (KClassModel) semanticObject); 
					return; 
				}
				else break;
			case ClassdataPackage.KENUM:
				if(context == grammarAccess.getKEnumRule() ||
				   context == grammarAccess.getKTypeRule()) {
					sequence_KEnum(context, (KEnum) semanticObject); 
					return; 
				}
				else break;
			case ClassdataPackage.KFIELD:
				if(context == grammarAccess.getKFieldRule()) {
					sequence_KField(context, (KField) semanticObject); 
					return; 
				}
				else break;
			case ClassdataPackage.KINTERFACE:
				if(context == grammarAccess.getKInterfaceRule() ||
				   context == grammarAccess.getKTypeRule()) {
					sequence_KInterface(context, (KInterface) semanticObject); 
					return; 
				}
				else break;
			case ClassdataPackage.KMETHOD:
				if(context == grammarAccess.getKMethodRule()) {
					sequence_KMethod(context, (KMethod) semanticObject); 
					return; 
				}
				else break;
			case ClassdataPackage.KPACKAGE:
				if(context == grammarAccess.getKPackageRule()) {
					sequence_KPackage(context, (KPackage) semanticObject); 
					return; 
				}
				else break;
			case ClassdataPackage.KTYPE_REFERENCE:
				if(context == grammarAccess.getKTypeReferenceRule()) {
					sequence_KTypeReference(context, (KTypeReference) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     ((javaProjects+=QualifiedID | bundles+=QualifiedID)* packages+=KPackage*)
	 */
	protected void sequence_KClassModel(EObject context, KClassModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (fields+=KField | methods+=KMethod)*)
	 */
	protected void sequence_KClass(EObject context, KClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (fields+=KField | methods+=KMethod)*)
	 */
	protected void sequence_KEnum(EObject context, KEnum semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (name=ID (fields+=KField | methods+=KMethod)*)
	 */
	protected void sequence_KInterface(EObject context, KInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (parameters+=KTypeReference parameters+=KTypeReference*)?)
	 */
	protected void sequence_KMethod(EObject context, KMethod semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedID types+=KType*)
	 */
	protected void sequence_KPackage(EObject context, KPackage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     signature=TypeSignature
	 */
	protected void sequence_KTypeReference(EObject context, KTypeReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
