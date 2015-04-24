package com.company;


import com.company.Car;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car Taco = new Car(15);
        System.out.println("Car initial odometer reading is: " + Taco.getStartMiles());
        System.out.println();

        System.out.println("Filling Station Visit #1");
        System.out.println("odometer reading 150");
        System.out.println("gallons to fill tank 8.0");
        Taco.fillUp(150, 8.0);
        System.out.println("Miles per gallon: " + Taco.calculateMPG());
        System.out.println();

        System.out.println("Filling Station Visit #2");
        System.out.println("odometer reading 350");
        System.out.println("gallons to fill tank 10.0");
        Taco.fillUp(350, 10.0);
        System.out.println("Miles per gallon: " + Taco.calculateMPG());
        System.out.println();

        System.out.println("Filling Station Visit #3");
        System.out.println("odometer reading 450");
        System.out.println("gallons to fill tank 20.0");
        Taco.fillUp(450, 20.0);
        System.out.println("Miles per gallon: " + Taco.calculateMPG());
        System.out.println();

        System.out.println("Filling Station Visit #4");
        System.out.println("odometer reading 603");
        System.out.println("gallons to fill tank 25.5");
        Taco.fillUp(603, 25.5);
        System.out.println("Miles per gallon: " + Taco.calculateMPG());

    }
}
