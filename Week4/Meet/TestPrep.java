package Week4.Meet;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class TestPrep {
    // The main method
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in); // Scanner class helps us to receive input from user
        Random randGen = new Random(); // Random class generates random choices
        ArrayList<Cafe> drinks = new ArrayList<Cafe>(); // An array list to store each drink

        // Giving the user more information
        System.out.println("It's time to get ready for midterms!");
        System.out.println("You know you have to be alert for study sessions.");
        System.out.println("Caffeinated beverages from your favorite cafe will work.");
        System.out.println("We all like different drinks, so get ready to enter yours.");
        System.out.println("You will need the name, the mg of caffeine and the price.");
        System.out.println("When you are done, enter DONE then 0 then 0.");

        String name = "na";
        int caffeine;
        double price;

        // A while loop which continues looping while name is DONE (IT SHOULD NOT IGNORE THE CASE)
        while (!name.equalsIgnoreCase("DONE")){
            // Ask the users for name, caffeine, price
            System.out.println("Enter a drink name or DONE: ");
            name = keyboard.next();
            System.out.println("Enter the caffeine in mg: ");
            caffeine = keyboard.nextInt();
            System.out.println("Enter the price: ");
            price = keyboard.nextDouble();
            keyboard.nextLine();
            //conditional if statement that checks if the name is not equal done ignoring the case
            // and adds the inputs from users to the drinks arrayList
            if (!name.equalsIgnoreCase("DONE")) {
                drinks.add(new Cafe(name, caffeine, price));
            }
        }

        // get the total drink by getting the size of arraylist of drinks
        int max = drinks.size();
        System.out.println(max);

        // Giving the user more information
        System.out.println("The human body can handle about 500 mg of caffeine " +
                "before bad things start to happen.");
        System.out.println("You will now play chicken with your drink choices. " +
                "Try to stay alert without going over.");
        System.out.println("You can DRINK or be DONE");
        System.out.println("The drink will be chosen at random from the ones you entered");

        // declares new variables
        int totalCaffeine = 0;
        String tally = "";
        String choice = "DRINK";

        //A while loop which continues looping while the choice is not equal done (ignore the case)
        while (!choice.equalsIgnoreCase("DONE")){
            // asks input from user
            System.out.println("You can DRINK or be DONE!");
            choice = keyboard.nextLine();
            Cafe bev = drinks.get(randGen.nextInt(max));
            totalCaffeine += bev.getCaffeine();
            tally += "["+bev.toString() +"] ";
        }

        // if conditional statement that checks if the totalCaffeine is greater than 500
        if (totalCaffeine > 500){
            System.out.println("You lose! You get the jitters and can't " +
                    "remember anything you studied today!");
        }
        // else if conditional statement that checks if the totalCaffeine is greater than 100
        else if (totalCaffeine > 100){
            System.out.println("You win! You stay alert for the whole study session!");
        }
        // else block that is printed if none of the if block is executed
        else{
            System.out.println("What's this? It's like you didn't play! " +
                    "You fell asleep on your book.");
        }
        System.out.println("You drank: " + tally);
    }
}