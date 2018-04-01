package controller;

import exceptions.BookNotFoundException;
import exceptions.InsufficientQuantityException;
import exceptions.LibraryException;
import library.dao.BooksDAO;
import library.dao.RentalsDAO;
import model.Book;

import java.sql.SQLException;

public class LibraryController {

    public void rentABook(String esbn, int user_id, int quantity) throws LibraryException, SQLException {

        Book book = new BooksDAO().findByEsbn(esbn);

        int takenBooks = new RentalsDAO().getTakenBooks(esbn);
        if (book.getQuantity() - takenBooks < quantity)
            throw new InsufficientQuantityException(book.getQuantity() - takenBooks);
    }
}
