package com.corejava.armstrong;

import java.util.Scanner;

public class ArmstrongNumber {
    Scanner userInput = null;

    public ArmstrongNumber() {
        userInput = new Scanner(System.in);

    }
    public void armstrongNumber(){
        try {
            System.out.println("---------------- Armstrong ----------------");
            System.out.print("Enter Any Value To Check Armstrong or Not : ");
            int original = userInput.nextInt();
            int sum = 0,holdValue = original ,digits =String.valueOf(original).length();

            while (original > 0){
                int digit = original % 10;
                sum += Math.pow(digit,digits);
                original = original /10;
            }
            if(sum == holdValue){
                System.out.println("The entered value is Armstrong");
            }else{
                System.out.println("The entered value is not Armstrong");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
