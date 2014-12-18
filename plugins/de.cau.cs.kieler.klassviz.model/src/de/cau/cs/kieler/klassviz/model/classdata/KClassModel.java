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
 * A representation of the model object '<em><b>KClass Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.KClassModel#getJavaProjects <em>Java Projects</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.KClassModel#getBundles <em>Bundles</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.KClassModel#getPackages <em>Packages</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.KClassModel#isResolved <em>Resolved</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.KClassModel#getOptions <em>Options</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.KClassModel#getMetamodels <em>Metamodels</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKClassModel()
 * @model
 * @generated
 */
public interface KClassModel extends EObject {
    /**
	 * Returns the value of the '<em><b>Java Projects</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Java Projects</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Java Projects</em>' attribute list.
	 * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKClassModel_JavaProjects()
	 * @model
	 * @generated
	 */
    EList<String> getJavaProjects();

    /**
	 * Returns the value of the '<em><b>Bundles</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Bundles</em>' attribute list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Bundles</em>' attribute list.
	 * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKClassModel_Bundles()
	 * @model
	 * @generated
	 */
    EList<String> getBundles();

    /**
	 * Returns the value of the '<em><b>Packages</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.klassviz.model.classdata.KPackage}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Packages</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Packages</em>' containment reference list.
	 * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKClassModel_Packages()
	 * @model containment="true"
	 * @generated
	 */
    EList<KPackage> getPackages();

    /**
	 * Returns the value of the '<em><b>Resolved</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resolved</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolved</em>' attribute.
	 * @see #setResolved(boolean)
	 * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKClassModel_Resolved()
	 * @model default="false"
	 * @generated
	 */
    boolean isResolved();

    /**
	 * Sets the value of the '{@link de.cau.cs.kieler.klassviz.model.classdata.KClassModel#isResolved <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolved</em>' attribute.
	 * @see #isResolved()
	 * @generated
	 */
    void setResolved(boolean value);

    /**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link de.cau.cs.kieler.klassviz.model.classdata.KOption}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKClassModel_Options()
	 * @model containment="true"
	 * @generated
	 */
    EList<KOption> getOptions();

    /**
	 * Returns the value of the '<em><b>Metamodels</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * a list of Strings denoting referenced meta model definitions in the form
	 * bundle.ID/path/to/metamodel.file
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metamodels</em>' attribute list.
	 * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKClassModel_Metamodels()
	 * @model
	 * @generated
	 */
    EList<String> getMetamodels();

} // KClassModel
