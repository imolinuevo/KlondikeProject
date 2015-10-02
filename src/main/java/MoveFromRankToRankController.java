public class MoveFromRankToRankController extends MoveController {

	protected MoveFromRankToRankController(Board board) {
		super(board);
	}

	@Override
	public void recibir(GameView gameView) {
		gameView.atender(this);
	}

}
