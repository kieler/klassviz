/*
 * KlassViz - Kieler Class Diagram Visualization
 * 
 * A part of OpenKieler
 * https://github.com/OpenKieler
 * 
 * Copyright 2014, 2018 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.klassviz.text

import org.eclipse.xtext.conversion.IValueConverterService

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class ClassDataRuntimeModule extends AbstractClassDataRuntimeModule {
    override Class<? extends IValueConverterService> bindIValueConverterService() {
        return ClassDataValueConverters
    }
}
