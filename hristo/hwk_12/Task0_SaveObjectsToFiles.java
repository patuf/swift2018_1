package swift2018_1.hristo.hwk_12;

import java.io.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class Task0_SaveObjectsToFiles {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Movie movie = new Movie("Titanic","Cameron", "Dicaprio",
                LocalDate.of(1997,07,23));

        FileOutputStream fs = new FileOutputStream(new File("D:\\JAVA\\swift2018_1\\hristo\\hwk_12\\data\\data.txt"));
        ObjectOutputStream o = new ObjectOutputStream(fs);

        o.writeObject(movie);

        fs.close();
        o.close();

        FileInputStream fi = new FileInputStream(new File("D:\\JAVA\\swift2018_1\\hristo\\hwk_12\\data\\data.txt"));
        ObjectInputStream oi = new ObjectInputStream(fi);

        Movie movie1 = (Movie) oi.readObject();

        fi.close();
        o.close();

        System.out.println(movie1);



    }


}
