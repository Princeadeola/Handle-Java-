package Week2.Lab;

import java.util.Scanner;

public class Statistics {
    public static void main(String[] args) {

        // asks the user for an input
        Scanner input = new Scanner(System.in);

        // requests for grade 1 input
        System.out.print("Enter Grade 1: ");
        int grade1 = input.nextInt();

        // requests for grade 2 input
        System.out.print("Enter Grade 2: ");
        int grade2 = input.nextInt();

        // requests for grade 3 input
        System.out.print("Enter Grade 3: ");
        int grade3 = input.nextInt();

        // sum the total grades of the user
        int sum = grade1 + grade2 + grade3;
        System.out.println("The sum of the student score: " + sum);

        // calculates the average score
        int average = (sum / 3);
        System.out.println("Average score of the student: " + average);

        // calculates the max by using the Math.max method
        int max1 = Math.max(grade1, grade2); // compares grade 1 and grade 2
        int max2 = Math.max(max1, grade3); // compare the result of grade 1 and grade 2 comparison with grade 3
        System.out.println("Max: " + max2); // prints the max

        // calculates the min by using the Math.min method
        int min1 = Math.min(grade1, grade2); // compares grade 1 and grade 2
        int min2 = Math.min(min1, grade3); // compare the result of grade 1 and grade 2 comparison with grade 3
        System.out.println("Min: " + min2); // prints the min

        // Gets the range by subtracting the min from max
        int range = max2 - min2;
        System.out.println("Range: " + range);

    }
}
