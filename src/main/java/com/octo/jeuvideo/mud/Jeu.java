package com.octo.jeuvideo.mud;

import com.octo.jeuvideo.mud.positions.Direction;
import com.octo.jeuvideo.mud.positions.PieceSombre;
import com.octo.jeuvideo.mud.positions.Position;
import com.octo.jeuvideo.mud.positions.SousPorte;

public class Jeu {

	private Position position;

	public Jeu() {
		position = new PieceSombre();
	}

	public String regarde() {
		return position.decrire();
	}

	public String deplaceNord() {
		Position destination;
		try {
			destination = position.donneMoiLaPosition(Direction.NORD);
		} catch (CommandeInvalideException e) {
			return e.getMessage();
		}

		position = destination;
		return new SousPorte().decrire();
	}

}
