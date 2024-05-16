//import java.util.*;
///*
//# Name: Dashawn Richardson
//         # Date: 3/24/2024
//         # create a Java application that will be used to inventory mowers in a mower store.
//         In addition to the classes that store the mower data, you will search the inventory based on the type of mower.
//         Give the code for walkbehind mower
// properly created the class
//*/
public abstract class WalkBehindMower extends Mower {
    //variables
    private double cutWidth;
    private double wheelDiameter;
    //costructors
    public WalkBehindMower(){

    }
//getters and setters
    public double getCutWidth() {
        return cutWidth;
    }

    public void setCutWidth(double cutWidth) {
        this.cutWidth = cutWidth;
    }

    public double getWheelDiameter() {
        return wheelDiameter;
    }

    public void setWheelDiameter(double wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }
//toString
    @Override
    public String toString() {
        return getManufacturer() + "\n" + getYear()+ "\n" +getSerialNumber()+"\n#"+"\n"+getCutWidth()+"\n"+getWheelDiameter();
    }
}
