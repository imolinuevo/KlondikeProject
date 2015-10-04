public class MoveFromRankToSuitController extends MoveController {

	protected MoveFromRankToSuitController(Board board) {
		super(board);
	}

	@Override
	public void recibir(GameView gameView) {
		gameView.atender(this);
	}

	public Rank getRank(int rankValue) {
		return board.getRank(rankValue);
	}

	public CardGroup getSuit(int suitValue) {
		return board.getSuit(suitValue);
	}

	public void moveCardFromRankToSuit(int originRank, int destinySuit) {
		board.getSuit(destinySuit).addCard(
				board.getRank(originRank).popCardFromTop());
	}

}
