package com.swift.videostore.model;

import java.time.LocalDate;

public class RentedMovie extends Movie {

    public final LocalDate dueDate;

    public RentedMovie(String title,
                       String editor,
                       String genre,
                       int imdbRating,
                       LocalDate releaseDate,
                       LocalDate dueDate) {

        super(title, editor, genre, imdbRating, releaseDate);
        this.dueDate = dueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }
}
