package com.company;

public class Menu {

    public static void start() {
        System.out.println("#####################################");
        System.out.println("| Welcome to Richie's Algorithm CLI |");
        System.out.println("#####################################");
        options();
    }

    public static void displayMenu() {
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("Please choose from one of our options");
        System.out.println("-------------------------------------");
        System.out.println("1. Factorial Calculator");
        System.out.println("2. Title case a word");
        System.out.println("3. Pig Latin Converter");
        System.out.println("4. Is it a factor?");
        System.out.println("5. Repeat a word");
        System.out.println("6. Exit the program");
        System.out.println("-------------------------------------");
        System.out.print("Selection: ");
    }

    public static void options() {
        while (true) {
            displayMenu();
            int option = CLI.getInt(1, 6);

            switch (option) {
                case 1 -> Factorial.run();
                case 2 -> TitleCase.run();
                case 3 -> PigLatin.run();
                case 4 -> IsFactor.run();
                case 5 -> RepeatAString.run();
                case 6 -> CLI.exit();
            }
        }
    }
}

