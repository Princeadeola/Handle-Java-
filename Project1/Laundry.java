package Project1;

import java.util.Scanner;

public class Laundry {
    // variables declared
    int numberOfSetOfWash;
    int numberOfWashPerWeek;
    int costPerWash = 2; //cost per wash cost $2
    int costPerDry = 2;  //cost per dry cost $2
    int average;
    int monthly;
    int quarterly;
    int option;

    // Get the user data
    public void getUserData() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of wash per week: "); //How many times do user wash in a week
        numberOfWashPerWeek = input.nextInt();

        System.out.print("Enter set of wash on per week: "); // How many set of cloth does the user wash
        numberOfSetOfWash = input.nextInt();

        // Gives the user wat report is need
        System.out.println("What do you want to calculate?");
        System.out.println("1. Weekly Wash and Dry");
        System.out.println("2. Monthly Wash and Dry");
        System.out.println("3. Quarterly Wash and Dry");

        // a while  loop that keeps requesting for input until user enters '0' to end program
        while (true) {
            System.out.println("Enter 1|2|3 or (0 to exit): ");
            option = input.nextInt();

            // checks for Weekly Wash and Dry
            if (option == 1) {
                getAverage();
            } else if (option == 2) { // checks for Monthly Wash and Dry
                getMonthly();
            } else if (option == 3) { // checks for Quarterly Wash and Dry
                getQuarterly();
            } else if (option == 0) { // end program
                System.out.println("Thank you for using this application");
                System.out.println("Done!");
                break;
            } else {
                System.out.println("Please enter a valid input"); // for wrong inputs
            }
        }
    }

    // a method to calculate the average of weekly wash
    public void getAverage(){
        average = (numberOfSetOfWash * (costPerWash + costPerDry)) * numberOfWashPerWeek;
        System.out.println("Total cost for " + numberOfSetOfWash +
                " set on average week is $" + average);
    }

    // a method to calculate the monthly wash
    public void getMonthly(){
        monthly = ((numberOfSetOfWash * (costPerWash + costPerDry)) * numberOfWashPerWeek) * 4;
        System.out.println("Total cost for " + numberOfSetOfWash +
                " set in a month is $" + monthly);
    }

    // a method to calculate the quarterly wash
    public void getQuarterly(){
        quarterly = ((numberOfSetOfWash * (costPerWash + costPerDry)) * numberOfWashPerWeek) * 7;
        System.out.println("Total cost for " + numberOfSetOfWash +
                " set quarterly is $" + quarterly);
    }
}
