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

import de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage;
import de.cau.cs.kieler.klassviz.model.classdata.KInterface;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KInterface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KInterfaceImpl#getSuperInterfaces <em>Super Interfaces</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KInterfaceImpl#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KInterfaceImpl extends KTypeImpl implements KInterface {
    /**
	 * The cached value of the '{@link #getSuperInterfaces() <em>Super Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSuperInterfaces()
	 * @generated
	 * @ordered
	 */
    protected EList<KInterface> superInterfaces;

    /**
	 * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' attribute list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTypeParameters()
	 * @generated
	 * @ordered
	 */
    protected EList<String> typeParameters;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected KInterfaceImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return ClassdataPackage.Literals.KINTERFACE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<KInterface> getSuperInterfaces() {
		if (superInterfaces == null) {
			superInterfaces = new EObjectResolvingEList<KInterface>(KInterface.class, this, ClassdataPackage.KINTERFACE__SUPER_INTERFACES);
		}
		return superInterfaces;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<String> getTypeParameters() {
		if (typeParameters == null) {
			typeParameters = new EDataTypeUniqueEList<String>(String.class, this, ClassdataPackage.KINTERFACE__TYPE_PARAMETERS);
		}
		return typeParameters;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassdataPackage.KINTERFACE__SUPER_INTERFACES:
				return getSuperInterfaces();
			case ClassdataPackage.KINTERFACE__TYPE_PARAMETERS:
				return getTypeParameters();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClassdataPackage.KINTERFACE__SUPER_INTERFACES:
				getSuperInterfaces().clear();
				getSuperInterfaces().addAll((Collection<? extends KInterface>)newValue);
				return;
			case ClassdataPackage.KINTERFACE__TYPE_PARAMETERS:
				getTypeParameters().clear();
				getTypeParameters().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eUnset(int featureID) {
		switch (featureID) {
			case ClassdataPackage.KINTERFACE__SUPER_INTERFACES:
				getSuperInterfaces().clear();
				return;
			case ClassdataPackage.KINTERFACE__TYPE_PARAMETERS:
				getTypeParameters().clear();
				return;
		}
		super.eUnset(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ClassdataPackage.KINTERFACE__SUPER_INTERFACES:
				return superInterfaces != null && !superInterfaces.isEmpty();
			case ClassdataPackage.KINTERFACE__TYPE_PARAMETERS:
				return typeParameters != null && !typeParameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (typeParameters: ");
		result.append(typeParameters);
		result.append(')');
		return result.toString();
	}

} //KInterfaceImpl
