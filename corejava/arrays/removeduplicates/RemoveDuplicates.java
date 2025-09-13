package com.corejava.arrays.removeduplicates;

import java.util.*;

public class RemoveDuplicates {
    Scanner userInput = null;

    public RemoveDuplicates() {
        userInput = new Scanner(System.in);
    }

    public void removeDuplicates(){
        try{
            System.out.println("----------- Rotate Array  -----------");
            int[] duplicateArray = {1,1,2,3,4,1,2,5};
            System.out.println("The Array List : " + Arrays.toString(duplicateArray));
            Set<Integer> uniqueArray = new HashSet<>();
            Arrays.stream(duplicateArray).forEach(val -> uniqueArray.add(val) );
            System.out.println("Without Duplicates List : " + uniqueArray.toString());


        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
