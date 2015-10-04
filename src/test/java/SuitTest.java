import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SuitTest {

	private Suit suit;

	@Before
	public void before() {
		suit = new Suit(SuitValue.CLOVERS);
	}

	@Test
	public void testSuit() {
		assertEquals(0, suit.size());
	}

	@Test
	public void testIsFull() {
		assertFalse(suit.isFull());
		for (int i = 0; i < 13; i++) {
			suit.addCard(new Card((i + 1), SuitValue.CLOVERS));
		}
		assertTrue(suit.isFull());
	}

	@Test
	public void testGetSuitValue() {
		assertEquals(SuitValue.CLOVERS, suit.getSuitValue());
	}

	@Test
	public void testAddCard() {
		suit = new Suit(SuitValue.CLOVERS);
		assertEquals(0, suit.size());
		suit.addCard(new Card(2, SuitValue.CLOVERS));
		assertEquals(1, suit.size());
	}

}
