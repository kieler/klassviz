/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
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

import org.eclipse.jdt.core.IMethod;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KMethod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.KMethod#getMethod <em>Method</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.KMethod#getParameterTypeSignatures <em>Parameter Type Signatures</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKMethod()
 * @model
 * @generated
 */
public interface KMethod extends KMember {
    /**
     * Returns the value of the '<em><b>Method</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Method</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Method</em>' attribute.
     * @see #setMethod(IMethod)
     * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKMethod_Method()
     * @model dataType="de.cau.cs.kieler.klassviz.model.classdata.IMethod" required="true" transient="true"
     * @generated
     */
    IMethod getMethod();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.klassviz.model.classdata.KMethod#getMethod <em>Method</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Method</em>' attribute.
     * @see #getMethod()
     * @generated
     */
    void setMethod(IMethod value);

    /**
     * Returns the value of the '<em><b>Parameter Type Signatures</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.klassviz.model.classdata.KParameterTypeSignature}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameter Type Signatures</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameter Type Signatures</em>' containment reference list.
     * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKMethod_ParameterTypeSignatures()
     * @model containment="true"
     * @generated
     */
    EList<KParameterTypeSignature> getParameterTypeSignatures();

} // KMethod
