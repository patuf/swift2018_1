package com.swift.academy.homework03;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[] theArr = new int[count];

        int sum = 0;
        for (int i = 0; i < count; i++) {
            theArr[i] = sc.nextInt();
            sum += theArr[i];
        }

        System.out.printf("The sum is: %d%n", sum);
        System.out.print("Reversed sequence:");
        for (int i = theArr.length - 1; i >= 0; i--) {
            System.out.printf(" %d", theArr[i]);
        }

        System.out.print("\nOnly even numbers: ");
        for (int i = 0; i < theArr.length; i++) {
            System.out.print(theArr[i] % 2 == 0? theArr[i] : " ");
        }


    }
}
