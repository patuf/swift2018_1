package com.swift.academy.demo;

public class Demo {

    public static void main(String[] args) {
        Person person = new Person("Spas", 30);

        person.printNameAndAge();


        person = new Person("Kosta", 40);

        person.printNameAndAge();

        person.printNameAndAge(10, "Pesho");
        person.printNameAndAge(20, "Ivan");
    }
}
