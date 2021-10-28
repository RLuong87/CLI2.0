package com.company;

public class VowelFinder {

    public static void run() {

        String userStr = CLI.getStr("\nPlease enter any words you'd like");

        int vowelCount = 0;

        for (char f: userStr.toLowerCase().toCharArray()) {
            if (f == 'a' || f == 'e' || f == 'i' || f == 'o' || f == 'u') {
                vowelCount++;
            }
        }
        System.out.print("\nYour input: " + userStr + "\n");
        System.out.print("\nWe found " + vowelCount + " vowels\n");
    }
}
