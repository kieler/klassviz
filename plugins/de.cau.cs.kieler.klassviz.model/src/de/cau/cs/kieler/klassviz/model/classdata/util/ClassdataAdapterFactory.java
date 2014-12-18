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
package de.cau.cs.kieler.klassviz.model.classdata.util;

import de.cau.cs.kieler.klassviz.model.classdata.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage
 * @generated
 */
public class ClassdataAdapterFactory extends AdapterFactoryImpl {
    /**
	 * The cached model package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static ClassdataPackage modelPackage;

    /**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ClassdataAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ClassdataPackage.eINSTANCE;
		}
	}

    /**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
    @Override
    public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

    /**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ClassdataSwitch<Adapter> modelSwitch =
        new ClassdataSwitch<Adapter>() {
			@Override
			public Adapter caseKClassModel(KClassModel object) {
				return createKClassModelAdapter();
			}
			@Override
			public Adapter caseKOption(KOption object) {
				return createKOptionAdapter();
			}
			@Override
			public Adapter caseKPackage(KPackage object) {
				return createKPackageAdapter();
			}
			@Override
			public Adapter caseKType(KType object) {
				return createKTypeAdapter();
			}
			@Override
			public Adapter caseKClass(KClass object) {
				return createKClassAdapter();
			}
			@Override
			public Adapter caseKInterface(KInterface object) {
				return createKInterfaceAdapter();
			}
			@Override
			public Adapter caseKEnum(KEnum object) {
				return createKEnumAdapter();
			}
			@Override
			public Adapter caseKDependency(KDependency object) {
				return createKDependencyAdapter();
			}
			@Override
			public Adapter caseKMember(KMember object) {
				return createKMemberAdapter();
			}
			@Override
			public Adapter caseKField(KField object) {
				return createKFieldAdapter();
			}
			@Override
			public Adapter caseKMethod(KMethod object) {
				return createKMethodAdapter();
			}
			@Override
			public Adapter caseKTypeReference(KTypeReference object) {
				return createKTypeReferenceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

    /**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
    @Override
    public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.klassviz.model.classdata.KClassModel <em>KClass Model</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.klassviz.model.classdata.KClassModel
	 * @generated
	 */
    public Adapter createKClassModelAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.klassviz.model.classdata.KOption <em>KOption</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.klassviz.model.classdata.KOption
	 * @generated
	 */
    public Adapter createKOptionAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.klassviz.model.classdata.KPackage <em>KPackage</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.klassviz.model.classdata.KPackage
	 * @generated
	 */
    public Adapter createKPackageAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.klassviz.model.classdata.KType <em>KType</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.klassviz.model.classdata.KType
	 * @generated
	 */
    public Adapter createKTypeAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.klassviz.model.classdata.KClass <em>KClass</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.klassviz.model.classdata.KClass
	 * @generated
	 */
    public Adapter createKClassAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.klassviz.model.classdata.KInterface <em>KInterface</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.klassviz.model.classdata.KInterface
	 * @generated
	 */
    public Adapter createKInterfaceAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.klassviz.model.classdata.KEnum <em>KEnum</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.klassviz.model.classdata.KEnum
	 * @generated
	 */
    public Adapter createKEnumAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.klassviz.model.classdata.KDependency <em>KDependency</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.klassviz.model.classdata.KDependency
	 * @generated
	 */
    public Adapter createKDependencyAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.klassviz.model.classdata.KMember <em>KMember</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.klassviz.model.classdata.KMember
	 * @generated
	 */
    public Adapter createKMemberAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.klassviz.model.classdata.KField <em>KField</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.klassviz.model.classdata.KField
	 * @generated
	 */
    public Adapter createKFieldAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.klassviz.model.classdata.KMethod <em>KMethod</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.klassviz.model.classdata.KMethod
	 * @generated
	 */
    public Adapter createKMethodAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for an object of class '{@link de.cau.cs.kieler.klassviz.model.classdata.KTypeReference <em>KType Reference</em>}'.
	 * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.cau.cs.kieler.klassviz.model.classdata.KTypeReference
	 * @generated
	 */
    public Adapter createKTypeReferenceAdapter() {
		return null;
	}

    /**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
    public Adapter createEObjectAdapter() {
		return null;
	}

} //ClassdataAdapterFactory
