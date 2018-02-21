package com.swift.academy.polymorphism;

public class LifeManagerDemo {
    public static void main(String[] args) {
        Ruminant[] ruminantAnimals = new Ruminant[100];

        Ruminant r = new Deer();
        // Illegal. No implicit auto-casting:
//        Mammal m = r;
//        Animal a = r;
        // Explicit casting works;
        Mammal m = (Mammal) r;

        // Can't instantiate an abstract class
//        Animal a1 = new Animal();

        Deer d = new Deer();
        // Legal - implicit auto-casting, because we use superclasses of Deer
        Ruminant r1 = d;
        Animal a1 = d;
        Mammal m1 = d;

        // Animal is not ruminant, neither is mammal!
//        ruminantAnimals[0] = a1;
//        ruminantAnimals[0] = m1;
        ruminantAnimals[0] = d;

        // Polymorphism anyone?
        System.out.println("*** Testing polymorphism on static methods ***");
        d.whatIsRumination();
        m1.whatIsRumination();
        Ruminant.whatIsRumination();
        System.out.println();

        System.out.println("*** Testing polymorphism on virtual methods ***");
        ruminationTime(ruminantAnimals);

        // Can't call eat on a Ruminant
//        r1.eat();
        d.setHungry(true);
        d.setAge(1);
        a1.dailyRoutine();

        d.setAge(2);
        d.dailyRoutine();
        ruminationTime(ruminantAnimals);
    }

    private static void ruminationTime(Ruminant[] animalsToRuminate) {
        for (Ruminant rumi : animalsToRuminate) {
            if (rumi != null)
                rumi.ruminate();
        }
    }
}
