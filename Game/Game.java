package Game;

import java.util.Scanner;

public class Game {
    Scanner input;

    public Game(){

    }

    public Game(Scanner input){
        this.input = input;
    }
    void getUserInput(){
        System.out.println("Welcome to family game night");
        System.out.println("What game would you like? ");

        System.out.println("1. Guessing Game");
        System.out.println("2. TicTacToe Game");
        System.out.println("3. Math Game");

        while (true) {
            input = new Scanner(System.in);
            System.out.println("Enter 1|2|3 (0 to exit): ");
            int option = input.nextInt();

            if (option == 1){
                GuessGame run = new GuessGame();
                run.playGame();
            }else if (option == 2){
                TicTacToe run = new TicTacToe();
                run.playGame();
            }else if (option == 3){
                QuestionGame run = new QuestionGame();
                run.playGame();
            }else if (option == 0){
                System.out.println("Thank you for coming around");
                System.out.println("Take care");
                break;
            }else {
                System.out.println("Please enter the right input 1|2|3 (0 to exit)");
                option = input.nextInt();
            }
        }

    }
}


