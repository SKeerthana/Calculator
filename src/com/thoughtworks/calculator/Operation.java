package com.thoughtworks.calculator;

public abstract class Operation {
    protected double operand2;

    public abstract double computeResult(double accumulator);
}
