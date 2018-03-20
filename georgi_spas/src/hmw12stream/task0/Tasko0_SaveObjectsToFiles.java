package hmw12stream.task0;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Arrays;

public class Tasko0_SaveObjectsToFiles {

    public static void main(String[] args) {
        Movie movie = new Movie("Bloodsport", "Newt Arnold", LocalDate.of(1988, 4, 29), new String[]{"Jean-Claude Van Damme", "Donald Gibb",});
        //1) make directory to safe
        Path path = Paths.get("Movie");// make folder whit name movie
        // if direcotry not exist?
        if (!Files.exists(path)) {
            try {
                // make directory
                Files.createDirectories(path);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // 2) create file whit directory Movie/movies
        File mf = new File(path + File.separator + "movies");
        // System.out.println(mf.exists());
        try {
            mf.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
// write object to file directory
        try {
            // make stream to write in directory
            //  String directory=path.toString();
            FileOutputStream fos = new FileOutputStream(mf);

            // write object to file
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(movie);// write movie in directory
            fos.close();
            oos.close();
            // read object from file
            FileInputStream fis = new FileInputStream(mf);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Movie result = (Movie) ois.readObject();
            fis.close();
            ois.close();
            System.out.println("Title movie is " + result.director);
            System.out.println("The crew is " + Arrays.toString(result.actors));
            System.out.println("Release year of movie is " + result.releaseDate);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
