package com.swift.academy.homework03;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String theString = sc.next();
        int theNumber = Integer.parseInt(theString);
        System.out.printf("First digit: %s%n", theString.toCharArray()[0]);

        System.out.print("Mirror: ");
        for (int i = theString.length() - 1; i >= 0; i--) {
            System.out.print(theString.charAt(i));
        }

        int sum = 0;
        for (int i = 0; i < theString.length(); i++) {
            sum += theString.charAt(i) - '0';
        }
        System.out.printf("%nSum of digits: %d%n", sum);

        boolean isPrime = true;
        System.out.print("Divisors: 1");
        for (int i = 2; i < theNumber; i++) {
            if (theNumber % i == 0) {
                System.out.printf(" %d", i);
                isPrime = false;
            }
        }
        System.out.printf(" %d%n", theNumber);

        System.out.printf("Is it prime?: %b%n", isPrime);


        System.out.printf("Hexadecimal: %s%n", Integer.toString(theNumber, 16));
        System.out.printf("Binary: %s%n", Integer.toString(theNumber, 2));
    }

}
