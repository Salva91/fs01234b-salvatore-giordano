package it.epicode.gestioneDispositivi.exceptions;

public class NotFoundException extends RuntimeException {
	public NotFoundException(String message) {
		super(message);
	}

	public NotFoundException(Long id) {
		super(id + " non trovato!");
	}
}
