package com.thoughtworks.calculator;

public class MultiplicationOperation implements Operation {
    private int operand;

    public MultiplicationOperation(int operand) {
        this.operand = operand;
    }

    public double computeResult(double accumulator) {
        accumulator *= operand;
        return accumulator;
    }
}