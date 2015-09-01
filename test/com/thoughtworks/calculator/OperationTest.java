package com.thoughtworks.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class OperationTest {

    @Test
    public void shouldCallComputeResultFunction() {
        Operation test = mock(Operation.class);
        when(test.computeResult(0)).thenReturn(0.0);
        assertEquals(0, test.computeResult(0), 0);
    }
}
