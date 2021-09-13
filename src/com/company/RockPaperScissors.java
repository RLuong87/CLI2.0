package com.company;

import java.util.Random;

public class RockPaperScissors {

    public static String rps(String player1, String player2) {

        String rock = "rock", paper = "paper", scissors = "scissors";

        if (player1.equals(paper) && player2.equals(rock) || player1.equals(rock) && player2.equals(scissors) || player1.equals(scissors) && player2.equals(paper)) {
            return "Player 1 wins";
        } else if (player1.equals(rock) && player2.equals(paper) || player1.equals(scissors) && player2.equals(rock) || player1.equals(paper) && player2.equals(scissors)) {
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
