package exceptions;

public class BookNotFound extends LibraryException {
    public BookNotFound(String message) {
        super(message);
    }
}
