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
import org.eclipse.emf.ecore.EEnum;
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
     * The meta object id for the '{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KClassModelImpl <em>KClass Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.KClassModelImpl
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getKClassModel()
     * @generated
     */
    int KCLASS_MODEL = 0;

    /**
     * The feature id for the '<em><b>Java Projects</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KCLASS_MODEL__JAVA_PROJECTS = 0;

    /**
     * The feature id for the '<em><b>Bundles</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KCLASS_MODEL__BUNDLES = 1;

    /**
     * The feature id for the '<em><b>Packages</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KCLASS_MODEL__PACKAGES = 2;

    /**
     * The number of structural features of the '<em>KClass Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KCLASS_MODEL_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>KClass Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KCLASS_MODEL_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KPackageImpl <em>KPackage</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.KPackageImpl
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getKPackage()
     * @generated
     */
    int KPACKAGE = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KPACKAGE__NAME = 0;

    /**
     * The feature id for the '<em><b>Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KPACKAGE__TYPES = 1;

    /**
     * The number of structural features of the '<em>KPackage</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KPACKAGE_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>KPackage</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KPACKAGE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KTypeImpl <em>KType</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.KTypeImpl
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getKType()
     * @generated
     */
    int KTYPE = 2;

    /**
     * The feature id for the '<em><b>Selected</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KTYPE__SELECTED = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KTYPE__NAME = 1;

    /**
     * The feature id for the '<em><b>Fields</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KTYPE__FIELDS = 2;

    /**
     * The feature id for the '<em><b>Methods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KTYPE__METHODS = 3;

    /**
     * The feature id for the '<em><b>Nested Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KTYPE__NESTED_TYPES = 4;

    /**
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KTYPE__STATIC = 5;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KTYPE__VISIBILITY = 6;

    /**
     * The number of structural features of the '<em>KType</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KTYPE_FEATURE_COUNT = 7;

    /**
     * The number of operations of the '<em>KType</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KTYPE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KClassImpl <em>KClass</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.KClassImpl
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getKClass()
     * @generated
     */
    int KCLASS = 3;

    /**
     * The feature id for the '<em><b>Selected</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KCLASS__SELECTED = KTYPE__SELECTED;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KCLASS__NAME = KTYPE__NAME;

    /**
     * The feature id for the '<em><b>Fields</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KCLASS__FIELDS = KTYPE__FIELDS;

    /**
     * The feature id for the '<em><b>Methods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KCLASS__METHODS = KTYPE__METHODS;

    /**
     * The feature id for the '<em><b>Nested Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KCLASS__NESTED_TYPES = KTYPE__NESTED_TYPES;

    /**
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KCLASS__STATIC = KTYPE__STATIC;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KCLASS__VISIBILITY = KTYPE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Super Class</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KCLASS__SUPER_CLASS = KTYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Interfaces</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KCLASS__INTERFACES = KTYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Type Parameters</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KCLASS__TYPE_PARAMETERS = KTYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Final</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KCLASS__FINAL = KTYPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KCLASS__ABSTRACT = KTYPE_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>KClass</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KCLASS_FEATURE_COUNT = KTYPE_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>KClass</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KCLASS_OPERATION_COUNT = KTYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KInterfaceImpl <em>KInterface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.KInterfaceImpl
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getKInterface()
     * @generated
     */
    int KINTERFACE = 4;

    /**
     * The feature id for the '<em><b>Selected</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KINTERFACE__SELECTED = KTYPE__SELECTED;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KINTERFACE__NAME = KTYPE__NAME;

    /**
     * The feature id for the '<em><b>Fields</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KINTERFACE__FIELDS = KTYPE__FIELDS;

    /**
     * The feature id for the '<em><b>Methods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KINTERFACE__METHODS = KTYPE__METHODS;

    /**
     * The feature id for the '<em><b>Nested Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KINTERFACE__NESTED_TYPES = KTYPE__NESTED_TYPES;

    /**
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KINTERFACE__STATIC = KTYPE__STATIC;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KINTERFACE__VISIBILITY = KTYPE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Super Interfaces</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KINTERFACE__SUPER_INTERFACES = KTYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Type Parameters</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KINTERFACE__TYPE_PARAMETERS = KTYPE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>KInterface</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KINTERFACE_FEATURE_COUNT = KTYPE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>KInterface</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KINTERFACE_OPERATION_COUNT = KTYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KEnumImpl <em>KEnum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.KEnumImpl
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getKEnum()
     * @generated
     */
    int KENUM = 5;

    /**
     * The feature id for the '<em><b>Selected</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KENUM__SELECTED = KTYPE__SELECTED;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KENUM__NAME = KTYPE__NAME;

    /**
     * The feature id for the '<em><b>Fields</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KENUM__FIELDS = KTYPE__FIELDS;

    /**
     * The feature id for the '<em><b>Methods</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KENUM__METHODS = KTYPE__METHODS;

    /**
     * The feature id for the '<em><b>Nested Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KENUM__NESTED_TYPES = KTYPE__NESTED_TYPES;

    /**
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KENUM__STATIC = KTYPE__STATIC;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KENUM__VISIBILITY = KTYPE__VISIBILITY;

    /**
     * The feature id for the '<em><b>Constants</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KENUM__CONSTANTS = KTYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>KEnum</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KENUM_FEATURE_COUNT = KTYPE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>KEnum</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KENUM_OPERATION_COUNT = KTYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KMemberImpl <em>KMember</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.KMemberImpl
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getKMember()
     * @generated
     */
    int KMEMBER = 6;

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
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KMEMBER__STATIC = 2;

    /**
     * The feature id for the '<em><b>Final</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KMEMBER__FINAL = 3;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KMEMBER__VISIBILITY = 4;

    /**
     * The number of structural features of the '<em>KMember</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KMEMBER_FEATURE_COUNT = 5;

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
    int KFIELD = 7;

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
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KFIELD__STATIC = KMEMBER__STATIC;

    /**
     * The feature id for the '<em><b>Final</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KFIELD__FINAL = KMEMBER__FINAL;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KFIELD__VISIBILITY = KMEMBER__VISIBILITY;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KFIELD__TYPE = KMEMBER_FEATURE_COUNT + 0;

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
    int KMETHOD = 8;

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
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KMETHOD__STATIC = KMEMBER__STATIC;

    /**
     * The feature id for the '<em><b>Final</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KMETHOD__FINAL = KMEMBER__FINAL;

    /**
     * The feature id for the '<em><b>Visibility</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KMETHOD__VISIBILITY = KMEMBER__VISIBILITY;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KMETHOD__PARAMETERS = KMEMBER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Return Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KMETHOD__RETURN_TYPE = KMEMBER_FEATURE_COUNT + 1;

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
     * The meta object id for the '{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KTypeReferenceImpl <em>KType Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.KTypeReferenceImpl
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getKTypeReference()
     * @generated
     */
    int KTYPE_REFERENCE = 9;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KTYPE_REFERENCE__NAME = 0;

    /**
     * The feature id for the '<em><b>Signature</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KTYPE_REFERENCE__SIGNATURE = 1;

    /**
     * The feature id for the '<em><b>Reference Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KTYPE_REFERENCE__REFERENCE_TYPE = 2;

    /**
     * The feature id for the '<em><b>Type Arguments</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KTYPE_REFERENCE__TYPE_ARGUMENTS = 3;

    /**
     * The feature id for the '<em><b>Array Depth</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KTYPE_REFERENCE__ARRAY_DEPTH = 4;

    /**
     * The number of structural features of the '<em>KType Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KTYPE_REFERENCE_FEATURE_COUNT = 5;

    /**
     * The number of operations of the '<em>KType Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int KTYPE_REFERENCE_OPERATION_COUNT = 0;


    /**
     * The meta object id for the '{@link de.cau.cs.kieler.klassviz.model.classdata.KVisibility <em>KVisibility</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.klassviz.model.classdata.KVisibility
     * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getKVisibility()
     * @generated
     */
    int KVISIBILITY = 10;


    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.klassviz.model.classdata.KClassModel <em>KClass Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>KClass Model</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KClassModel
     * @generated
     */
    EClass getKClassModel();

    /**
     * Returns the meta object for the attribute list '{@link de.cau.cs.kieler.klassviz.model.classdata.KClassModel#getJavaProjects <em>Java Projects</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Java Projects</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KClassModel#getJavaProjects()
     * @see #getKClassModel()
     * @generated
     */
    EAttribute getKClassModel_JavaProjects();

    /**
     * Returns the meta object for the attribute list '{@link de.cau.cs.kieler.klassviz.model.classdata.KClassModel#getBundles <em>Bundles</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Bundles</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KClassModel#getBundles()
     * @see #getKClassModel()
     * @generated
     */
    EAttribute getKClassModel_Bundles();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.klassviz.model.classdata.KClassModel#getPackages <em>Packages</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Packages</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KClassModel#getPackages()
     * @see #getKClassModel()
     * @generated
     */
    EReference getKClassModel_Packages();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.klassviz.model.classdata.KPackage <em>KPackage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>KPackage</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KPackage
     * @generated
     */
    EClass getKPackage();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.klassviz.model.classdata.KPackage#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KPackage#getName()
     * @see #getKPackage()
     * @generated
     */
    EAttribute getKPackage_Name();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.klassviz.model.classdata.KPackage#getTypes <em>Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Types</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KPackage#getTypes()
     * @see #getKPackage()
     * @generated
     */
    EReference getKPackage_Types();

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
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.klassviz.model.classdata.KType#isSelected <em>Selected</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Selected</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KType#isSelected()
     * @see #getKType()
     * @generated
     */
    EAttribute getKType_Selected();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.klassviz.model.classdata.KType#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KType#getName()
     * @see #getKType()
     * @generated
     */
    EAttribute getKType_Name();

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
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.klassviz.model.classdata.KType#getNestedTypes <em>Nested Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Nested Types</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KType#getNestedTypes()
     * @see #getKType()
     * @generated
     */
    EReference getKType_NestedTypes();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.klassviz.model.classdata.KType#isStatic <em>Static</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Static</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KType#isStatic()
     * @see #getKType()
     * @generated
     */
    EAttribute getKType_Static();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.klassviz.model.classdata.KType#getVisibility <em>Visibility</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Visibility</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KType#getVisibility()
     * @see #getKType()
     * @generated
     */
    EAttribute getKType_Visibility();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.klassviz.model.classdata.KClass <em>KClass</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>KClass</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KClass
     * @generated
     */
    EClass getKClass();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.klassviz.model.classdata.KClass#getSuperClass <em>Super Class</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Super Class</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KClass#getSuperClass()
     * @see #getKClass()
     * @generated
     */
    EReference getKClass_SuperClass();

    /**
     * Returns the meta object for the reference list '{@link de.cau.cs.kieler.klassviz.model.classdata.KClass#getInterfaces <em>Interfaces</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Interfaces</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KClass#getInterfaces()
     * @see #getKClass()
     * @generated
     */
    EReference getKClass_Interfaces();

    /**
     * Returns the meta object for the attribute list '{@link de.cau.cs.kieler.klassviz.model.classdata.KClass#getTypeParameters <em>Type Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Type Parameters</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KClass#getTypeParameters()
     * @see #getKClass()
     * @generated
     */
    EAttribute getKClass_TypeParameters();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.klassviz.model.classdata.KClass#isFinal <em>Final</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Final</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KClass#isFinal()
     * @see #getKClass()
     * @generated
     */
    EAttribute getKClass_Final();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.klassviz.model.classdata.KClass#isAbstract <em>Abstract</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Abstract</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KClass#isAbstract()
     * @see #getKClass()
     * @generated
     */
    EAttribute getKClass_Abstract();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.klassviz.model.classdata.KInterface <em>KInterface</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>KInterface</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KInterface
     * @generated
     */
    EClass getKInterface();

    /**
     * Returns the meta object for the reference list '{@link de.cau.cs.kieler.klassviz.model.classdata.KInterface#getSuperInterfaces <em>Super Interfaces</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Super Interfaces</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KInterface#getSuperInterfaces()
     * @see #getKInterface()
     * @generated
     */
    EReference getKInterface_SuperInterfaces();

    /**
     * Returns the meta object for the attribute list '{@link de.cau.cs.kieler.klassviz.model.classdata.KInterface#getTypeParameters <em>Type Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Type Parameters</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KInterface#getTypeParameters()
     * @see #getKInterface()
     * @generated
     */
    EAttribute getKInterface_TypeParameters();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.klassviz.model.classdata.KEnum <em>KEnum</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>KEnum</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KEnum
     * @generated
     */
    EClass getKEnum();

    /**
     * Returns the meta object for the attribute list '{@link de.cau.cs.kieler.klassviz.model.classdata.KEnum#getConstants <em>Constants</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Constants</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KEnum#getConstants()
     * @see #getKEnum()
     * @generated
     */
    EAttribute getKEnum_Constants();

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
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.klassviz.model.classdata.KMember#isStatic <em>Static</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Static</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KMember#isStatic()
     * @see #getKMember()
     * @generated
     */
    EAttribute getKMember_Static();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.klassviz.model.classdata.KMember#isFinal <em>Final</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Final</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KMember#isFinal()
     * @see #getKMember()
     * @generated
     */
    EAttribute getKMember_Final();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.klassviz.model.classdata.KMember#getVisibility <em>Visibility</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Visibility</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KMember#getVisibility()
     * @see #getKMember()
     * @generated
     */
    EAttribute getKMember_Visibility();

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
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.klassviz.model.classdata.KField#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Type</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KField#getType()
     * @see #getKField()
     * @generated
     */
    EReference getKField_Type();

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
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.klassviz.model.classdata.KMethod#getParameters <em>Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Parameters</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KMethod#getParameters()
     * @see #getKMethod()
     * @generated
     */
    EReference getKMethod_Parameters();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.klassviz.model.classdata.KMethod#getReturnType <em>Return Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Return Type</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KMethod#getReturnType()
     * @see #getKMethod()
     * @generated
     */
    EReference getKMethod_ReturnType();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.klassviz.model.classdata.KTypeReference <em>KType Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>KType Reference</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KTypeReference
     * @generated
     */
    EClass getKTypeReference();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.klassviz.model.classdata.KTypeReference#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KTypeReference#getName()
     * @see #getKTypeReference()
     * @generated
     */
    EAttribute getKTypeReference_Name();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.klassviz.model.classdata.KTypeReference#getSignature <em>Signature</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Signature</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KTypeReference#getSignature()
     * @see #getKTypeReference()
     * @generated
     */
    EAttribute getKTypeReference_Signature();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.klassviz.model.classdata.KTypeReference#getReferenceType <em>Reference Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Reference Type</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KTypeReference#getReferenceType()
     * @see #getKTypeReference()
     * @generated
     */
    EReference getKTypeReference_ReferenceType();

    /**
     * Returns the meta object for the attribute list '{@link de.cau.cs.kieler.klassviz.model.classdata.KTypeReference#getTypeArguments <em>Type Arguments</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Type Arguments</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KTypeReference#getTypeArguments()
     * @see #getKTypeReference()
     * @generated
     */
    EAttribute getKTypeReference_TypeArguments();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.klassviz.model.classdata.KTypeReference#getArrayDepth <em>Array Depth</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Array Depth</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KTypeReference#getArrayDepth()
     * @see #getKTypeReference()
     * @generated
     */
    EAttribute getKTypeReference_ArrayDepth();

    /**
     * Returns the meta object for enum '{@link de.cau.cs.kieler.klassviz.model.classdata.KVisibility <em>KVisibility</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>KVisibility</em>'.
     * @see de.cau.cs.kieler.klassviz.model.classdata.KVisibility
     * @generated
     */
    EEnum getKVisibility();

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
         * The meta object literal for the '{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KClassModelImpl <em>KClass Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.KClassModelImpl
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getKClassModel()
         * @generated
         */
        EClass KCLASS_MODEL = eINSTANCE.getKClassModel();

        /**
         * The meta object literal for the '<em><b>Java Projects</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KCLASS_MODEL__JAVA_PROJECTS = eINSTANCE.getKClassModel_JavaProjects();

        /**
         * The meta object literal for the '<em><b>Bundles</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KCLASS_MODEL__BUNDLES = eINSTANCE.getKClassModel_Bundles();

        /**
         * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KCLASS_MODEL__PACKAGES = eINSTANCE.getKClassModel_Packages();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KPackageImpl <em>KPackage</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.KPackageImpl
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getKPackage()
         * @generated
         */
        EClass KPACKAGE = eINSTANCE.getKPackage();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KPACKAGE__NAME = eINSTANCE.getKPackage_Name();

        /**
         * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KPACKAGE__TYPES = eINSTANCE.getKPackage_Types();

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
         * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KTYPE__SELECTED = eINSTANCE.getKType_Selected();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KTYPE__NAME = eINSTANCE.getKType_Name();

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
         * The meta object literal for the '<em><b>Nested Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KTYPE__NESTED_TYPES = eINSTANCE.getKType_NestedTypes();

        /**
         * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KTYPE__STATIC = eINSTANCE.getKType_Static();

        /**
         * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KTYPE__VISIBILITY = eINSTANCE.getKType_Visibility();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KClassImpl <em>KClass</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.KClassImpl
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getKClass()
         * @generated
         */
        EClass KCLASS = eINSTANCE.getKClass();

        /**
         * The meta object literal for the '<em><b>Super Class</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KCLASS__SUPER_CLASS = eINSTANCE.getKClass_SuperClass();

        /**
         * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KCLASS__INTERFACES = eINSTANCE.getKClass_Interfaces();

        /**
         * The meta object literal for the '<em><b>Type Parameters</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KCLASS__TYPE_PARAMETERS = eINSTANCE.getKClass_TypeParameters();

        /**
         * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KCLASS__FINAL = eINSTANCE.getKClass_Final();

        /**
         * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KCLASS__ABSTRACT = eINSTANCE.getKClass_Abstract();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KInterfaceImpl <em>KInterface</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.KInterfaceImpl
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getKInterface()
         * @generated
         */
        EClass KINTERFACE = eINSTANCE.getKInterface();

        /**
         * The meta object literal for the '<em><b>Super Interfaces</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KINTERFACE__SUPER_INTERFACES = eINSTANCE.getKInterface_SuperInterfaces();

        /**
         * The meta object literal for the '<em><b>Type Parameters</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KINTERFACE__TYPE_PARAMETERS = eINSTANCE.getKInterface_TypeParameters();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KEnumImpl <em>KEnum</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.KEnumImpl
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getKEnum()
         * @generated
         */
        EClass KENUM = eINSTANCE.getKEnum();

        /**
         * The meta object literal for the '<em><b>Constants</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KENUM__CONSTANTS = eINSTANCE.getKEnum_Constants();

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
         * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KMEMBER__STATIC = eINSTANCE.getKMember_Static();

        /**
         * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KMEMBER__FINAL = eINSTANCE.getKMember_Final();

        /**
         * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KMEMBER__VISIBILITY = eINSTANCE.getKMember_Visibility();

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
         * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KFIELD__TYPE = eINSTANCE.getKField_Type();

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
         * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KMETHOD__PARAMETERS = eINSTANCE.getKMethod_Parameters();

        /**
         * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KMETHOD__RETURN_TYPE = eINSTANCE.getKMethod_ReturnType();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KTypeReferenceImpl <em>KType Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.KTypeReferenceImpl
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getKTypeReference()
         * @generated
         */
        EClass KTYPE_REFERENCE = eINSTANCE.getKTypeReference();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KTYPE_REFERENCE__NAME = eINSTANCE.getKTypeReference_Name();

        /**
         * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KTYPE_REFERENCE__SIGNATURE = eINSTANCE.getKTypeReference_Signature();

        /**
         * The meta object literal for the '<em><b>Reference Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference KTYPE_REFERENCE__REFERENCE_TYPE = eINSTANCE.getKTypeReference_ReferenceType();

        /**
         * The meta object literal for the '<em><b>Type Arguments</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KTYPE_REFERENCE__TYPE_ARGUMENTS = eINSTANCE.getKTypeReference_TypeArguments();

        /**
         * The meta object literal for the '<em><b>Array Depth</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute KTYPE_REFERENCE__ARRAY_DEPTH = eINSTANCE.getKTypeReference_ArrayDepth();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.klassviz.model.classdata.KVisibility <em>KVisibility</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.klassviz.model.classdata.KVisibility
         * @see de.cau.cs.kieler.klassviz.model.classdata.impl.ClassdataPackageImpl#getKVisibility()
         * @generated
         */
        EEnum KVISIBILITY = eINSTANCE.getKVisibility();

    }

} //ClassdataPackage
