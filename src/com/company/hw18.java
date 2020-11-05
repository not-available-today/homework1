package com.company;

import java.util.Scanner;

public class hw18 {
    public static void main(String[] args) {
        double inches, meters;

        Scanner inch = new Scanner(System.in);

        System.out.println("Put the inches in: ");
        inches = inch.nextDouble();

        meters = inches * 0.0254;
        System.out.println(inches + " inches is " + meters + " meters.");


    }
}