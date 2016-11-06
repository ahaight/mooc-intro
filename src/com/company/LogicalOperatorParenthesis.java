package com.company;

/**
 * Created by aaronhaight on 11/6/16.
 */
public class LogicalOperatorParenthesis {

    public static void main(String[] args) {
        int number = 99;

        if ((number > 0 && number < 10) || number > 100) {
            System.out.println("The number was in the range of 1-9 or greater than 100");
        } else {
            System.out.println("The number was equal to or less than 0 or it was in the range 10-99");
        }
    }
}
