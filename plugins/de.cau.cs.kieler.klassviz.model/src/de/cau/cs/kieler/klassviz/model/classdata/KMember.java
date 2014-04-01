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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KMember</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.KMember#isSelected <em>Selected</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.KMember#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.KMember#isStatic <em>Static</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.KMember#isFinal <em>Final</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.KMember#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKMember()
 * @model abstract="true"
 * @generated
 */
public interface KMember extends EObject {
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
     * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKMember_Selected()
     * @model default="false"
     * @generated
     */
    boolean isSelected();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.klassviz.model.classdata.KMember#isSelected <em>Selected</em>}' attribute.
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
     * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKMember_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.klassviz.model.classdata.KMember#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

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
     * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKMember_Static()
     * @model default="false" required="true"
     * @generated
     */
    boolean isStatic();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.klassviz.model.classdata.KMember#isStatic <em>Static</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Static</em>' attribute.
     * @see #isStatic()
     * @generated
     */
    void setStatic(boolean value);

    /**
     * Returns the value of the '<em><b>Final</b></em>' attribute.
     * The default value is <code>"false"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Final</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Final</em>' attribute.
     * @see #setFinal(boolean)
     * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKMember_Final()
     * @model default="false" required="true"
     * @generated
     */
    boolean isFinal();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.klassviz.model.classdata.KMember#isFinal <em>Final</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Final</em>' attribute.
     * @see #isFinal()
     * @generated
     */
    void setFinal(boolean value);

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
     * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKMember_Visibility()
     * @model default="PACKAGE" required="true"
     * @generated
     */
    KVisibility getVisibility();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.klassviz.model.classdata.KMember#getVisibility <em>Visibility</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Visibility</em>' attribute.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KVisibility
     * @see #getVisibility()
     * @generated
     */
    void setVisibility(KVisibility value);

} // KMember
