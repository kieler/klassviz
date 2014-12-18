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
import de.cau.cs.kieler.klassviz.model.classdata.KType;
import de.cau.cs.kieler.klassviz.model.classdata.KTypeReference;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KType Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KTypeReferenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KTypeReferenceImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KTypeReferenceImpl#getReferenceType <em>Reference Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KTypeReferenceImpl#getTypeParameters <em>Type Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KTypeReferenceImpl extends MinimalEObjectImpl.Container implements KTypeReference {
    /**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
    protected static final String NAME_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
    protected String name = NAME_EDEFAULT;

    /**
	 * The default value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
    protected static final String SIGNATURE_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
    protected String signature = SIGNATURE_EDEFAULT;

    /**
	 * The cached value of the '{@link #getReferenceType() <em>Reference Type</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getReferenceType()
	 * @generated
	 * @ordered
	 */
    protected KType referenceType;

    /**
	 * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<KTypeReference> typeParameters;

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected KTypeReferenceImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return ClassdataPackage.Literals.KTYPE_REFERENCE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getName() {
		return name;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassdataPackage.KTYPE_REFERENCE__NAME, oldName, name));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getSignature() {
		return signature;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSignature(String newSignature) {
		String oldSignature = signature;
		signature = newSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassdataPackage.KTYPE_REFERENCE__SIGNATURE, oldSignature, signature));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public KType getReferenceType() {
		if (referenceType != null && referenceType.eIsProxy()) {
			InternalEObject oldReferenceType = (InternalEObject)referenceType;
			referenceType = (KType)eResolveProxy(oldReferenceType);
			if (referenceType != oldReferenceType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassdataPackage.KTYPE_REFERENCE__REFERENCE_TYPE, oldReferenceType, referenceType));
			}
		}
		return referenceType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public KType basicGetReferenceType() {
		return referenceType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setReferenceType(KType newReferenceType) {
		KType oldReferenceType = referenceType;
		referenceType = newReferenceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClassdataPackage.KTYPE_REFERENCE__REFERENCE_TYPE, oldReferenceType, referenceType));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KTypeReference> getTypeParameters() {
		if (typeParameters == null) {
			typeParameters = new EObjectContainmentEList<KTypeReference>(KTypeReference.class, this, ClassdataPackage.KTYPE_REFERENCE__TYPE_PARAMETERS);
		}
		return typeParameters;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClassdataPackage.KTYPE_REFERENCE__TYPE_PARAMETERS:
				return ((InternalEList<?>)getTypeParameters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClassdataPackage.KTYPE_REFERENCE__NAME:
				return getName();
			case ClassdataPackage.KTYPE_REFERENCE__SIGNATURE:
				return getSignature();
			case ClassdataPackage.KTYPE_REFERENCE__REFERENCE_TYPE:
				if (resolve) return getReferenceType();
				return basicGetReferenceType();
			case ClassdataPackage.KTYPE_REFERENCE__TYPE_PARAMETERS:
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
			case ClassdataPackage.KTYPE_REFERENCE__NAME:
				setName((String)newValue);
				return;
			case ClassdataPackage.KTYPE_REFERENCE__SIGNATURE:
				setSignature((String)newValue);
				return;
			case ClassdataPackage.KTYPE_REFERENCE__REFERENCE_TYPE:
				setReferenceType((KType)newValue);
				return;
			case ClassdataPackage.KTYPE_REFERENCE__TYPE_PARAMETERS:
				getTypeParameters().clear();
				getTypeParameters().addAll((Collection<? extends KTypeReference>)newValue);
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
			case ClassdataPackage.KTYPE_REFERENCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ClassdataPackage.KTYPE_REFERENCE__SIGNATURE:
				setSignature(SIGNATURE_EDEFAULT);
				return;
			case ClassdataPackage.KTYPE_REFERENCE__REFERENCE_TYPE:
				setReferenceType((KType)null);
				return;
			case ClassdataPackage.KTYPE_REFERENCE__TYPE_PARAMETERS:
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
			case ClassdataPackage.KTYPE_REFERENCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ClassdataPackage.KTYPE_REFERENCE__SIGNATURE:
				return SIGNATURE_EDEFAULT == null ? signature != null : !SIGNATURE_EDEFAULT.equals(signature);
			case ClassdataPackage.KTYPE_REFERENCE__REFERENCE_TYPE:
				return referenceType != null;
			case ClassdataPackage.KTYPE_REFERENCE__TYPE_PARAMETERS:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", signature: ");
		result.append(signature);
		result.append(')');
		return result.toString();
	}

} //KTypeReferenceImpl
