package com.thoughtworks.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InterpreterTest {

    @Test
    public void shouldParseAddCommandWhichCallAdditionOperationConstructor() {
        Interpreter interpreter = new Interpreter();
        Operation operation = interpreter.parseToGetOperation("add 5");

        assertEquals(new AdditionOperation(5), operation);
    }

    @Test
    public void shouldParseAddCommandWhichCallSubtractionOperationConstructor() {
        Interpreter interpreter = new Interpreter();
        Operation operation = interpreter.parseToGetOperation("subtract 5");

        assertEquals(new SubtractionOperation(5), operation);
    }

    @Test
    public void shouldParseAddCommandWhichCallMultiplicationOperationConstructor() {
        Interpreter interpreter = new Interpreter();
        Operation operation = interpreter.parseToGetOperation("multiply 5");

        assertEquals(new MultiplicationOperation(5), operation);
    }

    @Test
    public void shouldParseAddCommandWhichCallDivisionOperationConstructor() {
        Interpreter interpreter = new Interpreter();
        Operation operation = interpreter.parseToGetOperation("divide 5");

        assertEquals(new DivisionOperation(5), operation);
    }
}
