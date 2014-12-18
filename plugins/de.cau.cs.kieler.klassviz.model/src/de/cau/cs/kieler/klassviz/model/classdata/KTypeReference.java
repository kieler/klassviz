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
package de.cau.cs.kieler.klassviz.model.classdata;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KType Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.KTypeReference#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.KTypeReference#getSignature <em>Signature</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.KTypeReference#getReferenceType <em>Reference Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.KTypeReference#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKTypeReference()
 * @model
 * @generated
 */
public interface KTypeReference extends EObject {
    /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKTypeReference_Name()
	 * @model
	 * @generated
	 */
    String getName();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.klassviz.model.classdata.KTypeReference#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
    void setName(String value);

    /**
	 * Returns the value of the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Signature</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' attribute.
	 * @see #setSignature(String)
	 * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKTypeReference_Signature()
	 * @model
	 * @generated
	 */
    String getSignature();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.klassviz.model.classdata.KTypeReference#getSignature <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' attribute.
	 * @see #getSignature()
	 * @generated
	 */
    void setSignature(String value);

    /**
	 * Returns the value of the '<em><b>Reference Type</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reference Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Type</em>' reference.
	 * @see #setReferenceType(KType)
	 * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKTypeReference_ReferenceType()
	 * @model
	 * @generated
	 */
    KType getReferenceType();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.klassviz.model.classdata.KTypeReference#getReferenceType <em>Reference Type</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Type</em>' reference.
	 * @see #getReferenceType()
	 * @generated
	 */
    void setReferenceType(KType value);

				/**
	 * Returns the value of the '<em><b>Type Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.klassviz.model.classdata.KTypeReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Parameters</em>' containment reference list.
	 * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKTypeReference_TypeParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<KTypeReference> getTypeParameters();

} // KTypeReference
