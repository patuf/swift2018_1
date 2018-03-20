package hmw12stream.task0;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Movie implements Serializable{
    String title;
    String director;
    LocalDate releaseDate;
    String[] actors;

    Movie(String title,String director,LocalDate date,String[]actors){
        this.title=title;
        this.director=director;
        this.releaseDate=date;
        this.actors=actors;
    }
 


}
