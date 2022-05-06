package Test.GarageAndcar;

/**
 * Garage class uses an array of Car objects to implement a garage. Contains
 * separate methods arrive() and depart(), each of which returns a String
 * showing the result of the operation.
 */

public class Garage {

    private static final int SIZE = 10; // to hold the size of the array
    private final Car cars[]; //variable that references an array of type Car
    private int count; // to hold the value of count

    /**
     * Constructor that creates array and initializes count.
     */

    public Garage()
    {

        cars = new Car[SIZE]; // initializing array

        count = 0; // setting current number of cars to 0
    }

    /**
     * Method to perform the arrival operation of a car.
     * @param licenseNumber for license number of the car
     * @return  the result of operation, in a String format
     */

    public String arrival(String licenseNumber)
    {

        if (count == cars.length)
        {
            // garage is full
            return "Garage is full, " + licenseNumber + " is not parked";
        }

        // creating a new car
        Car newCar = new Car();

        newCar.setName(licenseNumber);

        // adding to the end and updating count
        cars[count] = newCar;

        count++; // incrementing count

        // return success message
        return licenseNumber + " parked in the Garage";
    }

    /**
     * Method to perform the departure operation of a car.
     * @param licenseNumber for the license number of the car
     * @return the result of operation, in a String format
     */

    public String depart(String licenseNumber) {
        // creating a car
        Car c = new Car();

        c.setName(licenseNumber);

        // finding the index of car in the array
        int index = indexOf(c);

        if (index == -1)
        {
            // car not found
            return licenseNumber + " is not found in the Garage";
        }

        /*
         * simulating the movement of cars before the specified car out of
         * the garage
         */

        for (int i = 0; i < index; i++)
        {

            // incrementing move count
            cars[i].incrementCountOfMove();
        }

        // storing the car to be removed
        Car removed = cars[index];

        // shifting the remaining cars to occupy the vacant space in array
        for (int i = index; i < count - 1; i++)
        {
            cars[i] = cars[i + 1];
        }

        count--; // decreasing the count

        // returning removed car stats
        return removed.getLicenceNo() + " is departed from Garage,"

                + " number of moves made by this car: "

                + removed.getCountOfMove();
    }

    /**
     * A private helper method to find the index of a car c in the cars array.
     * @param c
     * Car object
     * @return  index if found, -1 if not found
     */

    private int indexOf(Car c)
    {
        for (int i = 0; i < count; i++)
        {
            if (cars[i].getLicenceNo().equals(c.getLicenceNo()))
            {
                return i;
            }
        }
        return -1; // car not found
    }
}