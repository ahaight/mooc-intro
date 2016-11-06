package com.company;

/**
 * Created by aaronhaight on 11/6/16.
 */
public class LogicalOperatorNegation {

    public static void main(String[] args) {
        System.out.println("Is the string equal to milk?");
        String text = "water";

        if (!(text.equals("milk"))) {
            System.out.println("No!");
        } else {
            System.out.println("Yes");
        }
    }
}
