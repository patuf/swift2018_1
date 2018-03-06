package com.swift.academy.all;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        stack.push("Fourth");

        System.out.println("Top = " + stack.peek());

        while (stack.size() > 0) {
            String personName = (String) stack.pop();
            System.out.println(personName);
        }
    }
}
