package com.swift.academy.inheritance.three;

class Person {
    private String name;
    
    Person(String name) {
        this.name = name;
    }
    
    String getName(){
        return name;
    }
    
    String printInfo(){
        return "My name is " + name;
    }

    private void privateMethod() {
        System.out.println("Really secret");
    }
}