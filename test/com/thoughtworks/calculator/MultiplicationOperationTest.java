package com.thoughtworks.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplicationOperationTest {

    @Test
    public void shouldReturnValueFromComputeResult() {
        assertEquals(0, new MultiplicationOperation(0.0).computeResult(0), 0);
    }

    @Test
    public void shouldPerformMultiplicationUsingPreInitiatedValueAndOperand() {
        assertEquals(10, new MultiplicationOperation(5.0).computeResult(2), 0);
    }
}
