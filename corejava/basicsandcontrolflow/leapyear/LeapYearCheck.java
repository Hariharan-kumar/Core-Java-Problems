package com.corejava.basicsandcontrolflow.leapyear;

import java.util.Scanner;

public class LeapYearCheck {
    Scanner userInput = null;

    public LeapYearCheck() {
        userInput = new Scanner(System.in);
    }
    public void leapYearCheck(){
        try {
            System.out.println("----------- Leap Year Check  -----------");
            System.out.print("Enter any year to check leap or not: ");
            int year = userInput.nextInt();
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println("Entered year is leap");
            }else{
                System.out.println("Entered year is not leap");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
