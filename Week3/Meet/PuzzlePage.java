package Week3.Meet;

import java.util.Scanner;

public class PuzzlePage {
    public static void main(String args[]){

        Scanner keyboard = new Scanner(System.in);
        WordScramble puzzle = new WordScramble();


        System.out.print("Enter the solution word: ");
        String solution = keyboard.nextLine();

        System.out.printf("Your puzzle is: %s", puzzle.scramble(solution));
    }
}
