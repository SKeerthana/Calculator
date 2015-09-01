package com.thoughtworks.calculator;

public class MultiplicationOperation implements Operation {
    private int operand2;

    public MultiplicationOperation(int operand2) {
        this.operand2 = operand2;
    }

    public double computeResult(double accumulator) {
        accumulator *= operand2;
        return accumulator;
    }
}