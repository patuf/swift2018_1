package com.swift.academy.polymorphism;

public class Deer extends Mammal implements Ruminant {
    boolean stomachFullOfGrass;

    @Override
    public void ruminate() {
        if (stomachFullOfGrass) {
            System.out.println("The deer now ruminates!");
            stomachFullOfGrass = false;
        } else {
            System.out.println("Rumination failed: There is no grass in the deer stomach");
        }
    }

    @Override
    boolean needsMilkToSurvive() {
        return getAge() < 2;
    }

    @Override
    void eat() {
        if (needsMilkToSurvive())
            System.out.println("The small deer now eats milk");
        else {
            System.out.println("The grown-up deer now eats grass");
            stomachFullOfGrass = true;
        }
    }

    public static void whatIsRumination() {
        System.out.println("Rumination is when the deer starts chewing out of nowhere while maintaining that sheepish look");
    }
}
