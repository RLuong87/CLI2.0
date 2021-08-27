package com.company;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CLI {

    public static Scanner scan = new Scanner(System.in);

    public static int getInt (String question, int min, int max) {

        while (true) {
            try {
                System.out.println(question);
                System.out.print("Input: ");
                int userInt = scan.nextInt();

                if (userInt < min || userInt > max) {
                    System.out.println("\nSorry, enter a number between " + min + " & " + max + "\n");
                } else {
                    return userInt;
                }
            } catch (InputMismatchException exception) {
                System.out.println("\nInvalid, you must enter a value between " + min + " & " + max + "\n");
                scan.nextLine();
            }
        }
    }

    public static String getStr (String question) {

        while (true) {
            System.out.println(question);
            System.out.print("Input: ");
            String userInput = scan.nextLine();

            if (!userInput.trim().equals("")) {
                return userInput;
            } else {
                System.out.println("\nNah ah no you didn't!\n");
            }
        }
    }
}
