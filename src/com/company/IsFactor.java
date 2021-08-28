package com.company;

public class IsFactor {

    public static void run() {

        System.out.println("-------------------------------------");
        System.out.println("\n\tWelcome to the\n\t\tIs it a Factor?\n");
        System.out.println("-------------------------------------");

        int num = CLI.getInt("Enter a num", 1, 16);
        int num2 = CLI.getInt("Enter a num", 1, 16);

        int factor = 1;

        for (int i = 1; i <= num2; i++) {
            factor *= i;
        }
        System.out.println(num2 + " is a factor of " + factor);
    }

}
