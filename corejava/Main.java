package com.corejava;

import com.corejava.armstrong.ArmstrongNumber;
import com.corejava.palindrome.PalindromeNumber;
import com.corejava.reverseinteger.ReverseInteger;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        basicProblems();

    }

    static void basicProblems(){
        try {
              Scanner userInput =  new Scanner(System.in);
            System.out.println("************** Basic & Control Flow Problems **************");
            System.out.println("1.Reverse Integer \n2.Palindrome \n3.Armstrong");
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
