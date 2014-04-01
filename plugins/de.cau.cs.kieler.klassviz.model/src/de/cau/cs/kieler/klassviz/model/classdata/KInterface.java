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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>KInterface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.KInterface#getSuperInterfaces <em>Super Interfaces</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.KInterface#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKInterface()
 * @model
 * @generated
 */
public interface KInterface extends KType {
    /**
     * Returns the value of the '<em><b>Super Interfaces</b></em>' reference list.
     * The list contents are of type {@link de.cau.cs.kieler.klassviz.model.classdata.KInterface}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Super Interfaces</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Super Interfaces</em>' reference list.
     * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKInterface_SuperInterfaces()
     * @model
     * @generated
     */
    EList<KInterface> getSuperInterfaces();

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
     * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKInterface_TypeParameters()
     * @model
     * @generated
     */
    EList<String> getTypeParameters();

} // KInterface
