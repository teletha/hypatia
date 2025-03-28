/*
 * Copyright (C) 2025 The HYPATIA Development Team
 *
 * Licensed under the MIT License (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          https://opensource.org/licenses/MIT
 */
package hypatia;

public interface Orientational<E extends Orientational> {

    /**
     * Detect the orientation.
     * 
     * @return
     */
    default boolean isPositive() {
        return orientation().isPositive();
    }

    /**
     * Detect the orientation.
     * 
     * @return
     */
    default boolean isNegative() {
        return !isPositive();
    }

    /**
     * Get the entity.
     * 
     * @return
     */
    default E orientation() {
        return (E) this;
    }
}