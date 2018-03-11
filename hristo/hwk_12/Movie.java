package swift2018_1.hristo.hwk_12;

import java.io.Serializable;
import java.time.LocalDate;

public class Movie implements Serializable{

    String title;
    String director;
    String actors; //i can't make the task using array but keep trying
    LocalDate releaseDate;

    public Movie(String title, String director, String actors, LocalDate releaseDate) {
        this.title = title;
        this.director = director;
        this.actors = actors;
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nDirector: " + director +
                "\nActors: " + actors + "\nRelease date: " + releaseDate;
    }
}