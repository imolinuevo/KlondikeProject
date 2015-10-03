import java.util.Scanner;

public class MoveFromDrawToSuitView {

	private MoveFromDrawToSuitController moveFromDrawToSuitController;

	public MoveFromDrawToSuitView(
			MoveFromDrawToSuitController moveFromDrawToSuitController) {
		this.moveFromDrawToSuitController = moveFromDrawToSuitController;
	}

	public void render() {
		if (moveFromDrawToSuitController.getBoard().getDraw() != null) {
			int suitValue;
			do {
				System.out.println("Which suit?");
				System.out.print("Option? [1-4]: ");
				@SuppressWarnings("resource")
				Scanner in = new Scanner(System.in);
				suitValue = in.nextInt();
			} while (suitValue < 1 || suitValue > 4);
			suitValue--;
			if ((moveFromDrawToSuitController.getBoard().getDraw()
					.getSuitValue() == moveFromDrawToSuitController.getBoard()
					.getSuit(suitValue).getSuitValue())
					&& (moveFromDrawToSuitController.getBoard().getDraw()
							.getValue() == moveFromDrawToSuitController
							.getBoard().getSuit(suitValue).getCardFromTop()
							.getValue())) {
				moveFromDrawToSuitController
						.getBoard()
						.getSuit(suitValue)
						.addCard(
								moveFromDrawToSuitController.getBoard()
										.getDraw());
				moveFromDrawToSuitController.getBoard().setDrawNull();
			} else {
				System.out.println("The movement is not allowed.");
			}
		} else {
			System.out.println("There is no card in draw.");
		}
	}
}
