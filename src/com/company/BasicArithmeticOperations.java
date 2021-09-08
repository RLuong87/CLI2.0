package com.company;

public class BasicArithmeticOperations {

    public static int operation(String a, String b, String op) {

        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        char operator = op.charAt(0);
        int calc = 0;

        switch (operator) {
            case '+' -> calc = num1 + num2;
            case '-' -> calc = num1 - num2;
            case '*' -> calc = num1 * num2;
            case '/' -> calc = num2 == 0 ? 0 : num1 / num2;
        }
        return calc;
    }

    public static void main(String[] args) {
        System.out.println(operation("6", "5", "-"));
    }
}
