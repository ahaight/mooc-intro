package com.company;

/**
 * Created by aaronhaight on 11/6/16.
 */
public class CompareStrings {

    public static void main(String[] args) {
        String text = "marzipan";
        String anotherText = "marzipan";

        if (text.equals(anotherText)) {
            System.out.println("The variable text contains the text marzipan");
        } else {
            System.out.println("The variable text does not contain the text marzipan");
        }
    }
}
