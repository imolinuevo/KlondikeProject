import java.util.Scanner;

public class MoveFromSuitToRankView {

	private MoveFromSuitToRankController moveFromSuitToRankController;

	public MoveFromSuitToRankView(
			MoveFromSuitToRankController moveFromSuitToRankController) {
		this.moveFromSuitToRankController = moveFromSuitToRankController;
	}

	public void render() {
		int originSuit;
		do {
			System.out.println("From which suit?");
			System.out.print("Option? [1-7]: ");
			@SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);
			originSuit = in.nextInt();
		} while (originSuit < 1 || originSuit > 4);
		originSuit--;
		int destinyRank;
		do {
			System.out.println("To which rank?");
			System.out.print("Option? [1-7]: ");
			@SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);
			destinyRank = in.nextInt();
		} while (destinyRank < 1 || destinyRank > 7);
		destinyRank--;
		if (!moveFromSuitToRankController.getSuit(originSuit).isEmpty()) {
			if (moveFromSuitToRankController.getRank(destinyRank).isEmpty()) {
				moveFromSuitToRankController.moveCardFromSuitToRank(originSuit,
						destinyRank);
			} else {
				if ((moveFromSuitToRankController.getSuit(originSuit)
						.getCardFromTop().getColor() != moveFromSuitToRankController
						.getRank(destinyRank).getCardFromTop().getColor())
						&& (moveFromSuitToRankController.getSuit(originSuit)
								.getCardFromTop().getValue() == moveFromSuitToRankController
								.getRank(destinyRank).getCardFromTop()
								.getValue() - 1)) {
					moveFromSuitToRankController.moveCardFromSuitToRank(
							originSuit, destinyRank);
				} else {
					System.out.println("Movement not allowed");
				}
			}
		} else {
			System.out.println("The origin suit is empty.");
		}
	}
}
