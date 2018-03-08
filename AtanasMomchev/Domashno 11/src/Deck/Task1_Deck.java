package Deck;

import Cards.CardRank;
import Cards.CardSuit;

import java.util.LinkedList;
import java.util.List;

public class Task1_Deck {
    public static void main(String[] args) {
        List<Card> deck = new LinkedList<>();
        for (int i = 0; i < 4; i++) {
            if(i<1) {
                for (CardRank r : CardRank.values()) {
                    deck.add(new Card(r, CardSuit.Clubs));
                }
            }else if(i<2) {
                for (CardRank r : CardRank.values()) {
                    deck.add(new Card(r, CardSuit.Diamonds));
                }
            }else if(i<3){
                        for(CardRank r : CardRank.values()){
                            deck.add(new Card(r, CardSuit.Hearts));
                        }
                    }else {
                        for(CardRank r : CardRank.values()){
                            deck.add(new Card(r, CardSuit.Spades));
                        }
                    }
                }
        for(Card c : deck){
            System.out.printf("%s %n",c.toString());
        }
    }
}

