package com.bohdan;

/**
 * Main class
 *
 * @version  1.0 06 Feb 2019
 * @author   Bohdan Ovchar
 */
public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new ConsoleView();
        Controller controller = new Controller(model, view);
        controller.execute();
    }
}
