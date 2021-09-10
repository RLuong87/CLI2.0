package com.company;

public class AtBash {

    public static void run() {

        String message = CLI.getStr("Enter a message: ");

        char[] charArr = message.toCharArray();

        for (char c: charArr) {

            switch (c) {
                case 'A' -> System.out.println('Z');
                case 'B' -> System.out.println('Y');
                case 'C' -> System.out.println('X');
            }
        }
    }
}
