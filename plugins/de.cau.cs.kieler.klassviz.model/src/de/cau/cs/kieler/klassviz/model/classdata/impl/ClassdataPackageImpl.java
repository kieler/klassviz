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
package de.cau.cs.kieler.klassviz.model.classdata.impl;

import de.cau.cs.kieler.klassviz.model.classdata.ClassdataFactory;
import de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage;
import de.cau.cs.kieler.klassviz.model.classdata.EClassDataSelection;
import de.cau.cs.kieler.klassviz.model.classdata.EField;
import de.cau.cs.kieler.klassviz.model.classdata.EMethod;
import de.cau.cs.kieler.klassviz.model.classdata.EParameterTypeSignature;
import de.cau.cs.kieler.klassviz.model.classdata.EType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassdataPackageImpl extends EPackageImpl implements ClassdataPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eFieldEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eMethodEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eClassDataSelectionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eParameterTypeSignatureEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType iMethodEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType iFieldEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType iTypeEDataType = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ClassdataPackageImpl() {
        super(eNS_URI, ClassdataFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link ClassdataPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ClassdataPackage init() {
        if (isInited) return (ClassdataPackage)EPackage.Registry.INSTANCE.getEPackage(ClassdataPackage.eNS_URI);

        // Obtain or create and register package
        ClassdataPackageImpl theClassdataPackage = (ClassdataPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ClassdataPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ClassdataPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theClassdataPackage.createPackageContents();

        // Initialize created meta-data
        theClassdataPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theClassdataPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ClassdataPackage.eNS_URI, theClassdataPackage);
        return theClassdataPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEType() {
        return eTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEType_Type() {
        return (EAttribute)eTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEType_Fields() {
        return (EReference)eTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEType_Methods() {
        return (EReference)eTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEType_FullyQualifiedName() {
        return (EAttribute)eTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEField() {
        return eFieldEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEField_Field() {
        return (EAttribute)eFieldEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEField_Selected() {
        return (EAttribute)eFieldEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEField_Name() {
        return (EAttribute)eFieldEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEMethod() {
        return eMethodEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEMethod_Method() {
        return (EAttribute)eMethodEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEMethod_Selected() {
        return (EAttribute)eMethodEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEMethod_Name() {
        return (EAttribute)eMethodEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEMethod_ParameterTypeSignatures() {
        return (EReference)eMethodEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEClassDataSelection() {
        return eClassDataSelectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEClassDataSelection_Types() {
        return (EReference)eClassDataSelectionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEParameterTypeSignature() {
        return eParameterTypeSignatureEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEParameterTypeSignature_Name() {
        return (EAttribute)eParameterTypeSignatureEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getIMethod() {
        return iMethodEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getIField() {
        return iFieldEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getIType() {
        return iTypeEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ClassdataFactory getClassdataFactory() {
        return (ClassdataFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        eTypeEClass = createEClass(ETYPE);
        createEAttribute(eTypeEClass, ETYPE__TYPE);
        createEReference(eTypeEClass, ETYPE__FIELDS);
        createEReference(eTypeEClass, ETYPE__METHODS);
        createEAttribute(eTypeEClass, ETYPE__FULLY_QUALIFIED_NAME);

        eFieldEClass = createEClass(EFIELD);
        createEAttribute(eFieldEClass, EFIELD__FIELD);
        createEAttribute(eFieldEClass, EFIELD__SELECTED);
        createEAttribute(eFieldEClass, EFIELD__NAME);

        eMethodEClass = createEClass(EMETHOD);
        createEAttribute(eMethodEClass, EMETHOD__METHOD);
        createEAttribute(eMethodEClass, EMETHOD__SELECTED);
        createEAttribute(eMethodEClass, EMETHOD__NAME);
        createEReference(eMethodEClass, EMETHOD__PARAMETER_TYPE_SIGNATURES);

        eClassDataSelectionEClass = createEClass(ECLASS_DATA_SELECTION);
        createEReference(eClassDataSelectionEClass, ECLASS_DATA_SELECTION__TYPES);

        eParameterTypeSignatureEClass = createEClass(EPARAMETER_TYPE_SIGNATURE);
        createEAttribute(eParameterTypeSignatureEClass, EPARAMETER_TYPE_SIGNATURE__NAME);

        // Create data types
        iMethodEDataType = createEDataType(IMETHOD);
        iFieldEDataType = createEDataType(IFIELD);
        iTypeEDataType = createEDataType(ITYPE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes

        // Initialize classes, features, and operations; add parameters
        initEClass(eTypeEClass, EType.class, "EType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEType_Type(), this.getIType(), "type", null, 1, 1, EType.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEType_Fields(), this.getEField(), null, "fields", null, 0, -1, EType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        getEType_Fields().getEKeys().add(this.getEField_Field());
        initEReference(getEType_Methods(), this.getEMethod(), null, "methods", null, 0, -1, EType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEType_FullyQualifiedName(), ecorePackage.getEString(), "fullyQualifiedName", null, 1, 1, EType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eFieldEClass, EField.class, "EField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEField_Field(), this.getIField(), "field", null, 1, 1, EField.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEField_Selected(), ecorePackage.getEBoolean(), "selected", null, 1, 1, EField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEField_Name(), ecorePackage.getEString(), "name", null, 1, 1, EField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eMethodEClass, EMethod.class, "EMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEMethod_Method(), this.getIMethod(), "method", null, 1, 1, EMethod.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEMethod_Selected(), ecorePackage.getEBoolean(), "selected", null, 1, 1, EMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEMethod_Name(), ecorePackage.getEString(), "name", null, 1, 1, EMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEMethod_ParameterTypeSignatures(), this.getEParameterTypeSignature(), null, "parameterTypeSignatures", null, 0, -1, EMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eClassDataSelectionEClass, EClassDataSelection.class, "EClassDataSelection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEClassDataSelection_Types(), this.getEType(), null, "types", null, 0, -1, EClassDataSelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        getEClassDataSelection_Types().getEKeys().add(this.getEType_Type());

        initEClass(eParameterTypeSignatureEClass, EParameterTypeSignature.class, "EParameterTypeSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEParameterTypeSignature_Name(), ecorePackage.getEString(), "name", null, 1, 1, EParameterTypeSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize data types
        initEDataType(iMethodEDataType, IMethod.class, "IMethod", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(iFieldEDataType, IField.class, "IField", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(iTypeEDataType, IType.class, "IType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //ClassdataPackageImpl
