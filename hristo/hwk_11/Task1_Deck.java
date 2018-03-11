package swift2018_1.hristo.hwk_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1_Deck extends Task0_Cards {

    public static void main(String[] args) {

        List<CardRank> ranks = Arrays.asList(CardRank.values());
        List<CardSuit> suits = Arrays.asList(CardSuit.values());
        List deck = new ArrayList();

        for (int i = 0; i < ranks.size(); i++) {
            for (int j = 0; j < suits.size(); j++) {

                //System.out.println(ranks.get(i) + " of " + suits.get(j));

                deck.add(ranks.get(i) + " of " + suits.get(j));

            }

        }

        for (Object element:deck) {

            System.out.println(element);
        }

    }
}
