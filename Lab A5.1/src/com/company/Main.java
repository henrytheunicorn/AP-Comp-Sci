package com.company;

import com.company.PiggyBank;

public class Main {

    public static void main(String[] args) {
	    PiggyBank BofA = new PiggyBank(10, 10, 10, 10, 10, 40);
        BofA.printPiggyBank();
        BofA.depositHalfDollars(29);
        BofA.printPiggyBank();
        BofA.depositNickles(193);
        BofA.printPiggyBank();
    }
}
