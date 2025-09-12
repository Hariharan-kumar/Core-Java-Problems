package com.corejava.basicsandcontrolflow;

import com.corejava.basicsandcontrolflow.armstrong.ArmstrongNumber;
import com.corejava.basicsandcontrolflow.factorial.FactorialUsingLoop;
import com.corejava.basicsandcontrolflow.factorial.FactorialUsingRecursion;
import com.corejava.basicsandcontrolflow.fibonacci.FibonacciSeries;
import com.corejava.basicsandcontrolflow.lcm.LCMOfTwoNumbers;
import com.corejava.basicsandcontrolflow.leapyear.LeapYearCheck;
import com.corejava.basicsandcontrolflow.palindrome.PalindromeNumber;
import com.corejava.basicsandcontrolflow.reverseinteger.ReverseInteger;
import com.corejava.basicsandcontrolflow.sumofdigits.SumofDigits;
import com.corejava.basicsandcontrolflow.swapnumbers.SwapNumbersWithoutTemp;
import com.corejava.basicsandcontrolflow.vowels.CountVowels_Consonants;
import com.corejava.basicsandcontrolflow.gcd.GCDofOddandEvenSums;
import com.corejava.basicsandcontrolflow.gcd.GCDofTwoNumbers;
import com.corejava.basicsandcontrolflow.primenumbercheck.PrimeNumber;
import com.corejava.basicsandcontrolflow.printprimenumber.PrintPrimeNumber;

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
                    "\n9.Prime Numbers"+
                    "\n10.Print Prime Number"+
                    "\n11.GCD of Two Numbers"+
                    "\n12.GCD of Odd and Even Sums"+
                    "\n13.LCM Of Two Numbers"+
                    "\n14.Count Vowels & Consonants"+
                    "\n15.Leap Year Check");
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
                case 10:
                    PrintPrimeNumber primeNum = new PrintPrimeNumber();
                    primeNum.printPrimeNumber();
                    break;
                case 11:
                    GCDofTwoNumbers gcd = new GCDofTwoNumbers();
                    gcd.gcdOfTwoNumbers();
                    break;
                case 12:
                    GCDofOddandEvenSums gcDofOddandEvenSums = new GCDofOddandEvenSums();
                    gcDofOddandEvenSums.gcdOfOddandEvenNumbers();
                    break;
                case 13:
                    LCMOfTwoNumbers lcm = new LCMOfTwoNumbers();
                    lcm.lcmOfTwoNumbers();
                    break;
                case 14:
                    CountVowels_Consonants vowels_consonants = new CountVowels_Consonants();
                    vowels_consonants.countVowels();
                    break;
                case 15:
                    LeapYearCheck leapYear = new LeapYearCheck();
                    leapYear.leapYearCheck();
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
