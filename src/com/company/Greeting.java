package com.company;

import java.util.Scanner;

/**
 * Created by aaronhaight on 10/26/16.
 */
public class Greeting {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Your name: ");
        String name = reader.nextLine();

        System.out.print("How old are you: ");
        int age = Integer.parseInt(reader.nextLine());

        System.out.println("Your name is: " + name + ", and you are " + age + " years old, nice to meet you!");
    }
}
