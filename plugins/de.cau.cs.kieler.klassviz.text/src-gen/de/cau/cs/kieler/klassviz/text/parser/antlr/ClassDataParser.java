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
package de.cau.cs.kieler.klassviz.text.parser.antlr;

import com.google.inject.Inject;
import de.cau.cs.kieler.klassviz.text.parser.antlr.internal.InternalClassDataParser;
import de.cau.cs.kieler.klassviz.text.services.ClassDataGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class ClassDataParser extends AbstractAntlrParser {

	@Inject
	private ClassDataGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalClassDataParser createParser(XtextTokenStream stream) {
		return new InternalClassDataParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "KClassModel";
	}

	public ClassDataGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ClassDataGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
