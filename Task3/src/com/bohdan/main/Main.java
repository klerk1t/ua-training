package com.bohdan.main;

import com.bohdan.controller.Controller;
import com.bohdan.model.Model;
import com.bohdan.view.View;

import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static final ResourceBundle bundle =
            ResourceBundle.getBundle("messages", new Locale("ua", "UA"));
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());
        String qwe = "input.string.data";
        System.out.println(bundle.getString(qwe));
        System.out.println(Locale.getDefault());
    }
}
