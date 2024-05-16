import java.util.*;
/*
# Name: Dashawn Richardson
         # Date: 3/24/2024
         # create a Java application that will be used to inventory mowers in a mower store.
         In addition to the classes that store the mower data, you will search the inventory based on the type of mower.
         Give the code for MowerWareHouse
 properly created the class
*/
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MowerWareHouse {
//variables
    private String storeName;

    private ArrayList<Mower>mowers;
    private ArrayList<LawnTractor> lawnTractors;
    private ArrayList<CommercialMower> commercialMowers;
    private ArrayList<GasPoweredMower> gasPoweredMowers;
    private ArrayList<PushReelMower> pushReelMowers;
    //getters and setters of arrayList
    public ArrayList<LawnTractor> getLawnTractors() {
        return lawnTractors;
    }

    public void setLawnTractors(ArrayList<LawnTractor> lawnTractors) {
        this.lawnTractors = lawnTractors;
    }

    public ArrayList<CommercialMower> getCommercialMowers() {
        return commercialMowers;
    }

    public void setCommercialMowers(ArrayList<CommercialMower> commercialMowers) {
        this.commercialMowers = commercialMowers;
    }

    public ArrayList<GasPoweredMower> getGasPoweredMowers() {
        return gasPoweredMowers;
    }

    public void setGasPoweredMowers(ArrayList<GasPoweredMower> gasPoweredMowers) {
        this.gasPoweredMowers = gasPoweredMowers;
    }

    public ArrayList<PushReelMower> getPushReelMowers() {
        return pushReelMowers;
    }

    public void setPushReelMowers(ArrayList<PushReelMower> pushReelMowers) {
        this.pushReelMowers = pushReelMowers;
    }

    //Constructor
    public MowerWareHouse(){
        storeName = "";
        lawnTractors = new ArrayList<>();
        commercialMowers = new ArrayList<>();
        gasPoweredMowers = new ArrayList<>();
        pushReelMowers = new ArrayList<>();
        mowers = new ArrayList<>();
    }
//getters and setters
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public ArrayList<Mower> getMowers() {
        return mowers;
    }

    public void setMowers(ArrayList<Mower> mowers) {
        this.mowers = mowers;
    }
//reads in my data then seperates the data in to specifc mower objects into a arraylist of mower objexts
    //two arraylist are made for each the original mower then also the type of mower to make sure the object is obtainable
    public void readMowerData(String inputFileName){
        try{
            mowers = new ArrayList<>();
            File file = new File(inputFileName);
            Scanner scanner = new Scanner(file);
              storeName = scanner.nextLine();


            while(scanner.hasNext()){
                String manufacturer = scanner.nextLine();
                int year = Integer.parseInt(scanner.nextLine());
                String serialNum = scanner.nextLine();
                char choice = scanner.nextLine().charAt(0);
                setStoreName(storeName);
                if (choice =='L'){
                    LawnTractor obj1 = new LawnTractor();
                    obj1.setManufacturer(manufacturer);
                    obj1.setYear(year);
                    obj1.setSerialNumber(serialNum);
                    //setMower(obj1,manufacturer,year,serialNum);
                    String engMan = scanner.nextLine();
                    double horseP =Double.parseDouble(scanner.nextLine());
                    int cylind = Integer.parseInt(scanner.nextLine());
                    Engine engine = new Engine(engMan,horseP,cylind);
                    obj1.setEngine(engine);
                    String model = scanner.nextLine();
                    obj1.setModel(model);
                    double deck = Double.parseDouble(scanner.nextLine());
                    obj1.setDeckWidth(deck);
                    mowers.add(obj1);
                    lawnTractors.add(obj1);
                }else if(choice =='C'){
                    CommercialMower obj2 = new CommercialMower();
                    obj2.setManufacturer(manufacturer);
                    obj2.setYear(year);
                    obj2.setSerialNumber(serialNum);
                    //setMower(obj2,manufacturer,year,serialNum);
                    String engMan = scanner.nextLine();
                    double horseP = Double.parseDouble(scanner.nextLine());
                    int cylind = Integer.parseInt(scanner.nextLine());
                    Engine engine = new Engine(engMan,horseP,cylind);
                    obj2.setEngine(engine);
                    String model = scanner.nextLine();
                    obj2.setModel(model);
                    double deck = Double.parseDouble(scanner.nextLine());
                    obj2.setDeckWidth(deck);
                    double hours = Double.parseDouble(scanner.nextLine());
                    obj2.setOperatingHours(hours);
                    boolean zeroTurn = scanner.nextBoolean();
                    obj2.setZeroTurnRadius(zeroTurn);
                    mowers.add(obj2);
                    commercialMowers.add(obj2);
                    setStoreName(scanner.nextLine());
                    continue;
                }else if(choice =='G'){
                    double cutWidth = Double.parseDouble(scanner.nextLine());
                    double wheelDiam = Double.parseDouble(scanner.nextLine());
                    GasPoweredMower obj3 = new GasPoweredMower();
                    String engMan = scanner.nextLine();
                    double horseP = Double.parseDouble(scanner.nextLine());
                    int cylind = Integer.parseInt(scanner.nextLine());
                    Engine engine = new Engine(engMan,horseP,cylind);
                    obj3.setManufacturer(manufacturer);
                    obj3.setYear(year);
                    obj3.setSerialNumber(serialNum);
                    //setMower(obj3,manufacturer,year,serialNum);
                    obj3.setCutWidth(cutWidth);
                    obj3.setWheelDiameter(wheelDiam);
                    obj3.setEngine(engine);
                    boolean selfProp = scanner.nextBoolean();
                    obj3.setSelfPropelled(selfProp);
                    mowers.add(obj3);
                    addMower(obj3);
                    gasPoweredMowers.add(obj3);
                    setStoreName(scanner.nextLine());
                }else if(choice =='P'){
                    PushReelMower obj4 = new PushReelMower();
                    obj4.setManufacturer(manufacturer);
                    obj4.setYear(year);
                    obj4.setSerialNumber(serialNum);
                    //setMower(obj4,manufacturer,year,serialNum);
                    double cut = Double.parseDouble(scanner.nextLine());
                    double wheel = Double.parseDouble(scanner.nextLine());
                    obj4.setCutWidth(cut);
                    obj4.setWheelDiameter(wheel);
                    int numWheel = Integer.parseInt(scanner.nextLine());
                    obj4.setNumWheels(numWheel);
                    mowers.add(obj4);
                    pushReelMowers.add(obj4);
                }


            }
            //end of while loop
            //end of while loop
            scanner.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }//end of catch file

    }//end of method
    //saveMower data this saves my txt file
    public void saveMowerData(String outputFileName){
        try{
            FileWriter fileWriter = new FileWriter(outputFileName,true);
            PrintWriter out = new PrintWriter(fileWriter);
            out.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
//print to two string of eahc mower but instead it goes and get the two string of each indvidual mower ex: walkbehindMower
    @Override
    public String toString() {
       String s = "";
       for(int i = 0; i<mowers.size();i++){
           s += mowers.get(i).toString();
       }
        return getStoreName() + "\n" + s;
    }
    //add on getters and setters for test cases
    public String getEngine(){
        Engine e = new Engine();
       return e.toString();
    }
    public void setEngine(String man, double horse, int cyl){
        Engine e = new Engine(man,horse,cyl);

    }


    public int getNumMowers(){
        return mowers.size();
    }
    public Mower getMower(int num){
        return mowers.get(num);
    }
    public void setMower(int num, Mower mow){
        mowers.set(num,mow);
    }
    public void addMower(Mower item){
        mowers.add(item);
    }
    public Mower removeMower(int num){
        return mowers.remove(num);
    }
}
