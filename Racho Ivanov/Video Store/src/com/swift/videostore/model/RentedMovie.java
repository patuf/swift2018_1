package com.swift.videostore.model;

import java.time.LocalDate;

public class RentedMovie extends Movie
{
    private final LocalDate dueDate;

    public RentedMovie(String title, String editor, String genre, double imdbRating,
                       LocalDate releaseDate, LocalDate dueDate)
    {
        super(title, editor, genre, imdbRating, releaseDate);
        this.dueDate = dueDate;
    }

    public RentedMovie(VideoStoreMovie movie, int rentingDays)
    {
        super(movie.getTitle(), movie.getEditor(), movie.getGenre(),
                movie.getImdbRating(),movie.getReleaseDate());
        this.dueDate = LocalDate.now().plusDays(rentingDays);
    }

    public LocalDate getDueDate()
    {
        return dueDate;
    }


}
