package Week4.Meet;

public class Cafe {

    private String name;
    private int caffeine;
    private double price;

    // An empty constructor with default parameters
    public Cafe(){
        name = "Coffee";
        caffeine = 100;
        price = 1.50;
    }
    // Another constructor that receive the parameters
    public Cafe(String n, int c, double p){
        name = n;
        caffeine = c;
        price = p;
    }

    // getters of each declared variables

    public String getName(){
        return name;
    }
    public int getCaffeine(){
        return caffeine;
    }
    public double getPrice(){
        return price;
    }

    // a toString method that prints the name, caffeine and price
    public String toString(){
        return (name + ", " + caffeine + "mg of caffeine at $" + price);
    }
}
