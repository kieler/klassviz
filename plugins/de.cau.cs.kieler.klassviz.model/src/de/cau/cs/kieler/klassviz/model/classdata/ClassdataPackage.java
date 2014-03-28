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
     * The meta object id for the '{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KTypeImpl <em>KType</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.KTypeImpl
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getKType()
     * @generated
     */
    int KTYPE = 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KTYPE__TYPE = 0;

    /**
     * The feature id for the '<em><b>Fields</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KTYPE__FIELDS = 1;

    /**
     * The feature id for the '<em><b>Methods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KTYPE__METHODS = 2;

    /**
     * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KTYPE__QUALIFIED_NAME = 3;

    /**
     * The number of structural features of the '<em>KType</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KTYPE_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>KType</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KTYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KMemberImpl <em>KMember</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.KMemberImpl
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getKMember()
     * @generated
     */
    int KMEMBER = 1;

    /**
     * The feature id for the '<em><b>Selected</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KMEMBER__SELECTED = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KMEMBER__NAME = 1;

    /**
     * The number of structural features of the '<em>KMember</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KMEMBER_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>KMember</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KMEMBER_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KFieldImpl <em>KField</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.KFieldImpl
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getKField()
     * @generated
     */
    int KFIELD = 2;

    /**
     * The feature id for the '<em><b>Selected</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KFIELD__SELECTED = KMEMBER__SELECTED;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KFIELD__NAME = KMEMBER__NAME;

    /**
     * The feature id for the '<em><b>Field</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KFIELD__FIELD = KMEMBER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>KField</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KFIELD_FEATURE_COUNT = KMEMBER_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>KField</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KFIELD_OPERATION_COUNT = KMEMBER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KMethodImpl <em>KMethod</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.KMethodImpl
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getKMethod()
     * @generated
     */
    int KMETHOD = 3;

    /**
     * The feature id for the '<em><b>Selected</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KMETHOD__SELECTED = KMEMBER__SELECTED;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KMETHOD__NAME = KMEMBER__NAME;

    /**
     * The feature id for the '<em><b>Method</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KMETHOD__METHOD = KMEMBER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parameter Type Signatures</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KMETHOD__PARAMETER_TYPE_SIGNATURES = KMEMBER_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>KMethod</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KMETHOD_FEATURE_COUNT = KMEMBER_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>KMethod</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KMETHOD_OPERATION_COUNT = KMEMBER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KParameterTypeSignatureImpl <em>KParameter Type Signature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.KParameterTypeSignatureImpl
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getKParameterTypeSignature()
     * @generated
     */
    int KPARAMETER_TYPE_SIGNATURE = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KPARAMETER_TYPE_SIGNATURE__NAME = 0;

    /**
     * The number of structural features of the '<em>KParameter Type Signature</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KPARAMETER_TYPE_SIGNATURE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>KParameter Type Signature</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KPARAMETER_TYPE_SIGNATURE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KTypeSelectionImpl <em>KType Selection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.KTypeSelectionImpl
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getKTypeSelection()
     * @generated
     */
    int KTYPE_SELECTION = 5;

    /**
     * The feature id for the '<em><b>Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KTYPE_SELECTION__TYPES = 0;

    /**
     * The feature id for the '<em><b>Java Projects</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KTYPE_SELECTION__JAVA_PROJECTS = 1;

    /**
     * The feature id for the '<em><b>Bundles</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KTYPE_SELECTION__BUNDLES = 2;

    /**
     * The number of structural features of the '<em>KType Selection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KTYPE_SELECTION_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>KType Selection</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KTYPE_SELECTION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '<em>IType</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.jdt.core.IType
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getIType()
     * @generated
     */
    int ITYPE = 6;

    /**
     * The meta object id for the '<em>IField</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.jdt.core.IField
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getIField()
     * @generated
     */
    int IFIELD = 7;

    /**
     * The meta object id for the '<em>IMethod</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.jdt.core.IMethod
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getIMethod()
     * @generated
     */
    int IMETHOD = 8;


    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.klassviz.model.classdata.KType <em>KType</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>KType</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KType
     * @generated
     */
    EClass getKType();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.klassviz.model.classdata.KType#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KType#getType()
     * @see #getKType()
     * @generated
     */
    EAttribute getKType_Type();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.klassviz.model.classdata.KType#getFields <em>Fields</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Fields</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KType#getFields()
     * @see #getKType()
     * @generated
     */
    EReference getKType_Fields();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.klassviz.model.classdata.KType#getMethods <em>Methods</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Methods</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KType#getMethods()
     * @see #getKType()
     * @generated
     */
    EReference getKType_Methods();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.klassviz.model.classdata.KType#getQualifiedName <em>Qualified Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Qualified Name</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KType#getQualifiedName()
     * @see #getKType()
     * @generated
     */
    EAttribute getKType_QualifiedName();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.klassviz.model.classdata.KMember <em>KMember</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>KMember</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KMember
     * @generated
     */
    EClass getKMember();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.klassviz.model.classdata.KMember#isSelected <em>Selected</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Selected</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KMember#isSelected()
     * @see #getKMember()
     * @generated
     */
    EAttribute getKMember_Selected();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.klassviz.model.classdata.KMember#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KMember#getName()
     * @see #getKMember()
     * @generated
     */
    EAttribute getKMember_Name();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.klassviz.model.classdata.KField <em>KField</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>KField</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KField
     * @generated
     */
    EClass getKField();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.klassviz.model.classdata.KField#getField <em>Field</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Field</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KField#getField()
     * @see #getKField()
     * @generated
     */
    EAttribute getKField_Field();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.klassviz.model.classdata.KMethod <em>KMethod</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>KMethod</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KMethod
     * @generated
     */
    EClass getKMethod();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.klassviz.model.classdata.KMethod#getMethod <em>Method</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Method</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KMethod#getMethod()
     * @see #getKMethod()
     * @generated
     */
    EAttribute getKMethod_Method();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.klassviz.model.classdata.KMethod#getParameterTypeSignatures <em>Parameter Type Signatures</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Parameter Type Signatures</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KMethod#getParameterTypeSignatures()
     * @see #getKMethod()
     * @generated
     */
    EReference getKMethod_ParameterTypeSignatures();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.klassviz.model.classdata.KParameterTypeSignature <em>KParameter Type Signature</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>KParameter Type Signature</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KParameterTypeSignature
     * @generated
     */
    EClass getKParameterTypeSignature();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.klassviz.model.classdata.KParameterTypeSignature#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KParameterTypeSignature#getName()
     * @see #getKParameterTypeSignature()
     * @generated
     */
    EAttribute getKParameterTypeSignature_Name();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.klassviz.model.classdata.KTypeSelection <em>KType Selection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>KType Selection</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KTypeSelection
     * @generated
     */
    EClass getKTypeSelection();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.klassviz.model.classdata.KTypeSelection#getTypes <em>Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Types</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KTypeSelection#getTypes()
     * @see #getKTypeSelection()
     * @generated
     */
    EReference getKTypeSelection_Types();

    /**
     * Returns the meta object for the attribute list '{@link de.cau.cs.kieler.klassviz.model.classdata.KTypeSelection#getJavaProjects <em>Java Projects</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Java Projects</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KTypeSelection#getJavaProjects()
     * @see #getKTypeSelection()
     * @generated
     */
    EAttribute getKTypeSelection_JavaProjects();

    /**
     * Returns the meta object for the attribute list '{@link de.cau.cs.kieler.klassviz.model.classdata.KTypeSelection#getBundles <em>Bundles</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Bundles</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KTypeSelection#getBundles()
     * @see #getKTypeSelection()
     * @generated
     */
    EAttribute getKTypeSelection_Bundles();

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
         * The meta object literal for the '{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KTypeImpl <em>KType</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.KTypeImpl
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getKType()
         * @generated
         */
        EClass KTYPE = eINSTANCE.getKType();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KTYPE__TYPE = eINSTANCE.getKType_Type();

        /**
         * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KTYPE__FIELDS = eINSTANCE.getKType_Fields();

        /**
         * The meta object literal for the '<em><b>Methods</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KTYPE__METHODS = eINSTANCE.getKType_Methods();

        /**
         * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KTYPE__QUALIFIED_NAME = eINSTANCE.getKType_QualifiedName();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KMemberImpl <em>KMember</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.KMemberImpl
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getKMember()
         * @generated
         */
        EClass KMEMBER = eINSTANCE.getKMember();

        /**
         * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KMEMBER__SELECTED = eINSTANCE.getKMember_Selected();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KMEMBER__NAME = eINSTANCE.getKMember_Name();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KFieldImpl <em>KField</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.KFieldImpl
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getKField()
         * @generated
         */
        EClass KFIELD = eINSTANCE.getKField();

        /**
         * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KFIELD__FIELD = eINSTANCE.getKField_Field();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KMethodImpl <em>KMethod</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.KMethodImpl
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getKMethod()
         * @generated
         */
        EClass KMETHOD = eINSTANCE.getKMethod();

        /**
         * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KMETHOD__METHOD = eINSTANCE.getKMethod_Method();

        /**
         * The meta object literal for the '<em><b>Parameter Type Signatures</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KMETHOD__PARAMETER_TYPE_SIGNATURES = eINSTANCE.getKMethod_ParameterTypeSignatures();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KParameterTypeSignatureImpl <em>KParameter Type Signature</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.KParameterTypeSignatureImpl
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getKParameterTypeSignature()
         * @generated
         */
        EClass KPARAMETER_TYPE_SIGNATURE = eINSTANCE.getKParameterTypeSignature();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KPARAMETER_TYPE_SIGNATURE__NAME = eINSTANCE.getKParameterTypeSignature_Name();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KTypeSelectionImpl <em>KType Selection</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.KTypeSelectionImpl
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getKTypeSelection()
         * @generated
         */
        EClass KTYPE_SELECTION = eINSTANCE.getKTypeSelection();

        /**
         * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KTYPE_SELECTION__TYPES = eINSTANCE.getKTypeSelection_Types();

        /**
         * The meta object literal for the '<em><b>Java Projects</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KTYPE_SELECTION__JAVA_PROJECTS = eINSTANCE.getKTypeSelection_JavaProjects();

        /**
         * The meta object literal for the '<em><b>Bundles</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KTYPE_SELECTION__BUNDLES = eINSTANCE.getKTypeSelection_Bundles();

        /**
         * The meta object literal for the '<em>IType</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.jdt.core.IType
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getIType()
         * @generated
         */
        EDataType ITYPE = eINSTANCE.getIType();

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
         * The meta object literal for the '<em>IMethod</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.jdt.core.IMethod
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getIMethod()
         * @generated
         */
        EDataType IMETHOD = eINSTANCE.getIMethod();

    }

} //ClassdataPackage
