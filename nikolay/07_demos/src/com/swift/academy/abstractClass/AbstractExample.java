package com.swift.academy.abstractClass;

public class AbstractExample {

    public static void main(String[] args) {
        Pincher pincher = new Pincher();

        pincher.move();
        System.out.println(pincher.makeSound());
        
        System.out.println();

        Pitbull pitbull = new Pitbull();

        pitbull.move();
        System.out.println(pitbull.makeSound());
        
        System.out.println();

        System.out.println("Pincher chance to bite you: " + (pincher.biteChance() * 100) + "%");
        System.out.println("Pitbull chance to bite you: " + (pitbull.biteChance() * 100) + "%");
    }
}