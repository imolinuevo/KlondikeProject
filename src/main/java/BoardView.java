public class BoardView {

	private Board board;

	public BoardView(Board board) {
		this.board = board;
	}

	public void render() {
		System.out.println("Deck: [X,X]");
		Card draw = board.getDraw();
		if (draw != null) {
			System.out.println("[" + draw.getValue() + ","
					+ draw.getSuitValue() + "]");
		} else {
			System.out.println("[X,X]");
		}
		new SuitView(board.getSuit(1), SuitValue.HEARTS);
		new SuitView(board.getSuit(2), SuitValue.TILES);
		new SuitView(board.getSuit(3), SuitValue.CLOVERS);
		new SuitView(board.getSuit(4), SuitValue.PIKES);
		new RankView(board.getRank());
	}
}
