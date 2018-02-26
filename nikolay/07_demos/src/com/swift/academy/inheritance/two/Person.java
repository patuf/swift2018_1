package com.swift.academy.inheritance.two;

class Person {
    
    public String name;

    Person(String name) {
        this.name = name;

        System.out.println("Calling constructor Person");
    }

    String getName(){
        return name;
    }
}