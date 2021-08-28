package com.company;

public class IsFactor {

    public static void run() {

        System.out.println("-------------------------------------");
        System.out.println("\n\tWelcome to\n\t\tIs it a Factor?\n");
        System.out.println("-------------------------------------");

        int num = CLI.getInt("Enter a num", 1, 100_000_000);
        int num2 = CLI.getInt("Enter a num", 1, 100_000_000);

        if (num % num2 != 0) {
            System.out.println(num + " is not a factor of " + num2);
        } else {
            System.out.println("Yes, " + num + " is a factor of " + num2);
        }
    }
}
