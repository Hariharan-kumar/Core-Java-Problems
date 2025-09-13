package com.corejava.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindMissingNumber {
    Scanner userInput = null;

    public FindMissingNumber() {
        userInput = new Scanner(System.in);
    }

    public void findMissingNumber(int[] nums){
        try{
            System.out.println("----------- Find Missing Number  -----------");
            int length = nums.length;
            System.out.print("Missing Number Is : " );
            boolean isContain=false;
            for(int i =0; i<=length;i++){
                for(int j=0;j<nums.length;j++){
                    if(nums[j]==i){
                        isContain =true;
                        continue;
                    }
                }
                if(isContain==false){
                    System.out.print(i +" ");
                }
                isContain = false;

            }
            System.out.println();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
