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
		
	}
}
