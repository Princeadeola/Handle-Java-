package Week4.Lab.Loops;

import java.util.Scanner;

public class CountUp {
    public static void main(String[] args) {
        int initialNumber = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = input.nextInt();

        System.out.print("Enter the stopping number: ");
        int stop = input.nextInt();

        for (int x = start; x <= stop; x = x + start){
            System.out.println("Loop " + x);
        }

    }
}
