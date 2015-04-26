package com.company;

/**
 * Created by Henry on 4/25/15.
 */
public class TaxPrinter {

    double workHours;
    double hourlyRatePay;
    double grossPay;
    double netPay;
    final double federalTax = .154;
    final double ficaTax = .0775;
    final double stateTax = .04;

    public TaxPrinter(double hoursWorked, double hourlyRatePaid){
        workHours = hoursWorked;
        hourlyRatePay = hourlyRatePaid;

    }

    public void calculateTaxes(){
        grossPay = workHours*hourlyRatePay;
        netPay = grossPay - (grossPay*federalTax + grossPay*ficaTax + grossPay*stateTax);
    }

    public void printPayAndTaxInfo(){
        System.out.println("Hours worked: " + workHours);
        System.out.println("Hourly rate: " + hourlyRatePay);
        System.out.println();

        System.out.println("Gross pay: " + grossPay);
        System.out.println();

        System.out.println("Federal Tax (" + federalTax*100 + ") : " + grossPay*federalTax);
        System.out.println("FICA Tax (" + ficaTax*100 + ") : " + grossPay*ficaTax);
        System.out.println("State Tax (" + stateTax*100 + ") : " + grossPay*stateTax);
        System.out.println();

        System.out.println("Net pay: " + netPay);
    }
}
