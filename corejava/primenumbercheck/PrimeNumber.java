package com.corejava.primenumbercheck;

import java.util.Scanner;

public class PrimeNumber {
    Scanner userInput = null;

    public PrimeNumber() {
        userInput = new Scanner(System.in);

    }

    public void primeNumber() {
        System.out.println("----------- Prime Numbers -----------");
        System.out.print("Enter Integer to Check Prime or Not: ");
        int input = userInput.nextInt();
        int count = 0;
        if (input > 0) {
            if (input < 1) {
                System.out.println("The Number is Not Prime");
            }
            if (input == 2) {
                System.out.println("The Number is Prime");
            } else {
                boolean isPrime = true;
                System.out.println("Math Sqrt : "+ Math.sqrt(input));
                for (int i = 2; i <= Math.sqrt(input); i++) {
                    if (input % i == 0)
                        isPrime = false;
                }
                if (isPrime) {
                    System.out.println("The Number is Prime");
                } else {
                    System.out.println("The Number is Not Prime");
                }
            }

        } else {
            System.out.println("The Number is Not Prime");
        }


    }


}
