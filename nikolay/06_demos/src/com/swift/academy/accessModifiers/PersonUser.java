package com.swift.academy.accessModifiers;

import com.swift.academy.accessModifiers.Person;

public class PersonUser {

    public static void main(String[] args) {
        Person person = new Person("Ivan", 1990, "1223456789");

        int age = person.calculatePersonAge();

        System.out.println("Person's age age: " + age);
        System.out.println("Are they allowed to drink?: " + person.isLegalToDrink());
        System.out.println("The person nationality is: " + person.getPersonNationality());
    }
}
