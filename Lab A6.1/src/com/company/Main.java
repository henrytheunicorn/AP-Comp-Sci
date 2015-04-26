package com.company;

import com.company.TaxPrinter;

public class Main {

    public static void main(String[] args) {
        TaxPrinter taxMachine = new TaxPrinter(30, 12.35);
        taxMachine.calculateTaxes();
        taxMachine.printPayAndTaxInfo();
    }
}
