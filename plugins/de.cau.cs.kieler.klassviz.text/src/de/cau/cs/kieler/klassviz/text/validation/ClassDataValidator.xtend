/*
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
package de.cau.cs.kieler.klassviz.text.validation

import org.eclipse.xtext.validation.Check
import de.cau.cs.kieler.klassviz.model.classdata.KType
import de.cau.cs.kieler.klassviz.model.classdata.KTypeSelection
import de.cau.cs.kieler.klassviz.model.classdata.ClassdataPackage
import de.cau.cs.kieler.klassviz.model.classdata.KField
import de.cau.cs.kieler.klassviz.model.classdata.KMethod
import de.cau.cs.kieler.klassviz.synthesis.ClassDataExtensions

/**
 * Custom validation rules. 
 *
 * @see http://www.eclipse.org/Xtext/documentation.html#validation
 * @author msp
 */
class ClassDataValidator extends AbstractClassDataValidator {
    
    extension ClassDataExtensions

    /**
     * Check whether a type exists in the referenced projects and bundles.
     */
    @Check
    def checkTypeExists(KType type) {
        val data = type.eContainer as KTypeSelection
        if (data.getJdtType(type) == null) {
            error("Type not found: " + type.qualifiedName,
                type, ClassdataPackage.eINSTANCE.KType_QualifiedName)
        }
    }
    
    /**
     * Check whether a field exists in its containing type.
     */
    @Check
    def checkFieldExists(KField field) {
        val type = field.eContainer as KType
        val data = type.eContainer as KTypeSelection
        val jdtType = data.getJdtType(type)
        if (jdtType != null) {
            if (jdtType.getField(field.name) == null) {
                error("Field name not found: " + field.name,
                    field, ClassdataPackage.eINSTANCE.KMember_Name)
            }
        }
    }
    
    /**
     * Check whether a method exists in its containing type.
     */
    @Check
    def checkMethodExists(KMethod method) {
        val type = method.eContainer as KType
        val data = type.eContainer as KTypeSelection
        val jdtType = getJdtType(data, type)
        if (jdtType != null) {
            if (jdtType.getMethod(method.name,
                    method.parameterTypeSignatures.map[s | s.name]) == null) {
                error("Method not found: " + method.name,
                    method, ClassdataPackage.eINSTANCE.KMember_Name)
            }
        }
    }

}
