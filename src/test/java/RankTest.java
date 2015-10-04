import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RankTest {

	private Rank rank;

	@Before
	public void before() {
		rank = new Rank();
	}

	@Test
	public void testAddCard() {
		assertEquals(0, rank.size());
		rank.addCard(new Card(2, SuitValue.CLOVERS));
		assertEquals(1, rank.size());
	}

}
