package com.bohdan;

/**
 * Main class
 *
 * @version 1.0 09 Feb 2019
 * @author Bohdan Ovchar
 */
public class Main {
    public static void main(String[] args) {
        Model model = new Model(0, 100);
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.execute();
    }
}
