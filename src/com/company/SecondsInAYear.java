package com.company;

/**
 * Created by aaronhaight on 10/25/16.
 */
public class SecondsInAYear {

    public static void main(String[] args) {

        int year = 365;
        int day = 24;
        int minutes = 60;
        int seconds = 60;

        int sum = seconds * minutes * day * year;

        System.out.print("There are " + sum + " seconds in a year");
    }
}
