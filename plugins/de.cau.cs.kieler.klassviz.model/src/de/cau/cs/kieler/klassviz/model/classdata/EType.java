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

import org.eclipse.jdt.core.IType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EType</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.EType#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.EType#getFields <em>Fields</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.EType#getMethods <em>Methods</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.EType#getFullyQualifiedName <em>Fully Qualified Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getEType()
 * @model
 * @generated
 */
public interface EType extends EObject {
    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(IType)
     * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getEType_Type()
     * @model dataType="de.cau.cs.kieler.klassviz.model.classdata.IType" required="true" transient="true"
     * @generated
     */
    IType getType();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.klassviz.model.classdata.EType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(IType value);

    /**
     * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.klassviz.model.classdata.EField}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fields</em>' containment reference list.
     * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getEType_Fields()
     * @model containment="true" keys="field"
     * @generated
     */
    EList<EField> getFields();

    /**
     * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.klassviz.model.classdata.EMethod}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Methods</em>' containment reference list.
     * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getEType_Methods()
     * @model containment="true"
     * @generated
     */
    EList<EMethod> getMethods();

    /**
     * Returns the value of the '<em><b>Fully Qualified Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fully Qualified Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fully Qualified Name</em>' attribute.
     * @see #setFullyQualifiedName(String)
     * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getEType_FullyQualifiedName()
     * @model required="true"
     * @generated
     */
    String getFullyQualifiedName();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.klassviz.model.classdata.EType#getFullyQualifiedName <em>Fully Qualified Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fully Qualified Name</em>' attribute.
     * @see #getFullyQualifiedName()
     * @generated
     */
    void setFullyQualifiedName(String value);

} // EType
