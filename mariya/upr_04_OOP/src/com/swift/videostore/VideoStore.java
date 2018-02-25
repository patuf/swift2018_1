package com.swift.videostore;

import com.swift.videostore.database.ClientDB;
import com.swift.videostore.database.MovieDB;
import com.swift.videostore.model.VideoStoreClient;
import com.swift.videostore.model.VideoStoreMovie;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class VideoStore {

    MovieDB moviesInStore = new MovieDB();
    ClientDB clientsInStore = new ClientDB();

    double totalIncome = 0;

    public VideoStore(){

    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public boolean addMovieToVideoStore(VideoStoreMovie movie) {
        moviesInStore.addMovie(movie);
        return true;
    }

    public boolean addClientToVideoStore(VideoStoreClient client) {
        clientsInStore.addClient(client);
        return true;
    }

    public boolean rentAMovie(VideoStoreMovie movie) {
        if(movie.getAvailableQuantity() == 0){
            return false;
        }
        movie.decAvailableQuantity();
        totalIncome += movie.getRentPrice();
        return true;
    }

    public boolean returnAMovie(VideoStoreMovie movie) {
        if(movie.getAvailableQuantity() == movie.getTotalQuantity()){
            return false;
        }
        movie.incAvailableQuantity();
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line;

        VideoStore store = new VideoStore();

        //for testing
        VideoStoreMovie titanic = new VideoStoreMovie("Titanic",
                "James Cameron",
                "Romance",
                7,
                LocalDate.of(1997, Month.JANUARY, 1),
                2,
                10.99);

        store.moviesInStore.addMovie(titanic);

        VideoStoreMovie pulp = new VideoStoreMovie("PulpFiction",
                "Quentin Tarantino",
                "Crime",
                9,
                LocalDate.of(1994, Month.JANUARY, 1),
                1,
                15.99);

        store.moviesInStore.addMovie(pulp);
        pulp.decAvailableQuantity();

        while( !(line = sc.nextLine()).equalsIgnoreCase("END") ) {
            String[] split = line.split(" ");
            String command = split[0].trim();

            String result = "";

            switch(command.toUpperCase()){
                case "RENT":
                    result = "RENT ";
                    String client = split[1].trim();
                    String movie = split[2].trim();

                    result += store.rentAMovie(store.moviesInStore.findByTitle(movie))
                            ? "success"
                            : "fail";

                    if (store.rentAMovie(store.moviesInStore.findByTitle(movie))) {
                        store.moviesInStore.findByTitle(movie).decAvailableQuantity();
                    }
                    break;
                case "RETURN":
                    result = "RETURN ";
                    String cl = split[1].trim();
                    String mov = split[2].trim();

                    result += store.returnAMovie(store.moviesInStore.findByTitle(mov))
                            ? "success"
                            : "fail";

                    if (store.rentAMovie(store.moviesInStore.findByTitle(mov))) {
                        store.moviesInStore.findByTitle(mov).incAvailableQuantity();
                    }
                    break;
                case "QUERY":
                    String secondCommand = split[1].trim();

                    switch (secondCommand.toUpperCase()){
                        case "FIND":
                            break;
                        case "FILTER":
                            String thirdCommand = split[2].trim();

                            switch (thirdCommand.toUpperCase()){
                                case "GENRE":
                                    break;
                                case "EDITOR":
                                    break;
                                case "ABOVERATING":
                                    break;
                            }
                            break;
                        case "TOTALINCOME":
                            String thirdComm = split[2].trim();

                            switch (thirdComm.toUpperCase()){
                                case "MOVIE":
                                    break;
                                case "GENRE":
                                    break;
                            }
                            break;
                    }

                    break;

            }

            System.out.println(result);

        }
    }
}
