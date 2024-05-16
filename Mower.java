import java.util.*;
/*
# Name: Dashawn Richardson
         # Date: 3/24/2024
         # create a Java application that will be used to inventory mowers in a mower store.
         In addition to the classes that store the mower data, you will search the inventory based on the type of mower.
         Give the code for Mower
 properly created the class
*/

public abstract class Mower {
    //variables
    private String manufacturer;
    private int year;

    private String serialNumber;
// 2  constructors one with param
    public Mower(){
        manufacturer =null;
        year = 0;
        serialNumber =null;

    }
    public Mower(String manufacturer, int year, String serialNumber){
        this.manufacturer = manufacturer;
        this.year = year;
        this.serialNumber = serialNumber;
    }
//getters and setters
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
//toString
    @Override
    public String toString() {
        return getManufacturer() + "\n" + getYear()+ "\n" +getSerialNumber()+"\n#";
    }
}
