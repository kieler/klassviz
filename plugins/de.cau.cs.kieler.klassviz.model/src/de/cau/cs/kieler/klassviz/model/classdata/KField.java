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

import org.eclipse.jdt.core.IField;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KField</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.KField#getField <em>Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKField()
 * @model
 * @generated
 */
public interface KField extends KMember {
    /**
     * Returns the value of the '<em><b>Field</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Field</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Field</em>' attribute.
     * @see #setField(IField)
     * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKField_Field()
     * @model dataType="de.cau.cs.kieler.klassviz.model.classdata.IField" transient="true"
     * @generated
     */
    IField getField();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.klassviz.model.classdata.KField#getField <em>Field</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Field</em>' attribute.
     * @see #getField()
     * @generated
     */
    void setField(IField value);

} // KField
