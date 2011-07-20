package com.octo.jeuvideo.mud.positions;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

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
	public void donneMoiLaPositionNord() {
		assertEquals(position.donneMoiLaPosition(Direction.NORD), position);
	}
}
