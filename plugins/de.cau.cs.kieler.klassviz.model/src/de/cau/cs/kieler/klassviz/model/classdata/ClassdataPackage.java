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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataFactory
 * @model kind="package"
 * @generated
 */
public interface ClassdataPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "classdata";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://kieler.cs.cau.de/classdata";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "classdata";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ClassdataPackage eINSTANCE = de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl.init();

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.klassviz.model.classdata.impl.ETypeImpl <em>EType</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ETypeImpl
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getEType()
     * @generated
     */
    int ETYPE = 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ETYPE__TYPE = 0;

    /**
     * The feature id for the '<em><b>Fields</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ETYPE__FIELDS = 1;

    /**
     * The feature id for the '<em><b>Methods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ETYPE__METHODS = 2;

    /**
     * The feature id for the '<em><b>Fully Qualified Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ETYPE__FULLY_QUALIFIED_NAME = 3;

    /**
     * The number of structural features of the '<em>EType</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ETYPE_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>EType</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ETYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.klassviz.model.classdata.impl.EFieldImpl <em>EField</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.EFieldImpl
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getEField()
     * @generated
     */
    int EFIELD = 1;

    /**
     * The feature id for the '<em><b>Field</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EFIELD__FIELD = 0;

    /**
     * The feature id for the '<em><b>Selected</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EFIELD__SELECTED = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EFIELD__NAME = 2;

    /**
     * The number of structural features of the '<em>EField</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EFIELD_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>EField</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EFIELD_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.klassviz.model.classdata.impl.EMethodImpl <em>EMethod</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.EMethodImpl
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getEMethod()
     * @generated
     */
    int EMETHOD = 2;

    /**
     * The feature id for the '<em><b>Method</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMETHOD__METHOD = 0;

    /**
     * The feature id for the '<em><b>Selected</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMETHOD__SELECTED = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMETHOD__NAME = 2;

    /**
     * The feature id for the '<em><b>Parameter Type Signatures</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMETHOD__PARAMETER_TYPE_SIGNATURES = 3;

    /**
     * The number of structural features of the '<em>EMethod</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMETHOD_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>EMethod</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMETHOD_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.klassviz.model.classdata.impl.EClassDataSelectionImpl <em>EClass Data Selection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.EClassDataSelectionImpl
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getEClassDataSelection()
     * @generated
     */
    int ECLASS_DATA_SELECTION = 3;

    /**
     * The feature id for the '<em><b>Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECLASS_DATA_SELECTION__TYPES = 0;

    /**
     * The number of structural features of the '<em>EClass Data Selection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECLASS_DATA_SELECTION_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>EClass Data Selection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECLASS_DATA_SELECTION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.klassviz.model.classdata.impl.EParameterTypeSignatureImpl <em>EParameter Type Signature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.EParameterTypeSignatureImpl
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getEParameterTypeSignature()
     * @generated
     */
    int EPARAMETER_TYPE_SIGNATURE = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPARAMETER_TYPE_SIGNATURE__NAME = 0;

    /**
     * The number of structural features of the '<em>EParameter Type Signature</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPARAMETER_TYPE_SIGNATURE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>EParameter Type Signature</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPARAMETER_TYPE_SIGNATURE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '<em>IMethod</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.jdt.core.IMethod
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getIMethod()
     * @generated
     */
    int IMETHOD = 5;

    /**
     * The meta object id for the '<em>IField</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.jdt.core.IField
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getIField()
     * @generated
     */
    int IFIELD = 6;

    /**
     * The meta object id for the '<em>IType</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.jdt.core.IType
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getIType()
     * @generated
     */
    int ITYPE = 7;


    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.klassviz.model.classdata.EType <em>EType</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EType</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.EType
     * @generated
     */
    EClass getEType();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.klassviz.model.classdata.EType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.EType#getType()
     * @see #getEType()
     * @generated
     */
    EAttribute getEType_Type();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.klassviz.model.classdata.EType#getFields <em>Fields</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Fields</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.EType#getFields()
     * @see #getEType()
     * @generated
     */
    EReference getEType_Fields();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.klassviz.model.classdata.EType#getMethods <em>Methods</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Methods</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.EType#getMethods()
     * @see #getEType()
     * @generated
     */
    EReference getEType_Methods();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.klassviz.model.classdata.EType#getFullyQualifiedName <em>Fully Qualified Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Fully Qualified Name</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.EType#getFullyQualifiedName()
     * @see #getEType()
     * @generated
     */
    EAttribute getEType_FullyQualifiedName();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.klassviz.model.classdata.EField <em>EField</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EField</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.EField
     * @generated
     */
    EClass getEField();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.klassviz.model.classdata.EField#getField <em>Field</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Field</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.EField#getField()
     * @see #getEField()
     * @generated
     */
    EAttribute getEField_Field();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.klassviz.model.classdata.EField#isSelected <em>Selected</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Selected</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.EField#isSelected()
     * @see #getEField()
     * @generated
     */
    EAttribute getEField_Selected();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.klassviz.model.classdata.EField#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.EField#getName()
     * @see #getEField()
     * @generated
     */
    EAttribute getEField_Name();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.klassviz.model.classdata.EMethod <em>EMethod</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EMethod</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.EMethod
     * @generated
     */
    EClass getEMethod();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.klassviz.model.classdata.EMethod#getMethod <em>Method</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Method</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.EMethod#getMethod()
     * @see #getEMethod()
     * @generated
     */
    EAttribute getEMethod_Method();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.klassviz.model.classdata.EMethod#isSelected <em>Selected</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Selected</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.EMethod#isSelected()
     * @see #getEMethod()
     * @generated
     */
    EAttribute getEMethod_Selected();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.klassviz.model.classdata.EMethod#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.EMethod#getName()
     * @see #getEMethod()
     * @generated
     */
    EAttribute getEMethod_Name();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.klassviz.model.classdata.EMethod#getParameterTypeSignatures <em>Parameter Type Signatures</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Parameter Type Signatures</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.EMethod#getParameterTypeSignatures()
     * @see #getEMethod()
     * @generated
     */
    EReference getEMethod_ParameterTypeSignatures();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.klassviz.model.classdata.EClassDataSelection <em>EClass Data Selection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EClass Data Selection</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.EClassDataSelection
     * @generated
     */
    EClass getEClassDataSelection();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.klassviz.model.classdata.EClassDataSelection#getTypes <em>Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Types</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.EClassDataSelection#getTypes()
     * @see #getEClassDataSelection()
     * @generated
     */
    EReference getEClassDataSelection_Types();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.klassviz.model.classdata.EParameterTypeSignature <em>EParameter Type Signature</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EParameter Type Signature</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.EParameterTypeSignature
     * @generated
     */
    EClass getEParameterTypeSignature();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.klassviz.model.classdata.EParameterTypeSignature#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.EParameterTypeSignature#getName()
     * @see #getEParameterTypeSignature()
     * @generated
     */
    EAttribute getEParameterTypeSignature_Name();

    /**
     * Returns the meta object for data type '{@link org.eclipse.jdt.core.IMethod <em>IMethod</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>IMethod</em>'.
     * @see org.eclipse.jdt.core.IMethod
     * @model instanceClass="org.eclipse.jdt.core.IMethod"
     * @generated
     */
    EDataType getIMethod();

    /**
     * Returns the meta object for data type '{@link org.eclipse.jdt.core.IField <em>IField</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>IField</em>'.
     * @see org.eclipse.jdt.core.IField
     * @model instanceClass="org.eclipse.jdt.core.IField"
     * @generated
     */
    EDataType getIField();

    /**
     * Returns the meta object for data type '{@link org.eclipse.jdt.core.IType <em>IType</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>IType</em>'.
     * @see org.eclipse.jdt.core.IType
     * @model instanceClass="org.eclipse.jdt.core.IType"
     * @generated
     */
    EDataType getIType();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ClassdataFactory getClassdataFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.klassviz.model.classdata.impl.ETypeImpl <em>EType</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ETypeImpl
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getEType()
         * @generated
         */
        EClass ETYPE = eINSTANCE.getEType();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ETYPE__TYPE = eINSTANCE.getEType_Type();

        /**
         * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ETYPE__FIELDS = eINSTANCE.getEType_Fields();

        /**
         * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ETYPE__METHODS = eINSTANCE.getEType_Methods();

        /**
         * The meta object literal for the '<em><b>Fully Qualified Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ETYPE__FULLY_QUALIFIED_NAME = eINSTANCE.getEType_FullyQualifiedName();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.klassviz.model.classdata.impl.EFieldImpl <em>EField</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.EFieldImpl
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getEField()
         * @generated
         */
        EClass EFIELD = eINSTANCE.getEField();

        /**
         * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EFIELD__FIELD = eINSTANCE.getEField_Field();

        /**
         * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EFIELD__SELECTED = eINSTANCE.getEField_Selected();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EFIELD__NAME = eINSTANCE.getEField_Name();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.klassviz.model.classdata.impl.EMethodImpl <em>EMethod</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.EMethodImpl
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getEMethod()
         * @generated
         */
        EClass EMETHOD = eINSTANCE.getEMethod();

        /**
         * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EMETHOD__METHOD = eINSTANCE.getEMethod_Method();

        /**
         * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EMETHOD__SELECTED = eINSTANCE.getEMethod_Selected();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EMETHOD__NAME = eINSTANCE.getEMethod_Name();

        /**
         * The meta object literal for the '<em><b>Parameter Type Signatures</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EMETHOD__PARAMETER_TYPE_SIGNATURES = eINSTANCE.getEMethod_ParameterTypeSignatures();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.klassviz.model.classdata.impl.EClassDataSelectionImpl <em>EClass Data Selection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.EClassDataSelectionImpl
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getEClassDataSelection()
         * @generated
         */
        EClass ECLASS_DATA_SELECTION = eINSTANCE.getEClassDataSelection();

        /**
         * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ECLASS_DATA_SELECTION__TYPES = eINSTANCE.getEClassDataSelection_Types();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.klassviz.model.classdata.impl.EParameterTypeSignatureImpl <em>EParameter Type Signature</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.EParameterTypeSignatureImpl
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getEParameterTypeSignature()
         * @generated
         */
        EClass EPARAMETER_TYPE_SIGNATURE = eINSTANCE.getEParameterTypeSignature();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EPARAMETER_TYPE_SIGNATURE__NAME = eINSTANCE.getEParameterTypeSignature_Name();

        /**
         * The meta object literal for the '<em>IMethod</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.jdt.core.IMethod
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getIMethod()
         * @generated
         */
        EDataType IMETHOD = eINSTANCE.getIMethod();

        /**
         * The meta object literal for the '<em>IField</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.jdt.core.IField
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getIField()
         * @generated
         */
        EDataType IFIELD = eINSTANCE.getIField();

        /**
         * The meta object literal for the '<em>IType</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.jdt.core.IType
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getIType()
         * @generated
         */
        EDataType ITYPE = eINSTANCE.getIType();

    }

} //ClassdataPackage
