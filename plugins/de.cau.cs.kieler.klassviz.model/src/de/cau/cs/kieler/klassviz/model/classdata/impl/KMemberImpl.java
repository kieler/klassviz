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
import de.cau.cs.kieler.klassviz.model.classdata.KMember;

import de.cau.cs.kieler.klassviz.model.classdata.KVisibility;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KMember</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KMemberImpl#isSelected <em>Selected</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KMemberImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KMemberImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KMemberImpl#isFinal <em>Final</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KMemberImpl#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class KMemberImpl extends MinimalEObjectImpl.Container implements KMember {
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
     * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isStatic()
     * @generated
     * @ordered
     */
    protected static final boolean STATIC_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isStatic() <em>Static</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isStatic()
     * @generated
     * @ordered
     */
    protected boolean static_ = STATIC_EDEFAULT;

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
     * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVisibility()
     * @generated
     * @ordered
     */
    protected static final KVisibility VISIBILITY_EDEFAULT = KVisibility.PACKAGE;

    /**
     * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVisibility()
     * @generated
     * @ordered
     */
    protected KVisibility visibility = VISIBILITY_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected KMemberImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ClassdataPackage.Literals.KMEMBER;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ClassdataPackage.KMEMBER__SELECTED, oldSelected, selected));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ClassdataPackage.KMEMBER__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isStatic() {
        return static_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStatic(boolean newStatic) {
        boolean oldStatic = static_;
        static_ = newStatic;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ClassdataPackage.KMEMBER__STATIC, oldStatic, static_));
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
            eNotify(new ENotificationImpl(this, Notification.SET, ClassdataPackage.KMEMBER__FINAL, oldFinal, final_));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public KVisibility getVisibility() {
        return visibility;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVisibility(KVisibility newVisibility) {
        KVisibility oldVisibility = visibility;
        visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ClassdataPackage.KMEMBER__VISIBILITY, oldVisibility, visibility));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ClassdataPackage.KMEMBER__SELECTED:
                return isSelected();
            case ClassdataPackage.KMEMBER__NAME:
                return getName();
            case ClassdataPackage.KMEMBER__STATIC:
                return isStatic();
            case ClassdataPackage.KMEMBER__FINAL:
                return isFinal();
            case ClassdataPackage.KMEMBER__VISIBILITY:
                return getVisibility();
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
            case ClassdataPackage.KMEMBER__SELECTED:
                setSelected((Boolean)newValue);
                return;
            case ClassdataPackage.KMEMBER__NAME:
                setName((String)newValue);
                return;
            case ClassdataPackage.KMEMBER__STATIC:
                setStatic((Boolean)newValue);
                return;
            case ClassdataPackage.KMEMBER__FINAL:
                setFinal((Boolean)newValue);
                return;
            case ClassdataPackage.KMEMBER__VISIBILITY:
                setVisibility((KVisibility)newValue);
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
            case ClassdataPackage.KMEMBER__SELECTED:
                setSelected(SELECTED_EDEFAULT);
                return;
            case ClassdataPackage.KMEMBER__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ClassdataPackage.KMEMBER__STATIC:
                setStatic(STATIC_EDEFAULT);
                return;
            case ClassdataPackage.KMEMBER__FINAL:
                setFinal(FINAL_EDEFAULT);
                return;
            case ClassdataPackage.KMEMBER__VISIBILITY:
                setVisibility(VISIBILITY_EDEFAULT);
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
            case ClassdataPackage.KMEMBER__SELECTED:
                return selected != SELECTED_EDEFAULT;
            case ClassdataPackage.KMEMBER__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case ClassdataPackage.KMEMBER__STATIC:
                return static_ != STATIC_EDEFAULT;
            case ClassdataPackage.KMEMBER__FINAL:
                return final_ != FINAL_EDEFAULT;
            case ClassdataPackage.KMEMBER__VISIBILITY:
                return visibility != VISIBILITY_EDEFAULT;
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
        result.append(" (selected: ");
        result.append(selected);
        result.append(", name: ");
        result.append(name);
        result.append(", static: ");
        result.append(static_);
        result.append(", final: ");
        result.append(final_);
        result.append(", visibility: ");
        result.append(visibility);
        result.append(')');
        return result.toString();
    }

} //KMemberImpl
