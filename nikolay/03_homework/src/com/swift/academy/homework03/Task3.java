package com.swift.academy.homework03;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        final String DELIM = " ";
        Scanner sc = new Scanner(System.in);

        int theNumber = sc.nextInt();

        System.out.println("Square:");
        for (int i = 0; i < theNumber; i++) {
            for (int j = 0; j < theNumber; j++) {
                if (j == 0 || j == theNumber - 1 || i == 0 || i == theNumber - 1)
                    System.out.print(DELIM + "*");
                else
                    System.out.print(DELIM + " ");
            }
            System.out.println();
        }

        System.out.println("BigZi:");
        for (int i = 0; i < theNumber; i++) {
            for (int j = 0; j < theNumber; j++) {
                if (j == theNumber - i - 1 || i == 0 || i == theNumber - 1)
                    System.out.print(DELIM + "*");
                else
                    System.out.print(DELIM + " ");
            }
            System.out.println();
        }

        //----------------//
        // CHRISTMAS TREE //
        //----------------//
        System.out.println("Christmas Tree:");
        final int STAND_HEIGHT = 1;
        // Must be odd number!!!
        final int STAND_WIDTH = 3;
        // Must be odd number!!!
        final int STEM_WIDTH = 1;
        final int STEM_HEIGHT = 1;

        final int treeOnlyHeight = theNumber - STAND_HEIGHT - STEM_HEIGHT;
        // Each row adds two stars, except the first, hence we subtract 1 to account for the first row:
        final int maxTreeWidth = treeOnlyHeight * 2 - 1;
        for (int i = 0; i < treeOnlyHeight; i++) {
            for (int j = 0; j < maxTreeWidth; j++) {
                if (j >= maxTreeWidth/2 - i && j <= maxTreeWidth/2 + i)
                    System.out.print(DELIM + "*");
                else
                    System.out.print(DELIM + " ");
            }
            System.out.println();
        }
        // Print the stem
        for (int i = 0; i < STEM_HEIGHT; i++) {
            for (int j = 0; j < maxTreeWidth / 2 + 1 + STEM_WIDTH/2; j++) {
                if (j < maxTreeWidth/2 - STEM_WIDTH/2)
                    System.out.print(DELIM + " ");
                else
                    System.out.print(DELIM + "*");
            }
            System.out.println();
        }
        // Print the stand
        for (int i = 0; i < STAND_HEIGHT; i++) {
            for (int j = 0; j < maxTreeWidth / 2 + 1 + STAND_WIDTH/2; j++) {
                if (j < maxTreeWidth/2 - STAND_WIDTH/2)
                    System.out.print(DELIM + " ");
                else
                    System.out.print(DELIM + "*");
            }
            System.out.println();
        }
    }
}
