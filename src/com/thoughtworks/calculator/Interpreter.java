package com.thoughtworks.calculator;

public class Interpreter {

    public Operation parseToGetOperation(String command) {

        String[] splitCommand = command.split(" ");
        if(splitCommand.length == 2) {
            switch (splitCommand[0]) {
                case "add":
                    return new AdditionOperation(Integer.parseInt(splitCommand[1]));
                case "subtract":
                    return new SubtractionOperation(Integer.parseInt(splitCommand[1]));
                case "multiply":
                    return new MultiplicationOperation(Integer.parseInt(splitCommand[1]));
                case "divide":
                    return new DivisionOperation(Integer.parseInt(splitCommand[1]));
            }
        }

        if (splitCommand.length ==1 && splitCommand[1].equals("cancel"))
            return new CancelOperation();

        return new InvalidOperation();
    }
}
