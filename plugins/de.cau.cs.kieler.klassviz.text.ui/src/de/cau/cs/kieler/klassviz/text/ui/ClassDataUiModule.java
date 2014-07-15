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
package de.cau.cs.kieler.klassviz.text.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;

/**
 * Use this class to register components to be used within the IDE.
 */
public class ClassDataUiModule extends de.cau.cs.kieler.klassviz.text.ui.AbstractClassDataUiModule {
    
    /** The plug-in identifier. */
    public static final String PLUGIN_ID = "de.cau.cs.kieler.klassviz.text.ui";
    
    public ClassDataUiModule(AbstractUIPlugin plugin) {
        super(plugin);
    }
    
}
