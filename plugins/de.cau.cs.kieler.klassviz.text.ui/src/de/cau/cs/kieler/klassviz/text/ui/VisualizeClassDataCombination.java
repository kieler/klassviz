/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse Rich Client
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2011 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.klassviz.text.ui;

import de.cau.cs.kieler.klassviz.synthesis.ClassDataDiagramSynthesis;
import de.cau.cs.kieler.klighd.xtext.UpdateXtextModelKLighDCombination;
import de.cau.cs.kieler.klighd.xtext.triggers.XtextBasedEditorActivationChangeTrigger.XtextModelChangeState;
// SUPPRESS CHECKSTYLE PREVIOUS LineLength

/**
 * A combination for initializing/refreshing of KLighD views of class data descriptions.
 * 
 * @author msp
 */
public class VisualizeClassDataCombination extends UpdateXtextModelKLighDCombination {

    /**
     * The execute method invoked by Kivi.
     * 
     * @param state
     *            A {@link de.cau.cs.kieler.core.kivi.ITriggerState} carrying the necessary
     *            information.
     */
    @Override
    public void execute(final XtextModelChangeState state) {
        // the resource provided by the trigger state won't by available for 'CLOSE' event firings
        if (state.getEditor() == null
                || !state.getEditor().getLanguageName()
                        .equals("de.cau.cs.kieler.klassviz.text.ClassData")) {
            return;
        }
        super.execute(state);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getRequestedDiagramSynthesis(final XtextModelChangeState state) {
        return ClassDataDiagramSynthesis.SYNTHESIS_ID;
    }
    
}
