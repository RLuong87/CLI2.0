package com.company;

public class LeapYearChecker {

    public static void run() {

        System.out.println("-------------------------------------");
        System.out.println("\n\tWelcome to the\n\t\tLeap Year Checker\n");
        System.out.println("-------------------------------------");

        int year = CLI.getInt("Enter any year: ");

        if (year % 400 == 0) {
            System.out.println("\n\tYes, " + year + " is a Leap Year\n");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("\n\tYes, " + year + " is a Leap Year\n");
        } else {
            System.out.println("\n\tNo, " + year + " is not a Leap Year\n");
            Menu.subOptions2();
        }
    }
}
