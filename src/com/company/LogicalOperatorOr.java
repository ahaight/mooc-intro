package com.company;

/**
 * Created by aaronhaight on 11/6/16.
 */
public class LogicalOperatorOr {

    public static void main(String[] args) {
        System.out.println("Is the number less than 0 or greater than 100?");
        int number = 145;

        if (number < 0 || number >100) {
            System.out.println("Yes! :)");
        } else {
            System.out.println("Nope :(");
        }
    }
}
