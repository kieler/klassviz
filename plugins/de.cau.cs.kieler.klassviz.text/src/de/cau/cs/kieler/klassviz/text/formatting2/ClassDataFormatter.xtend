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
package de.cau.cs.kieler.klassviz.text.formatting2

import com.google.inject.Inject
import de.cau.cs.kieler.klassviz.model.classdata.KClassModel
import de.cau.cs.kieler.klassviz.model.classdata.KOption
import de.cau.cs.kieler.klassviz.model.classdata.KPackage
import de.cau.cs.kieler.klassviz.model.classdata.KType
import de.cau.cs.kieler.klassviz.text.services.ClassDataGrammarAccess
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import de.cau.cs.kieler.klassviz.model.classdata.KField
import de.cau.cs.kieler.klassviz.model.classdata.KMethod
import de.cau.cs.kieler.klassviz.model.classdata.KDependency

class ClassDataFormatter extends AbstractFormatter2 {
	
	@Inject extension ClassDataGrammarAccess

	def dispatch void format(KClassModel kClassModel, extension IFormattableDocument document) {
	    kClassModel.prepend[setNewLines(0, 0, 1); noSpace]
	    
	    kClassModel.regionFor.keyword("import").prepend[newLine]
	    kClassModel.regionFor.keyword("project").surround[oneSpace]
	    kClassModel.regionFor.keyword("bundle").surround[oneSpace]
	    
		for (KOption kOption : kClassModel.getOptions()) {
			kOption.format;
		}
		for (KPackage kPackage : kClassModel.getPackages()) {
			kPackage.format;
		}
	}
	
    def dispatch void format(KOption kOption, extension IFormattableDocument document) {
        kOption.prepend[newLine]
        kOption.regionFor.keyword("=").surround[oneSpace] 
    }

	def dispatch void format(KPackage kPackage, extension IFormattableDocument document) {
        kPackage.prepend[newLines = 2]
        interior(
            kPackage.regionFor.keyword('{').append[newLine],
            kPackage.regionFor.keyword('}').prepend[newLine],
            [indent]
        )
	    
		for (KType kType : kPackage.getTypes()) {
			kType.format;
		}
	}

    def dispatch void format(KType kType, extension IFormattableDocument document) {
        kType.prepend[newLines = 2]
        interior(
            kType.regionFor.keyword('{').append[newLine],
            kType.regionFor.keyword('}').prepend[newLine],
            [indent]
        )
        
        for (KField kField : kType.getFields()) {
            kField.format;
        }
        
        for (KMethod kMethod : kType.getMethods()) {
            kMethod.format;
        }
        
        for (KDependency kDependency : kType.getDependencies()) {
            kDependency.format;
        }
    }

    def dispatch void format(KField kField, extension IFormattableDocument document) {
        kField.prepend[newLine]
    }

    def dispatch void format(KMethod kMethod, extension IFormattableDocument document) {
        kMethod.prepend[newLine]
    }

    def dispatch void format(KDependency kDependency, extension IFormattableDocument document) {
        kDependency.prepend[newLine]
    }
}
