package com.octo.jeuvideo.mud.positions;

public class PieceSombre extends Position {

    public static final String MESSAGE_PIECE_SOMBRE = "Je suis dans une pièce sombre.";

    @Override
    public String decrire() {
        return MESSAGE_PIECE_SOMBRE;
    }

    @Override
    public Position donneMoiLaPositionNord() {
        return new Foret();
    }
}
