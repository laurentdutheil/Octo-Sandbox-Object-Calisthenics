package com.octo.jeuvideo.mud;

public class CommandeInvalideException extends Exception {

	public CommandeInvalideException() {
		super("Commande invalide.");
	}

	public CommandeInvalideException(Throwable t) {
		super("Commande invalide.", t);
	}

}
