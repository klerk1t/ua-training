package com.bohdan;

import java.util.LinkedList;
import java.util.List;

/**
 * Model class
 *
 * @version 1.0 09 Feb 2019
 * @author Bohdan Ovchar
 */
public class Model {
    /** Max allowable number */
    private static final int RAND_MAX = Integer.MAX_VALUE / 2;

    /** Number the need guess */
    private int number;

    /** List with previous attempts */
    private List<Integer> listOfNumbers;

    /** Number of previous attempts */
    private int count;

    /** Lower bound range */
    private int lowerBound;

    /** Upper bound range */
    private int upperBound;

    /**
     * Initialization a new model object with default parameters
     */
    public Model() {
        number = rand();
        upperBound = RAND_MAX;
        lowerBound = 0;
        listOfNumbers = new LinkedList<>();
    }

    /**
     * Initialization a new model object with bounds for a random number
     * @param lowerBound
     *        Lower bound of range
     * @param upperBound
     *        Upper bound of range
     */
    public Model(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        number = rand(lowerBound, upperBound);
        listOfNumbers = new LinkedList<>();
    }

    /**
     *
     * @param i
     * @return
     */
    public int process(int i) {
        count++;
        listOfNumbers.add(i);
        int c;
        if((c = verifyNumber(i)) == 0) {
            return c;
        }
        else if(c == 1) {
            upperBound = --i;
        }
        else lowerBound = ++i;
        return c;
    }

    /**
     * Check for more or less
     *
     * @param i number that verify
     *
     * @return  If i greater then number return 1. If i less than number return 0.
     *          If i equals number return 0.
     */
    private int verifyNumber(int i) {
        return i == number ?
                0 : i > number ?
                1 : 2;
    }

    /**
     * Generation of random number with bounds.
     *
     * @param to Lower bound of random number.
     *
     * @param from Upper bound of random number.
     *
     * @return  Random number.
     */
    private int rand(int to, int from) {
        int temp;
        if((temp = from) > RAND_MAX) temp = RAND_MAX;
        return (int)(Math.random() * (temp - to + 1) + to);
    }

    /**
     * Generation of random number with default bounds.
     *
     * @return  Random number.
     */
    private int rand() {
        return (int)(Math.random() * RAND_MAX);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public int getCount() {
        return count;
    }

    public int getLowerBound() {
        return lowerBound;
    }

    public int getUpperBound() {
        return upperBound;
    }

    public List<Integer> getListOfNumbers() {
        return listOfNumbers;
    }
}
