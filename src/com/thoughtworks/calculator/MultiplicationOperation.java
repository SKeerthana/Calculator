package com.thoughtworks.calculator;

public class MultiplicationOperation extends Operation {

    public MultiplicationOperation(double accumulator) {
        this.accumulator = accumulator;
    }

    public double computeResult(int operand) {
        accumulator *= operand;
        return accumulator;
    }
}