public class MoveFromRankToRankController extends MoveController {

	protected MoveFromRankToRankController(Board board) {
		super(board);
	}

	@Override
	public void recibir(GameView gameView) {
		gameView.atender(this);
	}

	public Rank getRank(int originRank) {
		return board.getRank(originRank);
	}

	public Card getCardFromRank(int originRank) {
		return board.getRank(originRank).getCardFromTop();
	}

	public void moveCardFromRankToRank(int originRank, int destinyRank) {
		board.getRank(destinyRank).addCard(board.getRank(originRank).popCardFromTop());
	}

}
