package com.swift.academy.statics;

public class Counter {
    private static int counter = 0;
    private int diffCounter;

    static {
        System.out.println("I'm in static block!");
    }

    {
        System.out.println("I'm in not static block!");
    }

    public Counter() {
        System.out.println("I'm in Counter constructor.");
        counter++;
        diffCounter++;
    }

    public int numberOfInstances() {
        return counter;
    }

    public static int getCouner() {
        return 3;
    }
}
