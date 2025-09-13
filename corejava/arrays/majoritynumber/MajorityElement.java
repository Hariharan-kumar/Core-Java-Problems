package com.corejava.arrays.majoritynumber;

import java.util.Arrays;
import java.util.Scanner;

public class MajorityElement {
    Scanner userInput = null;

    public MajorityElement() {
        userInput = new Scanner(System.in);
    }

    public void majorityElements() {
        try {
            System.out.println("----------- Find Majority Element -----------");
            int[] nums = {2, 1, 1, 4, 2, 1, 5};
            int count1 = 0, count2 = 0, majority = -1;
            System.out.println("Array Values: " + Arrays.toString(nums));

            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        count1++;
                    }
                }
                if (count1 > count2) {
                    majority = nums[i];
                    count2 = count1;
                }
                count1 = 0;
            }

            System.out.println("Majority Element : " +majority );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
