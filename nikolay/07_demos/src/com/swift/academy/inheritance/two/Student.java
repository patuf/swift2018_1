package com.swift.academy.inheritance.two;

class Student extends Person {
    private int grade;

//    public String name;

    Student(String name, int grade){
        super(name);

        this.grade = grade;

        System.out.println("Calling constructor Student");
    }

    public void doSomething() {
        System.out.println(name);
    }

    Student(int grade) {
        this("Empty", grade);
    }

    Student() {
        this(10);
    }


    
    int getGrade(){
        return grade;
    }
}