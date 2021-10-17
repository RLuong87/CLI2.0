package com.company;

public class Encryption {

    public static void run() {

        String word = CLI.getStr("Enter any words you'd like");
        char[] chars = word.toCharArray(); // Convert the string into a char array
        StringBuilder str = new StringBuilder(); // Use String builder to concatenate the new string
        int num = 1; // Initialize a variable and set it to 1
        // Based on the ASCII chart, we can add or subtract a number to a character,
        // and it'll return any character that is before or after the original character

        for (int i = 0; i < chars.length; i++) { // Loop through the chars array
            chars[i] += num; // add 1 to each character
        }
        for (char aChar : chars) { // For each loop through the new char array
            str.append(aChar); // append the results with String builder
        }
        System.out.println(str.toString()); // Return the new string and using the to string method from the String builder class
    }
}
