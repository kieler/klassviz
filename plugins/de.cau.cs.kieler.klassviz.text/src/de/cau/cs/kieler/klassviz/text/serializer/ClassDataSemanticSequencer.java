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
package de.cau.cs.kieler.klassviz.text.serializer;

import org.eclipse.emf.ecore.EObject;

import de.cau.cs.kieler.klassviz.model.classdata.KTypeReference;

public class ClassDataSemanticSequencer extends AbstractClassDataSemanticSequencer {

    /**
     * {@inheritDoc}
     */
    @Override
    protected void sequence_KTypeReference(EObject context, KTypeReference typeRef) {
        final String origSig = typeRef.getSignature();
        // Use only the simple name for serialization (i.e. the part after the last '.').
        String tmpSig = origSig.substring(origSig.lastIndexOf('.') + 1);
        // Remove any type generics.
        if (tmpSig.contains("<")) {
            tmpSig = tmpSig.substring(0, tmpSig.indexOf('<'));
        }
        typeRef.setSignature(tmpSig);
        super.sequence_KTypeReference(context, typeRef);
        // Restore the original signature.
        typeRef.setSignature(origSig);
    }
}
