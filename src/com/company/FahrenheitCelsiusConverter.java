package com.company;

public class FahrenheitCelsiusConverter {

    public static void run() {
        while (true) {
            System.out.println();
            char choice = CLI.getChar("""
                    Choose from these options below
                    --------------------------------
                    F) Convert Fahrenheit to Celsius
                    C) Convert Celsius to Fahrenheit
                    E) Main Menu
                    --------------------------------
                    Selection:\s""");
            switch (choice) {
                case 'F' -> convertFahrenheitToC();
                case 'C' -> convertCelsiusToF();
                case 'E' -> Menu.options();
                default -> System.out.println("\nERROR: INVALID SELECTION, PLEASE TRY AGAIN.");
            }
        }
    }

    public static void convertFahrenheitToC() {
        int fahrenheit = CLI.getInt("\nEnter a Fahrenheit temperature and we'll convert it to Celsius\nInput: ");
        System.out.println("\nCelsius: " + (fahrenheit - 32) * 5 / 9);
        Menu.subOptions5();
    }

    public static void convertCelsiusToF() {
        int celsius = CLI.getInt("\nEnter a Celsius temperature and we'll convert it to Fahrenheit\nInput: ");
        System.out.println("\nFahrenheit: " + (celsius * 9 / 5 + 32));
        Menu.subOptions5();
    }
}
