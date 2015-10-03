import java.util.Scanner;

public class MoveFromRankToSuitView {

	private MoveFromRankToSuitController moveFromRankToSuitController;

	public MoveFromRankToSuitView(
			MoveFromRankToSuitController moveFromRankToSuitController) {
		this.moveFromRankToSuitController = moveFromRankToSuitController;
	}

	public void render() {
		int originRank;
		do {
			System.out.println("From which rank?");
			System.out.print("Option? [1-7]: ");
			@SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);
			originRank = in.nextInt();
		} while (originRank < 1 || originRank > 7);
		originRank--;
		int destinySuit;
		do {
			System.out.println("To which suit?");
			System.out.print("Option? [1-7]: ");
			@SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);
			destinySuit = in.nextInt();
		} while (destinySuit < 1 || destinySuit > 4);
		destinySuit--;
		if (!moveFromRankToSuitController.getRank(originRank).isEmpty()) {
			if (moveFromRankToSuitController.getSuit(destinySuit).isEmpty()) {
				moveFromRankToSuitController.moveCardFromRankToSuit(originRank,
						destinySuit);
			} else {
				if ((moveFromRankToSuitController.getRank(originRank)
						.getCardFromTop().getSuitValue() == moveFromRankToSuitController
						.getSuit(destinySuit).getCardFromTop().getSuitValue())
						&& (moveFromRankToSuitController.getRank(originRank)
								.getCardFromTop().getValue() == moveFromRankToSuitController
								.getSuit(destinySuit).getCardFromTop()
								.getValue() + 1)) {
					moveFromRankToSuitController.moveCardFromRankToSuit(
							originRank, destinySuit);
				} else {
					System.out.println("Invalid movement.");
				}
			}
		} else {
			System.out.println("Selected rank is empty.");
		}
	}
}
