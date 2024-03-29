/*
 * Copyright (C) 2024 Nameless Production Committee
 *
 * Licensed under the MIT License (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          http://opensource.org/licenses/mit-license.php
 */
package hypatia;

public interface Orientational<T extends Orientational> {

    /** Reusable {@link Orientational}. */
    Orientational POSITIVE = () -> true;

    /** Reusable {@link Orientational}. */
    Orientational NEGATIVE = () -> false;

    /**
     * Detect the orientation.
     * 
     * @return
     */
    boolean isPositive();

    /**
     * Detect the orientation.
     * 
     * @return
     */
    default boolean isNegative() {
        return !isPositive();
    }

    /**
     * Inverse the orientation.
     * 
     * @return
     */
    default Orientational reverse() {
        return isPositive() ? NEGATIVE : POSITIVE;
    }

    default T orientation() {
        return (T) this;
    }
}
