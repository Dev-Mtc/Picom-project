package fr.open.picom.exception;

public class UtilisateurExistantException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public UtilisateurExistantException(String message) {
		super(message);
	}

}
