package Deck;

import Cards.CardRank;
import Cards.CardSuit;

public class Card implements Comparable<Card>{
    private CardSuit color;
    private CardRank rank;

    Card(){

    }
    Card(CardRank rank, CardSuit color){
        this.rank = rank;
        this.color = color;
    }
    @Override
    public String toString() {
        return rank + " of " + color;
    }

    @Override
    public int compareTo(Card T) {
        return getRank().compareTo(T.getRank());
    }

    public CardRank getRank() {
        return rank;
    }

}
