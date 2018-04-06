import org.omg.CosNaming.NamingContextPackage.NotFoundReasonHolder;

import java.util.ArrayList;
import java.util.List;

public class Deck
{
	private List<Card> deck = new ArrayList<>(52);

	Deck()
	{
		for (CardSuite s: CardSuite.values())
		{
			for (CardRank r: CardRank.values())
			{
				deck.add(new Card(s,r));
			}
		}
	}

	public List<Card> getCardsFromDeck()
	{
		return this.deck;
	}
}
