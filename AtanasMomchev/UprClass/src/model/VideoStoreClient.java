package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VideoStoreClient {
    private final String clientId;
    private final List<RentedMovie> rentedMovies;

    public VideoStoreClient(String clientId) {
        this.clientId = clientId;
        rentedMovies = new ArrayList<RentedMovie>();
    }

    public String getClientId() {
        return clientId;
    }

    public void rentTheMovie(String title,
                                String editor,
                                String genre,
                                double imdbRating,
                                LocalDate releaseDate,
                                LocalDate dueDate){
        rentedMovies.add(new RentedMovie(title,editor,genre, imdbRating,releaseDate,dueDate));
    }
    public void returnTheMovie(String title){
        rentedMovies.remove(title);
    }
    public List<RentedMovie> getRentedMovies() {
        return rentedMovies;
    }
    public boolean haveMovieBre(String title){
        for(RentedMovie rm : rentedMovies){
            if(rm.getTitle().equals(title))
                return true;
        }
        return false;
    }
}
