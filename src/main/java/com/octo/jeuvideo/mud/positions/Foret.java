package com.octo.jeuvideo.mud.positions;

public class Foret extends Position {

    private static final String MESSAGE_FORET = "Je suis dans la forêt.";

    @Override
    public String decrire() {
        return MESSAGE_FORET;
    }

    @Override
    public Position donneMoiLaPositionNord() {
        return this;
    }
}
