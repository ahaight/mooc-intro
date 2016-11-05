package com.company;

import java.util.Scanner;

/**
 * Created by aaronhaight on 10/26/16.
 */
public class InputDivide {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int numberOne = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        int numberTwo = Integer.parseInt(reader.nextLine());

        double divider = (double)numberOne / numberTwo;

        System.out.print("Division: " + numberOne + " / " + numberTwo + " = " + divider);
    }
}