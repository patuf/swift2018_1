package swift2018_1.hristo.hwk_07.VideoStore.model;

import java.time.LocalDate;

public class RentedMovie extends Movie{

    private final LocalDate dueDate;

    public RentedMovie(String editor,
                       String title,
                       String genre,
                       double imdbRating,
                       LocalDate releseDate, LocalDate dueDate) {
        super(editor, title, genre, imdbRating, releseDate);
        this.dueDate = dueDate;
    }

    public LocalDate getNewDate() {
        return dueDate;    }

}
