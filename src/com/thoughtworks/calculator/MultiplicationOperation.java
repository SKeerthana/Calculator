package com.thoughtworks.calculator;

public class MultiplicationOperation extends Operation {

    public MultiplicationOperation(int operand2) {
        this.operand2 = operand2;
    }

    public MultiplicationOperation() {
    }

    public double computeResult(double accumulator) {
        accumulator *= operand2;
        return accumulator;
    }
}