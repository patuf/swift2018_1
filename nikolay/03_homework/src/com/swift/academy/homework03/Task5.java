package com.swift.academy.homework03;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        final int THIS_YEAR = 2018;
        Scanner sc = new Scanner(System.in);
        System.out.print("How may people? ");
        int numPeople = sc.nextInt();

        String[] firstNames = new String[numPeople];
        String[] lastNames = new String[numPeople];
        short[] birthYears = new short[numPeople];
        float[] weights = new float[numPeople];
        short[] heights = new short[numPeople];
        String[] occupations = new String[numPeople];

        int personId = 0;
        boolean correct;
        while (personId < numPeople) {
            correct = true;
            System.out.printf("%nEnter details for person %d%n", personId + 1);
            // Data Entry
            System.out.print("First name: ");
            String fn = sc.next();

            System.out.print("Last name: ");
            String ln = sc.next();

            System.out.print("Year of birth: ");
            short by = sc.nextShort();

            System.out.print("Weight: ");
            float wt = sc.nextFloat();

            System.out.print("Height: ");
            short ht = sc.nextShort();

            System.out.print("Occupation: ");
            String occu = sc.next();

            // Checks
            if (fn.isEmpty() || ln.isEmpty()) {
                correct = false;
                System.out.println("Names cannot be empty!");
            }
            if (by < 1920) {
                correct = false;
                System.out.println("No living person is THAT old!");
            } else if ( by > 2018) {
                correct = false;
                System.out.println("This person isn't born yet!");
            }
            if (wt > 300) {
                correct = false;
                System.out.println("No living person is THAT fat!");
            }
            if (ht < 30) {
                correct = false;
                System.out.println("Even babies are taller(longer) than that!");
            } else if (ht > 240) {
                correct = false;
                System.out.println("No living person is over 240 cm tall!");
            }
            if (occu.isEmpty()) {
                correct = false;
                System.out.println("Occupation cannot be empty!");
            }

            if (correct) {
                firstNames[personId] = fn;
                lastNames[personId] = ln;
                birthYears[personId] = by;
                weights[personId] = wt;
                heights[personId] = ht;
                occupations[personId] = occu;
                personId++;
            } else {
                System.out.println("There were errors when entering details for that person. Please re-enter their details in correct way!");
            }
        }

        for (int i = 0; i < numPeople; i++) {
            System.out.printf("%s %s is %d years old. He was born in %d. His weight is %12.8f and he is %d cm tall. He is a %s.%n",
                    firstNames[i], lastNames[i], THIS_YEAR - birthYears[i], birthYears[i], weights[i], heights[i], occupations[i]);
        }
    }


}
