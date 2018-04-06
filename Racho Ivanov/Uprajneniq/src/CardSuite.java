enum CardSuite
{
	CLUBS("Clubs"),
	DIAMONDS("Diamonds"),
	HEARTS("Hearts"),
	SPADES("Spades");

	private String type;

	CardSuite(String type)
	{
		this.type = type;
	}

	public String getType()
	{
		return type;
	}
}