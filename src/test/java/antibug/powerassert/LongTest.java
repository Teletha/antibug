/*
 * Copyright (C) 2018 Nameless Production Committee
 *
 * Licensed under the MIT License (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          https://opensource.org/licenses/MIT
 */
package antibug.powerassert;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

/**
 * @version 2018/03/31 16:31:35
 */
public class LongTest {

    @RegisterExtension
    static PowerAssertTester test = new PowerAssertTester();

    @Test
    public void constant_0() throws Exception {
        long value = -1;

        test.willUse("0");
        test.willCapture("value", value);
        assert 0 == value;
    }

    @Test
    public void constant_1() throws Exception {
        long value = -1;

        test.willUse("1");
        test.willCapture("value", value);
        assert 1 == value;
    }

    @Test
    public void constant_2() throws Exception {
        long value = -1;

        test.willUse("2");
        test.willCapture("value", value);
        assert 2 == value;
    }

    @Test
    public void constant_3() throws Exception {
        long value = -1;

        test.willUse("3");
        test.willCapture("value", value);
        assert 3 == value;
    }

    @Test
    public void constant_M1() throws Exception {
        long value = 0;

        test.willUse("-1");
        test.willCapture("value", value);
        assert -1 == value;
    }

    @Test
    public void big() throws Exception {
        long value = 2;

        test.willUse("1234567890123");
        test.willCapture("value", value);
        assert 1234567890123L == value;
    }

    @Test
    public void not() throws Exception {
        long value = 10;

        test.willUse("10");
        test.willUse("!=");
        test.willCapture("value", value);
        assert 10 != value;
    }

    @Test
    public void negative() throws Exception {
        long value = 10;

        test.willUse("10");
        test.willUse("-value");
        test.willCapture("value", value);
        assert 10 == -value;
    }

    @Test
    public void array() throws Exception {
        long[] array = {0, 1, 2};

        test.willCapture("array", array);
        assert array == null;
    }

    @Test
    public void arrayIndex() throws Exception {
        long[] array = {0, 1, 2};

        test.willCapture("array", array);
        test.willCapture("array[1]", 1L);
        assert array[1] == 128;
    }

    @Test
    public void arrayLength() throws Exception {
        long[] array = {0, 1, 2};

        test.willCapture("array", array);
        test.willCapture("array.length", 3);
        assert array.length == 10;
    }

    @Test
    public void arrayNew() throws Exception {
        test.willUse("new long[] {1, 2}");
        assert new long[] {1, 2} == null;
    }

    @Test
    public void varargs() throws Exception {
        test.willCapture("var()", false);
        assert var();
    }

    boolean var(long... var) {
        return false;
    }

    @Test
    public void method() throws Exception {
        test.willCapture("test()", 1L);
        assert test() == 2;
    }

    long test() {
        return 1;
    }

    @Test
    public void parameter() throws Exception {
        test.willCapture("test(12)", false);
        assert test(12);
    }

    private boolean test(long value) {
        return false;
    }

    /** The tester. */
    private long longField = 11;

    /** The tester. */
    private static long longFieldStatic = 11;

    @Test
    public void fieldLongAccess() throws Exception {
        test.willCapture("longField", 11L);
        assert longField == 0;
    }

    @Test
    public void fieldIntAccessWithHiddenName() throws Exception {
        long longField = 11;

        test.willCapture("this.longField", longField);
        assert this.longField == 0;
    }

    @Test
    public void fieldLongStaticAccess() throws Exception {
        test.willCapture("longFieldStatic", 11L);
        assert longFieldStatic == 0;
    }
}
