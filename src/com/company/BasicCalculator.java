package com.company;

public class BasicCalculator {

    public static void run() {

        System.out.println("-------------------------------------");
        System.out.println("\n\tWelcome to the\n\t\tBasic Calculator\n");
        System.out.println("-------------------------------------");

        int num1 = CLI.getInt("Enter a number", 0, 1_000_000_000);
        char operator = CLI.getChar("Enter an operator");
        int num2 = CLI.getInt("Enter a number", 0, 1_000_000_000);
        int calculate = 0;

        switch (operator) {
            case '+' -> calculate = num1 + num2;
            case '*' -> calculate = num1 * num2;
            case '-' -> calculate = num1 - num2;
            case '/' -> calculate = num2 == 0 ? 0 : num1 / num2;
        }
        System.out.println(calculate);
    }
}
