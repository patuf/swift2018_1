package com.swift.academy.classesAndObjects;

public class ClassStructureDemo {

    public static void main(String[] args) {
        Animal balkanDog = new Animal("dog", "balkan", 29.5, false);
        balkanDog.move();
        System.out.println("Is \"" + balkanDog.name + "\" venomous? " + balkanDog.isVenomous());

        System.out.println();

        Animal chichiDog = new Animal("dog", "chi chi", 17.3, false);
        chichiDog.move();

        System.out.println();

        Animal child = balkanDog.mate(chichiDog);
        child.move();
        System.out.println("Is \"" + child.name + "\" venomous? " + child.isVenomous());

        System.out.println();

        Animal spaska = new Animal("snake", "spaska", 3.5, true);
        spaska.bite(child);
        spaska.mate(chichiDog);
    }
}
