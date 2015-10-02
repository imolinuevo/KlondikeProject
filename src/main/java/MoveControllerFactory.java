public class MoveControllerFactory {

	private Board board;

	private MoveController moveController;

	private MenuController menuController;

	public MoveControllerFactory(Board board) {
		this.board = board;
		this.menuController = new MenuController();
	}

	public void setMoveAction(int menuOption) {
		switch (menuOption) {
		case 1:
			moveController = new MoveFromDeckToDrawController(board);
			break;
		case 2:
			moveController = new MoveFromDrawToSuitController(board);
			break;
		case 3:
			moveController = new MoveFromDrawToRankController(board);
			break;
		case 4:
			moveController = new MoveFromRankToSuitController(board);
			break;
		case 5:
			moveController = new MoveFromRankToRankController(board);
			break;
		case 6:
			moveController = new MoveFromSuitToRankController(board);
			break;
		default:
			assert false;
			break;
		}
	}

	public MoveController getController() {
		if (board.isEndOfTheGame()) {
			return null;
		}
		new MenuView(menuController, board).render();
		int menuOption = menuController.getMenuOption();
		setMoveAction(menuOption);
		return moveController;
	}

}
