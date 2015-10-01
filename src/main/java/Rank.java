import java.util.ArrayList;

public class Rank extends CardGroup {

	private ArrayList<Card> cards;

	public void firstDeal(int rankNumber, Deck deck) {
		for (int i = 0; i < rankNumber; i++) {
			cards.add(deck.getCardFromTop());
		}
	}
}
