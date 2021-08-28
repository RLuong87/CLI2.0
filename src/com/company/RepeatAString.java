package com.company;

public class RepeatAString {

    public static void run() {

        String str = CLI.getStr("Enter a word to repeat");

        int num = CLI.getInt("Enter a number", 1, 100);

        StringBuilder repStr = new StringBuilder();

        for (int i = 0; i <= num; i++) {
            repStr.append(str);
        }
        System.out.println(repStr);
    }
}
