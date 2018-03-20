package hmw11.excersicelection.Task1;

import hmw11.excersicelection.task0.CardRank;
import hmw11.excersicelection.task0.CardSuit;

import javax.smartcardio.Card;
import java.util.ArrayList;
import java.util.List;

public class Deck {
    private  List deck;

    public Deck(){
        this.deck=new ArrayList();
        for (int i = 0; i < CardSuit.values().length ; i++) {
            CardSuit suit=CardSuit.values()[i];
            for (int j = 0; j < CardRank.values().length ; j++) {
                hmw11.excersicelection.Task1.Card card=new hmw11.excersicelection.Task1.Card(CardRank.values()[j],suit);
                    this.deck.add(card);
            }
        }
    }

    void printDeckCards(){
        for (int i = 0; i <deck.size() ; i++) {

            System.out.println(deck.get(i));
        }
    }
}
