import java.util.ArrayList;

public class Suit extends CardGroup {

	private ArrayList<Card> cards;

	public boolean isFull() {
		if (cards.size() == 13) {
			return true;
		} else {
			return false;
		}
	}
}
