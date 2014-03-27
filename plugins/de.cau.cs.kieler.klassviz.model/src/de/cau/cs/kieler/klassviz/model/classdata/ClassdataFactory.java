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
     * Returns a new object of class '<em>EType</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EType</em>'.
     * @generated
     */
    EType createEType();

    /**
     * Returns a new object of class '<em>EField</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EField</em>'.
     * @generated
     */
    EField createEField();

    /**
     * Returns a new object of class '<em>EMethod</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EMethod</em>'.
     * @generated
     */
    EMethod createEMethod();

    /**
     * Returns a new object of class '<em>EClass Data Selection</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EClass Data Selection</em>'.
     * @generated
     */
    EClassDataSelection createEClassDataSelection();

    /**
     * Returns a new object of class '<em>EParameter Type Signature</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EParameter Type Signature</em>'.
     * @generated
     */
    EParameterTypeSignature createEParameterTypeSignature();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ClassdataPackage getClassdataPackage();

} //ClassdataFactory
