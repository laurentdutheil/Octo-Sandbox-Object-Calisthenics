package com.octo.jeuvideo.mud.positions;

public class Foret extends Position {

	private static final String MESSAGE_FORET = "Je suis dans la forêt.";

	public Foret() {
		this.voisins.put(Direction.NORD, this);
	}

	@Override
	public String decrire() {
		return MESSAGE_FORET;
	}

}
