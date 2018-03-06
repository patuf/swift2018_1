package swift2018_1.hristo.hwk_07.VideoStore.model;

import java.time.LocalDate;

public class Movie {


    private final String editor;
    private final String title;
    private final String genre;
    private double ImdbRating;
    private final LocalDate releseDate;

    public String getTitle() {
        return title;
    }

    public String getEditor() {
        return editor;
    }

    public String getGenre() {
        return genre;
    }

    public Movie(String editor, String title, String genre, LocalDate releseDate) {
        this.editor = editor;
        this.title = title;
        this.genre = genre;
        this.releseDate = releseDate;
    }

    public Movie(String editor, String title, String genre, double imdbRating, LocalDate releseDate) {
        this.editor = editor;
        this.title = title;
        this.genre = genre;
        ImdbRating = imdbRating;
        this.releseDate = releseDate;
    }

    public void setImdbRating(double imdbRating) {
        if (imdbRating >= 0 && imdbRating <= 10)
        this.ImdbRating = imdbRating;
    }

    public double getImdbRating() {
        return ImdbRating;
    }

    public LocalDate getReleseDate() {
        return releseDate;
    }
}
