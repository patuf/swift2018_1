package com.swift.academy.demo;

public class Person {
    int age;
    String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printNameAndAge() {
        System.out.println("Person " + name + " is " + age + " old.");
    }

    public void printNameAndAge(int age, String name) {
        this.age = age;
        this.name = name;

        System.out.println("Person " + name + " is " + age + " old.");
    }


    public static void main(String[] args) {
        Person person = new Person("Spas", 30);

        person.printNameAndAge();


        person = new Person("Kosta", 40);

        person.printNameAndAge();

        person.printNameAndAge(10, "Pesho");
        person.printNameAndAge(20, "Ivan");
    }
}
