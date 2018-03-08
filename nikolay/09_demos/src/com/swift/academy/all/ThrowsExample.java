package com.swift.academy.all;

public class ThrowsExample {

    public static void main(String[] args)  {
        RuntimeException exception =
                new NullPointerException("We have a problem");

        System.out.println("test");

        throw exception;
    }
}
