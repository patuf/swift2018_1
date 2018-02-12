package com.swift.academy.homework04;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("How many elements? ");
//        int numElements = sc.nextInt();
//
//        System.out.printf("%nEnter %d elements, separated by spaces:", numElements);
//        int[] theArr = new int[numElements];
//        for (int i = 0; i < numElements; i++) {
//            theArr[i] = sc.nextInt();
//        }
        int[] theArr = {21, 5, 1, 2, 3, 4, 9, 1, 3, 4, -6, 4};
//        int[] theArr = {-13, -1, -12, -3};
        int numElements = theArr.length;

        // -------------- //
        // Largest Number //
        // -------------- //
        int largest = Integer.MIN_VALUE;
        for (int i : theArr) {
            if (i > largest)
                largest = i;
        }
        System.out.printf("Largest number is: %d%n", largest);

        // -------------- //
        // Sorted Numbers //
        // -------------- //
        int[] sortedArr = Arrays.copyOf(theArr, theArr.length);
        Arrays.sort(sortedArr);
        System.out.printf("Sorted array: %s%n", Arrays.toString(sortedArr));

        // ------------- //
        // Cluster Count //
        // ------------- //
        // Ensuring init value that will not duplicate with the first element, faking a cluster
        int lastClusterVal = theArr[0] - 1;
        int clusterCount = 0;
        boolean inCluster = false;
        for (int i : theArr) {
            if (lastClusterVal == i) {
                inCluster = true;
            } else if (inCluster) {
                clusterCount++;
                inCluster = false;
            }
            lastClusterVal = i;
        }
        // Ensuring the case where the last cluster is at the end of the array
        if (inCluster) clusterCount++;

        System.out.printf("Cluster count: %d%n", clusterCount);

        // ----------- //
        // Split Index //
        // ----------- //
        boolean foundSplitIdx = false;
        for (int i = 0; i < numElements - 1; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            for (int j = 0; j <= i; j++) {
                sumLeft+=theArr[j];
            }
            for (int k = i + 1; k < numElements; k++) {
                sumRight+=theArr[k];
            }
            if (sumLeft == sumRight) {
                System.out.printf("Split index found: %d%n", i);
                foundSplitIdx = true;
                break;
            }
        }
        if (!foundSplitIdx)
            System.out.println("NO");

        // ------------------------------ //
        // Longest Increasing Subsequence //
        // ------------------------------ //
        int currSubSeqLen = 1;
        int maxSubSeqLen = 0;
        int currSubseqIdx = 0;
        int maxSubseqIdx = 0;
        boolean inSeq = false;
        for (int i = 1; i < numElements; i++) {
            if (theArr[i] > theArr[i-1]) {
                currSubSeqLen++;
                if (!inSeq) {
                    currSubseqIdx = i - 1;
                    inSeq = true;
                }
            } else {
                inSeq = false;
                if (currSubSeqLen > maxSubSeqLen) {
                    maxSubSeqLen = currSubSeqLen;
                    maxSubseqIdx = currSubseqIdx;
                }
                currSubSeqLen = 1;
                currSubseqIdx = i;
            }
        }
        // Account for the last subsequence
        if (currSubSeqLen > maxSubSeqLen) {
            maxSubSeqLen = currSubSeqLen;
            maxSubseqIdx = currSubseqIdx;
        }
        System.out.printf("Longest increasing Subsequence: %s%n",
                Arrays.toString(Arrays.copyOfRange(theArr, maxSubseqIdx, maxSubseqIdx + maxSubSeqLen)));

        // ---------------------------- //
        // Largest sum of K subsequence //
        // ---------------------------- //
        final int k = 5;
        int maxKSum = Integer.MIN_VALUE;
        for (int i = 0; i < numElements - k + 1; i++) {
            int kSum = 0;
            for (int j = i; j < k + i; j++) {
                kSum+=theArr[j];
            }
            if (kSum > maxKSum)
                maxKSum = kSum;
        }
        System.out.printf("Largest sum of K subsequence: %d%n", maxKSum);

        // ----------------------- //
        // Largest sum subsequence //
        // ----------------------- //

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int currStreakStart = 0;
        int maxStreakStart = 0, maxStreakEnd = 0;
        boolean inStreak = false;
        for (int i = 0; i < numElements; i++) {
            currSum += theArr[i];
            if (currSum > maxSum) {
                // New highest Streak! Remember everything!
                maxSum = currSum;
                maxStreakStart = currStreakStart;
                maxStreakEnd = i;
            }
            if (currSum > 0) {
                // Still above 0. Maintain the current streak.
            } else {
                // Kill the streak!
                currSum = 0;
                // Set currStreakStart for the next iteration. This is the carrier of information whether the streak has been killed last iteration.
                currStreakStart = i + 1;
            }
        }

        System.out.printf("Largest sum subsequence: %s%n",
                Arrays.toString(Arrays.copyOfRange(theArr, maxStreakStart, maxStreakEnd+1)));

    }
}
