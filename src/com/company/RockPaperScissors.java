package com.company;

import java.util.Random;

public class RockPaperScissors {

    public static String rps(String s1, String s2) {

        String rock = new String("rock");
        String paper = new String("paper");
        String scissors = new String("scissors");

        if (s1.equals(paper) && s2.equals(rock) || s1.equals(rock) && s2.equals(scissors) || s1.equals(scissors) && s2.equals(paper)) {
            return "Player 1 wins";
        } else if (s2.equals(paper) && s1.equals(rock) || s2.equals(rock) && s1.equals(scissors) || s2.equals(scissors) && s1.equals(paper)) {
            return "Player 2 wins";
        } else {
            return "TIE";
        }
    }

    public static void main(String[] args) {
        System.out.println(rps("rock", "scissors"));
        System.out.println(rps("paper", "rock"));
        System.out.println(rps("scissors", "paper"));
        System.out.println(rps("rock", "paper"));
        System.out.println(rps("scissors", "rock"));
        System.out.println(rps("paper", "scissors"));
        System.out.println(rps("rock", "rock"));
        System.out.println(rps("scissors", "scissors"));
        System.out.println(rps("paper", "paper"));
    }
}

//        String[] rpsArr = { "rock", "paper", "scissors" };
//        Random r = new Random();
//        int rand = r.nextInt(rpsArr.length);
//        System.out.println(rpsArr[rand]);
