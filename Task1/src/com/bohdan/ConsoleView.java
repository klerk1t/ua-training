package com.bohdan;

/**
 * ConsoleView class implementation of the {@code View}
 *
 * @version  1.0 06 Feb 2019
 * @author   Bohdan Ovchar
 */
public class ConsoleView implements View {
    public static final String INPUT_HELLO = "Input \"Hello\" ";
    public static final String INPUT_WORLD = "Input \"world!\" ";
    public static final String WRONG_INPUT_DATA = "Wrong input! Repeat please! ";

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void sayHelloWorld(String hello, String world) {
        System.out.println(hello + " " + world);
    }
}
