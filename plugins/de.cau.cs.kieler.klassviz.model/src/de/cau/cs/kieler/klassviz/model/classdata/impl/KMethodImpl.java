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

import de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage;
import de.cau.cs.kieler.klassviz.model.classdata.KMethod;
import de.cau.cs.kieler.klassviz.model.classdata.KParameterTypeSignature;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.jdt.core.IMethod;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KMethod</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KMethodImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KMethodImpl#getParameterTypeSignatures <em>Parameter Type Signatures</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KMethodImpl extends KMemberImpl implements KMethod {
    /**
     * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMethod()
     * @generated
     * @ordered
     */
    protected static final IMethod METHOD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMethod()
     * @generated
     * @ordered
     */
    protected IMethod method = METHOD_EDEFAULT;

    /**
     * The cached value of the '{@link #getParameterTypeSignatures() <em>Parameter Type Signatures</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameterTypeSignatures()
     * @generated
     * @ordered
     */
    protected EList<KParameterTypeSignature> parameterTypeSignatures;

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
    public IMethod getMethod() {
        return method;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMethod(IMethod newMethod) {
        IMethod oldMethod = method;
        method = newMethod;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ClassdataPackage.KMETHOD__METHOD, oldMethod, method));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<KParameterTypeSignature> getParameterTypeSignatures() {
        if (parameterTypeSignatures == null) {
            parameterTypeSignatures = new EObjectContainmentEList<KParameterTypeSignature>(KParameterTypeSignature.class, this, ClassdataPackage.KMETHOD__PARAMETER_TYPE_SIGNATURES);
        }
        return parameterTypeSignatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ClassdataPackage.KMETHOD__PARAMETER_TYPE_SIGNATURES:
                return ((InternalEList<?>)getParameterTypeSignatures()).basicRemove(otherEnd, msgs);
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
            case ClassdataPackage.KMETHOD__METHOD:
                return getMethod();
            case ClassdataPackage.KMETHOD__PARAMETER_TYPE_SIGNATURES:
                return getParameterTypeSignatures();
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
            case ClassdataPackage.KMETHOD__METHOD:
                setMethod((IMethod)newValue);
                return;
            case ClassdataPackage.KMETHOD__PARAMETER_TYPE_SIGNATURES:
                getParameterTypeSignatures().clear();
                getParameterTypeSignatures().addAll((Collection<? extends KParameterTypeSignature>)newValue);
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
            case ClassdataPackage.KMETHOD__METHOD:
                setMethod(METHOD_EDEFAULT);
                return;
            case ClassdataPackage.KMETHOD__PARAMETER_TYPE_SIGNATURES:
                getParameterTypeSignatures().clear();
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
            case ClassdataPackage.KMETHOD__METHOD:
                return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
            case ClassdataPackage.KMETHOD__PARAMETER_TYPE_SIGNATURES:
                return parameterTypeSignatures != null && !parameterTypeSignatures.isEmpty();
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
        result.append(" (method: ");
        result.append(method);
        result.append(')');
        return result.toString();
    }

} //KMethodImpl
