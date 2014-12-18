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
package de.cau.cs.kieler.klassviz.text;

import org.eclipse.xtext.conversion.IValueConverterService;

import com.google.inject.Binder;
import com.google.inject.name.Names;

import de.cau.cs.kieler.klassviz.synthesis.IMetaModelExtensions;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 *
 * @author msp
 * @author chsch
 */
public class ClassDataRuntimeModule extends de.cau.cs.kieler.klassviz.text.AbstractClassDataRuntimeModule {

	private static final Class<? extends IMetaModelExtensions> XCORE_EXTENSIONS_CLASS;

	static {
		Class<? extends IMetaModelExtensions> clazz;
    	try {
			clazz = Class.forName(
					"de.cau.cs.kieler.klassviz.xcore.XcoreExtensions").asSubclass(IMetaModelExtensions.class);
    	} catch (final Exception e) {
    		clazz = null;
    	}

    	XCORE_EXTENSIONS_CLASS = clazz;
	}

    /**
     * {@inheritDoc}
     */
    @Override
    public Class<? extends IValueConverterService> bindIValueConverterService() {
        return ClassDataValueConverters.class;
    }

    @Override
    public void configure(final Binder binder) {
    	super.configure(binder);

    	binder.bind(IMetaModelExtensions.class).annotatedWith(Names.named("Xcore")).to(XCORE_EXTENSIONS_CLASS);
    }
}