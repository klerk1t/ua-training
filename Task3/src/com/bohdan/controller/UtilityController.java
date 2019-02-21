package com.bohdan.controller;

import com.bohdan.view.View;

import static com.bohdan.controller.RegexConstans.*;
import static com.bohdan.view.TextConstans.FIRST_NAME_DATA;
import static com.bohdan.view.TextConstans.LAST_NAME_DATA;
import static com.bohdan.view.TextConstans.NICKNAME_DATA;

import java.util.Scanner;

public class UtilityController {

    private Scanner scanner;
    private View view;
    private InputRecord inputRecord;
    private Validator validator;
    private SystemRegex systemRegex;

    public UtilityController(Scanner scanner, View view, InputRecord inputRecord, SystemRegex systemRegex) {
        this.scanner = scanner;
        this.view = view;
        this.inputRecord = inputRecord;
        this.systemRegex = systemRegex;
        validator = new Validator(scanner, view);
    }

    public void inputToRecord() {
        inputRecord.setFirstName(
                validator.checking(FIRST_NAME_DATA, systemRegex.getRegexBundle().getString(REGEX_FIRST_NAME))
        );

        inputRecord.setLastName(
                validator.checking(LAST_NAME_DATA, systemRegex.getRegexBundle().getString(REGEX_LAST_NAME))
        );

        inputNickname();

    }

    public void inputNickname() {
        inputRecord.setNickname(
                validator.checking(NICKNAME_DATA, systemRegex.getRegexBundle().getString(REGEX_NICKNAME_DATA))
        );
    }

}
