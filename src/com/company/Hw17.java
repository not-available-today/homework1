package com.company;

import java.util.Scanner;

public class Hw17 {
    public static void main(String[] args) {
        double fahrenheit, celsius;
        Scanner temperature = new Scanner(System.in);

        System.out.println("Please enter the temperature in Fahrenheit: ");
        fahrenheit = temperature.nextInt();

        celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println(fahrenheit + " degrees Fahrenheit is equal to " + celsius + " degrees Celsius");

    }
}
