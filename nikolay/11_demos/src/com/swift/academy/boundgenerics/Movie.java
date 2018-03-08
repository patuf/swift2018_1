package com.swift.academy.boundgenerics;

public class Movie extends Identifiable {
    private final String name;
    private final int releaseYear;

    Movie(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    @Override
    String getId() {
        return name + releaseYear;
    }
}
