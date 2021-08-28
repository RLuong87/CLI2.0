package com.company;

public class BasicCalculator {
    private static int calculate = 0;

    public static void run() {

        System.out.println("-------------------------------------");
        System.out.println("\n\tWelcome to the\n\t\tBasic Calculator\n");
        System.out.println("-------------------------------------");

        int num1 = CLI.getInt("\nEnter a number: ", 0, 1_000_000_000);
        char operator = CLI.getChar("\nEnter an operator: ");
        int num2 = CLI.getInt("\nEnter a number: ", 0, 1_000_000_000);

        switch (operator) {
            case '+' -> calculate = num1 + num2;
            case '*' -> calculate = num1 * num2;
            case '-' -> calculate = num1 - num2;
            case '/' -> calculate = num2 == 0 ? 0 : num1 / num2;
        }
        System.out.print("\nResult: " + calculate + "\n");
    }
}
