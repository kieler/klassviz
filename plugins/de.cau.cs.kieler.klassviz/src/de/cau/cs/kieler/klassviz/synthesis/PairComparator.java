/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.klassviz.synthesis;

import java.util.Comparator;

import org.eclipse.xtext.xbase.lib.Pair;

/**
 * A lexicographical comparator for pairs. Keys and values must not be null.
 *
 * @author msp
 */
public class PairComparator<K extends Comparable<K>, V extends Comparable<V>>
        implements Comparator<Pair<K, V>> {

    /**
     * {@inheritDoc}
     */
    public int compare(final Pair<K, V> p1, final Pair<K, V> p2) {
        int keyres = p1.getKey().compareTo(p2.getKey());
        if (keyres != 0) {
            return keyres;
        }
        int valueres = p1.getValue().compareTo(p2.getValue());
        return valueres;
    }

}
