package exceptions;

public class InsufficientQuantityException extends LibraryException{
    private int availableitems;

    public InsufficientQuantityException(int availableitems) {
        this.availableitems = availableitems;
    }
}
