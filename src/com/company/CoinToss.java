package com.company;

import java.util.Random;

public class CoinToss {

    public static void run() {

        Random rand = new Random();

        System.out.println("\nCall it in the air!");
        CLI.getChar("""

                You wanna flip it?
                (Y/N):\s""");

        int toss = Math.abs(rand.nextInt()) % 2;

        if (toss == 0) {
            System.out.println("\n\tIt's HEADS!\n");
        } else {
            System.out.println("\n\tIt's TAILS!\n");
        }
        Menu.subOptions4();
    }
}
