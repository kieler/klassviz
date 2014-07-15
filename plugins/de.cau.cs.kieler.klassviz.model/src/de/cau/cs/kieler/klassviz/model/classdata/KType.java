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
 * A representation of the model object '<em><b>KType</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.KType#isSelected <em>Selected</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.KType#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.KType#getFields <em>Fields</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.KType#getMethods <em>Methods</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.KType#getNestedTypes <em>Nested Types</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.KType#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.KType#isStatic <em>Static</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.KType#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKType()
 * @model abstract="true"
 * @generated
 */
public interface KType extends EObject {
    /**
     * Returns the value of the '<em><b>Selected</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Selected</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Selected</em>' attribute.
     * @see #setSelected(boolean)
     * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKType_Selected()
     * @model default="false"
     * @generated
     */
    boolean isSelected();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.klassviz.model.classdata.KType#isSelected <em>Selected</em>}' attribute.
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
     * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKType_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.klassviz.model.classdata.KType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.klassviz.model.classdata.KField}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Fields</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Fields</em>' containment reference list.
     * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKType_Fields()
     * @model containment="true"
     * @generated
     */
    EList<KField> getFields();

    /**
     * Returns the value of the '<em><b>Methods</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.klassviz.model.classdata.KMethod}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Methods</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Methods</em>' containment reference list.
     * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKType_Methods()
     * @model containment="true"
     * @generated
     */
    EList<KMethod> getMethods();

    /**
     * Returns the value of the '<em><b>Nested Types</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.klassviz.model.classdata.KType}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Nested Types</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nested Types</em>' containment reference list.
     * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKType_NestedTypes()
     * @model containment="true"
     * @generated
     */
    EList<KType> getNestedTypes();

    /**
     * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
     * The list contents are of type {@link de.cau.cs.kieler.klassviz.model.classdata.KDependency}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Dependencies</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Dependencies</em>' containment reference list.
     * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKType_Dependencies()
     * @model containment="true"
     * @generated
     */
    EList<KDependency> getDependencies();

    /**
     * Returns the value of the '<em><b>Static</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Static</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Static</em>' attribute.
     * @see #setStatic(boolean)
     * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKType_Static()
     * @model default="false" required="true"
     * @generated
     */
    boolean isStatic();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.klassviz.model.classdata.KType#isStatic <em>Static</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Static</em>' attribute.
     * @see #isStatic()
     * @generated
     */
    void setStatic(boolean value);

    /**
     * Returns the value of the '<em><b>Visibility</b></em>' attribute.
     * The default value is <code>"PACKAGE"</code>.
     * The literals are from the enumeration {@link de.cau.cs.kieler.klassviz.model.classdata.KVisibility}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Visibility</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Visibility</em>' attribute.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KVisibility
     * @see #setVisibility(KVisibility)
     * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKType_Visibility()
     * @model default="PACKAGE" required="true"
     * @generated
     */
    KVisibility getVisibility();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.klassviz.model.classdata.KType#getVisibility <em>Visibility</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Visibility</em>' attribute.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KVisibility
     * @see #getVisibility()
     * @generated
     */
    void setVisibility(KVisibility value);

} // KType
