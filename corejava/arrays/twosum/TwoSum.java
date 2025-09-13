package com.corejava.arrays.twosum;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {

    Scanner userInput = null;

    public TwoSum() {
        userInput = new Scanner(System.in);
    }

    public void twoSum(){
        try{
            System.out.println("----------- Rotate Array  -----------");
            int[] value = {3,4,2,4,6,8,9};
            System.out.println("The Array List : " + Arrays.toString(value));
            System.out.print("Enter target : ");
            int target = userInput.nextInt();
            int first =0;
            int[] sum = new int[2] ;
            boolean found = false;
            for(int i=0;i<value.length;i++){
                first =value[i];
                for(int j=1;j<value.length;j++){
                    if(first+value[j]==target){
                        sum[0] = first;
                        sum[1] =value[j];
                        found = true;
                        break;
                    }
                    if (found) break;
                }
            }
            if(found)
                System.out.println("The Two Sum Matched Value Is : " + Arrays.toString(sum));
            else
                System.out.println("The Two Sum Matched Value Is Not There");
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
