package com.thoughtworks.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InterpreterTest {
    @Test
    public void shouldParseAddCommandWhichCallAdditionOperationConstructor(){
        Interpreter interpreter=new Interpreter();
        Operation operation=interpreter.parseToGetOperation("add 5");

        assertEquals(new AdditionOperation(5),operation);
    }

}
