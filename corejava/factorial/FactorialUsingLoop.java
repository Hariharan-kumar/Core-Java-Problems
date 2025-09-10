package com.corejava.factorial;

import java.util.Scanner;

public class FactorialUsingLoop {

    Scanner userInput = null;

    public FactorialUsingLoop() {
        userInput = new Scanner(System.in);
    }
    public void factorialUsingLoop(){
        System.out.println("---------------- Factorial ----------------");
        System.out.print("Enter number to find factorial  : ");
        int original = userInput.nextInt();
        int sum = 1,value = original;
        for(int i = 0;original>i;i++){
            sum *= value;
            value--;
        }
        System.out.println("Factorial value is : " + sum);

    }
}
