public class MoveControllerFactory {

	private Board board;

	private MoveController moveController;

	public MoveControllerFactory(Board board) {
		this.board = board;
	}

	public void setMoveAction(int menuOption) {
		switch (menuOption) {
		case 1:
			moveController = new MoveFromDeckToDrawController();
			break;
		case 2:
			moveController = new MoveFromDrawToSuitController();
			break;
		case 3:
			moveController = new MoveFromDrawToRankController();
			break;
		case 4:
			moveController = new MoveFromRankToSuitController();
			break;
		case 5:
			moveController = new MoveFfromRankToRankController();
			break;
		case 6:
			moveController = new MoveFromSuitToRankController();
			break;
		default:
			assert false;
			break;
		}
	}

	public MoveController getController() {
		if (board.isEndOfTheGame()){
			return null;
		}
		return moveController;
	}

}
