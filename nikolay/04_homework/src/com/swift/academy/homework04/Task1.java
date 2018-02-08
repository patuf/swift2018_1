package com.swift.academy.homework04;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        final int DIM = 4;

        // ----------- //
        // Condition A //
        // ----------- //
        int[][] matrixA = new int[DIM][DIM];
        for (int i = 0; i < DIM; i++) {
            for (int j = 0; j < DIM; j++) {
                matrixA[j][i] = i*DIM + j + 1;
            }
        }

        // ----------- //
        // Condition B //
        // ----------- //
        int[][] matrixB = new int[DIM][DIM];
        for (int i = 0; i < DIM; i++) {
            for (int j = 0; j < DIM; j++) {
                if (i % 2 == 0)
                    matrixB[j][i] = i*DIM + j + 1;
                else
                    matrixB[j][i] = i*DIM + DIM - j;
            }
        }

        // ----------- //
        // Condition C //
        // ----------- //
        int[][] matrixC = new int[DIM][DIM];
        int counter = 1;
        for (int i = 0; i < DIM; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j <= i; j++) {
                    matrixC[i - j][j] = counter++;
                }
            } else {
                for (int j = i; j >= 0; j--) {
                    matrixC[i - j][j] = counter++;
                }
            }
        }
        for (int i = DIM - 1; i >= 0; i--) {
            if (i % 2 == 1) {
                int rowIdx = DIM - 1;
                for (int j = DIM - i; j < DIM; j++) {
                    matrixC[rowIdx][j] = counter++;
                    rowIdx--;
                }
            } else {
                int rowIdx = DIM - i;
                for (int j = DIM - 1; j >= DIM - i; j--) {
                    matrixC[rowIdx][j] = counter++;
                    rowIdx++;
                }
            }
        }

        // ----------- //
        // Condition D //
        // ----------- //
        final int HORIZ_INC = 0;
        final int HORIZ_DEC = 2;
        final int VERT_INC = 1;
        final int VERT_DEC = 3;
        final int STARTX = 0;
        final int STARTY = 1;
        final int LEN = 2;
        int[][] matrixD = new int[DIM][DIM];
        int[][] spiralInfo = new int[4][3];
        spiralInfo[HORIZ_INC][STARTX] = 0;
        spiralInfo[HORIZ_INC][STARTY] = 0;
        spiralInfo[HORIZ_INC][LEN] = DIM;

        spiralInfo[HORIZ_DEC][STARTX] = DIM - 1;
        spiralInfo[HORIZ_DEC][STARTY] = DIM - 2;
        spiralInfo[HORIZ_DEC][LEN] = DIM - 1;

        spiralInfo[VERT_INC][STARTX] = 1;
        spiralInfo[VERT_INC][STARTY] = DIM - 1;
        spiralInfo[VERT_INC][LEN] = DIM - 1;

        spiralInfo[VERT_DEC][STARTX] = DIM - 2;
        spiralInfo[VERT_DEC][STARTY] = 0;
        spiralInfo[VERT_DEC][LEN] = DIM - 2;


        int counterD = 0;
        for (int i = 0; i < DIM*2 - 1; i++) {
            switch (i%4) {
                case HORIZ_INC:
                    for (int j = spiralInfo[HORIZ_INC][STARTY]; j < spiralInfo[HORIZ_INC][LEN] + spiralInfo[HORIZ_INC][STARTY]; j++) {
                        matrixD[spiralInfo[HORIZ_INC][STARTX]][j] = ++counterD;
                    }
                    spiralInfo[HORIZ_INC][STARTY]++;
                    spiralInfo[HORIZ_INC][STARTX]++;
                    spiralInfo[HORIZ_INC][LEN]-=2;
                    break;

                case VERT_INC:
                    for (int j = spiralInfo[VERT_INC][STARTX]; j < spiralInfo[VERT_INC][LEN] + spiralInfo[VERT_INC][STARTX]; j++) {
                        matrixD[j][spiralInfo[VERT_INC][STARTY]] = ++counterD;
                    }
                    spiralInfo[VERT_INC][STARTY]--;
                    spiralInfo[VERT_INC][STARTX]++;
                    spiralInfo[VERT_INC][LEN]-=2;
                    break;

                case HORIZ_DEC:
                    for (int j = spiralInfo[HORIZ_DEC][STARTY]; j > spiralInfo[HORIZ_DEC][STARTY] - spiralInfo[HORIZ_DEC][LEN]; j--) {
                        matrixD[spiralInfo[HORIZ_DEC][STARTX]][j] = ++counterD;
                    }
                    spiralInfo[HORIZ_DEC][STARTY]--;
                    spiralInfo[HORIZ_DEC][STARTX]--;
                    spiralInfo[HORIZ_DEC][LEN]-=2;
                    break;

                case VERT_DEC:
                    for (int j = spiralInfo[VERT_DEC][STARTX]; j > spiralInfo[VERT_DEC][STARTX] - spiralInfo[VERT_DEC][LEN]; j--) {
                        matrixD[j][spiralInfo[VERT_DEC][STARTY]] = ++counterD;
                    }
                    spiralInfo[VERT_DEC][STARTY]++;
                    spiralInfo[VERT_DEC][STARTX]--;
                    spiralInfo[VERT_DEC][LEN]-=2;
                    break;
            }
        }

        printArr(matrixA, "Condition A:");
        printArr(matrixB, "Condition B:");
        printArr(matrixC, "Condition C:");
        printArr(matrixD, "Condition D:");
    }

    private static void printArr(int[][] arr, String label) {
        System.out.println(label);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println();
    }
}
