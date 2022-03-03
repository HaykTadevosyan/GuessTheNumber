package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//     Guess the number game

        Random rand = new Random();
        int numberToGuess = rand.nextInt(10);
        //    int numbersOfTries = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;
        while (win == false){
            System.out.println("Guess the number between 1 and 10:");
            guess = input.nextInt();
            //      numbersOfTries++;
            if (guess == numberToGuess) {
                win = true;
            }
            else if (guess<numberToGuess) {
                System.out.println("Ձեր ենթադրությունը չափազանց Ցածր է");
            }
            else if (guess>numberToGuess){
                System.out.println("Ձեր ենթադրությունը չափազանց Բարձր է");
            }


        }
        System.out.println("You Win");

    }
}
