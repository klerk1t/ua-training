package com.bohdan;

import java.util.Scanner;

/**
 * Controller class
 *
 * @version  1.0 06 Feb 2019
 * @author   Bohdan Ovchar
 */
public class Controller {

    public static final String HELLO = "Hello";
    public static final String WORLD = "world!";

    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Method for execute program
     */
    public void execute() {
        Scanner scanner = new Scanner(System.in);

        model.setHello(inputSomething(scanner, HELLO, ConsoleView.INPUT_HELLO, ConsoleView.WRONG_INPUT_DATA));
        model.setWorld(inputSomething(scanner, WORLD, ConsoleView.INPUT_WORLD, ConsoleView.WRONG_INPUT_DATA));

        view.sayHelloWorld(model.getHello(), model.getWorld());
    }

    private String inputSomething(Scanner scanner, String var1, String var2, String var3) {
        String temp;

        view.printMessage(var2);
        while(!(temp = scanner.nextLine()).equals(var1)) {
            view.printMessage(var3 + "\n" + var2);
        }
        return temp;
    }
}
