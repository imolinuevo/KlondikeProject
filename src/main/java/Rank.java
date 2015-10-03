public class Rank extends CardGroup {

	public void firstDeal(int rankNumber, Deck deck) {
		for (int i = -1; i < rankNumber; i++) {
			cards.add(deck.popCardFromTop());
		}
	}

	public void addCard(Card card) {
		this.cards.add(0, card);
	}
}
