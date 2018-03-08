import java.util.Arrays;

public class PrintCards {
    private CardSuit cardsuit;
    private CardRank cardRank;

    public PrintCards (CardRank cardRank, CardSuit cardSuit)
    {
        this.cardRank = cardRank;
        this.cardsuit = cardSuit;
    }

    public CardSuit getSuit()
    {
        return cardsuit;
    }

    public void setCardSuit(CardSuit suit)
    {
        this.cardsuit = suit;
    }

    public CardRank getCardRank()
    {
        return cardRank;

    }

    public void setCardValue(CardRank cardRank)
    {
        this.cardRank = cardRank;
    }

   // System.out.printf("%s: %d ranks\n", cardRank.getCardRank());


}

