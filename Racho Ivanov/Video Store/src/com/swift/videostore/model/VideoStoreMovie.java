package com.swift.videostore.model;

import java.time.LocalDate;

public class VideoStoreMovie extends Movie
{
    private double rentPrice;
    private int availableQuantity;
    private final int totalQuantity;

    public VideoStoreMovie(String title, String editor, String genre,
                           double imdbRating, LocalDate releaseDate,
                           double rentPrice, int totalQuantity)
    {
        super(title, editor, genre, imdbRating, releaseDate);
        this.rentPrice = rentPrice;
        this.availableQuantity = totalQuantity;
        this.totalQuantity = totalQuantity;
    }

    public void setRentPrice(double rentPrice)
    {
        this.rentPrice = rentPrice;
    }

    public boolean decreaseAvailableQuantity()
    {
        if(availableQuantity > 0)
        {
            availableQuantity--;
            return true;
        }
        else
            return  false;
    }

    public boolean increaseAvailableQuantity()
    {
        if (availableQuantity < totalQuantity)
        {
            availableQuantity++;
            return true;
        }
        else
            return  false;
    }

    public double getRentPrice()
    {
        return rentPrice;
    }
}
