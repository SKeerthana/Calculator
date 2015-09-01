package com.thoughtworks.calculator;

public class DivisionOperation extends Operation{

    public DivisionOperation(double accumulator) {
        this.accumulator = accumulator;
    }

    public double computeResult(int operand) {
        if (operand != 0)
            accumulator /= operand;
        return accumulator;
    }
}
