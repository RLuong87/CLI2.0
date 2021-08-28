package com.company;

public class PigLatin {
    public static void run() {

        System.out.println("-------------------------------------");
        System.out.println("\n\tWelcome to the\n\t\tPig Latin Converter\n");
        System.out.println("-------------------------------------");

        String str = CLI.getStr("Enter any words you'd like");
        // Look at each word in the string
        String[] newStr = str.split(" ");

        for (int i = 0; i < newStr.length; i++) {
            // If it's a vowel add "way" to the end
            // Otherwise add "ay"
            // Combine all new words into a string
            char chars = newStr[i].charAt(0); // Look at the first characters of each string in the array

            if (chars == 'A' || chars == 'E' || chars == 'I' || chars == 'O' || chars == 'U' || chars == 'a'
            || chars == 'e' || chars == 'i' || chars == 'o' || chars == 'u') {
                newStr[i] += "way";
            } else {
                newStr[i] = newStr[i].substring(1) + newStr[i].charAt(0) + "ay";
            }
        }
        StringBuilder pig = new StringBuilder();

        for (String s : newStr) {

            pig.append(s).append(" ");
        }
        System.out.print("\nResult: " + pig.toString().trim() + "\n");
    }
}

