package com.swift.academy.debuging;

public class DebuggingExample {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int a = 8;
        int b = 4;
        boolean bool = true;

        int sum = calculator.add(a, b);
        System.out.printf("%3d + %3d = %-3d%n", a, b, sum);


        System.out.printf("%3d * %3d = %-3d%n", a, b, calculator.multiply(a, b));
        System.out.printf("%3d * 2 / 2 = %-3d%n", a, b, calculator.multiplyAndDevideByTwo(a));
    }

}
