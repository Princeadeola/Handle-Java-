package Game;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    void playGame() {
        Random rand = new Random();
        int numberOfGuess = rand.nextInt(50);
        int numberOfTries = 0;

        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;

        while (win == false){
            System.out.println("Guess a number between 1 and 50");
            guess = input.nextInt();
            numberOfTries++;

            if (guess == numberOfGuess){
                win = true;
            }else if (guess < numberOfGuess){
                System.out.println("Your Guess is too low");
            }else if (guess > numberOfGuess){

                System.out.println("Your guess is too high");
            }
        }

        System.out.println("You win!");
        System.out.println("The number was " + numberOfGuess);
        System.out.println("It took you " + numberOfTries + " tries");

    }
}
