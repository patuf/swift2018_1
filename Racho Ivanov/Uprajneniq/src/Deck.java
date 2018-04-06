import java.util.Random;

public final  class Deck
{
	private Card[] cards;

	public Deck()
	{
		this.cards = new Card[52];


		int i=0;
		for (CardSuite s:CardSuite.values())
		{
			for (CardRank r: CardRank.values())
			{
				cards[i]= new Card(s,r);
				i++;
			}
		}
	}

	public Card[] getCards()
	{
		return cards;
	}

	public Card getCard(int n)
	{
		return this.cards[n];
	}

	public void shuffle()
	{
		for (int i = 0; i <this.cards.length ; i++)
		{
			int indx=	new Random().nextInt(this.cards.length);
			Card temp=this.cards[i];
			//Card randCard= this.cards[indx];
			this.cards[i]=this.cards[indx];
			this.cards[indx]=temp;
		}
	}
}
