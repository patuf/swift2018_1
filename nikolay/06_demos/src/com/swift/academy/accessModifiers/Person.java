package com.swift.academy.accessModifiers;

import java.time.Year;

public class Person {
    private final String name;
    private final int yearOfBirth;
    private final String passId;

    public Person(String name, int yearOfBirth, String passId) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.passId = passId;
    }

    public int calculatePersonAge() {
        Year year = Year.now();

        return year.getValue() - yearOfBirth;
    }

    protected boolean isLegalToDrink() {
        int age = calculatePersonAge();

        return age >= 18 ? true : false;
    }

    String getPersonNationality() {
        String passportId = getPersonPassportID();

        return passportId.startsWith("1234") ? "Bulgarian" : "Foreigner";
    }

    private String getPersonPassportID() {
        return passId;
    }
}
