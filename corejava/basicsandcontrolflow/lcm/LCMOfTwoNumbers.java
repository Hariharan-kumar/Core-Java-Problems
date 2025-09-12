package com.corejava.basicsandcontrolflow.lcm;

import java.util.Scanner;

public class LCMOfTwoNumbers {
    Scanner userInput = null;

    public LCMOfTwoNumbers() {
        userInput = new Scanner(System.in);

    }

    public void lcmOfTwoNumbers(){
        try{
            System.out.println("----------- LCM of Two Numbers  -----------");
            System.out.print("Enter First Value: ");
            int value1 = userInput.nextInt();
            System.out.print("Enter Second Value: ");
            int value2 = userInput.nextInt();

            System.out.println("LCM Of Two Value Is : " + (value1 * value2)/gcdFind(value1,value2));

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public int gcdFind(int a,int b){

        while (b !=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

}
