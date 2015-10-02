public abstract class MoveController {

	protected Board board;

	protected MoveController(Board board) {
		this.board = board;
	}

	public Board getBoard() {
		return board;
	}

	public abstract void recibir(GameView gameView);

}
