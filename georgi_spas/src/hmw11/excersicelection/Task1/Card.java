package hmw11.excersicelection.Task1;

import hmw11.excersicelection.task0.CardRank;
import hmw11.excersicelection.task0.CardSuit;

public class Card implements Comparable<Card>{
    CardRank rank;
    CardSuit suit;



    public Card(CardRank rank,CardSuit suit) {
        this.rank=rank;
        this.suit=suit;
    }


    @Override
    public String toString() {
        return rank.name() + " of " + suit.name();
    }

    public static void main(String[] args) {

    }

    @Override
    public int compareTo(Card c) {
        return this.rank.getCardRank().compareTo(c.rank.getCardRank());
    }
}
