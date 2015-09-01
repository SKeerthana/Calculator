package com.thoughtworks.calculator;

public class SubtractionOperation extends Operation{

    public SubtractionOperation(int operand2) {
        this.operand2 = operand2;
    }

    public double computeResult(double accumulator) {
        accumulator -= operand2;
        return accumulator;
    }
}
