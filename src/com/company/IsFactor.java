package com.company;

public class IsFactor {

    public static void run() {

        System.out.println("-------------------------------------");
        System.out.println("\n\tWelcome to\n\t\tIs it a Factor?\n");
        System.out.println("-------------------------------------");

        int num = CLI.getInt("Enter a num: ");
        int num2 = CLI.getInt("\nEnter a num: ");

        if (num2 % num != 0) {
            System.out.println("\n\t" + num + " is not a factor of " + num2);
        } else {
            System.out.println("\n\tYes, " + num + " is a factor of " + num2 + "\n");
            Menu.subOptions3();
        }
    }
}
