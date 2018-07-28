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
package de.cau.cs.kieler.klassviz.text.ui;

import com.google.inject.Injector;
import de.cau.cs.kieler.klassviz.text.ui.internal.TextActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ClassDataExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return TextActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return TextActivator.getInstance().getInjector(TextActivator.DE_CAU_CS_KIELER_KLASSVIZ_TEXT_CLASSDATA);
	}
	
}
