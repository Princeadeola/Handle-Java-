package Week4.Lab.Loops;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter String with letter e: ");
        String word = input.nextLine();

        while (!word.equals("done")){
            String newWord = word.replace("e", "_");
            System.out.println(newWord);

            System.out.print("Enter String with letter e: ");
            word = input.nextLine();
        }
        System.out.println("Thank you for playing");
    }
}
