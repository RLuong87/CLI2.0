package com.company;

public class FahrenheitCelsiusConverter {

    public static void run() {

        while (true) {
            System.out.println();
            int choice = CLI.getInt("""
                    Choose from the options below
                    --------------------------------
                    1) Convert Fahrenheit to Celsius
                    2) Convert Celsius to Fahrenheit
                    3) Main Menu
                    --------------------------------
                    Selection:\s""");
            switch (choice) {
                case 1 -> convertFahrenheitToC();
                case 2 -> convertCelsiusToF();
                case 3 -> Menu.options();
                default -> System.out.println("\nERROR: INVALID SELECTION, PLEASE TRY AGAIN.");
            }
        }
    }

    public static void convertFahrenheitToC() {
        int fahrenheit = CLI.getInt("\nEnter a Fahrenheit temperature and we'll convert it to Celsius\nInput: ");
        System.out.println("\nCelsius: " + (fahrenheit - 32) * 5 / 9);
        run();
    }

    public static void convertCelsiusToF() {
        int celsius = CLI.getInt("\nEnter a Celsius temperature and we'll convert it to Fahrenheit\nInput: ");
        System.out.println("\nFahrenheit: " + (celsius * 9 / 5 + 32));
        run();
    }
}
