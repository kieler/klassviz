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
package de.cau.cs.kieler.klassviz.text.formatting;

import com.google.inject.Inject;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.util.Pair;

import de.cau.cs.kieler.klassviz.text.services.ClassDataGrammarAccess;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
public class ClassDataFormatter extends AbstractDeclarativeFormatter {
    
    @Inject
    private ClassDataGrammarAccess grammarAccess; 
    
    @Override
    protected void configureFormatting(FormattingConfig c) {
        // general formatting options relative to some delimiters
        for (Pair<Keyword, Keyword> pair : grammarAccess.findKeywordPairs("{", "}")) {
            c.setIndentation(pair.getFirst(), pair.getSecond());
            c.setLinewrap(1).after(pair.getFirst());
            c.setLinewrap(1).before(pair.getSecond());
            c.setLinewrap(1).after(pair.getSecond());
        }
        for (Pair<Keyword, Keyword> pair : grammarAccess.findKeywordPairs("[", "]")) {
            c.setNoSpace().after(pair.getFirst());
            c.setNoSpace().before(pair.getSecond());
        }
        for (Pair<Keyword, Keyword> pair : grammarAccess.findKeywordPairs("(", ")")) {
            c.setNoSpace().after(pair.getFirst());
            c.setNoSpace().before(pair.getSecond());
        }
        for (Keyword comma : grammarAccess.findKeywords(",")) {
            c.setNoLinewrap().before(comma);
            c.setNoSpace().before(comma);
        }
        for (Keyword colon : grammarAccess.findKeywords(":")) {
            c.setNoLinewrap().before(colon);
            c.setNoSpace().before(colon);
        }
        for (Keyword star : grammarAccess.findKeywords("*")) {
            c.setNoLinewrap().after(star);
            c.setNoSpace().after(star);
        }
        
        // line wrapping for main objects
        for (Keyword keyword : grammarAccess.findKeywords("import")) {
            c.setLinewrap().before(keyword);
        }
        c.setLinewrap().before(grammarAccess.getKPackageRule());
        c.setLinewrap().before(grammarAccess.getKInterfaceRule());
        c.setLinewrap().before(grammarAccess.getKClassRule());
        c.setLinewrap().before(grammarAccess.getKEnumRule());
        c.setLinewrap().before(grammarAccess.getKFieldRule());
        c.setLinewrap().before(grammarAccess.getKMethodRule());

        // line wrapping for comments
        c.setLinewrap(0, 1, 2).before(grammarAccess.getSL_COMMENTRule());
        c.setLinewrap(0, 1, 2).before(grammarAccess.getML_COMMENTRule());
        c.setLinewrap(0, 1, 1).after(grammarAccess.getML_COMMENTRule());
    }
}
