package com.company;

public class FahrenheitCelsiusConverter {

    public static void run() {

        char choice = CLI.getChar("""

                Enter 'F' to convert to Fahrenheit or 'C' to convert to Celsius:\s""");

        switch (choice) {
            case 'F' -> convertCelsiusToF();
            case 'C' -> convertFahrenheitToC();
        }
    }

    public static void convertCelsiusToF() {

//        return a * 9 / 5 + 32;

        int celsius = CLI.getInt("\nEnter Celsius degrees to convert to Fahrenheit: ");
        System.out.println(celsius * 9 / 5 + 32);
        Menu.subOptions5();
    }

    public static void convertFahrenheitToC() {

//        return (b - 32) * 5 / 9;

        int fahrenheit = CLI.getInt("\nEnter Fahrenheit to convert to Celsius: ");
        System.out.println((fahrenheit - 32) * 5 / 9);
        Menu.subOptions6();
    }
}
