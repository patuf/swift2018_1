package com.swift.academy.debuging;

import com.swift.academy.accessModifiers.Person;

public class Calculator {

    public int add(int a, int b) {
        int c = a + b;
        return c;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        int c = a / b;
        return c;
    }

    public int multiplyAndDevideByTwo(int a) {
        int b = multiply(a, 2);
        int c = divide(b, 2);

        return c;
    }
}
