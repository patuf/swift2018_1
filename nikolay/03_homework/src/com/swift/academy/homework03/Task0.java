package com.swift.academy.homework03;

import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {
//        task0a_ReadInt();
//        task0b_ReadLine();
//        task0c_ReadAge();
//        task0d_ReadNNumbers();
        task0e_ReadNNumbersOnNewLines();
    }

    private static void task0a_ReadInt() {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        System.out.println(++i);
    }

    private static void task0b_ReadLine() {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
    }

    private static void task0c_ReadAge() {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        System.out.println(i >= 18 ? "пълнолетен" : "непълнолетен");
    }

    private static void task0d_ReadNNumbers() {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println(sc.nextInt());
        }
    }

    private static void task0e_ReadNNumbersOnNewLines() {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            numbers[i] = sc.nextInt();
        }

        for(int i: numbers)
            System.out.printf("%d ", i);
    }
}
