package com.thoughtworks.calculator;

public class CalculatorApplication {

    public void run() {
        Console console = new Console();
        Interpreter interpreter = new Interpreter();
        String input;
        double accumulatedResult = 0;

        while(true) {
            input = console.getInputFromUser();
            if (!input.equals("exit")) {
                Operation operation = interpreter.parseToGetOperation(input);
                accumulatedResult = operation.computeResult(accumulatedResult);
                console.displayOutput(accumulatedResult);
            } else {
                stop();
            }
        }
    }

    public void stop() {
        System.exit(0);
    }
}
