package com.swift.academy.polymorphism;

public abstract class Animal {
    private boolean hungry = false;
    private int age;

    abstract void eat();

    public void dailyRoutine() {
        if (isHungry())
            eat();
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
