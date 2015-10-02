public class MoveFromDrawToSuitController extends MoveController {

	protected MoveFromDrawToSuitController(Board board) {
		super(board);
	}

	@Override
	public void recibir(GameView gameView) {
		gameView.atender(this);
	}

}
