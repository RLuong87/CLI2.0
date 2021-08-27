package com.company;

public class TitleCase {

    public static void run() {

        String userStr = CLI.getStr("Enter any word you want");

        String[] split = userStr.split(" ");

        for (int i = 0; i < split.length; i++) {

            split[i] = split[i].substring(0, 1).toUpperCase() + split[i].substring(1);
        }
        StringBuilder str = new StringBuilder();

        for (String s : split) {
            str.append(s).append(" ");
        }
        System.out.println("Result: " + str);
    }
}
