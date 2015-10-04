public class Suit extends CardGroup {

	private SuitValue suitValue;

	public Suit(SuitValue suitValue) {
		this.suitValue = suitValue;
	}

	public boolean isFull() {
		if (cards.size() == 13) {
			return true;
		} else {
			return false;
		}
	}

	public SuitValue getSuitValue() {
		return this.suitValue;
	}

	public void addCard(Card card) {
		this.cards.add(0, card);
	}
}
