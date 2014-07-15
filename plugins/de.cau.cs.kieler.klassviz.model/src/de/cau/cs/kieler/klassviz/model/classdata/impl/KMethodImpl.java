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
import de.cau.cs.kieler.klassviz.model.classdata.KMethod;
import de.cau.cs.kieler.klassviz.model.classdata.KTypeReference;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KMethod</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KMethodImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KMethodImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KMethodImpl#isAbstract <em>Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KMethodImpl extends KMemberImpl implements KMethod {
    /**
     * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameters()
     * @generated
     * @ordered
     */
    protected EList<KTypeReference> parameters;

    /**
     * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReturnType()
     * @generated
     * @ordered
     */
    protected KTypeReference returnType;

    /**
     * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAbstract()
     * @generated
     * @ordered
     */
    protected static final boolean ABSTRACT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAbstract()
     * @generated
     * @ordered
     */
    protected boolean abstract_ = ABSTRACT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected KMethodImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ClassdataPackage.Literals.KMETHOD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<KTypeReference> getParameters() {
        if (parameters == null) {
            parameters = new EObjectContainmentEList<KTypeReference>(KTypeReference.class, this, ClassdataPackage.KMETHOD__PARAMETERS);
        }
        return parameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KTypeReference getReturnType() {
        return returnType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReturnType(KTypeReference newReturnType, NotificationChain msgs) {
        KTypeReference oldReturnType = returnType;
        returnType = newReturnType;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ClassdataPackage.KMETHOD__RETURN_TYPE, oldReturnType, newReturnType);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReturnType(KTypeReference newReturnType) {
        if (newReturnType != returnType) {
            NotificationChain msgs = null;
            if (returnType != null)
                msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ClassdataPackage.KMETHOD__RETURN_TYPE, null, msgs);
            if (newReturnType != null)
                msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ClassdataPackage.KMETHOD__RETURN_TYPE, null, msgs);
            msgs = basicSetReturnType(newReturnType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ClassdataPackage.KMETHOD__RETURN_TYPE, newReturnType, newReturnType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isAbstract() {
        return abstract_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAbstract(boolean newAbstract) {
        boolean oldAbstract = abstract_;
        abstract_ = newAbstract;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ClassdataPackage.KMETHOD__ABSTRACT, oldAbstract, abstract_));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ClassdataPackage.KMETHOD__PARAMETERS:
                return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
            case ClassdataPackage.KMETHOD__RETURN_TYPE:
                return basicSetReturnType(null, msgs);
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
            case ClassdataPackage.KMETHOD__PARAMETERS:
                return getParameters();
            case ClassdataPackage.KMETHOD__RETURN_TYPE:
                return getReturnType();
            case ClassdataPackage.KMETHOD__ABSTRACT:
                return isAbstract();
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
            case ClassdataPackage.KMETHOD__PARAMETERS:
                getParameters().clear();
                getParameters().addAll((Collection<? extends KTypeReference>)newValue);
                return;
            case ClassdataPackage.KMETHOD__RETURN_TYPE:
                setReturnType((KTypeReference)newValue);
                return;
            case ClassdataPackage.KMETHOD__ABSTRACT:
                setAbstract((Boolean)newValue);
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
            case ClassdataPackage.KMETHOD__PARAMETERS:
                getParameters().clear();
                return;
            case ClassdataPackage.KMETHOD__RETURN_TYPE:
                setReturnType((KTypeReference)null);
                return;
            case ClassdataPackage.KMETHOD__ABSTRACT:
                setAbstract(ABSTRACT_EDEFAULT);
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
            case ClassdataPackage.KMETHOD__PARAMETERS:
                return parameters != null && !parameters.isEmpty();
            case ClassdataPackage.KMETHOD__RETURN_TYPE:
                return returnType != null;
            case ClassdataPackage.KMETHOD__ABSTRACT:
                return abstract_ != ABSTRACT_EDEFAULT;
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
        result.append(" (abstract: ");
        result.append(abstract_);
        result.append(')');
        return result.toString();
    }

} //KMethodImpl
