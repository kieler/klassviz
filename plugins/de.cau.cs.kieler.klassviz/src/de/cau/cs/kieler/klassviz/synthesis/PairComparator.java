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
package de.cau.cs.kieler.klassviz.synthesis;

import java.util.Comparator;

import de.cau.cs.kieler.core.util.Pair;


/**
 * A lexicographical comparator for pairs. Keys and values must not be null.
 */
public final class PairComparator<K extends Comparable<K>, V extends Comparable<V>>
        implements Comparator<Pair<K, V>> {

    /**
     * {@inheritDoc}
     */
    public int compare(final Pair<K, V> p1, final Pair<K, V> p2) {
        final int keyres = p1.getFirst().compareTo(p2.getFirst());
        if (keyres != 0) {
            return keyres;
        }
        final int valueres = p1.getSecond().compareTo(p2.getSecond());
        return valueres;
    }

}
