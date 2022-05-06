package Week2.Lab;

public class MathRandom {
    public static void main(String[] args) {
        double min = 21; // The minimum value
        double max = 55; // The maximum value

        double range = (max - min) + 1; // get the range
        // using the Math.random() method to generate the random numbers
        // from 21 to 55 (including 21 and 55)
        double rand = (Math.random() * range) + min;
        System.out.println(rand);
    }
}
