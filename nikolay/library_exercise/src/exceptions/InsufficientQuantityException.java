package exceptions;

public class InsufficientQuantityException extends LibraryException {
    private int availableItems;

    public InsufficientQuantityException(int availableItems) {
        super();
        this.availableItems = availableItems;
    }
}
