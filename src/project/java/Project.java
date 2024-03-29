
/*
 * Copyright (C) 2024 The HYPATIA Development Team
 *
 * Licensed under the MIT License (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          https://opensource.org/licenses/MIT
 */
import static bee.api.License.*;

public class Project extends bee.api.Project {
    {
        product("com.github.teletha", "hypatia", ref("version.txt"));
        license(MIT);
        describe("""
                Hypatia is a library for floating-point arithmetic that can handle unchangeable, arbitrary-precision signed decimal numbers.

                The Num class has two internal representations of numbers, one is a fast fixed-point operation based on long. The other is an arbitrary-precision floating-point operation using BigDecimal.
                However, the internal representation is completely hidden and the user need not be aware of it.
                """);
        versionControlSystem("https://github.com/teletha/hypatia");

        require("com.google.guava", "guava");
        require("com.github.teletha", "sinobu");
        require("com.github.teletha", "primavera");
        require("com.github.teletha", "antibug").atTest();
        require("org.decimal4j", "decimal4j").atTest();
    }
}