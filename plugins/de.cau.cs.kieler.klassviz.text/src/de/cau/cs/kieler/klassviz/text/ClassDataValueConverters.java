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

import java.util.Collections;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.inject.Inject;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractDeclarativeValueConverterService;
import org.eclipse.xtext.conversion.impl.AbstractIDValueConverter;
import org.eclipse.xtext.conversion.impl.AbstractNullSafeConverter;
import org.eclipse.xtext.conversion.impl.IDValueConverter;
import org.eclipse.xtext.conversion.impl.INTValueConverter;
import org.eclipse.xtext.conversion.impl.STRINGValueConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;

/**
 * Value converter for the ClassData grammar.
 * 
 * @author msp
 */
public class ClassDataValueConverters extends AbstractDeclarativeValueConverterService {
    
    /** precision of float outputs below which they are converted to integers. */
    private static final float FLOAT_PREC = 1e-4f;

    @Inject
    private AbstractIDValueConverter idValueConverter;

    // CHECKSTYLEOFF MethodName
    
    /**
     * Create a converter for the ID rule.
     * 
     * @return a value converter for ID
     */
    @ValueConverter(rule = "ID")
    public IValueConverter<String> ID() {
        return idValueConverter;
    }
    
    @Inject
    private QualifiedIDValueConverter qualifiedIdValueConverter;

    /**
     * Create a converter for the QualifiedID rule.
     * 
     * @return a value converter for QualifiedID
     */
    @ValueConverter(rule = "QualifiedID")
    public IValueConverter<String> QualifiedID() {
        return qualifiedIdValueConverter;
    }

    @Inject
    private STRINGValueConverter stringValueConverter;

    /**
     * Create a converter for the STRING rule.
     * 
     * @return a value converter for STRING
     */
    @ValueConverter(rule = "STRING")
    public IValueConverter<String> STRING() {
        return stringValueConverter;
    }
    
    private PropertyValueConverter propertyValueConverter = new PropertyValueConverter();

    /**
     * Create a converter for the PropertyValue rule.
     * 
     * @return a value converter for PropertyValue
     */
    @ValueConverter(rule = "PropertyValue")
    public IValueConverter<String> propertyValue() {
        return propertyValueConverter;
    }

    @Inject
    private INTValueConverter intValueConverter;

    /**
     * Create a converter for the NATURAL rule.
     * 
     * @return a value converter for NATURAL
     */
    @ValueConverter(rule = "NATURAL")
    public IValueConverter<Integer> NATURAL() {
        return intValueConverter;
    }

    /**
     * Create a converter for the Float rule.
     * 
     * @return a value converter for Float
     */
    @ValueConverter(rule = "Float")
    public IValueConverter<Float> Float() {
        return new FloatValueConverter();
    }

    /**
     * Value converter for qualified identifiers.
     */
    private static class QualifiedIDValueConverter extends IDValueConverter {

        @Inject
        private IValueConverterService valueConverter;

        public String toString(final String s) {
            String res = "";
            for (Object ss : Collections.list(new StringTokenizer(s, "."))) {
                res += "." + valueConverter.toString(ss, "ID");
            }            
            return res.substring(1);
        }
        
        public String toValue(final String string, final INode node) {
            String res = super.toValue(string, node);
            if (res != null) {
                return res.replace(".^", ".");
            }
            return null;
        }
    }
    
    /**
     * Value converter for floating point values.
     */
    private class FloatValueConverter extends AbstractNullSafeConverter<Float> {
        
        @Override
        protected String internalToString(final Float value) {
            int intValue = Math.round(value);
            if (Math.abs(value - intValue) < FLOAT_PREC) {
                return Integer.toString(intValue);
            } else {
                return Float.toString(value);
            }
        }
        
        @Override
        protected Float internalToValue(final String string, final INode node) {
            if (Strings.isEmpty(string)) {
                throw new ValueConverterException("Couldn't convert empty string to a float value.",
                        node, null);
            }
            try {
                return Float.parseFloat(string);
            } catch (NumberFormatException e) {
                throw new ValueConverterException("Couldn't convert '" + string + "' to a float value.",
                        node, e);
            }
        }
    }
    
    /**
     * Value converter for {@code PropertyValue} instances. To convert a value to a string, the value is
     * surrounded by quotation marks if (and only if) the value cannot be parsed as a Float and is not
     * an element of the language induced by the {@code QualifiedName} rule. To convert a string to a
     * value, surrounding quotation marks are removed if there are any.
     *  
     * @author cds
     */
    private class PropertyValueConverter extends AbstractNullSafeConverter<String> {
        /**
         * Regular expression pattern that matches instances of the QualifiedName rule.
         */
        private Pattern qualifiedNamePattern = Pattern.compile(
                "[a-zA-Z_][a-zA-Z0-9_]*(\\.[a-zA-Z_][a-zA-Z0-9_]*)*");
        
        @Override
        protected String internalToString(final String value) {
            // Check if the value can be parsed as a Float
            try {
                Float.parseFloat(value);
                return value;
            } catch (NumberFormatException e) {
                // Simply resume execution
            }
            
            // Check if the value is an instance of the QualifiedName rule
            Matcher matcher = qualifiedNamePattern.matcher(value);
            if (matcher.matches()) {
                // No need to escape anything since qualified names are simple
                return value;
            }
            
            // It's a String; surround with quotation marks
            return '"' + Strings.convertToJavaString(value, true) + '"';
        }

        @Override
        protected String internalToValue(final String string, final INode node) {
            // Strip leading and trailing quotation mark, if any (this can be simplified if we assume
            // that the string passed to the method either has both, a leading and a trailing quotation
            // mark, or none; but even though we should be able to assume that, we decide to program
            // defensively)
            int begin = string.startsWith("\"") ? 1 : 0;
            int end = string.length() - (string.endsWith("\"") ? 1 : 0);
            
            return Strings.convertFromJavaString(string.substring(begin, end), true);
        }
    }
    
}
