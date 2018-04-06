package Task0;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
import java.net.URI;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Exec
{
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		File testFile = new File("test.txt");

		testFile.createNewFile();
		System.out.println(testFile.getAbsolutePath());
		System.out.println(testFile.canRead());
		String input = "Hello streams";


		InputStream iFileStream = new FileInputStream(testFile);
		OutputStream oFileStream = new FileOutputStream(testFile);
		ObjectOutputStream objOStream = new ObjectOutputStream(oFileStream);
		ObjectInputStream objIStream = new ObjectInputStream(iFileStream);


		List<Movie> movies = new ArrayList<>();
		Movie mov1 =new Movie("Unknown","Thor Ragnarok","feb 2018","some actor" ,"another actor");
		movies.add(mov1);


		for (Movie m : movies)
		{
			objOStream.writeObject(m);
		}

		System.out.println(movies.get(0));
		Movie mov2 = (Movie)objIStream.readObject();
		System.out.println(mov2);


		System.out.println("Movie from file equals that from program : " + mov1.equals(mov2));

	}
}
