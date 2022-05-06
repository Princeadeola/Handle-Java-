package Week4.Lab.Program;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int option;
        Scanner input;
        Driver run = new Driver();

        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1. Add a car to the garage: ");
            System.out.println("2. Remove a car from the garage: ");
            System.out.println("3. Print the cars in the garage: ");
            System.out.println("4. Get the price of the cars in the garage: ");

            input = new Scanner(System.in);
            System.out.println("Enter 1|2|3 (0 to exit): ");
             option = input.nextInt();

            if (option == 1){
                System.out.println("Fill in the car details below, Thank you.");
                String ame = input.nextLine();
                System.out.print("Enter Name: ");
                String name = input.nextLine();
                System.out.print("Enter Model: ");
                String model = input.nextLine();
                System.out.print("Enter Speed: ");
                double speed = input.nextDouble();
                System.out.print("Enter Price: ");
                double price = input.nextDouble();

                run.addCars(name, model, speed, price);
                System.out.println("Car added to the cars");
                System.out.println();
            }else if (option == 2){
                String ame = input.nextLine();
                System.out.print("Enter Name: ");
                String name = input.nextLine();

                run.removeCar(name);
            }else if (option == 3){
                run.printGarage();

            }else if (option == 4){
                run.totalValue();

            }else if (option == 0){

                System.out.println("Done!");
                break;
            }else {
                System.out.println("Please enter the right input 1|2|3 (0 to exit)");
                option = input.nextInt();
            }
        }
    }
}
