
/*
# Name: Dashawn Richardson
         # Date: 3/24/2024
         # create a Java application that will be used to inventory mowers in a mower store.
         In addition to the classes that store the mower data, you will search the inventory based on the type of mower.
         Give the code for storeMower
 properly created the class
*/
import java.util.Scanner;
import java.util.*;
public class storeMower {

    public static void main(String [] args) {
//scanner and declaration of mower
        MowerWareHouse mower = new MowerWareHouse();
        Scanner scanner = new Scanner(System.in);
    //print table and call my read mower to have my data read
        System.out.println("Enter your choice of Mower to get information.");
        System.out.println("Type C for Commercial Mower, G for Gas Powered Mower, P for Push reel Mower, L for Lawn Tractor, and S to stop");
        mower.readMowerData("src//mower.txt");

        //take their choice
        String letter = scanner.nextLine();

        //call mower array-this got fix my the next comment just leaving this for when i review my code
        //switch case of the elements by indiviudallity by calling the enhanced for loop into the mower "General Array"
            switch (letter) {
                case "C":
                    for (CommercialMower commercialMower : mower.getCommercialMowers()) {
                       System.out.println(commercialMower);
                    }
                    break;
                case "G":
                    for(GasPoweredMower gasPoweredMower: mower.getGasPoweredMowers()){
                        System.out.println(gasPoweredMower);
                    }
                    break;
                case "P":
                    for(PushReelMower pushReelMower: mower.getPushReelMowers()){
                        System.out.println(pushReelMower);
                    }
                    break;
                case "L" :
                    for(LawnTractor lawnTractor: mower.getLawnTractors()){
                        System.out.println(lawnTractor);
                    }
                case "S":
                    break;
                }
            mower.saveMowerData("src//mower.txt");

       // }
    }
}
