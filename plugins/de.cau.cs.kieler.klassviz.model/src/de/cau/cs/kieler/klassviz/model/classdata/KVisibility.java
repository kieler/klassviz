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
package de.cau.cs.kieler.klassviz.model.classdata;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>KVisibility</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage#getKVisibility()
 * @model
 * @generated
 */
public enum KVisibility implements Enumerator {
    /**
     * The '<em><b>PUBLIC</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PUBLIC_VALUE
     * @generated
     * @ordered
     */
    PUBLIC(0, "PUBLIC", "PUBLIC"),

    /**
     * The '<em><b>PROTECTED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PROTECTED_VALUE
     * @generated
     * @ordered
     */
    PROTECTED(1, "PROTECTED", "PROTECTED"),

    /**
     * The '<em><b>PACKAGE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PACKAGE_VALUE
     * @generated
     * @ordered
     */
    PACKAGE(2, "PACKAGE", "PACKAGE"),

    /**
     * The '<em><b>PRIVATE</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #PRIVATE_VALUE
     * @generated
     * @ordered
     */
    PRIVATE(3, "PRIVATE", "PRIVATE");

    /**
     * The '<em><b>PUBLIC</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>PUBLIC</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PUBLIC
     * @model
     * @generated
     * @ordered
     */
    public static final int PUBLIC_VALUE = 0;

    /**
     * The '<em><b>PROTECTED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>PROTECTED</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PROTECTED
     * @model
     * @generated
     * @ordered
     */
    public static final int PROTECTED_VALUE = 1;

    /**
     * The '<em><b>PACKAGE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>PACKAGE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PACKAGE
     * @model
     * @generated
     * @ordered
     */
    public static final int PACKAGE_VALUE = 2;

    /**
     * The '<em><b>PRIVATE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>PRIVATE</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #PRIVATE
     * @model
     * @generated
     * @ordered
     */
    public static final int PRIVATE_VALUE = 3;

    /**
     * An array of all the '<em><b>KVisibility</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final KVisibility[] VALUES_ARRAY =
        new KVisibility[] {
            PUBLIC,
            PROTECTED,
            PACKAGE,
            PRIVATE,
        };

    /**
     * A public read-only list of all the '<em><b>KVisibility</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<KVisibility> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>KVisibility</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static KVisibility get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            KVisibility result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>KVisibility</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static KVisibility getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            KVisibility result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>KVisibility</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static KVisibility get(int value) {
        switch (value) {
            case PUBLIC_VALUE: return PUBLIC;
            case PROTECTED_VALUE: return PROTECTED;
            case PACKAGE_VALUE: return PACKAGE;
            case PRIVATE_VALUE: return PRIVATE;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private KVisibility(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getValue() {
      return value;
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
    public String getLiteral() {
      return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }
    
} //KVisibility
