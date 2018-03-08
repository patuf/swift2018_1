package swift2018_1.hristo.hwk_07.VideoStore.model;

import java.time.LocalDate;

public class VideoStoreMovie extends Movie {

    private double rentPrice;
    private int availableQuantity;
    private final int totalQuantity;


    public VideoStoreMovie(String editor,
                           String title,
                           String genre,
                           double imdbRating,
                           LocalDate releseDate,
                           int totalQuantity,
                           double rentPrice) {
        super(editor, title, genre, imdbRating, releseDate);
        this.availableQuantity = totalQuantity;
        this.totalQuantity = totalQuantity;
        this.rentPrice = rentPrice;
    }

    public void setRentPrice(double rentPrice) {
        this.rentPrice = rentPrice;
    }

    public boolean decAvailableQuantity() {
        if (availableQuantity > 0){
            availableQuantity--;
            return true;
        }else
            return false;
    }

    public boolean incAvailableQuantity() {
        if (availableQuantity < totalQuantity){
            availableQuantity++;
            return true;
        }else
            return false;
    }

    public double getRentPrice() {
        return rentPrice;
    }
}
