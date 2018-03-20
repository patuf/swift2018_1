package hmw11.excersicelection.task0;

public enum CardRank {
    Two,
    Three,
    Four,
    Five,
    Six,
    Seven,
    Eight,
    Nine,
    Ten,
    Jack,
    Queen,
    King,
    Ace;

    private CardRank rank;
    public static void main(String[] args) {
        CardRank.printCardRank();
    }

    public CardRank getCardRank(){
        return rank;
    }

    static void printCardRank() {
        int iterate = 1;

        for (CardRank rank : CardRank.values()) {
            if (iterate == CardRank.values().length) {
                System.out.println(rank);

            } else {
                System.out.print(rank+ ",");
            }
            iterate++;
        }

    }


}
