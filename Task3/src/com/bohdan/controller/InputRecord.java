package com.bohdan.controller;

import static com.bohdan.view.Constans.FIRST_NAME_DATA;
import static com.bohdan.view.Constans.LAST_NAME_DATA;
import static com.bohdan.view.Constans.NICKNAME_DATA;
import com.bohdan.view.View;

import java.util.Scanner;

public class InputRecord {

    private Scanner scanner;
    private View view;

    private String firstName;
    private String lastName;
    private String nickname;

    public InputRecord(Scanner scanner, View view) {
        this.scanner = scanner;
        this.view = view;
    }

    public void inputRecord() {
        view.printInput(FIRST_NAME_DATA);
    }
}
