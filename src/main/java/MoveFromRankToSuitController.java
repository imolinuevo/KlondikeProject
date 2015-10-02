public class MoveFromRankToSuitController extends MoveController {

	protected MoveFromRankToSuitController(Board board) {
		super(board);
	}

	@Override
	public void recibir(GameView gameView) {
		gameView.atender(this);
	}

}
