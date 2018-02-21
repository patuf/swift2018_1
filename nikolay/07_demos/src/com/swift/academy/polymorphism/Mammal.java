package com.swift.academy.polymorphism;

/**
 * If we extend an abstract class but do not override its abstract methods, the extending class must also be declared abstract!
 */
public abstract class Mammal extends Animal {
    private int milkLevel = 50;

    abstract boolean needsMilkToSurvive();

    @Override
    public void dailyRoutine() {
        super.dailyRoutine();

    }

    public void feedChild(Mammal child) {
        if (child.needsMilkToSurvive() && milkLevel > 10) {
            child.eat();
            milkLevel -= 10;
        }
    }

    public int getMilkLevel() {
        return milkLevel;
    }

    public void setMilkLevel(int milkLevel) {
        this.milkLevel = milkLevel;
    }

    public static void whatIsRumination() {
        System.out.println("Some mammals like to look really stupid by re-digesting their grass.");
    }
}
