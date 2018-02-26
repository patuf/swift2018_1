package com.swift.academy.interfaces;

public class Bird implements Animal{

    public void move(int speed) {
        System.out.println("flying");
    }
    
    public String makeSound() {
        return "ga ga ga";
    }
}