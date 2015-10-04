import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BoardTest {

	private Board board;

	@Before
	public void before() {
		board = new Board();
	}

	@Test
	public void testBoard() {
		assertEquals(24, board.getDeck().size());
		assertEquals(null, board.getDraw());
	}

	@Test
	public void testSetDraw() {
		assertEquals(null, board.getDraw());
		board.setDraw();
		assertFalse(board.getDraw() == null);
	}

	@Test
	public void testIsEndOfTheGame() {
		assertFalse(board.isEndOfTheGame());
		for (int i = 0; i < 13; i++) {
			board.getSuit(0).addCard(new Card((i + 1), SuitValue.HEARTS));
		}
		for (int i = 0; i < 13; i++) {
			board.getSuit(1).addCard(new Card((i + 1), SuitValue.TILES));
		}
		for (int i = 0; i < 13; i++) {
			board.getSuit(2).addCard(new Card((i + 1), SuitValue.CLOVERS));
		}
		for (int i = 0; i < 13; i++) {
			board.getSuit(3).addCard(new Card((i + 1), SuitValue.PIKES));
		}
		assertTrue(board.getSuit(0).isFull());
		assertTrue(board.getSuit(1).isFull());
		assertTrue(board.getSuit(2).isFull());
		assertTrue(board.getSuit(3).isFull());
		assertTrue(board.isEndOfTheGame());
	}

	@Test
	public void testSetDrawNull() {
		board.setDrawNull();
		assertTrue(board.getDraw() == null);
	}

}
