package com.company;

/**
 * Created by aaronhaight on 11/6/16.
 */
public class LogicalOperatorAnd {

    public static void main(String[] args) {
        System.out.println("Is the number between 5-10?");
        int number = 7;

        if (number > 4 && number < 11) {
            System.out.println("Yes! :)");
        } else {
            System.out.println("Nope :(");
        }
    }
}
