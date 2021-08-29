package com.company;

public class RepeatAString {

    public static void run() {

        System.out.println("-------------------------------------");
        System.out.println("\n\tWelcome to the\n\t\tRepeat a word program\n");
        System.out.println("-------------------------------------");
        String str = CLI.getStr("Enter a word to repeat");
        int num = CLI.getInt("\nEnter a number: ");
        // repeat method, Math.max as the parameter which takes two numbers
        // if count is 0, returns empty string. Any negative number will result in a throw
        // Math.max takes 2 arguments and will return the greater of two int values
        System.out.println("\n" + str.repeat(Math.max(0, num)) + "\n");
    }
}
