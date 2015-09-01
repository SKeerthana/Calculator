package com.thoughtworks.calculator;

public class DivisionOperation extends Operation{

    public DivisionOperation(double operand2) {
        this.operand2 = operand2;
    }

    public DivisionOperation() {
    }

    public double computeResult(double accumulator) {
        if (operand2 != 0)
            accumulator /= operand2;
        return accumulator;
    }
}
