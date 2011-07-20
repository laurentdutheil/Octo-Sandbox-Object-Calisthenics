package com.octo.jeuvideo.mud.positions;

import java.util.HashMap;
import java.util.Map;

import com.octo.jeuvideo.mud.CommandeInvalideException;

public abstract class Position {
	protected Map<Direction, Position> voisins = new HashMap<Direction, Position>(
			4);

	public abstract String decrire();

	public Position donneMoiLaPosition(Direction direction)
			throws CommandeInvalideException {
		if (!voisins.containsKey(direction)) {
			throw new CommandeInvalideException();
		}
		return voisins.get(direction);
	}

}
