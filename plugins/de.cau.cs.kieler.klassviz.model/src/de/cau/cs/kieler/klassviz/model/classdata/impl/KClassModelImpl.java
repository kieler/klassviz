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
import de.cau.cs.kieler.klassviz.model.classdata.KClassModel;
import de.cau.cs.kieler.klassviz.model.classdata.KOption;
import de.cau.cs.kieler.klassviz.model.classdata.KPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KClass Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KClassModelImpl#getJavaProjects <em>Java Projects</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KClassModelImpl#getBundles <em>Bundles</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KClassModelImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KClassModelImpl#isResolved <em>Resolved</em>}</li>
 *   <li>{@link de.cau.cs.kieler.klassviz.model.classdata.impl.KClassModelImpl#getOptions <em>Options</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KClassModelImpl extends MinimalEObjectImpl.Container implements KClassModel {
    /**
     * The cached value of the '{@link #getJavaProjects() <em>Java Projects</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJavaProjects()
     * @generated
     * @ordered
     */
    protected EList<String> javaProjects;

    /**
     * The cached value of the '{@link #getBundles() <em>Bundles</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBundles()
     * @generated
     * @ordered
     */
    protected EList<String> bundles;

    /**
     * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPackages()
     * @generated
     * @ordered
     */
    protected EList<KPackage> packages;

    /**
     * The default value of the '{@link #isResolved() <em>Resolved</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isResolved()
     * @generated
     * @ordered
     */
    protected static final boolean RESOLVED_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isResolved() <em>Resolved</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isResolved()
     * @generated
     * @ordered
     */
    protected boolean resolved = RESOLVED_EDEFAULT;

    /**
     * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOptions()
     * @generated
     * @ordered
     */
    protected EList<KOption> options;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected KClassModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ClassdataPackage.Literals.KCLASS_MODEL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getJavaProjects() {
        if (javaProjects == null) {
            javaProjects = new EDataTypeUniqueEList<String>(String.class, this, ClassdataPackage.KCLASS_MODEL__JAVA_PROJECTS);
        }
        return javaProjects;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getBundles() {
        if (bundles == null) {
            bundles = new EDataTypeUniqueEList<String>(String.class, this, ClassdataPackage.KCLASS_MODEL__BUNDLES);
        }
        return bundles;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<KPackage> getPackages() {
        if (packages == null) {
            packages = new EObjectContainmentEList<KPackage>(KPackage.class, this, ClassdataPackage.KCLASS_MODEL__PACKAGES);
        }
        return packages;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isResolved() {
        return resolved;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setResolved(boolean newResolved) {
        boolean oldResolved = resolved;
        resolved = newResolved;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ClassdataPackage.KCLASS_MODEL__RESOLVED, oldResolved, resolved));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<KOption> getOptions() {
        if (options == null) {
            options = new EObjectContainmentEList<KOption>(KOption.class, this, ClassdataPackage.KCLASS_MODEL__OPTIONS);
        }
        return options;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ClassdataPackage.KCLASS_MODEL__PACKAGES:
                return ((InternalEList<?>)getPackages()).basicRemove(otherEnd, msgs);
            case ClassdataPackage.KCLASS_MODEL__OPTIONS:
                return ((InternalEList<?>)getOptions()).basicRemove(otherEnd, msgs);
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
            case ClassdataPackage.KCLASS_MODEL__JAVA_PROJECTS:
                return getJavaProjects();
            case ClassdataPackage.KCLASS_MODEL__BUNDLES:
                return getBundles();
            case ClassdataPackage.KCLASS_MODEL__PACKAGES:
                return getPackages();
            case ClassdataPackage.KCLASS_MODEL__RESOLVED:
                return isResolved();
            case ClassdataPackage.KCLASS_MODEL__OPTIONS:
                return getOptions();
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
            case ClassdataPackage.KCLASS_MODEL__JAVA_PROJECTS:
                getJavaProjects().clear();
                getJavaProjects().addAll((Collection<? extends String>)newValue);
                return;
            case ClassdataPackage.KCLASS_MODEL__BUNDLES:
                getBundles().clear();
                getBundles().addAll((Collection<? extends String>)newValue);
                return;
            case ClassdataPackage.KCLASS_MODEL__PACKAGES:
                getPackages().clear();
                getPackages().addAll((Collection<? extends KPackage>)newValue);
                return;
            case ClassdataPackage.KCLASS_MODEL__RESOLVED:
                setResolved((Boolean)newValue);
                return;
            case ClassdataPackage.KCLASS_MODEL__OPTIONS:
                getOptions().clear();
                getOptions().addAll((Collection<? extends KOption>)newValue);
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
            case ClassdataPackage.KCLASS_MODEL__JAVA_PROJECTS:
                getJavaProjects().clear();
                return;
            case ClassdataPackage.KCLASS_MODEL__BUNDLES:
                getBundles().clear();
                return;
            case ClassdataPackage.KCLASS_MODEL__PACKAGES:
                getPackages().clear();
                return;
            case ClassdataPackage.KCLASS_MODEL__RESOLVED:
                setResolved(RESOLVED_EDEFAULT);
                return;
            case ClassdataPackage.KCLASS_MODEL__OPTIONS:
                getOptions().clear();
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
            case ClassdataPackage.KCLASS_MODEL__JAVA_PROJECTS:
                return javaProjects != null && !javaProjects.isEmpty();
            case ClassdataPackage.KCLASS_MODEL__BUNDLES:
                return bundles != null && !bundles.isEmpty();
            case ClassdataPackage.KCLASS_MODEL__PACKAGES:
                return packages != null && !packages.isEmpty();
            case ClassdataPackage.KCLASS_MODEL__RESOLVED:
                return resolved != RESOLVED_EDEFAULT;
            case ClassdataPackage.KCLASS_MODEL__OPTIONS:
                return options != null && !options.isEmpty();
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
        result.append(" (javaProjects: ");
        result.append(javaProjects);
        result.append(", bundles: ");
        result.append(bundles);
        result.append(", resolved: ");
        result.append(resolved);
        result.append(')');
        return result.toString();
    }

} //KClassModelImpl
