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

import de.cau.cs.kieler.klassviz.model.classdata.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;

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
            case ClassdataPackage.ETYPE: return createEType();
            case ClassdataPackage.EFIELD: return createEField();
            case ClassdataPackage.EMETHOD: return createEMethod();
            case ClassdataPackage.ECLASS_DATA_SELECTION: return createEClassDataSelection();
            case ClassdataPackage.EPARAMETER_TYPE_SIGNATURE: return createEParameterTypeSignature();
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
            case ClassdataPackage.IMETHOD:
                return createIMethodFromString(eDataType, initialValue);
            case ClassdataPackage.IFIELD:
                return createIFieldFromString(eDataType, initialValue);
            case ClassdataPackage.ITYPE:
                return createITypeFromString(eDataType, initialValue);
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
            case ClassdataPackage.IMETHOD:
                return convertIMethodToString(eDataType, instanceValue);
            case ClassdataPackage.IFIELD:
                return convertIFieldToString(eDataType, instanceValue);
            case ClassdataPackage.ITYPE:
                return convertITypeToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EType createEType() {
        ETypeImpl eType = new ETypeImpl();
        return eType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EField createEField() {
        EFieldImpl eField = new EFieldImpl();
        return eField;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EMethod createEMethod() {
        EMethodImpl eMethod = new EMethodImpl();
        return eMethod;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClassDataSelection createEClassDataSelection() {
        EClassDataSelectionImpl eClassDataSelection = new EClassDataSelectionImpl();
        return eClassDataSelection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EParameterTypeSignature createEParameterTypeSignature() {
        EParameterTypeSignatureImpl eParameterTypeSignature = new EParameterTypeSignatureImpl();
        return eParameterTypeSignature;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IMethod createIMethodFromString(EDataType eDataType, String initialValue) {
        return (IMethod)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertIMethodToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IField createIFieldFromString(EDataType eDataType, String initialValue) {
        return (IField)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertIFieldToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IType createITypeFromString(EDataType eDataType, String initialValue) {
        return (IType)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertITypeToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
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
