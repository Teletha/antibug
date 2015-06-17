/*
 * Copyright (C) 2014 Nameless Production Committee
 *
 * Licensed under the MIT License (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *          http://opensource.org/licenses/mit-license.php
 */
package antibug.powerassert2;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.junit.ClassRule;
import org.junit.Rule;

import antibug.ReusableRule;

/**
 * @version 2012/01/19 10:47:08
 */
public class PowerAssertTester extends ReusableRule {

    @Rule
    @ClassRule
    public final PowerAssert POWER_ASSERT = new PowerAssert(this);

    /** For self test. */
    private final List<Object> expecteds = new ArrayList();

    /** For self test. */
    private final List<String> operators = new ArrayList();

    /**
     * @see testament.ReusableRule#before(java.lang.reflect.Method)
     */
    @Override
    protected void before(Method method) throws Exception {
        expecteds.clear();
        operators.clear();
    }

    /**
     * <p>
     * Validate error message.
     * </p>
     * 
     * @param context
     */
    void validate(PowerAssertContext context) {
        System.out.println(context);
        // if (context.stack.size() != 1) {
        // throw new AssertionError("Stack size is not 1. \n" + context.stack);
        // }
        //
        // String code = context.stack.peek().toString();
        //
        // for (Operand expected : expecteds) {
        // if (!context.operands.contains(expected)) {
        // throw new AssertionError("Can't capture the below operand.\r\nExpect : " +
        // expected.toString() + "\r\nValue : " + expected.value + "\r\n");
        // }
        // }
        //
        // for (String operator : operators) {
        // if (code.indexOf(operator) == -1) {
        // throw new AssertionError("Can't capture the below code.\r\nExpect : " + operator +
        // "\r\nCode : " + code);
        // }
        // }
    }

    /**
     * @param name
     * @param value
     */
    void willCapture(String name, Object value) {
        // expecteds.add(new Operand(name, value));
    }

    /**
     * @param operator
     */
    void willUse(String operator) {
        operators.add(operator);
    }
}
