package com.corejava.vowels;

import java.util.Scanner;

public class CountVowels_Consonants {

    Scanner userInput = null;

    public CountVowels_Consonants() {
        userInput = new Scanner(System.in);
    }
    public void countVowels(){
        final char[] vowels = {'a','e','i','o','u'};
        try{
            System.out.println("----------- Count Vowels & Consonants  -----------");
            System.out.print("Enter any words o find number of vowels and consonants: ");
            String word = userInput.next();
            int vowelCount =0;
            char[] converted = word.toCharArray();
            for(int i = 0;i<converted.length;i++){
               for (int j = 0;j<vowels.length;j++){
                   if(vowels[j]==converted[i]){
                       vowelCount++;
                   }
               }
            }
            System.out.println("No of Vowels In this Word : "+vowelCount);
            System.out.println("No of Consonants In this Word : "+(converted.length-vowelCount));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
