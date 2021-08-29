package com.company;

public class TitleCase {

    public static void run() {

        System.out.println("-------------------------------------");
        System.out.println("\n\tWelcome to the\n\t\tTitle Case Program\n");
        System.out.println("-------------------------------------");
        String userStr = CLI.getStr("Enter any word you'd like");
        String[] split = userStr.split(" ");

        for (int i = 0; i < split.length; i++) {

            split[i] = split[i].substring(0, 1).toUpperCase() + split[i].substring(1);
        }
        StringBuilder str = new StringBuilder();

        for (String s : split) {
            str.append(s).append(" ");
        }
        System.out.println("\nResult: " + str + "\n");
    }
}
