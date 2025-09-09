package com.corejava.controlflow;

import java.util.Scanner;

public class Main {
    Scanner userInput = null;

    Main() {

        userInput = new Scanner(System.in);
    }

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        reverseInteger.reverseInteger();

    }

}
