package com.swift.videostore.model;

import java.time.LocalDate;

public class VideoStoreMovie extends Movie {

    private double rentPrice;
    private int availableQuantity;
    private final int totalQuantity;

    public VideoStoreMovie(String title,
                           String editor,
                           String genre,
                           int imdbRating,
                           LocalDate releaseDate,
                           int totalQuantity,
                           double rentPrice) {

        super(title, editor, genre, imdbRating, releaseDate);
        //this.availableQuantity = this.totalQuantity = totalQuantity;
        this.totalQuantity = totalQuantity;
        this.availableQuantity = totalQuantity;
        this.rentPrice = rentPrice;
    }

    public void setRentPrice(double rentPrice) {
        this.rentPrice = rentPrice;
    }

    public boolean decAvailableQuantity() {
        if (availableQuantity > 0) {
            availableQuantity--;
            return true;
        } else {
            return false;
        }
    }

    public boolean incAvailableQuantity() {
        if (availableQuantity < totalQuantity) {
            availableQuantity++;
            return true;
        } else {
            return false;
        }
    }

    public double getRentPrice() {
        return rentPrice;
    }
    public int getAvailableQuantity() { return availableQuantity; }
    public int getTotalQuantity() { return totalQuantity; }
}
