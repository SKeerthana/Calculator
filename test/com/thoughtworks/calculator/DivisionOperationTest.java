package com.thoughtworks.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivisionOperationTest {

    @Test
    public void shouldReturnValueFromComputeResult() {
        assertEquals(0, new DivisionOperation(0.0).computeResult(0), 0);
    }

    @Test
    public void shouldPerformDivisionUsingPreInitiatedValueAndOperand() {
        assertEquals(5, new DivisionOperation(10.0).computeResult(2), 0);
    }
}
