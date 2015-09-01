package com.thoughtworks.calculator;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ConsoleTest {

    @Test
    public void shouldCallPrintMethodWithResultOnAddCommandWithValidDoubleOperandSeparatedBySpace() {
        Console console = new Console();
        String input = "add 5";
        Console test = mock(Console.class);
        when(test.getInputFromUser()).thenReturn(input);
        assertEquals(input, test.getInputFromUser());
    }

}
