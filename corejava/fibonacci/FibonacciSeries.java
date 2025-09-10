package com.corejava.fibonacci;

import java.util.Scanner;

public class FibonacciSeries {

    Scanner userInput = null;

    public FibonacciSeries() {
        userInput = new Scanner(System.in);

    }
    public void fibonacciSeries(int target){
        try{
            int start1 = 0,start2 = 1,sum=1;
            if ( target ==1 || target ==0){
                System.out.println("Fibonacci Value is : "+ target);
            }
           else {
                for (int i = 2; i <= target; i++) {
                    System.out.print(start1 + " ");
                                       int next = start1 + start2;
                    start1 = start2;
                    start2 = next;
                }
                System.out.println(" - Fibonacci Value is : " + start2);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
