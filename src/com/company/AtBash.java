package com.company;

import java.util.Objects;

public class AtBash {

    public static void run() {

        String message = CLI.getStr("\nEnter a message: ");
        String[] messArr = message.toUpperCase().split("");

        for (String s : messArr) {
            if (Objects.equals(s, "A")) System.out.print(s.replace('A', 'Z'));
            if (Objects.equals(s, "B")) System.out.print(s.replace('B', 'Y'));
            if (Objects.equals(s, "C")) System.out.print(s.replace('C', 'X'));
            if (Objects.equals(s, "D")) System.out.print(s.replace('D', 'W'));
            if (Objects.equals(s, "E")) System.out.print(s.replace('E', 'V'));
            if (Objects.equals(s, "F")) System.out.print(s.replace('F', 'U'));
            if (Objects.equals(s, "G")) System.out.print(s.replace('G', 'T'));
            if (Objects.equals(s, "H")) System.out.print(s.replace('H', 'S'));
            if (Objects.equals(s, "I")) System.out.print(s.replace('I', 'R'));
            if (Objects.equals(s, "J")) System.out.print(s.replace('J', 'Q'));
            if (Objects.equals(s, "K")) System.out.print(s.replace('K', 'P'));
            if (Objects.equals(s, "L")) System.out.print(s.replace('L', 'O'));
            if (Objects.equals(s, "M")) System.out.print(s.replace('M', 'N'));
            if (Objects.equals(s, "N")) System.out.print(s.replace('N', 'M'));
            if (Objects.equals(s, "O")) System.out.print(s.replace('O', 'L'));
            if (Objects.equals(s, "P")) System.out.print(s.replace('P', 'K'));
            if (Objects.equals(s, "Q")) System.out.print(s.replace('Q', 'J'));
            if (Objects.equals(s, "R")) System.out.print(s.replace('R', 'I'));
            if (Objects.equals(s, "S")) System.out.print(s.replace('S', 'H'));
            if (Objects.equals(s, "T")) System.out.print(s.replace('T', 'G'));
            if (Objects.equals(s, "U")) System.out.print(s.replace('U', 'F'));
            if (Objects.equals(s, "V")) System.out.print(s.replace('V', 'E'));
            if (Objects.equals(s, "W")) System.out.print(s.replace('W', 'D'));
            if (Objects.equals(s, "X")) System.out.print(s.replace('X', 'C'));
            if (Objects.equals(s, "Y")) System.out.print(s.replace('Y', 'B'));
            if (Objects.equals(s, "Z")) System.out.print(s.replace('Z', 'A'));
        }
    }
}
