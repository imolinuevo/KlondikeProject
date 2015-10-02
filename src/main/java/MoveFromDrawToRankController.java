public class MoveFromDrawToRankController extends MoveController {

	protected MoveFromDrawToRankController(Board board) {
		super(board);
	}

	@Override
	public void recibir(GameView gameView) {
		gameView.atender(this);
	}

}
