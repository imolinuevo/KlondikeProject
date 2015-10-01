public class SuitView {

	public SuitView(Suit suit, SuitValue suitValue) {

		System.out.print(suitValue + " suit: ");
		if (suit.size() == 0) {
			System.out.print("<empty>");
			System.out.println("");
		} else {
			for (int j = 0; j < suit.size() - 1; j++) {
				System.out.print("[");
			}
			System.out.print("[" + suit.getCardFromTop().getValue() + ","
					+ suit.getCardFromTop().getSuitValue() + "]");
			System.out.println("");
		}
	}

}
