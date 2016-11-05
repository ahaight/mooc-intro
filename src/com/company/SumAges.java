package com.company;

import java.util.Scanner;

/**
 * Created by aaronhaight on 11/5/16.
 */
public class SumAges {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String nameOne = reader.nextLine();

        System.out.print("Type your age: ");
        int ageOne = Integer.parseInt(reader.nextLine());

        System.out.println();

        System.out.print("Type your name: ");
        String nameTwo = reader.nextLine();

        System.out.print("Type your age: ");
        int ageTwo = Integer.parseInt(reader.nextLine());

        int combinedAge = ageOne + ageTwo;

        System.out.println();

        System.out.println(nameOne + " and " + nameTwo + " are " + combinedAge + " years old in total.");
    }
}
