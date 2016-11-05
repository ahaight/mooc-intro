package com.company;

/**
 * Created by aaronhaight on 11/5/16.
 *
 * * comparison operators:
 * > greater than
 * >= greater than or equal to
 * < less than
 * <= less than or equal to
 * == equals
 * != not equal
 *
 */

public class ConditionalIf {
    public static void main(String[] args) {
        int x = 45;
        int number = 55;

        //a block can contain any code including other if statements
        if (number > 0) {
            System.out.println("The number is positive!");
            if (number > x) {
                System.out.println(" and greater than the value or variable x");
                System.out.println("after all, the value of variable x is " + x);
            }
        }
    }
}
