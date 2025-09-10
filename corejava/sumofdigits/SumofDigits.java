package com.corejava.sumofdigits;

import java.util.Scanner;

public class SumofDigits {

    Scanner userInput = null;

    public SumofDigits() {
        userInput = new Scanner(System.in);

    }
    public void sumOfDigits(){
        System.out.println("----------- SUM OF DIGITS -----------");
        System.out.print("Enter Value to find sum of value: ");
        int value = userInput.nextInt();
        int sum = 0;
        String convertedValue = String.valueOf(value);
        for(int i = 0; i<convertedValue.length();i++){
            sum += value %10;
            value /=10;
        }
        System.out.println("Sum Of Digit Value Is: " + sum);

    }
}
