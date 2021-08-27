package com.company;

public class Menu {

    static int option;

    public static void start() {
        System.out.println("#####################################");
        System.out.println("| Welcome to Richie's Algorithm CLI |");
        System.out.println("#####################################");
        options();
    }

    public static void menu() {
        System.out.println();
        System.out.println("-------------------------------------");
        System.out.println("Please choose from one of our options");
        System.out.println("-------------------------------------");
        System.out.println("1. Factorial Calculator");
        System.out.println("2. Title case a string");
        System.out.println("3. Pig Latin Converter");
        System.out.println("4. Is it a factor?");
        System.out.println("5. Exit the program");
        System.out.println("-------------------------------------");
        System.out.print("Selection: ");
    }

    public static void options() {

        while (option != 5) {
            menu();
            option = CLI.getInt(1, 5);

            switch (option) {
                case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("\n\tWelcome to the\n\t\tFactorial Calculator\n");
                    System.out.println("-------------------------------------");
                    Factorial.run();
                    break;
                case 2:
                    System.out.println("-------------------------------------");
                    System.out.println("\n\tWelcome to\n\t\tThe Capitalizer\n");
                    System.out.println("-------------------------------------");
                    TitleCase.run();
                    break;
                case 3:
                    System.out.println("-------------------------------------");
                    System.out.println("\n\tWelcome to the\n\t\tPig Latin Converter\n");
                    System.out.println("-------------------------------------");
                    PigLatin.run();
                    break;
                case 4:
                    System.out.println("-------------------------------------");
                    System.out.println("\n\tWelcome to the\n\t\tIs it a Factor?\n");
                    System.out.println("-------------------------------------");
                    IsFactor.run();
                    break;
                case 5:
                    System.out.println("\n");
                    System.out.println("*************************************");
                    System.out.println("\tThank you, come again!");
                    CLI.scan.close();
                    break;
            }
        }
    }
}

