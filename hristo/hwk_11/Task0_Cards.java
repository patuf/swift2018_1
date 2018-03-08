package swift2018_1.hristo.hwk_11;

import java.util.StringJoiner;

public class Task0_Cards {



    public enum CardSuit{

        Clubs, Diamonds, Hearts, Spades
    }

    public enum CardRank{

        Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Ace
    }


    public static void main(String[] args) {

        final StringJoiner suit = new StringJoiner(", ", "", "."); //i am using StringJoiners for both enums
        final StringJoiner rank = new StringJoiner(", ", "", ".");


        for (CardSuit d: CardSuit.values()) {  // put all values to string

            suit.add(d.toString());
        }

        for (CardRank d: CardRank.values()) {

            rank.add(d.toString());
        }

        System.out.println(suit);
        System.out.print(rank);


    }


}
