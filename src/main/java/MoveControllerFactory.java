public class MoveControllerFactory {

	private Board board;

	private MoveController moveController;
	
	private MenuController menuController;

	public MoveControllerFactory(Board board) {
		this.board = board;
		this.menuController = new MenuController();
	}

	public void setMoveAction() {
		new MenuView(menuController).render();
		int menuOption = menuController.getMenuOption();
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
