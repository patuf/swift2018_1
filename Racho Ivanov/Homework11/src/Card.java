public class Card implements Comparable<Card>
{
	private final CardSuite suite;
	private final CardRank rank;

	public Card(CardSuite suite, CardRank rank)
	{
		this.suite = suite;
		this.rank = rank;
	}

	@Override
	public String toString()
	{
		return rank.getRank() + " of " + suite.getType();
	}

	@Override
	public int compareTo(Card o)
	{
		if (this.rank.getValue() < o.rank.getValue())
			return -1;
		else if (this.rank.getValue() > o.rank.getValue())
			return 1;
		else
			return 0;
	}
}
