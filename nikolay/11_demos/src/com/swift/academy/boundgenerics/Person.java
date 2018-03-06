package com.swift.academy.boundgenerics;

public class Person extends Identifiable {
    private final String name;
    private final String egn;

    Person(String name, String egn) {
        this.name = name;
        this.egn = egn;
    }

    @Override
    String getId() {
        return egn;
    }
}
