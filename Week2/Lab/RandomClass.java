package Week2.Lab;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        int min = 21; // The minimum value
        int max = 55; // The maximum value

        // using the Random class (imports java.util.Random) to generate the random numbers
        // from 21 to 55 (including 21 and 55)
        Random rand = new Random();
        int num = min + rand.nextInt((max - min) + 1);
        System.out.println(num);
    }
}
