package fr.open.picom.service;

import fr.open.picom.business.Client;


public interface UtilisateurService {
	
	
	Client enregistrerUtilisateur(Client utilisateur);
	
	
	Client recupererUtilisateur(String email, String motDePasse);
}
