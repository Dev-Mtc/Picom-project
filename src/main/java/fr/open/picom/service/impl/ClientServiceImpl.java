package fr.open.picom.service.impl;

import fr.open.picom.business.Client;
import fr.open.picom.dao.ClientDao;
import fr.open.picom.service.ClientService;

public class ClientServiceImpl implements ClientService{

	private ClientDao clientDao;
	
	
	@Override
	public Client enregistrerUtilisateur(Client utilisateur) {
		
		return clientDao.save((Client)utilisateur);
	}

}
