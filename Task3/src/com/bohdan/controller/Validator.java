package com.bohdan.controller;

import com.bohdan.view.View;

import java.util.Scanner;

public class Validator {

    private Scanner scanner;
    private View view;

    public Validator(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    public String checking(String message, String regex) {
        String res;
        view.printInput(message);
        while(!(scanner.hasNext() && (res = scanner.next()).matches(regex))) {
            view.printWrongInput(message);
        }
        return res;
    }
}
