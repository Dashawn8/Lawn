import java.util.*;
/*
# Name: Dashawn Richardson
         # Date: 3/24/2024
         # create a Java application that will be used to inventory mowers in a mower store.
         In addition to the classes that store the mower data, you will search the inventory based on the type of mower.
         Give the code for lawnTractor
 properly created the class
*/
public class LawnTractor extends Mower {
//variables
    private Engine engine;
    private String model;

    private double deckWidth;
//constructors
    public LawnTractor(){

    }

    public Engine getEngine() {
        return engine;
    }
//getters and setters
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getDeckWidth() {
        return deckWidth;
    }

    public void setDeckWidth(double deckWidth) {
        this.deckWidth = deckWidth;
    }
//toString
    @Override
    public String toString() {
         return getManufacturer() + "\n" + getYear()+ "\n" +getSerialNumber()+"\n L\n"+getEngine()+"\n"+ getModel() +"\n"+ getDeckWidth();
    }
}
