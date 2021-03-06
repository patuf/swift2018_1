package Store;

import DataBase.ClientDB;
import DataBase.MovieDB;
import model.VideoStoreClient;
import model.VideoStoreMovie;

import java.time.LocalDate;

public class VideoStore {
    private VideoStoreMovie VSmovie;
    private VideoStoreClient VSclient;
    private ClientDB client = new ClientDB();
    private MovieDB movie = new MovieDB();
    double income = 0;

    public boolean addVSClient(String clientId){
        VSclient = new VideoStoreClient(clientId);
        return client.addClient(VSclient);
    }

    public boolean removeVSClient(String clientId){
        if(client.findClient(clientId).getRentedMovies().size() == 0){
            client.removeClient(clientId);
            return true;
        }
        return false;
    }

    public boolean addVSMovie(String title,
                              String editor,
                              String genre,
                              double imdbRating,
                              LocalDate releaseDate,
                              int totalQuantity,
                              double rentPrice){
        VSmovie = new VideoStoreMovie(title, editor, genre, imdbRating, releaseDate, totalQuantity, rentPrice );
        return movie.addMovie(VSmovie);
    }

    public LocalDate dueDate(LocalDate dueDate){
       dueDate = dueDate.plusDays(6);
       return dueDate;
    }

    public boolean clientRentsMovie(String clientId,String title){
        VideoStoreMovie found = movie.findByTitle(title);
        if(client.checkClientId(clientId) && found.getAvailableQuantity()>0){
        client.findClient(clientId).rentTheMovie(   found.getTitle(),
                                                    found.getEditor(),
                                                    found.getGenre(),
                                                    found.getImdbRating(),
                                                    found.getReleaseDate(),
                                                    dueDate(LocalDate.now()));
        movie.findByTitle(title).decreaseAvailableQuantity();
        income += found.getRentPrice();
            return true;
        }
        return false;
    }

    public boolean clientReturnsMovie (String clientId, String title) {
        if (client.findClient(clientId).haveMovieBre(title) && movie.findByTitle(title).getAvailableQuantity()<10) {
            client.findClient(clientId).returnTheMovie(title);
            movie.findByTitle(title).increaseAvailableQuantity();
            return true;
        }else
        return false;
    }

    public double getIncome() {
        return income;
    }

    public String findByTitle(String title){
        if(movie.findByTitle(title) == null){
            return "No data found";
        }else
            return title;
    }
    public String findByEditor(String editor){
        if(movie.findByEditor(editor)[0] == null){
            return "No data found";
        }else
            return movie.findByEditor(editor).toString();
    }
    public String findByGenre(String genre){
        if(movie.findByGenre(genre)[0] == null){
            return "No data found";
        }else
            return movie.findByEditor(genre).toString();
    }
    public String findByRating(double rating){
        if(movie.findByRating(rating)[0] == null){
            return "No data found";
        }else
            return movie.findByRating(rating).toString();
    }
}