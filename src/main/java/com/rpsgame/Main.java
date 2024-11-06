package com.rpsgame;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please chose rock, paper or scissors");
        String playerGuess = scanner.nextLine();
        System.out.println(playerGuess);
        boolean result = checkMatch(playerGuess);

        if (result) {
            System.out.println("Player wins the first duel");
        }
    }



    public static String checkInput(String choice) {
        return switch (choice.toLowerCase()) {
            case "rock" -> "You chose Rock!";
            case "paper" -> "You chose Paper!!";
            case "scissors" -> "You chose Scissors!";
            default -> "Please choose an option from Rock, Paper or Scissors";
        };
    }

    public static Boolean checkMatch (String playerGuess) {
        String[] potentialChoices = {"rock", "paper", "scissors"};
        Random random = new Random();
        int index = random.nextInt(potentialChoices.length);
        System.out.println(potentialChoices[index]);
        return playerGuess.toLowerCase().equals(potentialChoices[index]);
    }


    /*TDD Test cases
    * Checking if the user is inputting the correct input
    * Making sure the input is checked and a boolean is returned
    *
    * */
}

//Sudo code
//how will the project work
// The user will input a guess of rock, paper or scissors, then will match against the computer generated guess,
//whoever wins the will have a tally added to their total, first to 3 wins
//