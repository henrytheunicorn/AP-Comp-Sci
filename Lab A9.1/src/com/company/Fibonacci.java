package com.company;

/**
 * Created by Henry on 5/2/15.
 */
public class Fibonacci {

    public Fibonacci(){

    }
    public int fibNumber (int x){

        if (x == 0){
            return 0;
        }
        else if (x==1){
            return 1;
        }
        else {
            return fibNumber(x-1) + fibNumber(x-2);
        }
    }
}
