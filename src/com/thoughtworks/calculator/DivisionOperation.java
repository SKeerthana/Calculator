package com.thoughtworks.calculator;

public class DivisionOperation implements Operation{
    private int operand2;

    public DivisionOperation(int operand2) {
        this.operand2 = operand2;
    }

    public double computeResult(double accumulator) {
        if (operand2 != 0)
            accumulator /= operand2;
        return accumulator;
    }
}
