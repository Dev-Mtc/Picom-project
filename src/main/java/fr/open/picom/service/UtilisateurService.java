package fr.open.picom.service;

import java.util.List;

import javax.validation.Valid;

import fr.open.picom.business.Client;
import fr.open.picom.business.Utilisateur;
import fr.open.picom.dto.ClientDto;


public interface UtilisateurService {
	
		
	List<Utilisateur> recupererUtilisateurs();
	
	Utilisateur ajouterUtilisateur(Utilisateur utilisateur);
	
	Client ajouterClient(@Valid Client client);
	
	Client ajouterClient(@Valid ClientDto clientDto);

	ClientDto getInfoUserByEmail(String email);
}
