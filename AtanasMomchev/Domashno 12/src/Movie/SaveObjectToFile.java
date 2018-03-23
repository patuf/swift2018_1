package Movie;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class SaveObjectToFile {
    public static void main(String[] args) throws IOException, ClassNotFoundException{

        Scanner input = new Scanner(System.in);
        Movie movie = new Movie(input.nextLine(), input.nextLine(), input.nextLine(), input.next(), input.nextLine(), input.nextLine());
            Files.createFile(Paths.get("D:\\Movie.txt"));
            FileOutputStream fos = new FileOutputStream("D:\\Movie.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(movie);
            FileInputStream fis = new FileInputStream("D:\\Movie.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Movie movie2 = (Movie) ois.readObject();
            fos.close();
            oos.close();
            fis.close();
            ois.close();
        System.out.println(movie2.getTitle());
    }
}
