package com.bohdan.main;

import com.bohdan.controller.Controller;
import com.bohdan.model.Model;
import com.bohdan.view.View;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());
        controller.execute();
    }
}
