/*
 * Copyright (C) 2023 Nameless Production Committee
 *
 * Licensed under the MIT License (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          http://opensource.org/licenses/mit-license.php
 */
package antibug;

import static antibug.Tester.*;

import java.util.List;

import org.junit.jupiter.api.Test;

public class TesterTest {

    @Test
    void sameList() {
        assert same(List.of(), List.of());
        assert same(List.of(1, 2, 3), List.of(1, 2, 3));
    }

    @Test
    void differentList() {
        assert different(List.of(1), List.of());
        assert different(List.of(3, 2, 1), List.of(1, 2, 3));
    }
}