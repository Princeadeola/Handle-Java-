package Test.GarageAndcar;
/**
 * The Car class models a Car and will have private instance variables that
 * store the license number and number of times the car has been moved.
 */

public class Car
{
    private String licenceNo; // field to hold the license number of the car
    private int countOfMove; // field to hold the number of moves of the car

    /**
     * The setLicenceNo method accepts an argument that is stored in the
     * licenceNo field.
     * @param licenceNo holds the value of the argument passed to the method
     */

    public void setName(String licenceNo)
    {
        this.licenceNo = licenceNo; // setting value of license number
    }

    /**
     * The getLicenceNo method allows the other classes to get the value of
     * the licenceNo field.
     * @return the value stored in the licenceNo field
     */

    public String getLicenceNo()
    {
        return licenceNo; // returning licenseNo
    }

    /**
     * The getCountOfMove method allows the other classes to get the value
     * of countOfMove.
     * @return the value stored in the countOfMove field
     */

    public int getCountOfMove() {
        return countOfMove; // returning countOfMove
    }

    /**
     * Method to increment the number of moves.
     */

    public void incrementCountOfMove() {
        this.countOfMove++; // incrementing countOfMove
    }
}