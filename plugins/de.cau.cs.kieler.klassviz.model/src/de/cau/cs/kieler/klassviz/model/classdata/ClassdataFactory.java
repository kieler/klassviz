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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage
 * @generated
 */
public interface ClassdataFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ClassdataFactory eINSTANCE = de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataFactoryImpl.init();

    /**
     * Returns a new object of class '<em>KType</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>KType</em>'.
     * @generated
     */
    KType createKType();

    /**
     * Returns a new object of class '<em>KField</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>KField</em>'.
     * @generated
     */
    KField createKField();

    /**
     * Returns a new object of class '<em>KMethod</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>KMethod</em>'.
     * @generated
     */
    KMethod createKMethod();

    /**
     * Returns a new object of class '<em>KParameter Type Signature</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>KParameter Type Signature</em>'.
     * @generated
     */
    KParameterTypeSignature createKParameterTypeSignature();

    /**
     * Returns a new object of class '<em>KType Selection</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>KType Selection</em>'.
     * @generated
     */
    KTypeSelection createKTypeSelection();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ClassdataPackage getClassdataPackage();

} //ClassdataFactory
