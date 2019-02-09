package com.bohdan;

import java.util.Scanner;

/**
 * Controller class
 *
 * @version 1.0 09 Feb 2019
 * @author Bohdan Ovchar
 */
public class Controller {
    /** Object model */
    private Model model;
    /** Object view */
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
        int temp;
        do{
            view.printMessageInNewLine(View.INPUT_NUMBER + View.RANGE + model.getLowerBound()
                    + View.TO + model.getUpperBound());
            temp = model.process(verifyInput(sc));
            if(temp == 1) view.printMessageInNewLine(View.HINT_LESS);
            else if (temp == 2) view.printMessageInNewLine(View.HINT_GREATER);
            else {
                view.printMessageInNewLine(View.GAME_END);
                view.printMessageInNewLine(View.STATISTICS_MESSAGE);
                view.printMessageInNewLine(View.NUMBER_OF_INPUT + model.getCount()
                        + View.ATTEMPTS);
                view.printMessageInNewLine(View.LIST_OF_NUMBERS);
                view.printList(model.getListOfNumbers());
            }
        } while(temp != 0);
    }

    /**
     * Check of correct users input
     *
     * @param sc Object of scanner for console input
     *
     * @return If input is correct return number that user input
     */
    private int verifyInput(Scanner sc) {
        int temp;
        while(true) {
            if(!sc.hasNextInt()) {
                view.printMessageInNewLine(View.WRONG_INPUT);
                sc.next();
            } else {
                if(!rangeVerify(temp = sc.nextInt())) {
                    view.printMessageInNewLine(View.WRONG_RANGE);
                    view.printMessageInNewLine(View.INPUT_NUMBER + model.getLowerBound()
                            + View.TO + model.getUpperBound());
                } else return temp;
            }
        }
    }

    /**
     * Check that the number is in the range
     *
     * @param i number that verify
     *
     * @return true if number in range else false
     */
    private boolean rangeVerify(int i){
        return i >= model.getLowerBound() && i <= model.getUpperBound();
    }
}
