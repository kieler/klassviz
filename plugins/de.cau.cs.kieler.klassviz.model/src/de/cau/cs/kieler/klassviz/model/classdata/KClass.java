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
 * A representation of the model object '<em><b>KClass</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.KClass#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.KClass#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.KClass#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.KClass#isFinal <em>Final</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.KClass#isAbstract <em>Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKClass()
 * @model
 * @generated
 */
public interface KClass extends KType {
    /**
     * Returns the value of the '<em><b>Super Class</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Super Class</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Super Class</em>' reference.
     * @see #setSuperClass(KClass)
     * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKClass_SuperClass()
     * @model
     * @generated
     */
    KClass getSuperClass();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.klassviz.model.classdata.KClass#getSuperClass <em>Super Class</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Super Class</em>' reference.
     * @see #getSuperClass()
     * @generated
     */
    void setSuperClass(KClass value);

    /**
     * Returns the value of the '<em><b>Interfaces</b></em>' reference list.
     * The list contents are of type {@link de.cau.cs.kieler.klassviz.model.classdata.KInterface}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Interfaces</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Interfaces</em>' reference list.
     * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKClass_Interfaces()
     * @model
     * @generated
     */
    EList<KInterface> getInterfaces();

    /**
     * Returns the value of the '<em><b>Type Parameters</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type Parameters</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type Parameters</em>' attribute list.
     * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKClass_TypeParameters()
     * @model
     * @generated
     */
    EList<String> getTypeParameters();

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
     * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKClass_Final()
     * @model default="false" required="true"
     * @generated
     */
    boolean isFinal();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.klassviz.model.classdata.KClass#isFinal <em>Final</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Final</em>' attribute.
     * @see #isFinal()
     * @generated
     */
    void setFinal(boolean value);

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
     * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKClass_Abstract()
     * @model default="false" required="true"
     * @generated
     */
    boolean isAbstract();

    /**
     * Sets the value of the '{@link de.cau.cs.kieler.klassviz.model.classdata.KClass#isAbstract <em>Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Abstract</em>' attribute.
     * @see #isAbstract()
     * @generated
     */
    void setAbstract(boolean value);

} // KClass
