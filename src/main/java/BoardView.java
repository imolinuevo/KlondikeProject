public class BoardView {

	private Board board;

	public BoardView(Board board) {
		this.board = board;
	}

	public void render() {
		System.out.println("Deck: [X,X]");
		Card draw = board.getDraw();
		System.out.print("Draw: ");
		if (draw != null) {
			System.out.println("[" + draw.getValue() + ","
					+ draw.getSuitValue() + "]");
		} else {
			System.out.println("[X,X]");
		}
		new SuitView(board.getSuit(0), SuitValue.HEARTS);
		new SuitView(board.getSuit(1), SuitValue.TILES);
		new SuitView(board.getSuit(2), SuitValue.CLOVERS);
		new SuitView(board.getSuit(3), SuitValue.PIKES);
		new RankView(board.getAllRanks());
	}
}
