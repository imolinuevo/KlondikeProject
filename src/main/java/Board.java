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
		for (int i = 0; i < suit.length; i++) {
			suit[i] = new Suit();
		}
		rank = new Rank[RANKS];
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

	public Suit getSuit(int value) {
		return suit[value];
	}

	public Rank[] getRank() {
		return rank;
	}

}
