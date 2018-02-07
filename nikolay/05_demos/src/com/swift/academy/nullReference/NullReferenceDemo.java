package com.swift.academy.nullReference;

public class NullReferenceDemo {

    public static void main(String[] args) {
        Animal dog = new Animal("pesho");

        dog.move();

        Animal sameDogDifferentVariable = dog;

        sameDogDifferentVariable.move();

        dog = null;

        sameDogDifferentVariable.move();

        dog.move();

        sameDogDifferentVariable = null;

        sameDogDifferentVariable.move();
    }
}

