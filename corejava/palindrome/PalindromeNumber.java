package com.corejava.palindrome;

import java.util.Scanner;

public class PalindromeNumber {
    Scanner userInput = null;

    public PalindromeNumber() {
        userInput = new Scanner(System.in);

    }
    public void palindrom() {
        try {
            System.out.println("---------------- Palindrome ----------------");
            System.out.print("Enter Any Value To Analyze Palindrome or Not : ");
            String original = userInput.next();
            String reversed = new StringBuilder(original).reverse().toString();

            if (original.equals(reversed)) {
                System.out.println("The Entered Value Is Palindrome");
            } else {
                System.out.println("The Entered Value Is Not Palindrome");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

