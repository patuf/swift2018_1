package swift2018_1.hristo.hwk_11;

import java.util.Comparator;

public class Card extends  Task0_Cards implements Comparable<Card>{

    CardSuit suit;
    CardRank rank;

    public CardRank getRank() {
        return rank;
    }

    public CardSuit getSuit(){
        return suit;
    }

    public Card(CardRank cardRank, CardSuit cardSuit) {
        this.suit = cardSuit;
        this.rank = cardRank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    public static void main(String[] args) {


        Card card = new Card(CardRank.Six, CardSuit.Diamonds);
        Card card1 = new Card(CardRank.Seven, CardSuit.Clubs);

        System.out.println(card.compareTo(card1));
    }

    @Override
    public int compareTo(Card t) {
        return Comparator.comparing(Card::getRank)
                .compare(this, t);
    }
}
