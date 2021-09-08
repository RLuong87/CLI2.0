package com.company;

public class FahrenheitCelsiusConverter {

    public static void run() {
        while (true) {
            char choice = CLI.getChar("""

                    Enter 'F' to convert to Fahrenheit or 'C' to convert to Celsius:\s""");

            switch (choice) {
                case 'F' -> convertCelsiusToF();
                case 'C' -> convertFahrenheitToC();
                default -> System.out.println("ERROR: INVALID SELECTION, PLEASE TRY AGAIN.");
            }
        }
    }

    public static void convertCelsiusToF() {

        int celsius = CLI.getInt("\nEnter Celsius: ");
        System.out.println("\nFahrenheit: " + (celsius * 9 / 5 + 32));
        Menu.subOptions5();
    }

    public static void convertFahrenheitToC() {

        int fahrenheit = CLI.getInt("\nEnter Fahrenheit: ");
        System.out.println("\nCelsius: " + (fahrenheit - 32) * 5 / 9);
        Menu.subOptions6();
    }
}
