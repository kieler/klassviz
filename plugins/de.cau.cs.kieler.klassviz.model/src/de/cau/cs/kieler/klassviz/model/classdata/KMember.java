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
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Selected</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Selected</em>' attribute.
     * @see #setSelected(boolean)
     * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKMember_Selected()
     * @model default="true"
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

} // KMember
