package Week4.Lab.Loops;

import java.util.Scanner;

public class ReWriteCountDown {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter number to count down: ");
//        int count = input.nextInt();

        int count = 10;

        for (int i = 0; i <= count; count--) {
            System.out.println(count);

            if (count == 0){
                System.out.println("Blast off");
            }
        }
    }
}
