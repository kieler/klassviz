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
import de.cau.cs.kieler.klassviz.model.classdata.KClass;
import de.cau.cs.kieler.klassviz.model.classdata.KInterface;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KClass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KClassImpl#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KClassImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KClassImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KClassImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KClassImpl#isAbstract <em>Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KClassImpl extends KTypeImpl implements KClass {
    /**
     * The cached value of the '{@link #getSuperClass() <em>Super Class</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuperClass()
     * @generated
     * @ordered
     */
    protected KClass superClass;

    /**
     * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInterfaces()
     * @generated
     * @ordered
     */
    protected EList<KInterface> interfaces;

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
     * The default value of the '{@link #isFinal() <em>Final</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isFinal()
     * @generated
     * @ordered
     */
    protected static final boolean FINAL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isFinal() <em>Final</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isFinal()
     * @generated
     * @ordered
     */
    protected boolean final_ = FINAL_EDEFAULT;

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
    protected KClassImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ClassdataPackage.Literals.KCLASS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KClass getSuperClass() {
        if (superClass != null && superClass.eIsProxy()) {
            InternalEObject oldSuperClass = (InternalEObject)superClass;
            superClass = (KClass)eResolveProxy(oldSuperClass);
            if (superClass != oldSuperClass) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClassdataPackage.KCLASS__SUPER_CLASS, oldSuperClass, superClass));
            }
        }
        return superClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KClass basicGetSuperClass() {
        return superClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSuperClass(KClass newSuperClass) {
        KClass oldSuperClass = superClass;
        superClass = newSuperClass;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ClassdataPackage.KCLASS__SUPER_CLASS, oldSuperClass, superClass));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<KInterface> getInterfaces() {
        if (interfaces == null) {
            interfaces = new EObjectResolvingEList<KInterface>(KInterface.class, this, ClassdataPackage.KCLASS__INTERFACES);
        }
        return interfaces;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getTypeParameters() {
        if (typeParameters == null) {
            typeParameters = new EDataTypeUniqueEList<String>(String.class, this, ClassdataPackage.KCLASS__TYPE_PARAMETERS);
        }
        return typeParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isFinal() {
        return final_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFinal(boolean newFinal) {
        boolean oldFinal = final_;
        final_ = newFinal;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ClassdataPackage.KCLASS__FINAL, oldFinal, final_));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ClassdataPackage.KCLASS__ABSTRACT, oldAbstract, abstract_));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ClassdataPackage.KCLASS__SUPER_CLASS:
                if (resolve) return getSuperClass();
                return basicGetSuperClass();
            case ClassdataPackage.KCLASS__INTERFACES:
                return getInterfaces();
            case ClassdataPackage.KCLASS__TYPE_PARAMETERS:
                return getTypeParameters();
            case ClassdataPackage.KCLASS__FINAL:
                return isFinal();
            case ClassdataPackage.KCLASS__ABSTRACT:
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
            case ClassdataPackage.KCLASS__SUPER_CLASS:
                setSuperClass((KClass)newValue);
                return;
            case ClassdataPackage.KCLASS__INTERFACES:
                getInterfaces().clear();
                getInterfaces().addAll((Collection<? extends KInterface>)newValue);
                return;
            case ClassdataPackage.KCLASS__TYPE_PARAMETERS:
                getTypeParameters().clear();
                getTypeParameters().addAll((Collection<? extends String>)newValue);
                return;
            case ClassdataPackage.KCLASS__FINAL:
                setFinal((Boolean)newValue);
                return;
            case ClassdataPackage.KCLASS__ABSTRACT:
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
            case ClassdataPackage.KCLASS__SUPER_CLASS:
                setSuperClass((KClass)null);
                return;
            case ClassdataPackage.KCLASS__INTERFACES:
                getInterfaces().clear();
                return;
            case ClassdataPackage.KCLASS__TYPE_PARAMETERS:
                getTypeParameters().clear();
                return;
            case ClassdataPackage.KCLASS__FINAL:
                setFinal(FINAL_EDEFAULT);
                return;
            case ClassdataPackage.KCLASS__ABSTRACT:
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
            case ClassdataPackage.KCLASS__SUPER_CLASS:
                return superClass != null;
            case ClassdataPackage.KCLASS__INTERFACES:
                return interfaces != null && !interfaces.isEmpty();
            case ClassdataPackage.KCLASS__TYPE_PARAMETERS:
                return typeParameters != null && !typeParameters.isEmpty();
            case ClassdataPackage.KCLASS__FINAL:
                return final_ != FINAL_EDEFAULT;
            case ClassdataPackage.KCLASS__ABSTRACT:
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
        result.append(" (typeParameters: ");
        result.append(typeParameters);
        result.append(", final: ");
        result.append(final_);
        result.append(", abstract: ");
        result.append(abstract_);
        result.append(')');
        return result.toString();
    }

} //KClassImpl
