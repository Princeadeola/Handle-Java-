package Week4.Lab.Loops;

import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter number to count down: ");
//        int count = input.nextInt();

        int count = 10;
        int blastOff = 0;

        while (count >= blastOff){
            System.out.println(count);

            if (count == blastOff){
                System.out.println("Blast off");
            }

            count--;
        }
    }
}
