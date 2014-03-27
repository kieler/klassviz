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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.jdt.core.IField;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EField</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.EFieldImpl#getField <em>Field</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.EFieldImpl#isSelected <em>Selected</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.EFieldImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EFieldImpl extends MinimalEObjectImpl.Container implements EField {
    /**
     * The default value of the '{@link #getField() <em>Field</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getField()
     * @generated
     * @ordered
     */
    protected static final IField FIELD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getField() <em>Field</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getField()
     * @generated
     * @ordered
     */
    protected IField field = FIELD_EDEFAULT;

    /**
     * The default value of the '{@link #isSelected() <em>Selected</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSelected()
     * @generated
     * @ordered
     */
    protected static final boolean SELECTED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isSelected() <em>Selected</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSelected()
     * @generated
     * @ordered
     */
    protected boolean selected = SELECTED_EDEFAULT;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EFieldImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ClassdataPackage.Literals.EFIELD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IField getField() {
        return field;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setField(IField newField) {
        IField oldField = field;
        field = newField;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ClassdataPackage.EFIELD__FIELD, oldField, field));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSelected() {
        return selected;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSelected(boolean newSelected) {
        boolean oldSelected = selected;
        selected = newSelected;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ClassdataPackage.EFIELD__SELECTED, oldSelected, selected));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ClassdataPackage.EFIELD__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ClassdataPackage.EFIELD__FIELD:
                return getField();
            case ClassdataPackage.EFIELD__SELECTED:
                return isSelected();
            case ClassdataPackage.EFIELD__NAME:
                return getName();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ClassdataPackage.EFIELD__FIELD:
                setField((IField)newValue);
                return;
            case ClassdataPackage.EFIELD__SELECTED:
                setSelected((Boolean)newValue);
                return;
            case ClassdataPackage.EFIELD__NAME:
                setName((String)newValue);
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
            case ClassdataPackage.EFIELD__FIELD:
                setField(FIELD_EDEFAULT);
                return;
            case ClassdataPackage.EFIELD__SELECTED:
                setSelected(SELECTED_EDEFAULT);
                return;
            case ClassdataPackage.EFIELD__NAME:
                setName(NAME_EDEFAULT);
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
            case ClassdataPackage.EFIELD__FIELD:
                return FIELD_EDEFAULT == null ? field != null : !FIELD_EDEFAULT.equals(field);
            case ClassdataPackage.EFIELD__SELECTED:
                return selected != SELECTED_EDEFAULT;
            case ClassdataPackage.EFIELD__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
        result.append(" (field: ");
        result.append(field);
        result.append(", selected: ");
        result.append(selected);
        result.append(", name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //EFieldImpl
