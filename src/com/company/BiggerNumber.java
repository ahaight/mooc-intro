package com.company;

import java.util.Scanner;

/**
 * Created by aaronhaight on 11/5/16.
 */
public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int numberOne = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        int numberTwo = Integer.parseInt(reader.nextLine());

        System.out.println("The bigger of the two numbers given was: " + Math.max(numberOne, numberTwo));
    }
}
