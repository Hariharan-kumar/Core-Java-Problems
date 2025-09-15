package com.corejava.arrays.mergearray;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    public void mergeTwoSortedArray(){
        System.out.println("----------- Merge Two Sorted Arrays   -----------");
        int[] a1 = {0,1,3,5};
        int[] a2 = {2,4,6};
        System.out.println("The First Array : " + Arrays.toString(a1));
        System.out.println("The Second Array : " + Arrays.toString(a2));
       int i = 0,j=0,k=0,n1 = a1.length,n2=a2.length;

       int[] mergedSortedArray = new int[n1+n2];
       while (i < n1 && j < n2){
           if(a1[i]<=a2[j]){
               mergedSortedArray[k++] = a1[i++];
           }else{
               mergedSortedArray[k++] = a2[j++];
           }
       }
       while (i<n1){
           mergedSortedArray[k++]=a1[i++];
       }
       while (j<n2){
           mergedSortedArray[k++] = a2[j++];
       }
        System.out.println("Merged Array Is : "+ Arrays.toString(mergedSortedArray));

    }
}
