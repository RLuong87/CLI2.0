package com.company;

public class Menu {
    public static char yes = ' ';

    public static void start() {
        System.out.println("#####################################");
        System.out.println("| Welcome to Richie's Algorithm CLI |");
        System.out.println("#####################################");
        options();
    }

    public static void displayMenu() {
        System.out.println("\n-------------------------------------");
        System.out.println("Please choose from one of our options");
        System.out.println("-------------------------------------");
        System.out.println("1. Factorial Calculator");
        System.out.println("2. Title case a word");
        System.out.println("3. Pig Latin Converter");
        System.out.println("4. Is it a factor?");
        System.out.println("5. Repeat a word");
        System.out.println("6. Basic Calculator");
        System.out.println("7. Leap Year Checker");
        System.out.println("8. Exit");
        System.out.println("-------------------------------------");
        System.out.print("Selection: ");
    }

    public static void options() {

        while (true) {
            displayMenu();
            int option = CLI.getInt(1, 8);
            // Switch Expression, much more concise
            switch (option) {
                case 1 -> Factorial.run();
                case 2 -> TitleCase.run();
                case 3 -> PigLatin.run();
                case 4 -> IsFactor.run();
                case 5 -> RepeatAString.run();
                case 6 -> BasicCalculator.run();
                case 7 -> LeapYearChecker.run();
                case 8 -> CLI.exit();
            }
        }
    }

    public static void subOptions() {
        while (true) {
            System.out.println("\nWould you like to try again?");
            yes = CLI.getChar("(" + "Y/N" + "): ");
            switch (yes) {
                case 'Y' -> Factorial.run();
                case 'N' -> options();
            }
        }
    }
}

