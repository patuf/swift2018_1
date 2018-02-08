package com.swift.academy.classesAndObjects;

class Animal {

    // Class Fields
    String kind;
    String name;
    double weight;
    boolean venomous;

    // Constructor
    Animal() {
        name = "";
        kind = "";
    }

    // Constructor
    Animal(String kindValue, String nameValue, double weightValue, boolean venomousValue) {
        kind = kindValue;
        name = nameValue;
        weight = weightValue;
        venomous = venomousValue;
    }

    //
    // Methods
    Animal mate(Animal lover) {

        if (! kind.equals(lover.kind)) {
            System.out.printf("Impossible! \"%s\" can't mate \"%s\"%n", name, lover.name);
            return null;
        }

        Animal child = new Animal(kind, name + " junior", 2.5, venomous || lover.venomous);

        return child;
    }

    void move() {
        System.out.printf("\"%s\" is moving.%n", name);

        if (true) {
            return;
        }

        System.out.println("Something else....");
    }

    void bite(Animal prey) {
        if (this.venomous) {
            System.out.printf("\"%s\" is biting \"%s\".%n", name, prey.name);
        }

        this.weight += prey.weight;
    }

    //
    // Getters, setters

    void setKind(String kindValue) {
        this.kind = kindValue;
    }

    String getKind() {
        return this.kind;
    }

    void setName(String name) {
        this.name = name;
    }

    boolean isVenomous() {
        return venomous;
    }
}