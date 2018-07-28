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
package de.cau.cs.kieler.klassviz.text.serializer

import de.cau.cs.kieler.klassviz.model.classdata.KField
import de.cau.cs.kieler.klassviz.model.classdata.KMethod
import de.cau.cs.kieler.klassviz.model.classdata.KTypeReference
import org.eclipse.xtext.serializer.ISerializationContext

class ClassDataSemanticSequencer extends AbstractClassDataSemanticSequencer {
    override protected void sequence_KTypeReference(ISerializationContext context, KTypeReference typeRef) {
        val String origSig = typeRef.getSignature()
        // Use only the simple name for serialization (i.e. the part after the last '.').
        var String tmpSig = origSig.substring(origSig.lastIndexOf(Character.valueOf('.').charValue) + 1)
        // Remove any type generics.
        if (tmpSig.contains("<")) {
            tmpSig = tmpSig.substring(0, tmpSig.indexOf(Character.valueOf('<').charValue))
        }
        typeRef.setSignature(tmpSig)
        super.sequence_KTypeReference(context, typeRef)
        // Restore the original signature.
        typeRef.setSignature(origSig)
    }

    override protected void sequence_KField(ISerializationContext context, KField semanticObject) {
        // Only serialize fields that are explicitly selected.
        if (semanticObject.isSelected()) {
            super.sequence_KField(context, semanticObject)
        }
    }

    override protected void sequence_KMethod(ISerializationContext context, KMethod semanticObject) {
        // Only serialize fields that are explicitly selected.
        if (semanticObject.isSelected()) {
            super.sequence_KMethod(context, semanticObject)
        }
    }
}
