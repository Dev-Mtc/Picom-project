package fr.open.picom.service.impl;

import org.springframework.stereotype.Component;

import fr.open.picom.business.Client;
import fr.open.picom.dao.ClientDao;
import fr.open.picom.dao.UtilisateurDao;
import fr.open.picom.service.UtilisateurService;
import lombok.AllArgsConstructor;


@Component
@AllArgsConstructor
public class UtilisateurServiceImpl implements UtilisateurService{

	private ClientDao clientDao;
	private UtilisateurDao utilisateurDao;
	
	@Override
	public Client enregistrerUtilisateur(Client utilisateur) {
		
		return clientDao.save((Client)utilisateur);
	}


	@Override
	public Client recupererUtilisateur(String email, String motDePasse) {
		return (Client)clientDao.findUserByEmailPassword(email, motDePasse);
	}

}
