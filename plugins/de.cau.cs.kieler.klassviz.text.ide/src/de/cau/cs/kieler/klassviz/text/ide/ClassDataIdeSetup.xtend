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
package de.cau.cs.kieler.klassviz.text.ide

import com.google.inject.Guice
import de.cau.cs.kieler.klassviz.text.ClassDataRuntimeModule
import de.cau.cs.kieler.klassviz.text.ClassDataStandaloneSetup
import org.eclipse.xtext.util.Modules2

/**
 * Initialization support for running Xtext languages as language servers.
 */
class ClassDataIdeSetup extends ClassDataStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new ClassDataRuntimeModule, new ClassDataIdeModule))
	}
	
}
