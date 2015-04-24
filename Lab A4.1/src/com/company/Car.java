package com.company;

/**
 * Created by Henry on 4/11/15.
 */
public class Car {

    // private instance variables
    private int myStartMiles;       // Starting odometer reading
    private int myEndMiles;         // Ending odometer reading
    private double myGallonsUsed;   // Gallons of gas used
    //"default" constructor
    public Car(){

    }

    //"normal" constructor
    public Car(int odometerReading){
    myStartMiles = odometerReading;
    }

    //"copy" constructor
    public Car(Car OtherCar){

    }

     //the car has just been filled up, set values accordingly
    public void fillUp(int odometerReading, double gals){
        myEndMiles = myStartMiles;
        myStartMiles = odometerReading;
        myGallonsUsed = gals;

    }

    //use private values to calculate MPG
    public double calculateMPG(){
        double MPG = (myStartMiles - myEndMiles)/myGallonsUsed;
        return MPG;
    }

    //if anybody asks, tell them what myStartMiles is
    public int getStartMiles(){
        return myStartMiles;
    }

    //if anybody asks, tell them what myEndMiles is
    public int getEndMiles(){
        return myEndMiles;
    }

     //if anybody asks, tell them what myGallonsUsed is
    public double getGallonsUsed(){
        return myGallonsUsed;

    }

}
