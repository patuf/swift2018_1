package hmw11.excersicelection.task0;

public enum CardSuit {

    Clubs,
    Diamonds,
    Hearts,
    Spades;



    public static void main(String[] args) {
        CardSuit.printCardSuit();

    }
    static void printCardSuit() {
        int iterate = 1;

        for (CardSuit suit : CardSuit.values()) {
            if (iterate == CardSuit.values().length) {
                System.out.println(suit);

            } else {
                System.out.print(suit + ",");
            }
            iterate++;
        }
    }
}
