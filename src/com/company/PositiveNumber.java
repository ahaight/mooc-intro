package com.company;

import java.util.Scanner;

/**
 * Created by aaronhaight on 11/5/16.
 */
public class PositiveNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());

        if (number > 0) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative.");
        }
    }
}
