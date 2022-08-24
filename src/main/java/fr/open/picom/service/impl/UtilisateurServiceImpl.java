package fr.open.picom.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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


	@Override
	public Page<Client> recupererUtilisateurs(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Client ajouterUtilisateur(String nom, String prenom, String email, String motDePasse) {
		// TODO Auto-generated method stub
		return null;
	}

}
