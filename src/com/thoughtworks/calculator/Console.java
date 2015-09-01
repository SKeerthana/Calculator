package com.thoughtworks.calculator;

import java.util.Scanner;

public class Console {
    private String command;

    public String getInputFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
