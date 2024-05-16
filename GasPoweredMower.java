import java.util.*;
/*
# Name: Dashawn Richardson
         # Date: 3/24/2024
         # create a Java application that will be used to inventory mowers in a mower store.
         In addition to the classes that store the mower data, you will search the inventory based on the type of mower.
         Give the code for gasPowered Mower
 properly created the class
*/

public class GasPoweredMower extends WalkBehindMower {
//variables
    private Engine engine;
    private boolean selfPropelled;
//costructor
    public GasPoweredMower(){

    }
//getter and setters
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public boolean isSelfPropelled() {
        return selfPropelled;
    }

    public void setSelfPropelled(boolean selfPropelled) {
        this.selfPropelled = selfPropelled;
    }
//toString
    @Override
    public String toString() {
        return getManufacturer() + "\n" + getYear()+ "\n" +getSerialNumber() +"\nG\n" +getCutWidth()+"\n"+getWheelDiameter()+"\n" + getEngine() + "\n" + isSelfPropelled();
    }
}
