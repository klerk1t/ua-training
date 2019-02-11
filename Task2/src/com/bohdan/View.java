package com.bohdan;

import java.util.List;

/**
 * View class
 *
 * @version 1.0 09 Feb 2019
 * @author Bohdan Ovchar
 */
public class View {

    /** Сonstants */
    public static final String GREETINGS = "Hi! In this game you must guess" +
            " a number";
    public static final String INPUT_NUMBER = "Input number";
    public static final String RANGE = " in range from ";
    public static final String WRONG_INPUT = "Wrong input try again";
    public static final String WRONG_RANGE = "Wrong range";
    public static final String TO = " to ";
    public static final String HINT_GREATER = "Needed number is greater than you have input";
    public static final String HINT_LESS = "Needed number is less than you have input";
    public static final String GAME_END = "Congratulations you won!";
    public static final String STATISTICS_MESSAGE = "Your statistics in this game:";
    public static final String NUMBER_OF_INPUT = "You guessed the number with ";
    public static final String ATTEMPTS = " attempts.";
    public static final String LIST_OF_NUMBERS = "These numbers you entered during the game:";
    public static final String SECRET_NUMBER = " Secret number is: ";

    public void printMessageInNewLine(String message) {
        System.out.println(message);
    }

    public void printList(List<Integer> list) {
        System.out.println(list);
    }

}
