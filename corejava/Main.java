package com.corejava;

import com.corejava.armstrong.ArmstrongNumber;
import com.corejava.factorial.FactorialUsingLoop;
import com.corejava.factorial.FactorialUsingRecursion;
import com.corejava.fibonacci.FibonacciSeries;
import com.corejava.palindrome.PalindromeNumber;
import com.corejava.primenumbercheck.PrimeNumber;
import com.corejava.reverseinteger.ReverseInteger;
import com.corejava.sumofdigits.SumofDigits;
import com.corejava.swapnumbers.SwapNumbersWithoutTemp;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        basicProblems();

    }

    static void basicProblems(){
        try {
              Scanner userInput =  new Scanner(System.in);
            System.out.println("************** Basic & Control Flow Problems **************");
            System.out.println("1.Reverse Integer " +
                    "\n2.Palindrome " +
                    "\n3.Armstrong " +
                    "\n4.FactorialUsingLoop " +
                    "\n5.FactorialUsingRecursion"+
                    "\n6.Fibonacci"+
                    "\n7.Sum Of Digits"+
                    "\n8.Swap Numbers Without Temp"+
                    "\n9.Prime Numbers");
            System.out.print("Which Problem You Want to Run Enter Index Number : ");
            int choice = userInput.nextInt();
            switch (choice){
                case 1:
                    ReverseInteger reverseInteger = new ReverseInteger();
                    reverseInteger.reverseInteger();
                    break;
                case 2:
                    PalindromeNumber palindromeNumber = new PalindromeNumber();
                    palindromeNumber.palindrom();
                    break;
                case 3:
                    ArmstrongNumber arms = new ArmstrongNumber();
                    arms.armstrongNumber();
                    break;
                case 4:
                    FactorialUsingLoop fact = new FactorialUsingLoop();
                    fact.factorialUsingLoop();;
                    break;
                case 5:
                    FactorialUsingRecursion factUsingRecursion = new FactorialUsingRecursion();
                    System.out.print("Enter value to find factorial : ");
                    System.out.println("Factorial Value is :" + factUsingRecursion.factorialUsingRecursion(userInput.nextInt()));
                    break;
                case 6:
                    FibonacciSeries fib = new FibonacciSeries();
                    System.out.print("Enter value to find fibonacci : ");
                    fib.fibonacciSeries(userInput.nextInt());
                    break;
                case 7:
                    SumofDigits sumofDigits = new SumofDigits();
                    sumofDigits.sumOfDigits();
                    break;
                case 8:
                    SwapNumbersWithoutTemp swap = new SwapNumbersWithoutTemp();
                    swap.swapNumbers();
                    break;
                case 9:
                    PrimeNumber prime = new PrimeNumber();
                    prime.primeNumber();
                    break;
                default:
                    System.out.println("Enter Valid Index Number");

            }
            basicProblems();
            userInput.close();
        }catch (Exception e){
            e.getMessage();
        }


    }

}
