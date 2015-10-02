public class GameView {

	private MoveControllerFactory moveControllerFactory;

	public GameView(MoveControllerFactory moveControllerFactory) {
		this.moveControllerFactory = moveControllerFactory;
	}

	public void render() {
		MoveController moveController;
		do {
			moveController = moveControllerFactory.getController();
			if (moveController != null) {
				moveController.recibir(this);
			}
		} while (moveController != null);

	}

	public void atender(
			MoveFromDeckToDrawController moveFromDeckToDrawController) {
		new MoveFromDeckToDrawView(moveFromDeckToDrawController).render();
	}

	public void atender(
			MoveFromDrawToSuitController moveFromDrawToSuitController) {
		new MoveFromDrawToSuitView(moveFromDrawToSuitController).render();
	}

	public void atender(
			MoveFromDrawToRankController moveFromDrawToRankController) {
		new MoveFromDrawToRankView(moveFromDrawToRankController).render();
	}

	public void atender(
			MoveFromRankToSuitController moveFromRankToSuitController) {
		new MoveFromRankToSuitView(moveFromRankToSuitController).render();
	}

	public void atender(
			MoveFromRankToRankController moveFfromRankToRankController) {
		new MoveFfromRankToRankView(moveFfromRankToRankController).render();
	}

	public void atender(
			MoveFromSuitToRankController moveFromSuitToRankController) {
		new MoveFromSuitToRankView(moveFromSuitToRankController).render();
	}

}
