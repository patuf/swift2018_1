public class Card implements Comparable {

    CardRank CardRank;
    CardSuit CardSuit;

    public Card(String rank, String color) {
        this.CardSuit = CardSuit.valueOf(color);
        this.CardRank = CardRank.valueOf(rank);
    }

    @Override
    public String toString() {
        return this.CardRank + " of " + this.CardSuit;
    }

    @Override
    public Card compareTo(Card t) {
        if (this.CardRank.compareTo(t.CardRank) >= 0) {
            return Card.this;
        } else {
            return t;
        }
    }
}
