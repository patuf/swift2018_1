package com.swift.videostore.model;

import java.time.LocalDate;

public class Movie {

    private final String title;
    private final String editor;
    private final String genre;
    private final LocalDate releaseDate;
    private double imdbRating;

    public Movie(String title, String editor, String genre, LocalDate releaseDate) {
        this.title = title;
        this.editor = editor;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }

    public Movie(String title, String editor, String genre, int imdbRating, LocalDate releaseDate) {
        this.title = title;
        this.editor = editor;
        this.genre = genre;
        this.imdbRating = imdbRating;
        this.releaseDate = releaseDate;
    }

    public void setImdbRating(double imdbRating) {
        if (imdbRating > 0 && imdbRating <= 10){
            this.imdbRating = imdbRating;
        }
    }

    public String getTitle() {
        return title;
    }

    public String getEditor() {
        return editor;
    }

    public String getGenre() {
        return genre;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }
}
