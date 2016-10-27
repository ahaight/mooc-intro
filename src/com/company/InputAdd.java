package com.company;

import java.util.Scanner;

/**
 * Created by aaronhaight on 10/26/16.
 */
public class InputAdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int numberOne = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        int numberTwo = Integer.parseInt(reader.nextLine());

        int sum = numberOne + numberTwo;

        System.out.print("Sum of the numbers: " + sum);
    }
}
