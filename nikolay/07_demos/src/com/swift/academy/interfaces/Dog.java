package com.swift.academy.interfaces;

public class Dog implements Animal{

    public String name;
    
    public void move(int speed) {
        System.out.println("moving my 4 feet");
    }

    public String makeSound() {
        return "Woof";
    }
    
}