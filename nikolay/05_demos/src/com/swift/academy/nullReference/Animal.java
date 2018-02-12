package com.swift.academy.nullReference;

class Animal{
    
    String name;
    
    Animal(String animalName){
        name = animalName;
    }
    
    void move(){
        System.out.println(name + " is moving.");
    }
}