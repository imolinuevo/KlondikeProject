import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck extends CardGroup {

	public Deck() {
		createCardsOfSuit(cards, SuitValue.HEARTS);
		createCardsOfSuit(cards, SuitValue.TILES);
		createCardsOfSuit(cards, SuitValue.CLOVERS);
		createCardsOfSuit(cards, SuitValue.PIKES);
		Random random = new Random(cards.size());

		for (int index = 0; index < cards.size(); index += 1) {
			Collections.swap(cards, index,
					index + random.nextInt(cards.size() - index));
		}
	}

	private void createCardsOfSuit(ArrayList<Card> cards, SuitValue suitValue) {
		for (int i = 0; i < 13; i++) {
			cards.add(new Card(i + 1, suitValue));
		}
	}

}
