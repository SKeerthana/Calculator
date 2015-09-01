package com.thoughtworks.calculator;

public class AdditionOperation extends Operation {

    public AdditionOperation(double accumulator) {
        this.accumulator = accumulator;
    }

    public double computeResult(int operand) {
        accumulator += operand;
        return accumulator;
    }
}