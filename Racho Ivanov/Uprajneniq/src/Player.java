import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Player
{
	private final String name;
	private final Deque<Card> cards;
	private List<Card> cardsOnTable;

	public Player(String name)
	{
		this.name = name;
		this.cards = new LinkedList<>();
		cardsOnTable = new LinkedList<>();
	}

	public String getName()
	{
		return name;
	}

	public List<Card> getCardsOnTable()
	{
		return this.cardsOnTable;
	}

	public String drawCard()
	{
		cardsOnTable.add(this.cards.pop());
		return cardsOnTable.get(cardsOnTable.size()-1).toString();
	}

	public void addCards(List<Card> crds)
	{
		for (Card c: crds)
		{
			this.cards.addLast(c);
		}
	}

	public void addCard(Card c)
	{
		this.cards.addLast(c);
	}

	public int remainingCards()
	{
		return this.cards.size();
	}

	public void removeCardsFromTable()
	{
		cardsOnTable.removeAll(cardsOnTable);
	}
}
