package com.swift.academy.hanoy;

import java.util.ArrayDeque;
import java.util.Deque;

public class Hanoy {
    public static void main(String[] args) {
        int numPlates = 20;

        Deque<Integer> from = new ArrayDeque<Integer>();
        Deque<Integer> to = new ArrayDeque<Integer>();
        Deque<Integer> via = new ArrayDeque<Integer>();

        for (int i = numPlates; i >= 1; i--) {
            from.push(i);
        }

        System.out.println("from: " + from);
        System.out.println("to: " + to);

        hanoy(5, from, to, via);

        System.out.println("from: " + from);
        System.out.println("to: " + to);
    }

    private static void hanoy(int elements, Deque<Integer> from, Deque<Integer> to, Deque<Integer> via) {

        if (elements == 1) {
            // Just a check to see if at some point we actually stack plates the wrong way.
            if (!to.isEmpty() && to.peek() < from.peek())
                throw new RuntimeException(String.format("Broken Hanoy condition: attempt to put plate size %d over plate size %d", from.peek(), to.peek()));

            to.push(from.pop());
            return;
        }
        hanoy(elements - 1, from, via, to);
        hanoy(1, from, to, via);
        hanoy(elements - 1, via, to, from);
    }
}
