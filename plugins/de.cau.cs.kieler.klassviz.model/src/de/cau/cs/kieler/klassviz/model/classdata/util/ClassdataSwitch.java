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
package de.cau.cs.kieler.klassviz.model.classdata.util;

import de.cau.cs.kieler.klassviz.model.classdata.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage
 * @generated
 */
public class ClassdataSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ClassdataPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ClassdataSwitch() {
        if (modelPackage == null) {
            modelPackage = ClassdataPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @parameter ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case ClassdataPackage.KCLASS_MODEL: {
                KClassModel kClassModel = (KClassModel)theEObject;
                T result = caseKClassModel(kClassModel);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ClassdataPackage.KOPTION: {
                KOption kOption = (KOption)theEObject;
                T result = caseKOption(kOption);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ClassdataPackage.KPACKAGE: {
                KPackage kPackage = (KPackage)theEObject;
                T result = caseKPackage(kPackage);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ClassdataPackage.KTYPE: {
                KType kType = (KType)theEObject;
                T result = caseKType(kType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ClassdataPackage.KCLASS: {
                KClass kClass = (KClass)theEObject;
                T result = caseKClass(kClass);
                if (result == null) result = caseKType(kClass);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ClassdataPackage.KINTERFACE: {
                KInterface kInterface = (KInterface)theEObject;
                T result = caseKInterface(kInterface);
                if (result == null) result = caseKType(kInterface);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ClassdataPackage.KENUM: {
                KEnum kEnum = (KEnum)theEObject;
                T result = caseKEnum(kEnum);
                if (result == null) result = caseKType(kEnum);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ClassdataPackage.KMEMBER: {
                KMember kMember = (KMember)theEObject;
                T result = caseKMember(kMember);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ClassdataPackage.KFIELD: {
                KField kField = (KField)theEObject;
                T result = caseKField(kField);
                if (result == null) result = caseKMember(kField);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ClassdataPackage.KMETHOD: {
                KMethod kMethod = (KMethod)theEObject;
                T result = caseKMethod(kMethod);
                if (result == null) result = caseKMember(kMethod);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ClassdataPackage.KTYPE_REFERENCE: {
                KTypeReference kTypeReference = (KTypeReference)theEObject;
                T result = caseKTypeReference(kTypeReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>KClass Model</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>KClass Model</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseKClassModel(KClassModel object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>KOption</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>KOption</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseKOption(KOption object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>KPackage</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>KPackage</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseKPackage(KPackage object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>KType</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>KType</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseKType(KType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>KClass</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>KClass</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseKClass(KClass object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>KInterface</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>KInterface</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseKInterface(KInterface object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>KEnum</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>KEnum</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseKEnum(KEnum object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>KMember</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>KMember</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseKMember(KMember object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>KField</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>KField</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseKField(KField object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>KMethod</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>KMethod</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseKMethod(KMethod object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>KType Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>KType Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseKTypeReference(KTypeReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase(EObject object) {
        return null;
    }

} //ClassdataSwitch
