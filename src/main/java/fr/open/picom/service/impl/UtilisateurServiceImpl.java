package fr.open.picom.service.impl;

import org.springframework.stereotype.Component;

import fr.open.picom.business.Client;
import fr.open.picom.dao.ClientDao;
import fr.open.picom.service.UtilisateurService;
import lombok.AllArgsConstructor;


@Component
@AllArgsConstructor
public class UtilisateurServiceImpl implements UtilisateurService{

	private ClientDao clientDao;
	
	
	@Override
	public Client enregistrerUtilisateur(Client utilisateur) {
		
		return clientDao.save((Client)utilisateur);
	}

}
