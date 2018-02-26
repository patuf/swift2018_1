package com.swift.academy.inheritance.three;

class InheritanceExample {

    public static void main(String[] args) {
        Person gosho = new Person("gosho");

        System.out.println(gosho.printInfo());

        Student maria = new Student("maria", 4);
        
        System.out.println(maria.printInfo());
    }
}