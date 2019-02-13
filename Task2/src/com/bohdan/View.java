package com.bohdan;

import java.util.List;

/**
 * View class
 *
 * @author Bohdan Ovchar
 * @version 1.2 13 Feb 2019
 */
public class View {

    /**
     * Сonstants
     */
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
    public static final String CHANGE_RANGE = "Dou you want change range?" +
            " Please input \"Y\" if you want do it else input \"N\"";
    public static final String INPUT_BOUNDS = "Input your bounds";
    public static final String INCORRECT_RANGE_VALUE = "Incorect input range, please try again." +
            "\n Minimum input number is: " + Model.getRandMin() +
            "\n Maximum input number is: " + Model.getRandMax();
    public static final String INCORRECT_RANGE_INPUT = "Your lower bound equals upper bound or " +
            "their difference is less than two";

    public void printMessageInNewLine(String message) {
        System.out.println(message);
    }

    public void printList(List<Integer> list) {
        System.out.println(list);
    }

}
