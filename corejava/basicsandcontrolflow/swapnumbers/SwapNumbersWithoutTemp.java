package com.corejava.basicsandcontrolflow.swapnumbers;

import java.util.Scanner;

public class SwapNumbersWithoutTemp {
    Scanner userInput = null;

    public SwapNumbersWithoutTemp() {
        userInput = new Scanner(System.in);

    }
    public void swapNumbers(){
        try{
            System.out.println("----------- Swap Numbers Without Temp -----------");
            System.out.print("Enter First Value: ");
            int value1 = userInput.nextInt();
            System.out.print("Enter Second Value: ");
            int value2 = userInput.nextInt();
            System.out.println("Before Swap : Value 1 - "+value1+" Value 2 - "+value2);
            value1= value1+value2;
            value2 = value1- value2;
            value1 =value1-value2;
            System.out.println("After Swap : Value 1 - "+value1+" Value 2 - "+value2);


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
