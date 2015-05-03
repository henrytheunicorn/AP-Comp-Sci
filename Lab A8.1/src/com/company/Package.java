package com.company;

/**
 * Created by Henry on 5/2/15.
 */

import java.util.Scanner;

public class Package {
    double sideOne;
    double sideTwo;
    double sideThree;

    double dim1;
    double dim2;

    double length;
    double girth;
    double size = length + girth;
    double weight;

    public Package(){

    }

    public void getData(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter one dimension of package: ");
        sideOne = in.nextDouble();
        System.out.print("Enter second dimension of package: ");
        sideTwo = in.nextDouble();
        System.out.print("Enter third dimension of package: ");
        sideThree = in.nextDouble();
        System.out.print("Enter weight of package in lbs: ");
        weight = in.nextDouble();

        determineGirth();
        calculateSize();



        if (weight <= 70 && size <= 100){
           System.out.print("Package is acceptable to the U.S. Postal Service.");

        }
            else if (weight > 70 && size <= 100) {
                System.out.print("Package is too heavy.");

        }
            else if (weight <= 70 && size > 100){
                System.out.print("Package is too large.");

        }
            else {
                System.out.print("Package is too large and too heavy.");
        }
    }

    public void determineGirth(){
        if (sideOne >= sideTwo){
            if (sideOne >= sideThree){
                length = sideOne;
                dim1 = sideTwo;
                dim2 = sideThree;
            }
            else {
                length = sideThree;
                dim1 = sideTwo;
                dim2 = sideOne;
            }
        }
        else if (sideOne >= sideThree){
            if (sideOne >= sideTwo){
                length = sideOne;
                dim1 = sideTwo;
                dim2 = sideThree;
            }
            else {
                length = sideTwo;
                dim1 = sideOne;
                dim2 = sideThree;
            }
        }
        else if (sideTwo >= sideOne){
            if (sideTwo >= sideThree){
                length = sideTwo;
                dim1 = sideOne;
                dim2 = sideThree;
            }
            else {
                length = sideThree;
                dim1 = sideOne;
                dim2 = sideTwo;
            }
        }
        else if (sideTwo >= sideThree){
            if (sideTwo >= sideOne){
                length = sideTwo;
                dim1 = sideOne;
                dim2 = sideThree;
            }
            else {
                length = sideOne;
                dim1 = sideTwo;
                dim2 = sideThree;
            }
        }

        else if (sideThree >= sideOne){
            if (sideThree >= sideTwo){
                length = sideThree;
                dim1 = sideOne;
                dim2 = sideTwo;
            }
            else {
                length = sideTwo;
                dim1 = sideOne;
                dim2 = sideThree;
            }
        }
        else if (sideThree >= sideTwo){
            if (sideThree >= sideOne){
                length = sideThree;
                dim1 = sideOne;
                dim2 = sideTwo;
            }
            else {
                length = sideOne;
                dim1 = sideTwo;
                dim2 = sideThree;
            }
        }
        girth = 2*(dim1 + dim2);
    }
    public void calculateSize(){
    size = length + girth;

    }





}
