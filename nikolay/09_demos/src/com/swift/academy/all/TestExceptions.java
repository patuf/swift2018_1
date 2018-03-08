package com.swift.academy.all;

public class TestExceptions {

    static void myMethod(int testNum) throws Exception {
        System.out.println ("start - myMethod");

        if (testNum == 12) {
            throw new Exception();
        }

        System.out.println("end - myMethod");
        return;
    }

    public static void main(String  args[]) {
        int testNum = 12;
        try {
            System.out.println("try - first statement");
            myMethod(testNum);
            System.out.println("try - last statement");
        } catch ( Exception ex) {
            System.out.println("An Exception");
        } finally {
            System. out. println( "finally") ;
        }

        System.out.println("Out of try/catch/finally - statement");
    }
}
