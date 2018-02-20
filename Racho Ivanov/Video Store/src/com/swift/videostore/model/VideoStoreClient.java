package com.swift.videostore.model;

import java.util.ArrayList;
import java.util.List;

public class VideoStoreClient
{
    private final String clientId;
    private final List<RentedMovie> rentedMovies;

    public VideoStoreClient(String clientId)
    {
        this.clientId = clientId;
        this.rentedMovies = new ArrayList<RentedMovie>();

    }

    public String getClientId()
    {
        return clientId;
    }

    public List<RentedMovie> getRentedMovies()
    {
        return rentedMovies;
    }

    public boolean haveMovieBre(String title)
    {
        for (RentedMovie rm : rentedMovies)
            if (rm.getTitle().equals(title))
                return true;

        return false;
    }

		public boolean rentMovie(VideoStoreMovie movie, int rentingDays)
		{
			if (haveMovieBre(movie.getTitle()))
				return false;
			else
			{
				rentedMovies.add(new RentedMovie(movie, rentingDays));
				return true;
			}
		}


		public void returnMovie(VideoStoreMovie movie)
		{
			rentedMovies.remove(movie);
		}
}
