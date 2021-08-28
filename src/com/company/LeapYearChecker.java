package com.company;

public class LeapYearChecker {

    public static void run() {

        System.out.println("-------------------------------------");
        System.out.println("\n\tWelcome to the\n\t\tLeap Year Checker\n");
        System.out.println("-------------------------------------");

        int year = CLI.getInt("Enter any year", 0, 10_000);

        if (year % 400 == 0) {
            System.out.println("\nYes, " + year + " is a Leap Year\n");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("\nYes, " + year + " is a Leap Year\n");
        } else {
            System.out.println("\nNo, " + year + " is not a Leap Year\n");
        }
    }
}
