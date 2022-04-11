package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//     Guess the number game

        Random rand = new Random();
        int numberToGuess = rand.nextInt(10);
        int numbersOfTries = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;
        while (!win){
            System.out.println("Guess the number between 1 and 10:");
            guess = input.nextInt();

                 numbersOfTries++;
            if (guess == numberToGuess) {
                win = true;
            }
            else if (guess<numberToGuess) {
                System.out.println("Your guess is too low");
            }
            else 
                System.out.println("Your assumption is too high");



        }
        System.out.println("You Win");
        System.out.println("Number Of Tries - "+numbersOfTries);
    }
}
