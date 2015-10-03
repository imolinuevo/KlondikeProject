import java.util.Scanner;

public class MoveFromDrawToRankView {

	private MoveFromDrawToRankController moveFromDrawToRankController;

	public MoveFromDrawToRankView(
			MoveFromDrawToRankController moveFromDrawToRankController) {
		this.moveFromDrawToRankController = moveFromDrawToRankController;
	}

	public void render() {
		if (moveFromDrawToRankController.getBoard().getDraw() != null) {
			int rankValue;
			do {
				System.out.println("Which rank?");
				System.out.print("Option? [1-7]: ");
				@SuppressWarnings("resource")
				Scanner in = new Scanner(System.in);
				rankValue = in.nextInt();
			} while (rankValue < 1 || rankValue > 7);
			rankValue--;
			if ((moveFromDrawToRankController.getBoard().getDraw().getColor() != moveFromDrawToRankController
					.getBoard().getRank(rankValue).getCardFromTop().getColor())
					&& (moveFromDrawToRankController.getBoard().getDraw()
							.getValue() == moveFromDrawToRankController
							.getBoard().getRank(rankValue).getCardFromTop()
							.getValue() - 1)) {
				moveFromDrawToRankController
						.getBoard()
						.getRank(rankValue)
						.addCard(
								moveFromDrawToRankController.getBoard()
										.getDraw());
				moveFromDrawToRankController.getBoard().setDrawNull();
			} else {
				System.out.println("The movement is invalid.");
			}
		} else {
			System.out.println("There is no card in draw.");
		}
	}
}
