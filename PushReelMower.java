import java.util.*;
/*
# Name: Dashawn Richardson
         # Date: 3/24/2024
         # create a Java application that will be used to inventory mowers in a mower store.
         In addition to the classes that store the mower data, you will search the inventory based on the type of mower.
         Give the code for push reel mower
 properly created the class
*/
public class PushReelMower extends WalkBehindMower{
    //intialize variables
    private int numWheels;
    //costructor
    public PushReelMower(){
    }
//getter and setters
    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }
//toString get all my methods and mutators
    @java.lang.Override
    public java.lang.String toString() {
        return getManufacturer() +"\n"+ getYear() +"\n"+
                getSerialNumber() +"\n" + "P\n"+getCutWidth() + "\n"+ getWheelDiameter()+
                "\n"+getNumWheels();
    }

}
