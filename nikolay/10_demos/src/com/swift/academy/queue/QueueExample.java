package com.swift.academy.queue;

import java.util.Queue;
import java.util.ArrayDeque;
import java.util.LinkedList;

public class QueueExample {

    public static void main(String[] args) {

        Queue<Integer> deck = new ArrayDeque<>();
        Queue<Integer> list = new LinkedList<>();
        
        for (int i = 1; i <= 10; i++) {
            deck.add(i);
            list.add(10 + i);
        }
        
        for (int i = 0; i < 4; i++) {
            System.out.print(deck.poll() + " ");
            list.poll();
        }
        
        System.out.print("pause ");
        
        while(!list.isEmpty()){
            System.out.print(list.poll() + " ");
        }
        System.out.println(list.poll());
    }
}
