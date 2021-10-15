package com.company;

public class Menu {
    private static char choice = ' ';

    public static void start() {
        System.out.println("#####################################");
        System.out.println("| Welcome to Richie's Algorithm CLI |");
        System.out.println("#####################################\n");
        options();
    }

    public static void displayMenu() {
        System.out.println();
        System.out.print("""
                -------------------------------------
                ============= M E N U ===============
                   
                   Select from one of our options
                -------------------------------------
                0. Enter 0 for something cool
                1. Factorial Calculator
                2. Title case a word
                3. Pig Latin Converter
                4. Is it a factor?
                5. Repeat a word
                6. Basic Calculator
                7. Leap Year Checker
                8. Coin Toss
                9. Fahrenheit/Celsius Converter
                10. Atbash Generator
                11. Dice Roller
                12. Exit
                -------------------------------------
                Selection:\s""");
    }

    public static void options() {
        while (true) {
            displayMenu();
            int option = CLI.getInt(0, 11);
            switch (option) {
                case 0 -> MarioStairs.run();
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
                case 11 -> DiceRoller.run();
                case 12 -> CLI.exit();
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
}

