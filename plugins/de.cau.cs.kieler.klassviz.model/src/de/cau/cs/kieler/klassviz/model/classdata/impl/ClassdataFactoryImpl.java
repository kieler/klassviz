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
package de.cau.cs.kieler.klassviz.model.classdata.impl;

import de.cau.cs.kieler.klassviz.model.classdata.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClassdataFactoryImpl extends EFactoryImpl implements ClassdataFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ClassdataFactory init() {
        try {
            ClassdataFactory theClassdataFactory = (ClassdataFactory)EPackage.Registry.INSTANCE.getEFactory(ClassdataPackage.eNS_URI);
            if (theClassdataFactory != null) {
                return theClassdataFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ClassdataFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ClassdataFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case ClassdataPackage.KCLASS_MODEL: return createKClassModel();
            case ClassdataPackage.KOPTION: return createKOption();
            case ClassdataPackage.KPACKAGE: return createKPackage();
            case ClassdataPackage.KCLASS: return createKClass();
            case ClassdataPackage.KINTERFACE: return createKInterface();
            case ClassdataPackage.KENUM: return createKEnum();
            case ClassdataPackage.KDEPENDENCY: return createKDependency();
            case ClassdataPackage.KFIELD: return createKField();
            case ClassdataPackage.KMETHOD: return createKMethod();
            case ClassdataPackage.KTYPE_REFERENCE: return createKTypeReference();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case ClassdataPackage.KVISIBILITY:
                return createKVisibilityFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case ClassdataPackage.KVISIBILITY:
                return convertKVisibilityToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KClassModel createKClassModel() {
        KClassModelImpl kClassModel = new KClassModelImpl();
        return kClassModel;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KOption createKOption() {
        KOptionImpl kOption = new KOptionImpl();
        return kOption;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KPackage createKPackage() {
        KPackageImpl kPackage = new KPackageImpl();
        return kPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KClass createKClass() {
        KClassImpl kClass = new KClassImpl();
        return kClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KInterface createKInterface() {
        KInterfaceImpl kInterface = new KInterfaceImpl();
        return kInterface;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KEnum createKEnum() {
        KEnumImpl kEnum = new KEnumImpl();
        return kEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KDependency createKDependency() {
        KDependencyImpl kDependency = new KDependencyImpl();
        return kDependency;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KField createKField() {
        KFieldImpl kField = new KFieldImpl();
        return kField;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KMethod createKMethod() {
        KMethodImpl kMethod = new KMethodImpl();
        return kMethod;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KTypeReference createKTypeReference() {
        KTypeReferenceImpl kTypeReference = new KTypeReferenceImpl();
        return kTypeReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KVisibility createKVisibilityFromString(EDataType eDataType, String initialValue) {
        KVisibility result = KVisibility.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertKVisibilityToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ClassdataPackage getClassdataPackage() {
        return (ClassdataPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ClassdataPackage getPackage() {
        return ClassdataPackage.eINSTANCE;
    }

} //ClassdataFactoryImpl
