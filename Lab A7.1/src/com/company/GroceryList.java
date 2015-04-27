package com.company;

/**
 * Created by Henry on 4/26/15.
 */

import java.util.Scanner;

public class GroceryList {
    double firstItem;
    double secondItem;
    double thirdItem;
    double fourthItem;
    double fifthItem;
    double totalCost;

    public GroceryList(){
    }

    public void getGroceryList(){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter cost of Item #1:");
        firstItem = in.nextDouble();
        System.out.print("Enter cost of Item #2:");
        secondItem = in.nextDouble();
        System.out.print("Enter cost of Item #3:");
        thirdItem = in.nextDouble();
        System.out.print("Enter cost of Item #4:");
        fourthItem = in.nextDouble();
        System.out.print("Enter cost of Item #5:");
        fifthItem = in.nextDouble();
        System.out.println();
        System.out.println("Grocery list created. Your receipt will now be created.");
        System.out.println();

    }

    public void getReceipt(){
        System.out.printf("%11s %10s %11s", "Item:", "Cost:", "Total:");
        System.out.println();

        totalCost = firstItem;
        System.out.printf("%11s %10.2f %11.2f", "#1", firstItem, totalCost);
        System.out.println();

        totalCost += secondItem;
        System.out.printf("%11s %10.2f %11.2f", "#2", secondItem, totalCost);
        System.out.println();

        totalCost += thirdItem;
        System.out.printf("%11s %10.2f %11.2f", "#3", thirdItem, totalCost);
        System.out.println();

        totalCost += fourthItem;
        System.out.printf("%11s %10.2f %11.2f", "#4", fourthItem, totalCost);
        System.out.println();

        totalCost += fifthItem;
        System.out.printf("%11s %10.2f %11.2f", "#5", fifthItem, totalCost);
        System.out.println();
        System.out.println();
        System.out.print("Receipt successfully created.");

    }


}
