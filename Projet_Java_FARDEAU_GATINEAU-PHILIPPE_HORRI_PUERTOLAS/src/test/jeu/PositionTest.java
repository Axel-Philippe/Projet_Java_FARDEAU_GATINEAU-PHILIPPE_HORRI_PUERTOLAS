package test.jeu;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import jeu.JeuException;
import jeu.Position;

class PositionTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSetX() {
		
		Position position = new Position(9, 0);
		
		position.setX(5);
		try {
			assertEquals(5, position.getX());
			assertFalse(position.getX()==9);
		} catch(Exception je) {
			je.printStackTrace();
			fail();
		}
	}

}
