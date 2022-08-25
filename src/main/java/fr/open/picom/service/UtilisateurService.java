package fr.open.picom.service;

import java.util.List;

import fr.open.picom.business.Utilisateur;


public interface UtilisateurService {
	
		
	List<Utilisateur> recupererUtilisateurs();
	
	Utilisateur ajouterUtilisateur(Utilisateur utilisateur);
}
