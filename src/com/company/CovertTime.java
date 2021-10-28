package com.company;

public class CovertTime {

    public static void run() {

        while (true) {
            System.out.println();
            int choice = CLI.getInt("""
                    Choose from the options below
                    --------------------------------
                    1) Convert hours to seconds
                    2) Convert minutes to seconds
                    3) Main Menu
                    --------------------------------
                    Selection:\s""");
            switch (choice) {
                case 1 -> hoursToSeconds();
                case 2 -> minutesToSeconds();
                case 3 -> Menu.options();
                default -> System.out.println("\nERROR: INVALID SELECTION, PLEASE TRY AGAIN.");
            }
        }
    }

    public static void hoursToSeconds() {

        int userHours = CLI.getInt("Enter a number of hours to covert to seconds\nInput: ");

        System.out.println("\nYour input: " + userHours);
        System.out.println("\nThe result is: " + (userHours * 3600) + " seconds");
    }

    public static void minutesToSeconds() {

        int userMinutes = CLI.getInt("Enter a number of minutes to convert to seconds\nInput: ");

        System.out.println("\nYour input: " + userMinutes);
        System.out.println("\nThe result is: " + (userMinutes * 60) + " seconds");
    }
}
