package com.corejava.reverseinteger;

import java.util.Scanner;

public class ReverseInteger {
    Scanner userInput = null;

    public ReverseInteger() {
        userInput = new Scanner(System.in);

    }

    public void reverseInteger() {
        try {
            System.out.print("Enter Value to Reverse The Integer : ");
            int value = userInput.nextInt();
            boolean isNegative = value < 0 ? true : false;
            int absValue = Math.abs(value);
            long reversed = 0;
            System.out.print("Reversed Integer is :");
            while (absValue > 0) {
                int digit = absValue % 10;
                reversed = reversed * 10 + digit;
                absValue = absValue / 10;
            }
            reversed = isNegative ? -reversed : reversed;

            System.out.println(reversed);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input! Please enter a valid integer.");
        } finally {
            userInput.close();
        }

    }
}
