package com.octo.jeuvideo.mud.positions;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.octo.jeuvideo.mud.CommandeInvalideException;

public class PositionTest {
	private Position position;

	@Before
	public void setUp() {
		position = new Position() {

			@Override
			public String decrire() {
				return "Test Position";
			}

		};
		position.voisins.put(Direction.NORD, position);
	}

	@Test
	public void donneMoiLaPositionNord() throws CommandeInvalideException {
		assertEquals(position.donneMoiLaPosition(Direction.NORD), position);
	}

	@Test(expected = CommandeInvalideException.class)
	public void donneMoiLaPositionSud() throws CommandeInvalideException {
		position.donneMoiLaPosition(Direction.SUD);
	}
}
