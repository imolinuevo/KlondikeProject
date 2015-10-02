import java.util.ArrayList;

public abstract class CardGroup {

	protected ArrayList<Card> cards;
	
	public CardGroup() {
		cards = new ArrayList<Card>();
	}

	public Card popCardFromTop() {
		Card card = null;
		if (!this.isEmpty()) {
			card = cards.get(0);
			cards.remove(0);
		}
		return card;
	}

	public Card getCardFromTop() {
		Card card = null;
		if (!this.isEmpty()) {
			card = cards.get(0);
		}
		return card;
	}

	public boolean isEmpty() {
		if (cards.size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int size() {
		return this.cards.size();
	}

}
