enum CardRank
{
	TWO("Two",2),
	THREE("Three", 3),
	FOUR("Four", 4),
	FIVE("Five", 5),
	SIX("Six", 6),
	SEVEN("Seven", 7),
	EIGHT("Eight", 8),
	NINE("Nine", 9),
	TEN("Ten", 10),
	JACK("Jack", 11),
	QUEEN("Queen", 12),
	KING("King", 13),
	ACE("Ace", 14);

	private String rank;
	private int value;

	CardRank(String rank, int value)
	{
		this.rank = rank;
		this.value = value;
	}

	public String getRank()
	{
		return rank;
	}

	public int getValue()
	{
		return this.value;
	}
}