package com.company;

public class Factorial {

    public static void run() {

        System.out.println("-------------------------------------");
        System.out.println("\n\tWelcome to the\n\t\tFactorial Calculator\n");
        System.out.println("-------------------------------------");

        int num = CLI.getInt("Enter a number between 1 and 16", 1, 16);

        int factor = 1;

        for (int i = 1; i <= num; i++) {
            factor *= i;
        }
        System.out.println("Result: " + factor + "\n");
        Menu.subOptions();
    }
}

//    Factorial Calculator using recursion
//    public static int fact(int n) {
//        // Factorial with Recursion
//        if (n == 1) {
//            System.out.println("Factorial(" + n + ") = 1");
//            return 1;
//        } else {
//            System.out.println("Factorial(" + n + ") = " + n + " + factorial(" + (n - 1) + ")");
//            return n * fact(n - 1);
//        }
//    }