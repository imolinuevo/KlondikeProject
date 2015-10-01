public class Board {

	private Deck deck;

	private Card draw;

	private Suit[] suit;

	private Rank[] rank;

	public Board() {
		deck = new Deck();
		draw = null;
		suit = new Suit[4];
		rank = new Rank[7];
		for (int i = 0; i < rank.length; i++) {
			rank[i].firstDeal(i, deck);
		}
	}
}
