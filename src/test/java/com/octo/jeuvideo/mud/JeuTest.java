package com.octo.jeuvideo.mud;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JeuTest {

    private Jeu jeu;

    @Before
    public void setUp() {
        jeu = new Jeu();
    }

    @Test
    public void regardePositionDepart() {
        assertEquals("Je suis dans une pièce sombre.", jeu.regarde());
    }


    @Test
    public void jeMeDeplaceVersLeNord() {
        assertEquals("Je passe sous une porte.", jeu.deplaceNord());
    }

    @Test
    public void jeMeDeplaceVersLeNordPuisJeRegarde() {
        jeu.deplaceNord();
        assertEquals("Je suis dans la forêt.", jeu.regarde());
    }

    @Test
    public void jeMeDeplaceVersLeNordPuisVersLeNord() {
        jeu.deplaceNord();
        assertEquals("Commande invalide.", jeu.deplaceNord());
    }
}
