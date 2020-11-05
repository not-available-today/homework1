package com.company;

import java.util.Scanner;


public class hw14 {
    public static void main(String[] args) {
        int a, b, product;
        Scanner userInput = new Scanner(System.in);

        System.out.println("Select a multiplicand ");
        a = userInput.nextInt();

        System.out.println("Select a multiplier: ");
        b = userInput.nextInt();

        product = a * b;

        System.out.println("The product of your equation is: " + product);
    }
}