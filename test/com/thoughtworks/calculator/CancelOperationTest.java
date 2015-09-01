package com.thoughtworks.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CancelOperationTest {

    @Test
    public void shouldResetTheAccumulatorValueToZero() {
        assertEquals(0, new CancelOperation().computeResult(9), 0);
    }
}
