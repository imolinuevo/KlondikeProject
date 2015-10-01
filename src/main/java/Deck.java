import java.util.ArrayList;
import java.util.Collections;

public class Deck extends CardGroup {

	public Deck() {
		createCardsOfSuit(cards, SuitValue.HEARTS);
		createCardsOfSuit(cards, SuitValue.TILES);
		createCardsOfSuit(cards, SuitValue.CLOVERS);
		createCardsOfSuit(cards, SuitValue.PIKES);
		Collections.shuffle(cards);
	}

	private void createCardsOfSuit(ArrayList<Card> cards, SuitValue suitValue) {
		for (int i = 0; i < 13; i++) {
			cards.add(new Card(i + 1, suitValue));
		}
	}

}
