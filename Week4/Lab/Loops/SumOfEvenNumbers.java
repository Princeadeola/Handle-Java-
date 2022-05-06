package Week4.Lab.Loops;

public class SumOfEvenNumbers {
    public static int sum(int num){
        int i = 0;
        int sum = 0;

        for (i = 0; i < num; i++){
            if (i % 2 == 0){
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int number = 100;
        int evenSum = 0;

        evenSum = sum(number);
        System.out.println("The sum of even number from 1 to " + number + " is = " + evenSum);
    }
}
