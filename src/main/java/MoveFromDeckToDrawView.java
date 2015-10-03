public class MoveFromDeckToDrawView {

	private MoveFromDeckToDrawController moveFromDeckToDrawController;

	public MoveFromDeckToDrawView(
			MoveFromDeckToDrawController moveFromDeckToDrawController) {
		this.moveFromDeckToDrawController = moveFromDeckToDrawController;
	}

	public void render() {
		if(moveFromDeckToDrawController.getBoard().getDraw() == null) {
			moveFromDeckToDrawController.getBoard().setDraw();
		} else {
			System.out.println("There is already a draw.");
		}
	}
}
