package com.corejava.basicsandcontrolflow.printprimenumber;

import java.util.Scanner;

public class PrintPrimeNumber {
    Scanner userInput = null;

    public PrintPrimeNumber() {
        userInput = new Scanner(System.in);

    }
    public void printPrimeNumber() {
        System.out.println("---------------- Print Prime Numbers ----------------");
        System.out.print("Enter Number To Print Prime Numbers Upto: ");
        int input = userInput.nextInt();

        if (input > 1) {
            System.out.print("Prime Numbers are: ");
            for (int i = 2; i <= input; i++) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) { // check only till sqrt(i)
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } else {
            System.out.println("No prime numbers exist below 2.");
        }
    }
}
