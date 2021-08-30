package com.company;

public class Main {

    public static void main(String[] args) {
        Menu.start();

//        System.out.println(convertCelsiusToF(20)); // 68% Fahrenheit
//        System.out.println(convertFahrenheitToC(50)); // 10% Celsius


//        String s = "102";
            // String to an integer (Integer.parseInt) method
//        System.out.println(Integer.parseInt(s) + 100);
//        int n = Integer.parseInt("4");
//        System.out.println(n);

//        int num = 8;
        // Integer to a string (Integer.toString) method
//        System.out.println(Integer.toString(num) + 1);

//        String s = "age: 34";
        // Using regex to get just the integers from a string (replaceAll) method
        // regex: "\\D+", replacement: empty string
//        s = s.replaceAll("\\D+","");
//        int num1 = Integer.parseInt(s);
//        System.out.println(num1 + 2);
//        System.out.println(BasicCalculator.run(8, '/', 4));

    }

    public static int convertCelsiusToF(int celsius) {

        // Convert Celsius to Fahrenheit
        return celsius * 9 / 5 + 32;
    }

    public static int convertFahrenheitToC(int fahrenheit) {

        // Convert Fahrenheit to Celsius
        return (fahrenheit - 32) * 5 / 9;
    }
}
