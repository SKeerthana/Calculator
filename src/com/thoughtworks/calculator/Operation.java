package com.thoughtworks.calculator;

public abstract class Operation {
    protected double accumulator;

    public abstract double computeResult(int operand);
}
