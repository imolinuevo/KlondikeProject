public class Board {

	private Deck deck;

	private Card draw;

	private Suit[] suit;

	private Rank[] rank;

	public final int SUITS = 4;

	public final int RANKS = 7;

	public Board() {
		deck = new Deck();
		draw = null;
		suit = new Suit[SUITS];
		suit[0] = new Suit(SuitValue.HEARTS);
		suit[1] = new Suit(SuitValue.TILES);
		suit[2] = new Suit(SuitValue.CLOVERS);
		suit[3] = new Suit(SuitValue.PIKES);
		rank = new Rank[RANKS];
		for (int i = 0; i < rank.length; i++) {
			rank[i] = new Rank();
		}
		for (int i = 0; i < rank.length; i++) {
			rank[i].firstDeal(i, deck);
		}
	}

	public Deck getDeck() {
		return deck;
	}

	public Card getDraw() {
		return draw;
	}

	public void setDraw() {
		this.draw = this.deck.popCardFromTop();
	}

	public Suit getSuit(int value) {
		return suit[value];
	}

	public Rank getRank(int rankValue) {
		return rank[rankValue];
	}

	public boolean isEndOfTheGame() {
		if (suit[0].isFull() && suit[1].isFull() && suit[2].isFull()
				&& suit[3].isFull()) {
			return true;
		}
		return false;
	}

	public void setDrawNull() {
		this.draw = null;

	}

	public Rank[] getAllRanks() {
		return this.rank;
	}
}
