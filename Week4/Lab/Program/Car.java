package Week4.Lab.Program;

public class Car {
    private String name;
    private String model;
    private double speed;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car Added is " +
                "Name='" + name + '\'' +
                ", Model='" + model + '\'' +
                ", Speed=" + speed +
                "km/h, Price=$" + price;
    }
}
