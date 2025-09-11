package com.corejava.leapyear;

import java.util.Scanner;

public class LeapYearCheck {
    Scanner userInput = null;

    public LeapYearCheck() {
        userInput = new Scanner(System.in);
    }
    public void leapYearCheck(){
        try {
            System.out.println("----------- Leap Year Check  -----------");
            System.out.print("Enter any words o find number of vowels and consonants: ");
            int year = userInput.nextInt();
            if(year % 4 ==0 && year % 100 == 0){
                System.out.println("Entered year is leap");
            }else{
                System.out.println("Entered year is not leap");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
