package com.swift.academy.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Deque<Integer> deck = new ArrayDeque<>();
        Deque<Integer> linkedList = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        
        Integer[] arr = { 1, 2, 3, 4, 5, 6, 7};
        
        for(Integer i : arr) {
            deck.push(i);
            stack.push(i);
            linkedList.push(i);
        }

        // should not be possible for a stack by its definition
        deck.addLast(0);
        stack.contains(5);
        linkedList.contains(5);

        System.out.println("Deque");
        while( !deck.isEmpty() ){
            System.out.print(deck.pop() + " ");
        }
        
        System.out.println();

        System.out.println("Stack");
        while( !stack.isEmpty() ){
            System.out.print(stack.pop() + " ");
        }
        
        System.out.println();

        System.out.println("LinkedList");
        while( !linkedList.isEmpty() ){
            System.out.print(linkedList.pop() + " ");
        }
    }
}
