package com.company;

import java.util.Scanner;

/**
 * Created by aaronhaight on 11/13/16.
 */
public class While {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Welcome to the calculator");

        while (true) {
            System.out.print("Enter a command (sum, difference, quit): ");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                break;
            }

            System.out.print("enter the numbers: ");
            int first = Integer.parseInt(reader.nextLine());
            int second = Integer.parseInt(reader.nextLine());

            if (command.equals("sum")) {
                int sum = first + second;
                System.out.println("The sum of the numbers is " + sum);
            } else if (command.equals("difference")) {
                int difference = first - second;
                System.out.println("The difference of the numbers is " + difference);
            } else {
                System.out.println("Unknown command");
            }
        }
        System.out.println("Thanks, bye!");
    }
}
