package com.swift.academy.accessModifiers2;

import com.swift.academy.accessModifiers.Person;

/**
 * Which of the commented lines will compile and which not? Why?
 */
public class PersonUser2 extends Person {
    public PersonUser2(String name, int yearOfBirth, String passId) {
        super(name, yearOfBirth, passId);
    }

    public static void main(String[] args) {
        Person person = new Person("Ivan", 1990, "1223456789");

        int age = person.calculatePersonAge();

        System.out.println("Person's age age: " + age);
        System.out.println("Are they allowed to drink?: " + person.isLegalToDrink());
        System.out.println("The person nationality is: " + person.getPersonNationality());

//        PersonUser2 personUsr = new PersonUser2("Ivan", 1990, "1223456789");
//
//        personUsr.giveMeMyFeatures();
    }

    private void giveMeMyFeatures() {
//        int age = calculatePersonAge();
//
//        System.out.println("Person's age age: " + age);
        System.out.println("Are they allowed to drink?: " + this.isLegalToDrink());
//        System.out.println("The person nationality is: " + getPersonNationality());
    }

    public boolean isLegalToDrink() {
        if (super.isLegalToDrink())
            return true;
        else
            return true;
    }
}
