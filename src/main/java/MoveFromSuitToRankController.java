public class MoveFromSuitToRankController extends MoveController {

	protected MoveFromSuitToRankController(Board board) {
		super(board);
	}

	@Override
	public void recibir(GameView gameView) {
		gameView.atender(this);
	}

}
