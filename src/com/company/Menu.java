package com.company;

public class Menu {
    private static char choice = ' ';

    public static void start() {
        System.out.println("#####################################");
        System.out.println("| Welcome to Richie's Algorithm CLI |");
        System.out.println("#####################################");
        options();
    }

    public static void displayMenu() {
        System.out.println("\n-------------------------------------");
        System.out.println("============= M E N U ===============");
        System.out.println("\tSelect from one of our options");
        System.out.println("-------------------------------------");
        System.out.println("1. Factorial Calculator");
        System.out.println("2. Title case a word");
        System.out.println("3. Pig Latin Converter");
        System.out.println("4. Is it a factor?");
        System.out.println("5. Repeat a word");
        System.out.println("6. Basic Calculator");
        System.out.println("7. Leap Year Checker");
        System.out.println("8. Coin Toss");
        System.out.println("9. Fahrenheit/Celsius Converter");
        System.out.println("10. Atbash Generator");
        System.out.println("11. Exit");
        System.out.println("-------------------------------------");
        System.out.print("Selection: ");
    }

    public static void options() {

        while (true) {
            displayMenu();
            int option = CLI.getInt(1, 11);
            // Switch Expression, much more concise
            switch (option) {
                case 1 -> Factorial.run();
                case 2 -> TitleCase.run();
                case 3 -> PigLatin.run();
                case 4 -> IsFactor.run();
                case 5 -> RepeatAString.run();
                case 6 -> BasicCalculator.run();
                case 7 -> LeapYearChecker.run();
                case 8 -> CoinToss.run();
                case 9 -> FahrenheitCelsiusConverter.run();
                case 10 -> AtBash.run();
                case 11 -> CLI.exit();
            }
        }
    }

    public static void subOptions() {
        while (true) {
            System.out.println("\nWould you like to try again?");
            choice = CLI.getChar("(" + "Y/N" + "): ");

            switch (choice) {
                case 'Y' -> Factorial.run();
                case 'N' -> options();
            }
        }
    }

    public static void subOptions2() {
        while (true) {
            System.out.println("\nWould you like to try again?");
            choice = CLI.getChar("(" + "Y/N" + "): ");

            switch (choice) {
                case 'Y' -> LeapYearChecker.run();
                case 'N' -> options();
            }
        }
    }

    public static void subOptions3() {
        while (true) {
            System.out.println("\nWould you like to try again?");
            choice = CLI.getChar("(" + "Y/N" + "): ");

            switch (choice) {
                case 'Y' -> IsFactor.run();
                case 'N' -> options();
            }
        }
    }

    public static void subOptions4() {
        while (true) {
            System.out.println("Wanna play again?");
            choice = CLI.getChar("(" + "Y/N" + "): ");

            switch (choice) {
                case 'Y' -> CoinToss.run();
                case 'N' -> options();
            }
        }
    }

    public static void subOptions5() {
        while (true) {
            System.out.println();
            choice = CLI.getChar("""
                    Choose from these options below
                    --------------------------------
                    F) Convert Fahrenheit to Celsius
                    C) Convert Celsius to Fahrenheit
                    E) Main Menu
                    --------------------------------
                    Selection:\s""");
            switch (choice) {
                case 'F' -> FahrenheitCelsiusConverter.convertFahrenheitToC();
                case 'C' -> FahrenheitCelsiusConverter.convertCelsiusToF();
                case 'E' -> options();
            }
        }
    }
}

