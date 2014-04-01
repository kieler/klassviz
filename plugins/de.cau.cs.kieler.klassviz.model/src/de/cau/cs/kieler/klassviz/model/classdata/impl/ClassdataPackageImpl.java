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
import de.cau.cs.kieler.klassviz.model.classdata.KClass;
import de.cau.cs.kieler.klassviz.model.classdata.KClassModel;
import de.cau.cs.kieler.klassviz.model.classdata.KEnum;
import de.cau.cs.kieler.klassviz.model.classdata.KField;
import de.cau.cs.kieler.klassviz.model.classdata.KInterface;
import de.cau.cs.kieler.klassviz.model.classdata.KMember;
import de.cau.cs.kieler.klassviz.model.classdata.KMethod;
import de.cau.cs.kieler.klassviz.model.classdata.KPackage;
import de.cau.cs.kieler.klassviz.model.classdata.KType;
import de.cau.cs.kieler.klassviz.model.classdata.KTypeReference;

import de.cau.cs.kieler.klassviz.model.classdata.KVisibility;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
    private EClass kClassModelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass kPackageEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass kTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass kClassEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass kInterfaceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass kEnumEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass kMemberEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass kFieldEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass kMethodEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass kTypeReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum kVisibilityEEnum = null;

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
    public EClass getKClassModel() {
        return kClassModelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKClassModel_JavaProjects() {
        return (EAttribute)kClassModelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKClassModel_Bundles() {
        return (EAttribute)kClassModelEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getKClassModel_Packages() {
        return (EReference)kClassModelEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getKPackage() {
        return kPackageEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKPackage_Name() {
        return (EAttribute)kPackageEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getKPackage_Types() {
        return (EReference)kPackageEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getKType() {
        return kTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKType_Selected() {
        return (EAttribute)kTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKType_Name() {
        return (EAttribute)kTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getKType_Fields() {
        return (EReference)kTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getKType_Methods() {
        return (EReference)kTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getKType_NestedTypes() {
        return (EReference)kTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKType_Static() {
        return (EAttribute)kTypeEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKType_Visibility() {
        return (EAttribute)kTypeEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getKClass() {
        return kClassEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getKClass_SuperClass() {
        return (EReference)kClassEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getKClass_Interfaces() {
        return (EReference)kClassEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKClass_TypeParameters() {
        return (EAttribute)kClassEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKClass_Final() {
        return (EAttribute)kClassEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKClass_Abstract() {
        return (EAttribute)kClassEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getKInterface() {
        return kInterfaceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getKInterface_SuperInterfaces() {
        return (EReference)kInterfaceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKInterface_TypeParameters() {
        return (EAttribute)kInterfaceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getKEnum() {
        return kEnumEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKEnum_Constants() {
        return (EAttribute)kEnumEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getKMember() {
        return kMemberEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKMember_Selected() {
        return (EAttribute)kMemberEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKMember_Name() {
        return (EAttribute)kMemberEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKMember_Static() {
        return (EAttribute)kMemberEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKMember_Final() {
        return (EAttribute)kMemberEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKMember_Visibility() {
        return (EAttribute)kMemberEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getKField() {
        return kFieldEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getKField_Type() {
        return (EReference)kFieldEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getKMethod() {
        return kMethodEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getKMethod_Parameters() {
        return (EReference)kMethodEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getKMethod_ReturnType() {
        return (EReference)kMethodEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getKTypeReference() {
        return kTypeReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKTypeReference_Name() {
        return (EAttribute)kTypeReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKTypeReference_Signature() {
        return (EAttribute)kTypeReferenceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getKTypeReference_ReferenceType() {
        return (EReference)kTypeReferenceEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKTypeReference_TypeArguments() {
        return (EAttribute)kTypeReferenceEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getKTypeReference_ArrayDepth() {
        return (EAttribute)kTypeReferenceEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getKVisibility() {
        return kVisibilityEEnum;
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
        kClassModelEClass = createEClass(KCLASS_MODEL);
        createEAttribute(kClassModelEClass, KCLASS_MODEL__JAVA_PROJECTS);
        createEAttribute(kClassModelEClass, KCLASS_MODEL__BUNDLES);
        createEReference(kClassModelEClass, KCLASS_MODEL__PACKAGES);

        kPackageEClass = createEClass(KPACKAGE);
        createEAttribute(kPackageEClass, KPACKAGE__NAME);
        createEReference(kPackageEClass, KPACKAGE__TYPES);

        kTypeEClass = createEClass(KTYPE);
        createEAttribute(kTypeEClass, KTYPE__SELECTED);
        createEAttribute(kTypeEClass, KTYPE__NAME);
        createEReference(kTypeEClass, KTYPE__FIELDS);
        createEReference(kTypeEClass, KTYPE__METHODS);
        createEReference(kTypeEClass, KTYPE__NESTED_TYPES);
        createEAttribute(kTypeEClass, KTYPE__STATIC);
        createEAttribute(kTypeEClass, KTYPE__VISIBILITY);

        kClassEClass = createEClass(KCLASS);
        createEReference(kClassEClass, KCLASS__SUPER_CLASS);
        createEReference(kClassEClass, KCLASS__INTERFACES);
        createEAttribute(kClassEClass, KCLASS__TYPE_PARAMETERS);
        createEAttribute(kClassEClass, KCLASS__FINAL);
        createEAttribute(kClassEClass, KCLASS__ABSTRACT);

        kInterfaceEClass = createEClass(KINTERFACE);
        createEReference(kInterfaceEClass, KINTERFACE__SUPER_INTERFACES);
        createEAttribute(kInterfaceEClass, KINTERFACE__TYPE_PARAMETERS);

        kEnumEClass = createEClass(KENUM);
        createEAttribute(kEnumEClass, KENUM__CONSTANTS);

        kMemberEClass = createEClass(KMEMBER);
        createEAttribute(kMemberEClass, KMEMBER__SELECTED);
        createEAttribute(kMemberEClass, KMEMBER__NAME);
        createEAttribute(kMemberEClass, KMEMBER__STATIC);
        createEAttribute(kMemberEClass, KMEMBER__FINAL);
        createEAttribute(kMemberEClass, KMEMBER__VISIBILITY);

        kFieldEClass = createEClass(KFIELD);
        createEReference(kFieldEClass, KFIELD__TYPE);

        kMethodEClass = createEClass(KMETHOD);
        createEReference(kMethodEClass, KMETHOD__PARAMETERS);
        createEReference(kMethodEClass, KMETHOD__RETURN_TYPE);

        kTypeReferenceEClass = createEClass(KTYPE_REFERENCE);
        createEAttribute(kTypeReferenceEClass, KTYPE_REFERENCE__NAME);
        createEAttribute(kTypeReferenceEClass, KTYPE_REFERENCE__SIGNATURE);
        createEReference(kTypeReferenceEClass, KTYPE_REFERENCE__REFERENCE_TYPE);
        createEAttribute(kTypeReferenceEClass, KTYPE_REFERENCE__TYPE_ARGUMENTS);
        createEAttribute(kTypeReferenceEClass, KTYPE_REFERENCE__ARRAY_DEPTH);

        // Create enums
        kVisibilityEEnum = createEEnum(KVISIBILITY);
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
        kClassEClass.getESuperTypes().add(this.getKType());
        kInterfaceEClass.getESuperTypes().add(this.getKType());
        kEnumEClass.getESuperTypes().add(this.getKType());
        kFieldEClass.getESuperTypes().add(this.getKMember());
        kMethodEClass.getESuperTypes().add(this.getKMember());

        // Initialize classes, features, and operations; add parameters
        initEClass(kClassModelEClass, KClassModel.class, "KClassModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getKClassModel_JavaProjects(), ecorePackage.getEString(), "javaProjects", null, 0, -1, KClassModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKClassModel_Bundles(), ecorePackage.getEString(), "bundles", null, 0, -1, KClassModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getKClassModel_Packages(), this.getKPackage(), null, "packages", null, 0, -1, KClassModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(kPackageEClass, KPackage.class, "KPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getKPackage_Name(), ecorePackage.getEString(), "name", null, 1, 1, KPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getKPackage_Types(), this.getKType(), null, "types", null, 0, -1, KPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(kTypeEClass, KType.class, "KType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getKType_Selected(), ecorePackage.getEBoolean(), "selected", "false", 0, 1, KType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKType_Name(), ecorePackage.getEString(), "name", null, 1, 1, KType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getKType_Fields(), this.getKField(), null, "fields", null, 0, -1, KType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getKType_Methods(), this.getKMethod(), null, "methods", null, 0, -1, KType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getKType_NestedTypes(), this.getKType(), null, "nestedTypes", null, 0, -1, KType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKType_Static(), ecorePackage.getEBoolean(), "static", "false", 1, 1, KType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKType_Visibility(), this.getKVisibility(), "visibility", "PACKAGE", 1, 1, KType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(kClassEClass, KClass.class, "KClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getKClass_SuperClass(), this.getKClass(), null, "superClass", null, 0, 1, KClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getKClass_Interfaces(), this.getKInterface(), null, "interfaces", null, 0, -1, KClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKClass_TypeParameters(), ecorePackage.getEString(), "typeParameters", null, 0, -1, KClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKClass_Final(), ecorePackage.getEBoolean(), "final", "false", 1, 1, KClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKClass_Abstract(), ecorePackage.getEBoolean(), "abstract", "false", 1, 1, KClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(kInterfaceEClass, KInterface.class, "KInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getKInterface_SuperInterfaces(), this.getKInterface(), null, "superInterfaces", null, 0, -1, KInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKInterface_TypeParameters(), ecorePackage.getEString(), "typeParameters", null, 0, -1, KInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(kEnumEClass, KEnum.class, "KEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getKEnum_Constants(), ecorePackage.getEString(), "constants", null, 0, -1, KEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(kMemberEClass, KMember.class, "KMember", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getKMember_Selected(), ecorePackage.getEBoolean(), "selected", "false", 0, 1, KMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKMember_Name(), ecorePackage.getEString(), "name", null, 1, 1, KMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKMember_Static(), ecorePackage.getEBoolean(), "static", "false", 1, 1, KMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKMember_Final(), ecorePackage.getEBoolean(), "final", "false", 1, 1, KMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKMember_Visibility(), this.getKVisibility(), "visibility", "PACKAGE", 1, 1, KMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(kFieldEClass, KField.class, "KField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getKField_Type(), this.getKTypeReference(), null, "type", null, 0, 1, KField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(kMethodEClass, KMethod.class, "KMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getKMethod_Parameters(), this.getKTypeReference(), null, "parameters", null, 0, -1, KMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getKMethod_ReturnType(), this.getKTypeReference(), null, "returnType", null, 0, 1, KMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(kTypeReferenceEClass, KTypeReference.class, "KTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getKTypeReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, KTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKTypeReference_Signature(), ecorePackage.getEString(), "signature", null, 0, 1, KTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getKTypeReference_ReferenceType(), this.getKType(), null, "referenceType", null, 0, 1, KTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKTypeReference_TypeArguments(), ecorePackage.getEString(), "typeArguments", null, 0, -1, KTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getKTypeReference_ArrayDepth(), ecorePackage.getEInt(), "arrayDepth", "0", 0, 1, KTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(kVisibilityEEnum, KVisibility.class, "KVisibility");
        addEEnumLiteral(kVisibilityEEnum, KVisibility.PUBLIC);
        addEEnumLiteral(kVisibilityEEnum, KVisibility.PROTECTED);
        addEEnumLiteral(kVisibilityEEnum, KVisibility.PACKAGE);
        addEEnumLiteral(kVisibilityEEnum, KVisibility.PRIVATE);

        // Create resource
        createResource(eNS_URI);
    }

} //ClassdataPackageImpl
