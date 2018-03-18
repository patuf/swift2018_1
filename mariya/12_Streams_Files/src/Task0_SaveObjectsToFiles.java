import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Writer;
import java.time.LocalDate;

public class Task0_SaveObjectsToFiles {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String fileName = "out.txt";
        Movie movie = new Movie();

        movie.director = "Spielberg";
        movie.title = "AI 2";
        LocalDate now = LocalDate.now();
        movie.releaseDate = now;
        movie.actors = new String[]{"JVD", "Sylvester Stalone", "Bruce Lee"};

        try (FileOutputStream fs = new FileOutputStream(fileName);
             ObjectOutputStream os = new ObjectOutputStream(fs)) {

            os.writeObject(movie);

        } catch (FileNotFoundException ex) {
            System.out.println("File " + fileName + " was not found.");
        }

        Writer writer = new FileWriter("file-output.txt");
        writer.write("The director is %s and the title is %s and the date is %s%n");
        writer.close();
    }
}