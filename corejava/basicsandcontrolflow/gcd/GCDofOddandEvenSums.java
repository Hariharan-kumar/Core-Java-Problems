package com.corejava.basicsandcontrolflow.gcd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GCDofOddandEvenSums {

    Scanner userInput = null;

    public GCDofOddandEvenSums() {
        userInput = new Scanner(System.in);

    }
    public  void gcdOfOddandEvenNumbers(){
        System.out.println("----------- GCD of Odd and Even Sums  -----------");
        System.out.print("Enter Value : ");
        int value = userInput.nextInt();
        int oddSum=1,evenSum=2,odd=0,even=0;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(oddSum);
        list2.add(evenSum);

        for(int i=0;i<value;i++){
            list1.add( oddSum+=2);
            list2.add( evenSum+=2);
            odd+=list1.get(i);
            even+=list2.get(i);

        }
        System.out.println("Odd Value : "+odd);
        System.out.println("Even Value : "+even);
        while(even !=0){
            int temp = even;
            even = odd % even;
            odd = temp;
        }
        System.out.println("GCD Of Value "+oddSum+" "+ evenSum+" is : "+odd);
    }
}
