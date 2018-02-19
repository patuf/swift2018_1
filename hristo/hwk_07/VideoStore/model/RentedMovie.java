package src.model;

import java.time.LocalDate;

public class RentedMovie extends Movie{

    private final LocalDate dueDate;

    public RentedMovie(String editor,
                       String title,
                       String genre,
                       double imdbRating,
                       LocalDate releseDate) {
        super(editor, title, genre, imdbRating, releseDate);
    }

    public LocalDate getNewDate() {
        return dueDate;
    }

}
