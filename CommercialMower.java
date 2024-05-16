
/*
# Name: Dashawn Richardson
         # Date: 3/24/2024
         # create a Java application that will be used to inventory mowers in a mower store.
         In addition to the classes that store the mower data, you will search the inventory based on the type of mower.
         Give the code for commercialMower
 properly created the class
*/
public  class CommercialMower extends LawnTractor {
//variables
    private double operatingHours;

    private boolean zeroTurnRadius;
//constructors
    public CommercialMower(){

    }
    //getters and setters
    public double getOperatingHours() {
        return operatingHours;
    }

    public void setOperatingHours(double operatingHours) {
        this.operatingHours = operatingHours;
    }

    public boolean isZeroTurnRadius() {
        return zeroTurnRadius;
    }

    public void setZeroTurnRadius(boolean zeroTurnRadius) {
        this.zeroTurnRadius = zeroTurnRadius;
    }
//toString
    @Override
    public String toString() {
        return getManufacturer() + "\n" + getYear() + "\n" + getSerialNumber()+ "\nC\n" +getEngine()+ "\n" +getModel()+ "\n" +getDeckWidth()
                + "\n" +getOperatingHours()+ "\n" + isZeroTurnRadius();
    }
}
