public class Suit extends CardGroup {

	public boolean isFull() {
		if (cards.size() == 13) {
			return true;
		} else {
			return false;
		}
	}
}
