package Movie;

import java.io.Serializable;
import java.time.LocalDate;

public class Movie implements Serializable{
    private String title;
    private String director;
    private String[] actors ;
    private LocalDate releaseDate;

    Movie(String releaseDate,String title, String director, String Actor1,String Actor2, String Actor3){
        this.title = title;
        this.director = director;
        this.releaseDate = LocalDate.parse(releaseDate);
        this.actors = new String[]{Actor1,Actor2,Actor3};
    }

    public String getTitle() {
        return title;
    }
}
