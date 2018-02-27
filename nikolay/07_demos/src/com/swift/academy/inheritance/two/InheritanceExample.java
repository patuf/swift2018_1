package com.swift.academy.inheritance.two;

class InheritanceExample {

    public static void main(String[] args) {

        Person gosho = new Person("gosho");

        System.out.println(gosho.getName());

        Student maria = new Student("maria", 4);

        System.out.println(maria.getName() + " " + maria.getGrade());
    }
}