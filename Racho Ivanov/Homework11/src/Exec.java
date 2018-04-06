public class Exec
{
	public static void main(String[] args)
	{
		Deck deck = new Deck();

		for (Card c: deck.getCardsFromDeck())
		{
			System.out.println(c.toString());
		}
	}
}
