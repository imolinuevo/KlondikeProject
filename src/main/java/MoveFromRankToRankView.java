import java.util.Scanner;

public class MoveFromRankToRankView {

	private MoveFromRankToRankController moveFromRankToRankController;

	public MoveFromRankToRankView(
			MoveFromRankToRankController moveFfromRankToRankController) {
		this.moveFromRankToRankController = moveFfromRankToRankController;
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
		int destinyRank;
		do {
			System.out.println("To which rank?");
			System.out.print("Option? [1-7]: ");
			@SuppressWarnings("resource")
			Scanner in = new Scanner(System.in);
			destinyRank = in.nextInt();
		} while (destinyRank < 1 || destinyRank > 7);
		destinyRank--;
		if (!moveFromRankToRankController.getRank(originRank).isEmpty()) {
			if (moveFromRankToRankController.getRank(destinyRank).isEmpty()) {
				moveFromRankToRankController.moveCardFromRankToRank(originRank,
						destinyRank);
			} else {
				if (moveFromRankToRankController.getCardFromRank(originRank)
						.getColor() == moveFromRankToRankController
						.getCardFromRank(destinyRank).getColor()) {
					moveFromRankToRankController.moveCardFromRankToRank(
							originRank, destinyRank);
				} else {
					System.out.println("Movement not allowed.");
				}
			}

		} else {
			System.out.println("Origin rank is empty, movement not possible.");
		}
	}
}
