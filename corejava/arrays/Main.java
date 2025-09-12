package com.corejava.arrays;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        arrayProblems();
    }
    static void arrayProblems(){
        try {
            Scanner userInput = new Scanner(System.in);
            System.out.println("************** Arrays Problems **************");
            System.out.println("1.Reverse Integer " );
            System.out.print("Which Problem You Want to Run Enter Index Number : ");
            int choice = userInput.nextInt();
            switch (choice) {
                case 1:
                    FindMissingNumber findMissingNumber = new FindMissingNumber();
                    int[] num = {1,2,3,4,6};
                    findMissingNumber.findMissingNumber(num);
                    break;

                default:
                    System.out.println("Enter Valid Index Number");

            }
            arrayProblems();
            userInput.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        }
}
