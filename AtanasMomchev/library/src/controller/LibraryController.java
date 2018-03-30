package controller;

import dao.BooksDAO;
import dao.RentalsDAO;
import exceptions.InsufficientQuantityException;
import exceptions.LibraryException;
import model.Book2;

import java.sql.SQLException;

public class LibraryController {
    public void rentABook(String esbn, int user_id, int quantity) throws LibraryException, SQLException {

       Book2 book = new BooksDAO().findByEsbn(esbn);

       int takenBooks = new RentalsDAO().getTakenBooks(esbn);
       if(book.getQuantity() - takenBooks < quantity) {
           throw new InsufficientQuantityException(book.getQuantity() - takenBooks);
       }
    }
}
