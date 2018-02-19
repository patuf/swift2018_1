package com.swift.videostore.model;

import Common.Scan;
import com.swift.videostore.database.ClientDb;
import com.swift.videostore.database.MovieDB;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class VideoStore
{

	public static void main(String[] args)
	{

		MovieDB movieDB = new MovieDB();
		ClientDb clientDB = new ClientDb();
	}

	static String inputTitle()
	{
		System.out.println("Enter movie title : ");
		return Scan.scanString();
	}

	static String inputEditor()
	{
		System.out.println("Enter movie title : ");
		return Scan.scanString();
	}

	static String inputGenre()
	{
		System.out.println("Enter movie genre : ");
		return Scan.scanString();
	}

	static double inputimdbRating()
	{
		System.out.println("Enter rating in IMDB : ");
		return Scan.scanDouble();
	}

	static LocalDate inputDate()
	{
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");
		return LocalDate.parse("", formatter);
	}

	static VideoStoreMovie fullInput()
	{
		String title = inputTitle();
		String editor = inputEditor();
		String genre = inputGenre();
		double rating = inputimdbRating();
		System.out.println("In the the format yyyy-mm-dd enter the date of release :");
		LocalDate rDate =  inputDate();
		System.out.println("Enter price for movie per day");
		double price = Scan.scanDouble();
		System.out.println("Enter quantity of movies to be rented");
		int quantity = Scan.scanInt();

		return new VideoStoreMovie(title,editor,genre,rating,rDate,price,quantity);
	}

	static boolean addMovie(MovieDB mdb)
	{
		VideoStoreMovie temp = fullInput();
		if (mdb.findByTitle(temp.getTitle()) == null)
		{
			mdb.addMovie(temp);
			return true;
		}
		else
		{
			System.out.println("Movie already exists in Database");
			return false;
		}
	}

	static boolean addClient(ClientDb cdb)
	{
		System.out.println("Enter client First and last name with a space in between :");
		String clientName = Scan.scanString();
		return cdb.addClient(new VideoStoreClient(clientName));
	}

	static boolean rentMovie(VideoStoreMovie movie, VideoStoreClient client, int rentingDays)
	{
		int counter = 0;
		while (rentingDays > 14)
		{
			System.out.println("You can't rent a movie longer than 2 weeks try again : ");
			rentingDays = Scan.scanInt();
			counter ++;
			if (counter  == 3)
				return false;
		}
		return client.rentMovie(movie, rentingDays);
	}

	static boolean returnMovie(VideoStoreMovie movie, VideoStoreClient client)
	{
		if (client.haveMovieBre(movie.getTitle()))
		{
			client.returnMovie(movie);
			return  true;
		}
		else
			return false;
	}

	// TODO: 19-Feb-2018  move inputs in separate class... too much methods
	// TODO: 19-Feb-2018 movies can be rented but at no cost need to fix to get rich
}
