package com.swift.academy.inheritance.one;

class InheritanceExample {

    public static void main(String[] args) {
        Person gosho = new Person();

        System.out.println(gosho.sayHello());

        Student maria = new Student();

        System.out.println(maria.getGrade());
        System.out.println(maria.sayHello());

        TestInheritance testInheritance = new TestInheritance();

        System.out.println(testInheritance.toString());

    }
}