public class MoveFromDeckToDrawController extends MoveController {

	protected MoveFromDeckToDrawController(Board board) {
		super(board);
	}

	@Override
	public void recibir(GameView gameView) {
		gameView.atender(this);
	}

}
