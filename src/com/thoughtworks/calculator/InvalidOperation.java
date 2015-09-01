package com.thoughtworks.calculator;

public class InvalidOperation implements Operation {

    @Override
    public double computeResult(double accumulator) {
        return accumulator;
    }
}
