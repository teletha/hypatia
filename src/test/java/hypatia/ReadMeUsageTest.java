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

import org.junit.jupiter.api.Test;

class ReadMeUsageTest {

    /**
     * Basic arithmetic operations.
     */
    @Test
    void operation() {
        assert Num.of(1).plus(Num.of(2)).is(Num.of(3));
        assert Num.of(10).minus(1.553).is(8.447);
        assert Num.of(10.25).multiply(2).is(20.5);
        assert Num.of(13).divide(7).is(Num.of(1.85714285714285));
    }
}