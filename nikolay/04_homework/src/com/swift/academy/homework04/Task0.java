package com.swift.academy.homework04;

import java.util.Arrays;
import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
//        createArray();
//        readArray();
//        printString();
        print2dArray();
    }

    private static void createArray() {
        int[] theArr = {5, 9, 11, 3, 6, 4, 7};

        for (int i: theArr)
            System.out.println(i);
    }

    private static void readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements? ");
        int numElements = sc.nextInt();

        System.out.printf("%nEnter %d elements, separated by spaces:", numElements);
        int[] theArr = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            theArr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println(Arrays.toString(theArr));
    }

    private static void printString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter some text:");
        String theString = sc.nextLine();

        for (char c: theString.toCharArray())
            System.out.println(c);
    }

    private static void print2dArray() {
        final int DIM = 4;
        int[][] theArray = new int[DIM][DIM];
        for (int i = 0; i < DIM; i++) {
            for (int j = 0; j < DIM; j++) {
                theArray[i][j] = i*DIM + j + 1;
            }
        }
        for (int i = 0; i < DIM; i++) {
                System.out.println(Arrays.toString(theArray[i]));
        }
    }

}
