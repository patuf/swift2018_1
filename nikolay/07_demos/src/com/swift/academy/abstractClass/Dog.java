package com.swift.academy.abstractClass;

public abstract class Dog implements Animal {

    public void move() {
        System.out.println("moving my 4 feet");
    }

    public String makeSound() {
        return "Woof";
    }
    
    public abstract double biteChance();
}