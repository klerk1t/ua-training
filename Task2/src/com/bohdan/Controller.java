package com.bohdan;

import java.util.Scanner;

/**
 * Controller class
 *
 * @author Bohdan Ovchar
 * @version 1.2 13 Feb 2019
 */
public class Controller {
    /**
     * Object model
     */
    private Model model;
    /**
     * Object view
     */
    private View view;

    /**
     * Initialization a new controller object.
     *
     * @param model
     * @param view
     */
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Start program
     */
    public void execute() {
        view.printMessageInNewLine(View.GREETINGS + View.RANGE + model.getLowerBound() +
                View.TO + model.getUpperBound());
        Scanner sc = new Scanner(System.in);
        view.printMessageInNewLine(View.CHANGE_RANGE);
        if (!wantChangeRange(sc)) {
            model.createNumber();
        } else{
            changeRange(sc);
            model.createNumber();
        }
        int temp;
        do {
            view.printMessageInNewLine(View.INPUT_NUMBER + View.RANGE + model.getLowerBound()
                    + View.TO + model.getUpperBound());
            temp = model.process(verifyInput(sc));
            if (temp == 1) view.printMessageInNewLine(View.HINT_LESS);
            else if (temp == 2) view.printMessageInNewLine(View.HINT_GREATER);
            else {
                view.printMessageInNewLine(View.GAME_END + View.SECRET_NUMBER + model.getNumber());
                view.printMessageInNewLine(View.STATISTICS_MESSAGE);
                view.printMessageInNewLine(View.NUMBER_OF_INPUT + model.getCount()
                        + View.ATTEMPTS);
                view.printMessageInNewLine(View.LIST_OF_NUMBERS);
                view.printList(model.getListOfNumbers());
            }
        } while (temp != 0);
    }

    /**
     * Check if user want change range
     *
     * @param sc Object of scanner for console input
     */
    private boolean wantChangeRange(Scanner sc) {
        while (!(sc.hasNext("[Yy]") || sc.hasNext("[Nn]"))) {
            view.printMessageInNewLine(View.WRONG_INPUT);
            sc.next();
        }
        String choose = sc.next().toLowerCase();
        return "y".equals(choose);
    }

    /**
     * Changing range
     *
     * @param sc Object of scanner for console input
     */
    private void changeRange(Scanner sc) {
        view.printMessageInNewLine(View.INPUT_BOUNDS);
        while(!verifyRange(sc)) {
            view.printMessageInNewLine(View.INCORRECT_RANGE_INPUT);
        }
    }

    /**
     * Checking correct input range
     *
     * @param sc Object of scanner for console input
     * @return true if input is correct, else false
     */
    private boolean verifyRange(Scanner sc) {
        int lower = checkMaxValue(sc);
        int upper = checkMaxValue(sc);
        if(lower == upper) {
            return false;
        } else if(Math.abs(lower - upper) < 2) {
            return false;
        } else if(lower > upper) {
            model.setLowerBound(upper);
            model.setUpperBound(lower);
            return true;
        } else {
            model.setLowerBound(lower);
            model.setUpperBound(upper);
            return true;
        }
    }

    /**
     * Checking input number for max value and min value,
     * if user input to large or to small number,
     * he must try again
     *
     * @param sc Object of scanner for console input
     * @return number that user input if it correct
     */
    private int checkMaxValue(Scanner sc) {
        int temp;
        while ((temp = verifyIntInput(sc)) > Model.getRandMax() || temp < Model.getRandMin()) {
            view.printMessageInNewLine(View.INCORRECT_RANGE_VALUE);
        }
        return temp;
    }

    /**
     * Checking that user input correct number and it in range
     *
     * @param sc Object of scanner for console input
     * @return If input is correct return number that user input
     */
    private int verifyInput(Scanner sc) {
        int temp;
        while (true) {
            if (!verifyInputNumberRange(temp = verifyIntInput(sc))) {
                view.printMessageInNewLine(View.WRONG_RANGE);
                view.printMessageInNewLine(View.INPUT_NUMBER + View.RANGE + model.getLowerBound()
                        + View.TO + model.getUpperBound());
            } else return temp;
        }
    }

    /**
     * Checking if correct user input integer number
     *
     * @param sc
     * @return int number
     */
    private int verifyIntInput(Scanner sc) {
        while (!sc.hasNextInt()) {
            view.printMessageInNewLine(View.WRONG_INPUT);
            sc.next();
        }
        return sc.nextInt();
    }

    /**
     * Checking if number in the range
     *
     * @param i number that verify
     * @return true if number in range else false
     */
    private boolean verifyInputNumberRange(int i) {
        return i >= (model.getLowerBound() + 1) && i <= (model.getUpperBound() - 1);
    }
}
