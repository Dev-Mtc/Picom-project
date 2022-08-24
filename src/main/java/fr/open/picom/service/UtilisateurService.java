package fr.open.picom.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import fr.open.picom.business.Client;


public interface UtilisateurService {
	
	
	Client enregistrerUtilisateur(Client utilisateur);
	
	Client recupererUtilisateur(String email, String motDePasse);
	
	Page<Client> recupererUtilisateurs(Pageable pageable);
	
	Client ajouterUtilisateur(String nom, String prenom, String email, String motDePasse);


}
