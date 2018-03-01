package com.swift.academy.try_catch_finally;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TryCatchFinally {

    static void closeProgram() {
        try {
            System.out.println("About to exit normally...");
//            System.exit(0);
            return;
        } finally {
            System.out.println("From the finally block.");
        }
    }

    static void tryAccessIndex(int[] arr, int idx) {
        
        System.out.println();
        
        try{
            arr[idx] = 5;

            return;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Type ArrayIndexOutOfBoundsException was caught.");
        } catch (Exception ex) {
            System.out.println("Type Exception was caught.");
        } finally {
            System.out.println("Finally block is always executed.");
        }

        System.out.println("Something else.");

//        try{
//            arr[idx] = 5;
////            new FileInputStream(new File("myFIle.txt"));
//        } catch (ArrayIndexOutOfBoundsException | IOException e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("Finally block is always executed.");
//        }
    }

    public static void main(String[] args) {
        int[] arr = new int[5];

        // shows that the catch block with the most specific type 
        // declaration will be executed
        tryAccessIndex(arr, 5); 
        
        arr = null;
        // we force change in exception which would be thrown
        // we show that next most specific exception is the generic type Exception
        tryAccessIndex(arr, 0);
        
        arr = new int[4];
        // shows that even if no exception occurs the finally block 
        // will be executed
        tryAccessIndex(arr, 2);

        closeProgram();
    }
}
