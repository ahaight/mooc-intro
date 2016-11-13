package com.company;

import java.util.Scanner;

/**
 * Created by aaronhaight on 11/13/16.
 */
public class Usernames {

    public static void main(String[] args) {
        String firstName = "alex";
        String secondName = "emily";
        String firstPassword = "mightyducks";
        String secondPassword = "cat";

        Scanner reader = new Scanner(System.in);

        System.out.print("Type your username: ");
        String name = reader.nextLine();

        System.out.print("Type your password: ");
        String password = reader.nextLine();

        if (name.equals(firstName) && password.equals(firstPassword)) {
            System.out.println("You are now logged in!");
        } else if (name.equals(secondName) && password.equals(secondPassword)) {
            System.out.println("You are now logged in!");
        } else {
            System.out.println("Your username or password was invalid!");
        }
    }
}
