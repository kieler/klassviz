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
package de.cau.cs.kieler.klassviz.text.ui.labeling

import com.google.inject.Inject
import de.cau.cs.kieler.klassviz.model.classdata.KOption

/** 
 * Provides labels for a EObjects.
 * @see http://www.eclipse.org/Xtext/documentation.html#labelProvider
 * @author msp
 */
class ClassDataLabelProvider extends org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider {
    @Inject new(org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider delegate) {
        super(delegate)
    }

    /** 
     * The label of KOptions.
     * @param option an option
     * @return the corresponding label
     */
    def String text(KOption option) {
        return '''«option.getKey()» = «option.getValue()»'''
    }
}
