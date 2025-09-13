package com.corejava.arrays.rotatearray;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {

    Scanner userInput = null;

    public RotateArray() {
        userInput = new Scanner(System.in);
    }

    public void rotateArray(int nums[]){
        try{
            System.out.println("----------- Rotate Array  -----------");
                       System.out.print("Enter Number to Move Array Steps: ");
            int steps = userInput.nextInt();
            int size = nums.length;
            int[] rotatedArray = new int[size];
            System.out.println("Before Value Rotated : "+Arrays.toString(nums));
           if(steps< size){
               for(int i = 0;i<size;i++){
                   rotatedArray[(i+steps) % size]=nums[i];
               }
               System.out.println("After Value Rotated : "+Arrays.toString(rotatedArray));
            }else {
                System.out.println("Please enter number under array length");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
