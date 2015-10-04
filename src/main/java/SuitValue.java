public enum SuitValue {

	HEARTS('r'), TILES('r'), CLOVERS('b'), PIKES('b');

	private char value;

	private SuitValue(char value) {
		this.value = value;
	}

	public char getValue() {
		return this.value;
	}
}
