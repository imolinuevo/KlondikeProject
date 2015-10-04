import static org.junit.Assert.*;

import org.junit.Test;

public class DeckTest {
	
	private Deck deck;

	@Test
	public void testDeck() {
		deck = new Deck();
		assertEquals(52, deck.size());
	}

}
