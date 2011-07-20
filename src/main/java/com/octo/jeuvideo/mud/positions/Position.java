package com.octo.jeuvideo.mud.positions;

import java.util.HashMap;
import java.util.Map;

public abstract class Position {
	protected Map<Direction, Position> voisins = new HashMap<Direction, Position>(
			4);

	public abstract String decrire();

	public Position donneMoiLaPosition(Direction direction) {
		return voisins.get(direction);
	}

}
