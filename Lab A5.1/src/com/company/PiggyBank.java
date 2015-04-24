package com.company;

/**
 * Created by Henry on 4/23/15.
 */
public class PiggyBank {
    private double pennies;
    private double nickles;
    private double dimes;
    private double quarters;
    private double halfDollars;
    private double dollars;


    public PiggyBank(){ // default constructor
        pennies = 0;
        nickles = 0;
        dimes = 0;
        quarters = 0;
        halfDollars = 0;
        dollars = 0;
    }

    public PiggyBank(double numPennies, double numNickles, double numDimes, double numQuarters, double numHalfDollars, double numDollars ) {
        pennies = numPennies;
        nickles = numNickles;
        dimes = numDimes;
        quarters = numQuarters;
        halfDollars = numHalfDollars;
        dollars = numDollars;
    }

    public double getNumOfPennies(){
        return pennies;
    }

    public double getNumOfNickles(){
        return nickles;
    }

    public double getNumOfDimes(){
        return dimes;
    }

    public double getNumOfQuarters(){
        return quarters;
    }

    public double getNumOfHalfDollars(){
        return halfDollars;
    }

    public double getNumOfDollars(){
        return dollars;
    }

    public void depositPennies(double newPennies){
        pennies += newPennies;
    }

    public void depositNickles(double newNickles){
        nickles += newNickles;
    }

    public void depositDimes(double newDimes){
        dimes += newDimes;
    }

    public void depositQuarters(double newQuarters){
       quarters += newQuarters;
    }

    public void depositHalfDollars(double newHalfDollars){
       halfDollars += newHalfDollars;
    }

    public void depositDollars(double newDollars){
        dollars += newDollars;
    }

    public double getValue(){
        double pigValue = pennies + nickles*5 + dimes*10 + quarters*25 + halfDollars*50 + dollars*100;
        pigValue /= 100;
        return pigValue;
    }

    public void printPiggyBank(){
        System.out.println("Number of Pennies: " + pennies);
        System.out.println("Number of Nickels: " + nickles);
        System.out.println("Number of Dimes: " + dimes);
        System.out.println("Number of Quarters: " + quarters);
        System.out.println("Number of Half-Dollars: " + halfDollars);
        System.out.println("Number of Dollar Bills:" + dollars);

        System.out.println("Total Value of Piggy Bank: " + getValue());
    }



}
