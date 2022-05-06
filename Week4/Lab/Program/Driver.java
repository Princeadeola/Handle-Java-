package Week4.Lab.Program;

import java.util.ArrayList;

public class Driver {
    public Car aCar;
    public ArrayList<Car> garage = new ArrayList<>();

    public void addCars(String name, String model, double speed, double price) {
        aCar = new Car();
        aCar.setName(name);
        aCar.setModel(model);
        aCar.setSpeed(speed);
        aCar.setPrice(price);

        garage.add(aCar);
    }

    public void printGarage(){
        for (Car g : garage ) {
            System.out.println("Total car in garage: " + garage.size());
            System.out.println(g);
        }
    }

    public void removeCar(String name){
        int count = garage.size();
        for (Car n: garage) {
            if (name.equals(n.getName())){
                garage.remove(name);
                count--;
                System.out.println(name + " has been removed");
                System.out.println("Cars left in the garage is " + count);
            }
        }
    }
    public void totalValue(){
        for (Car g : garage ) {
            System.out.println(g.getName() +  " is worth $" + g.getPrice());
        }
    }
}
