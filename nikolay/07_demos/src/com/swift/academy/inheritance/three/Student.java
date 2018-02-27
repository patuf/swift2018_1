package com.swift.academy.inheritance.three;

class Student extends Person {
    private int grade;

    Student(String name, int grade) {
        super(name);

        this.grade = grade;
    }

    int getGrade() {
        return grade;
    }

    @Override
    String printInfo() {
        return "My name is " + getName() + ". My grade is " + grade;
    }

    public void privateMethod() {
        System.out.println("Not secret anymore.");
    }
}