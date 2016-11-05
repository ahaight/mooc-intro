package com.company;

/**
 * Created by aaronhaight on 11/5/16.
 */
public class BooleanVariable {

    public static void main(String[] args) {
        int first = 1;
        int second = 3;

        boolean isLesser = first < second;

        if (isLesser) {
            System.out.println(first + " is less than " + second + "!");
        }
    }
}
