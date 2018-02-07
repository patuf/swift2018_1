package com.swift.academy.classesAndObjects;

public class Test {

    private int i;

    public Test() {
        i = 10;
    }

    public Test(int num) {
        i = num;
    }

    public Test(int num, int nm) {
        i = num;
    }

    public static void main(String[] args) {
        Test t = new Test(1, 2);

        for (int counter = 0; counter < 10; counter++) {
            System.out.println(t.i);
        }
    }
}
