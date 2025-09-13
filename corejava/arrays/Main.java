package com.corejava.arrays;



import com.corejava.arrays.findmissingnumber.FindMissingNumber;
import com.corejava.arrays.majoritynumber.MajorityElement;
import com.corejava.arrays.removeduplicates.RemoveDuplicates;
import com.corejava.arrays.rotatearray.RotateArray;
import com.corejava.arrays.twosum.TwoSum;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        arrayProblems();
    }
    static void arrayProblems(){
        try {
            Scanner userInput = new Scanner(System.in);
            System.out.println("************** Arrays Problems **************");
            System.out.println("1.Find Missing Integer " +
                    "\n2.Rotate Array"+
                    "\n3.Majority Element"+
                    "\n4.Remove Duplicates"+
                    "\n5.Two Sum");
            System.out.print("Which Problem You Want to Run Enter Index Number : ");
            int choice = userInput.nextInt();
            switch (choice) {
                case 1:
                    FindMissingNumber findMissingNumber = new FindMissingNumber();
                    int[] num = {1,2,3,4,6};
                    findMissingNumber.findMissingNumber(num);
                    break;
                case 2:
                    RotateArray rotate = new RotateArray();
                    int[] nums = {1,2,3,4,6};
                    rotate.rotateArray(nums);
                    break;
                case 3:
                    MajorityElement majority = new MajorityElement();
                    majority.majorityElements();
                    break;
                case 4:
                    RemoveDuplicates duplicate = new RemoveDuplicates();
                    duplicate.removeDuplicates();
                    break;
                case 5:
                    TwoSum sum = new TwoSum();
                    sum.twoSum();
                    break;

                default:
                    System.out.println("Enter Valid Index Number");

            }
            arrayProblems();
            userInput.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        }
}
