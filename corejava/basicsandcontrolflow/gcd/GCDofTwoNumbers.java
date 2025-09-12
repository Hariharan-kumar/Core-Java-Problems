package com.corejava.basicsandcontrolflow.gcd;

import java.util.Scanner;

public class GCDofTwoNumbers {
    Scanner userInput = null;

    public GCDofTwoNumbers() {
        userInput = new Scanner(System.in);

    }

    public void gcdOfTwoNumbers(){
        System.out.println("----------- GCS Of Two Numbers  -----------");
        System.out.print("Enter First Value: ");
        int value1 = userInput.nextInt();
        System.out.print("Enter Second Value: ");
        int value2 = userInput.nextInt();
        System.out.print("GCD Of Two Numbers as : ");
        while (value2 !=0){
            int temp = value2;
            value2 = value1 % value2;
            value1=temp;
        }
        System.out.println(value1);

    }
}
