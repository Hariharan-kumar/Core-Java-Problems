package com.corejava.factorial;

import java.util.Scanner;

public class FactorialUsingRecursion {
    Scanner userInput = null;
    int sum;

    public FactorialUsingRecursion() {
        userInput = new Scanner(System.in);
         sum = 1;
    }
    public int factorialUsingRecursion(int target){

        if(target > 0){
            this.sum *=target;
            factorialUsingRecursion( --target);
        }
        return sum;
    }
}
