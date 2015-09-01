package com.thoughtworks.calculator;

public class AdditionOperation implements Operation {
    private int operand2;

    public AdditionOperation(int operand2)
    {
        this.operand2 = operand2;
    }

    public double computeResult(double accumulator) {
        operand2 += accumulator;
        return operand2;
    }
}