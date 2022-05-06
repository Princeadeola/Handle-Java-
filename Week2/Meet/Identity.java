package Week2.Meet;


import java.util.Scanner;
import java.util.Random;

public class Identity{

  public static void main (String args[]){

    Random randGen = new Random();
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Welcome to the Identity Number Generator! " +
            "\nAnswer some questions and I will generate your ID.");
    
    System.out.println("first Name: ");
    String firstName = keyboard.next();
    keyboard.nextLine();
    
    System.out.println("last Name: ");
    String lastName = keyboard.next();
    keyboard.nextLine();
    
    
    char fNInitial = firstName.charAt(0);
    char lNInitial = lastName.charAt(0);
    
    int min_val = 100;
    int max_val = 999;
    
    Random rand = new Random();
    int randomNum = min_val + rand.nextInt((max_val - min_val) + 1);
    
    System.out.println("Random number is: " + randomNum);
    System.out.println("Your new ID is: " + fNInitial + lNInitial + randomNum);
    
  }
  
}