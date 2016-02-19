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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KMethod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.KMethod#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.KMethod#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.KMethod#isAbstract <em>Abstract</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKMethod()
 * @model
 * @generated
 */
public interface KMethod extends KMember {
    /**
     * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.klassviz.model.classdata.KTypeReference}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameters</em>' containment reference list.
     * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKMethod_Parameters()
     * @model containment="true"
     * @generated
     */
    EList<KTypeReference> getParameters();

    /**
     * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Return Type</em>' containment reference.
     * @see #setReturnType(KTypeReference)
     * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKMethod_ReturnType()
     * @model containment="true" transient="true"
     * @generated
     */
    KTypeReference getReturnType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.klassviz.model.classdata.KMethod#getReturnType <em>Return Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Return Type</em>' containment reference.
     * @see #getReturnType()
     * @generated
     */
    void setReturnType(KTypeReference value);

    /**
     * Returns the value of the '<em><b>Abstract</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Abstract</em>' attribute.
     * @see #setAbstract(boolean)
     * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKMethod_Abstract()
     * @model default="false" required="true" transient="true"
     * @generated
     */
    boolean isAbstract();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.klassviz.model.classdata.KMethod#isAbstract <em>Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Abstract</em>' attribute.
     * @see #isAbstract()
     * @generated
     */
    void setAbstract(boolean value);

} // KMethod
