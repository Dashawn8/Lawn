import java.util.*;
/*
# Name: Dashawn Richardson
         # Date: 3/24/2024
         # create a Java application that will be used to inventory mowers in a mower store.
         In addition to the classes that store the mower data, you will search the inventory based on the type of mower.
         Give the code for engine
 properly created the class
*/
public class Engine  {
    //variables
    private String manufacturer;
    private double hoursePower;

    private int cylinders;
//2 constuctors oned take in parameters
    public Engine(){

    }
    public Engine(String manufacturer,double horsePower,int cylinders ){
        this.manufacturer = manufacturer;
        this.cylinders = cylinders;
        this.hoursePower = horsePower;

    }
//getter and setters
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getHoursePower() {
        return hoursePower;
    }

    public void setHoursePower(double hoursePower) {
        this.hoursePower = hoursePower;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
//toString
    @Override
    public String toString() {
        return getManufacturer() +
                "\n" + getHoursePower() +
                "\n" + getCylinders();
    }
}
