package com.octo.jeuvideo.mud.positions;

public class PieceSombre extends Position {

	public static final String MESSAGE_PIECE_SOMBRE = "Je suis dans une pièce sombre.";

	public PieceSombre() {
		this.voisins.put(Direction.NORD, new Foret());
	}

	@Override
	public String decrire() {
		return MESSAGE_PIECE_SOMBRE;
	}

}
