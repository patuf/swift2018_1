import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exec
{
	public static void main(String[] args)
	{
		Deck deck = new Deck();
		deck.shuffle();

		Player p1 = new Player("Ra");
		Player p2 = new Player("Gosho");

		for (int i = 0; i < deck.getCards().length; i++)
		{
			if (i%2 == 0)
				p2.addCard(deck.getCard(i));
			else
				p1.addCard(deck.getCard(i));
		}
		int counter = 0;

		game:
		while (p1.remainingCards() > 0 && p2.remainingCards() > 0)
		{
			System.out.println("Draw : " + counter + " " + p1.drawCard());
			System.out.println("Draw : " + counter + " " + p2.drawCard());

			switch (p1.getCardsOnTable().get(p1.getCardsOnTable().size()-1).compareTo
							(p2.getCardsOnTable().get(p1.getCardsOnTable().size()-1)))
			{
				case 1:
					p1.addCards(winnerTakesAll(p1,p2));
					System.out.println("Player 1 wins battle");
					System.out.println();
					break;
				case -1:
					p2.addCards(winnerTakesAll(p1,p2));
					System.out.println("Player 2 wins battle");
					System.out.println();
					break;
				case 0:
					System.out.println("War is declared!");
					System.out.println("Draw : " + counter + " " + p1.drawCard());
					System.out.println("Draw : " + counter + " " + p2.drawCard());
					System.out.println("Draw : " + counter + " " + p1.drawCard());
					System.out.println("Draw : " + counter + " " + p2.drawCard());
					break;
			}
			counter++;

			if (p1.remainingCards() < 3 || p2.remainingCards() < 3)
			{
				if (p1.remainingCards() > p2.remainingCards())
					System.out.println(p1.getName() + " wins WAR!!!");
				else
					System.out.println(p2.getName() + " wins WAR!!!");
				break game;
			}
		}
	}

	public static List<Card> winnerTakesAll(Player p1, Player p2)
	{
		List<Card> winnings = new LinkedList<>();
		winnings.addAll(p1.getCardsOnTable());
		p1.removeCardsFromTable();
		winnings.addAll(p2.getCardsOnTable());
		p2.removeCardsFromTable();
		return winnings;
	}
}
