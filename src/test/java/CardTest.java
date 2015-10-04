import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CardTest {

	private Card card;

	@Before
	public void before() {
		card = new Card(2, SuitValue.CLOVERS);

	}

	@Test
	public void testCardIntSuitValue() {
		assertEquals(2, card.getValue());
		assertEquals(SuitValue.CLOVERS, card.getSuitValue());
	}

	@Test
	public void testGetColor() {
		assertEquals('b', card.getColor());
	}

}
