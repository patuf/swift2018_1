package model;

import java.time.LocalDate;

public class VideoStoreMovie extends Movie {
    private double rentPrice;
    private int availableQuantity;
    private final int totalQuantity;

    public VideoStoreMovie(String title,
                           String editor,
                           String genre,
                           double imdbRating,
                           LocalDate releaseDate,
                           int totalQuantity,
                           double rentPrice) {

        super(title, editor, genre, imdbRating, releaseDate);
        this.availableQuantity = totalQuantity;
        this.totalQuantity = totalQuantity;
        this.rentPrice = rentPrice;
    }

    public void setRentPrice(double rentPrice) {
        this.rentPrice = rentPrice;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public boolean decreaseAvailableQuantity() {
        if(availableQuantity >0) {
            availableQuantity--;
            return true;
        }else
            return false;
    }
    public boolean increaseAvailableQuantity() {
        if(availableQuantity < totalQuantity) {
            availableQuantity++;
            return true;
        }else
            return false;
    }

    public double getRentPrice() {
        return rentPrice;
    }
}
