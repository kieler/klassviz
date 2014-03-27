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
import de.cau.cs.kieler.klassviz.model.classdata.EField;
import de.cau.cs.kieler.klassviz.model.classdata.EMethod;
import de.cau.cs.kieler.klassviz.model.classdata.EType;

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

import org.eclipse.jdt.core.IType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EType</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.ETypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.ETypeImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.ETypeImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.ETypeImpl#getFullyQualifiedName <em>Fully Qualified Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ETypeImpl extends MinimalEObjectImpl.Container implements EType {
    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final IType TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected IType type = TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFields()
     * @generated
     * @ordered
     */
    protected EList<EField> fields;

    /**
     * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMethods()
     * @generated
     * @ordered
     */
    protected EList<EMethod> methods;

    /**
     * The default value of the '{@link #getFullyQualifiedName() <em>Fully Qualified Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFullyQualifiedName()
     * @generated
     * @ordered
     */
    protected static final String FULLY_QUALIFIED_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFullyQualifiedName() <em>Fully Qualified Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFullyQualifiedName()
     * @generated
     * @ordered
     */
    protected String fullyQualifiedName = FULLY_QUALIFIED_NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ETypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ClassdataPackage.Literals.ETYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IType getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(IType newType) {
        IType oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ClassdataPackage.ETYPE__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EField> getFields() {
        if (fields == null) {
            fields = new EObjectContainmentEList<EField>(EField.class, this, ClassdataPackage.ETYPE__FIELDS);
        }
        return fields;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<EMethod> getMethods() {
        if (methods == null) {
            methods = new EObjectContainmentEList<EMethod>(EMethod.class, this, ClassdataPackage.ETYPE__METHODS);
        }
        return methods;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFullyQualifiedName() {
        return fullyQualifiedName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFullyQualifiedName(String newFullyQualifiedName) {
        String oldFullyQualifiedName = fullyQualifiedName;
        fullyQualifiedName = newFullyQualifiedName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ClassdataPackage.ETYPE__FULLY_QUALIFIED_NAME, oldFullyQualifiedName, fullyQualifiedName));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ClassdataPackage.ETYPE__FIELDS:
                return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
            case ClassdataPackage.ETYPE__METHODS:
                return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
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
            case ClassdataPackage.ETYPE__TYPE:
                return getType();
            case ClassdataPackage.ETYPE__FIELDS:
                return getFields();
            case ClassdataPackage.ETYPE__METHODS:
                return getMethods();
            case ClassdataPackage.ETYPE__FULLY_QUALIFIED_NAME:
                return getFullyQualifiedName();
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
            case ClassdataPackage.ETYPE__TYPE:
                setType((IType)newValue);
                return;
            case ClassdataPackage.ETYPE__FIELDS:
                getFields().clear();
                getFields().addAll((Collection<? extends EField>)newValue);
                return;
            case ClassdataPackage.ETYPE__METHODS:
                getMethods().clear();
                getMethods().addAll((Collection<? extends EMethod>)newValue);
                return;
            case ClassdataPackage.ETYPE__FULLY_QUALIFIED_NAME:
                setFullyQualifiedName((String)newValue);
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
            case ClassdataPackage.ETYPE__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case ClassdataPackage.ETYPE__FIELDS:
                getFields().clear();
                return;
            case ClassdataPackage.ETYPE__METHODS:
                getMethods().clear();
                return;
            case ClassdataPackage.ETYPE__FULLY_QUALIFIED_NAME:
                setFullyQualifiedName(FULLY_QUALIFIED_NAME_EDEFAULT);
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
            case ClassdataPackage.ETYPE__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
            case ClassdataPackage.ETYPE__FIELDS:
                return fields != null && !fields.isEmpty();
            case ClassdataPackage.ETYPE__METHODS:
                return methods != null && !methods.isEmpty();
            case ClassdataPackage.ETYPE__FULLY_QUALIFIED_NAME:
                return FULLY_QUALIFIED_NAME_EDEFAULT == null ? fullyQualifiedName != null : !FULLY_QUALIFIED_NAME_EDEFAULT.equals(fullyQualifiedName);
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
        result.append(" (type: ");
        result.append(type);
        result.append(", fullyQualifiedName: ");
        result.append(fullyQualifiedName);
        result.append(')');
        return result.toString();
    }

} //ETypeImpl
