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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.jdt.core.IMethod;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMethod</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.EMethod#getMethod <em>Method</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.EMethod#isSelected <em>Selected</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.EMethod#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.EMethod#getParameterTypeSignatures <em>Parameter Type Signatures</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getEMethod()
 * @model
 * @generated
 */
public interface EMethod extends EObject {
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
     * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getEMethod_Method()
     * @model dataType="de.cau.cs.kieler.klassviz.model.classdata.IMethod" required="true" transient="true"
     * @generated
     */
    IMethod getMethod();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.klassviz.model.classdata.EMethod#getMethod <em>Method</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Method</em>' attribute.
     * @see #getMethod()
     * @generated
     */
    void setMethod(IMethod value);

    /**
     * Returns the value of the '<em><b>Selected</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Selected</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Selected</em>' attribute.
     * @see #setSelected(boolean)
     * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getEMethod_Selected()
     * @model required="true"
     * @generated
     */
    boolean isSelected();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.klassviz.model.classdata.EMethod#isSelected <em>Selected</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Selected</em>' attribute.
     * @see #isSelected()
     * @generated
     */
    void setSelected(boolean value);

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
     * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getEMethod_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.klassviz.model.classdata.EMethod#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Parameter Type Signatures</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.klassviz.model.classdata.EParameterTypeSignature}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameter Type Signatures</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameter Type Signatures</em>' containment reference list.
     * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getEMethod_ParameterTypeSignatures()
     * @model containment="true"
     * @generated
     */
    EList<EParameterTypeSignature> getParameterTypeSignatures();

} // EMethod
