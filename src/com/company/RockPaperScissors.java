package com.company;

import java.util.Random;

public class RockPaperScissors {

//    Create a function which simulates the game "rock, paper, scissors".
//    The function takes the input of both players (rock, paper or scissors),
//    first parameter from first player, second from second player.
//    The function returns the result as such:
//
//            "Player 1 wins"
//            "Player 2 wins"
//            "TIE" (if both inputs are the same)
//    The rules of rock, paper, scissors, if not known:
//
//    Both players have to say either "rock", "paper" or "scissors" at the same time.
//    Rock beats scissors, paper beats rock, scissors beat paper


    public static String rps(String s1, String s2) {

//        String[] rpsArr = { "rock", "paper", "scissors"};
//        Random r = new Random();
//        int rand = r.nextInt(rpsArr.length);

        return "";
    }

    public static void main(String[] args) {
//        System.out.println(rps("", ""));

        String[] rpsArr = { "rock", "paper", "scissors" };
        Random r = new Random();
        int rand = r.nextInt(rpsArr.length);
        System.out.println(rpsArr[rand]);

    }
}
