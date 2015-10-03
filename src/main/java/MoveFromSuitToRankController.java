public class MoveFromSuitToRankController extends MoveController {

	protected MoveFromSuitToRankController(Board board) {
		super(board);
	}

	@Override
	public void recibir(GameView gameView) {
		gameView.atender(this);
	}

	public Suit getSuit(int suitValue) {
		return board.getSuit(suitValue);
	}

	public Rank getRank(int rankValue) {
		return board.getRank(rankValue);
	}

	public void moveCardFromSuitToRank(int originSuit, int destinyRank) {
		board.getRank(destinyRank).addCard(board.getSuit(originSuit).popCardFromTop());
	}

}
