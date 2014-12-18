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
import de.cau.cs.kieler.klassviz.model.classdata.KDependency;
import de.cau.cs.kieler.klassviz.model.classdata.KField;
import de.cau.cs.kieler.klassviz.model.classdata.KMethod;
import de.cau.cs.kieler.klassviz.model.classdata.KType;

import de.cau.cs.kieler.klassviz.model.classdata.KVisibility;
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
 * An implementation of the model object '<em><b>KType</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KTypeImpl#isSelected <em>Selected</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KTypeImpl#getFields <em>Fields</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KTypeImpl#getMethods <em>Methods</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KTypeImpl#getNestedTypes <em>Nested Types</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KTypeImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KTypeImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KTypeImpl#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class KTypeImpl extends MinimalEObjectImpl.Container implements KType {
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
	 * The cached value of the '{@link #getFields() <em>Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getFields()
	 * @generated
	 * @ordered
	 */
    protected EList<KField> fields;

    /**
	 * The cached value of the '{@link #getMethods() <em>Methods</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getMethods()
	 * @generated
	 * @ordered
	 */
    protected EList<KMethod> methods;

    /**
	 * The cached value of the '{@link #getNestedTypes() <em>Nested Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNestedTypes()
	 * @generated
	 * @ordered
	 */
    protected EList<KType> nestedTypes;

    /**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
    protected EList<KDependency> dependencies;

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
    protected KTypeImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return ClassdataPackage.Literals.KTYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassdataPackage.KTYPE__SELECTED, oldSelected, selected));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassdataPackage.KTYPE__NAME, oldName, name));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<KField> getFields() {
		if (fields == null) {
			fields = new EObjectContainmentEList<KField>(KField.class, this, ClassdataPackage.KTYPE__FIELDS);
		}
		return fields;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<KMethod> getMethods() {
		if (methods == null) {
			methods = new EObjectContainmentEList<KMethod>(KMethod.class, this, ClassdataPackage.KTYPE__METHODS);
		}
		return methods;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<KType> getNestedTypes() {
		if (nestedTypes == null) {
			nestedTypes = new EObjectContainmentEList<KType>(KType.class, this, ClassdataPackage.KTYPE__NESTED_TYPES);
		}
		return nestedTypes;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<KDependency> getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectContainmentEList<KDependency>(KDependency.class, this, ClassdataPackage.KTYPE__DEPENDENCIES);
		}
		return dependencies;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassdataPackage.KTYPE__STATIC, oldStatic, static_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClassdataPackage.KTYPE__VISIBILITY, oldVisibility, visibility));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ClassdataPackage.KTYPE__FIELDS:
				return ((InternalEList<?>)getFields()).basicRemove(otherEnd, msgs);
			case ClassdataPackage.KTYPE__METHODS:
				return ((InternalEList<?>)getMethods()).basicRemove(otherEnd, msgs);
			case ClassdataPackage.KTYPE__NESTED_TYPES:
				return ((InternalEList<?>)getNestedTypes()).basicRemove(otherEnd, msgs);
			case ClassdataPackage.KTYPE__DEPENDENCIES:
				return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
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
			case ClassdataPackage.KTYPE__SELECTED:
				return isSelected();
			case ClassdataPackage.KTYPE__NAME:
				return getName();
			case ClassdataPackage.KTYPE__FIELDS:
				return getFields();
			case ClassdataPackage.KTYPE__METHODS:
				return getMethods();
			case ClassdataPackage.KTYPE__NESTED_TYPES:
				return getNestedTypes();
			case ClassdataPackage.KTYPE__DEPENDENCIES:
				return getDependencies();
			case ClassdataPackage.KTYPE__STATIC:
				return isStatic();
			case ClassdataPackage.KTYPE__VISIBILITY:
				return getVisibility();
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
			case ClassdataPackage.KTYPE__SELECTED:
				setSelected((Boolean)newValue);
				return;
			case ClassdataPackage.KTYPE__NAME:
				setName((String)newValue);
				return;
			case ClassdataPackage.KTYPE__FIELDS:
				getFields().clear();
				getFields().addAll((Collection<? extends KField>)newValue);
				return;
			case ClassdataPackage.KTYPE__METHODS:
				getMethods().clear();
				getMethods().addAll((Collection<? extends KMethod>)newValue);
				return;
			case ClassdataPackage.KTYPE__NESTED_TYPES:
				getNestedTypes().clear();
				getNestedTypes().addAll((Collection<? extends KType>)newValue);
				return;
			case ClassdataPackage.KTYPE__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection<? extends KDependency>)newValue);
				return;
			case ClassdataPackage.KTYPE__STATIC:
				setStatic((Boolean)newValue);
				return;
			case ClassdataPackage.KTYPE__VISIBILITY:
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
			case ClassdataPackage.KTYPE__SELECTED:
				setSelected(SELECTED_EDEFAULT);
				return;
			case ClassdataPackage.KTYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ClassdataPackage.KTYPE__FIELDS:
				getFields().clear();
				return;
			case ClassdataPackage.KTYPE__METHODS:
				getMethods().clear();
				return;
			case ClassdataPackage.KTYPE__NESTED_TYPES:
				getNestedTypes().clear();
				return;
			case ClassdataPackage.KTYPE__DEPENDENCIES:
				getDependencies().clear();
				return;
			case ClassdataPackage.KTYPE__STATIC:
				setStatic(STATIC_EDEFAULT);
				return;
			case ClassdataPackage.KTYPE__VISIBILITY:
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
			case ClassdataPackage.KTYPE__SELECTED:
				return selected != SELECTED_EDEFAULT;
			case ClassdataPackage.KTYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ClassdataPackage.KTYPE__FIELDS:
				return fields != null && !fields.isEmpty();
			case ClassdataPackage.KTYPE__METHODS:
				return methods != null && !methods.isEmpty();
			case ClassdataPackage.KTYPE__NESTED_TYPES:
				return nestedTypes != null && !nestedTypes.isEmpty();
			case ClassdataPackage.KTYPE__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case ClassdataPackage.KTYPE__STATIC:
				return static_ != STATIC_EDEFAULT;
			case ClassdataPackage.KTYPE__VISIBILITY:
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
		result.append(", visibility: ");
		result.append(visibility);
		result.append(')');
		return result.toString();
	}

} //KTypeImpl
