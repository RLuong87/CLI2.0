package com.company;

import java.util.Random;

public class DiceRoller {

    public static Random r = new Random();

    public static void run() {

        int getRoll = CLI.getInt("\nEnter the amount of die/dice you would like to roll\nInput: ");

        System.out.print("You rolled a ");
        for (int i = 0; i < getRoll; i++) {
            int roll = r.nextInt(6) + 1;
            System.out.print(roll + " " + "\n");
        }
    }
}
