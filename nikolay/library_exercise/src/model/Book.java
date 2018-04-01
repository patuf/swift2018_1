package model;

public class Book {
    private String title;
    private String esbn;
    private String author;
    private int quantity;

    public Book(String title, String esbn, String author, int quantity) {
        this.title = title;
        this.esbn = esbn;
        this.author = author;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEsbn() {
        return esbn;
    }

    public void setEsbn(String esbn) {
        this.esbn = esbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
