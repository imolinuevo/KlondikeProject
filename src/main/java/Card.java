public class Card {

	private int value;

	private SuitValue suitValue;

	public Card(int value, SuitValue suitValue) {
		this.value = value;
		this.suitValue = suitValue;
	}

	public int getValue() {
		return value;
	}

	public SuitValue getSuitValue() {
		return suitValue;
	}

	public char getColor() {
		return this.suitValue.getValue();
	}

}
