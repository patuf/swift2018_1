package com.swift.academy.varArgs;

public class VarArgsDemo {

    static int sum(int... args) {
        int sum = 0;

        for (int number : args) {
            sum += number;
        }

        for (int i = 0; i < args.length; i++) {
            int number = args[i];
            sum += number;
        }

        return sum;
    }

    public static void main(String... args){

        System.out.println(sum());

        System.out.println(sum(1,2,3));
        System.out.println(sum(1));
        System.out.println(sum(1,2,3,4,5,6,7,8,9,10));
    }
}