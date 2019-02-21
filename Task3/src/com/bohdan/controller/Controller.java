package com.bohdan.controller;

import com.bohdan.model.Model;
import com.bohdan.view.View;

import java.util.Locale;
import java.util.Scanner;

public class Controller {

    private Model model;
    private View view;
    private Scanner scanner;
    private SystemRegex systemRegex;
    private SystemLanguage systemLanguage;
    private String regex = BundleRegexPath.REGEX;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        systemRegex = new SystemRegex(regex, Locale.getDefault());
    }

    public void execute() {
        scanner = new Scanner(System.in);

    }
}
