package com.thoughtworks.calculator;

public class SubtractionOperation extends Operation{

    public SubtractionOperation(double accumulator) {
        this.accumulator = accumulator;
    }

    public double computeResult(int operand) {
        accumulator -= operand;
        return accumulator;
    }
}
