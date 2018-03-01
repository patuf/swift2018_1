package com.swift.academy.all;

public class NestedDemo {

    public static void main(String args[]) {
        demoOne();
        //demoTwo();
    }

    public static void demoOne() {

        //Parent try block
        try {
            //Child try block1
            try {
                System.out.println("Inside block1");
                int b = 45 / 0;
                System.out.println(b);
            } catch (ArithmeticException e1) {
                System.out.println("Exception: e1");
            }
            //Child try block2
            try {
                System.out.println("Inside block2");
                int b = 45 / 0;
                System.out.println(b);
            } catch (ArrayIndexOutOfBoundsException e2) {
                System.out.println("Exception: e2");
            }
            System.out.println("Just other statement");

        } catch (ArithmeticException e3) {
            System.out.println("Arithmetic Exception");
            System.out.println("Inside parent try catch block");
        } catch (ArrayIndexOutOfBoundsException e4) {
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println("Inside parent try catch block");
        } catch (Exception e5) {
            System.out.println("Exception");
            System.out.println("Inside parent try catch block");
        }

        System.out.println("Next statement..");
    }

    public static void demoTwo() {
        int arr[]= {1,2,3,4};
        //main try-block
        try{
            //try-block2
            try{
                //try-block3
                try{

                    System.out.println(arr[10]);
                }catch(ArithmeticException e){
                    System.out.print("Arithmetic Exception");
                    System.out.println(" handled in try-block3");
                }
            } catch (ArithmeticException e){
                System.out.print("Arithmetic Exception");
                System.out.println(" handled in try-block2");
            }
        } catch (ArithmeticException e3){
            System.out.print("Arithmetic Exception");
            System.out.println(" handled in main try-block");
        } catch (ArrayIndexOutOfBoundsException e4){
            System.out.print("ArrayIndexOutOfBoundsException");
            System.out.println(" handled in main try-block");
        } catch (Exception e5){
            System.out.print("Exception");
            System.out.println(" handled in main try-block");
        }
    }
}
