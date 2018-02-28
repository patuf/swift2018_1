package com.swift.academy.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class One {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        float myFloat = Float.MIN_VALUE;

        boolean hasError;

        do {
            hasError = false;
            System.out.println("Please enter a float number: ");

            try {
                myFloat = s.nextFloat();
            } catch (InputMismatchException exception) {
                System.out.println("Bad input data. Please try again.");
                hasError = true;
                s.nextLine();
            }

        } while (hasError);

        System.out.printf("Great. You entered %f", myFloat);

    }
}
