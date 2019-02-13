package com.bohdan;

import java.util.LinkedList;
import java.util.List;

/**
 * Model class
 *
 * @version 1.2 13 Feb 2019
 * @author Bohdan Ovchar
 */
public class Model {
    /** Max allowable number */
    private static final int RAND_MAX = Integer.MAX_VALUE / 2;

    /** Min allowable number */
    private static final int RAND_MIN = Integer.MIN_VALUE / 2;

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
     * Initialization a new model object with bounds for a random number
     *
     * @param lowerBound Lower bound of range
     * @param upperBound Upper bound of range
     */
    public Model(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        listOfNumbers = new LinkedList<>();
    }

    /**
     * Business logic
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
            upperBound = i;
        }
        else lowerBound = i;
        return c;
    }

    /**
     * Check for more or less
     *
     * @param i number that verify
     *
     * @return  If i greater then number return 1. If i less than number return 2.
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
    public int rand(int to, int from) {
        int tempUpper;
        int tempLower;
        int rand;
        if((tempUpper = from) > RAND_MAX) tempUpper = RAND_MAX;
        if((tempLower = to) < RAND_MIN) tempLower = RAND_MIN;
        return (rand = (int)(Math.random() *(tempUpper - tempLower)) + tempLower) == tempLower ?
                ++rand : rand;
    }

    /**
     * Generation of random number with bounds
     */
    public void createNumber() {
        number = rand(lowerBound, upperBound);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setLowerBound(int lowerBound) {
        this.lowerBound = lowerBound;
    }

    public void setUpperBound(int upperBound) {
        this.upperBound = upperBound;
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

    public static int getRandMax() {
        return RAND_MAX;
    }

    public static int getRandMin() {
        return RAND_MIN;
    }
}
