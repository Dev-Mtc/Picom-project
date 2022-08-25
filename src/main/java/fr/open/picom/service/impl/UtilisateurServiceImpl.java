package fr.open.picom.service.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import fr.open.picom.business.Utilisateur;
import fr.open.picom.dao.UtilisateurDao;
import fr.open.picom.service.UtilisateurService;
import lombok.AllArgsConstructor;


@Component
@AllArgsConstructor
public class UtilisateurServiceImpl implements UtilisateurService{

	private UtilisateurDao utilisateurDao;

	@Override
	public List<Utilisateur> recupererUtilisateurs() {
		return utilisateurDao.findAll();
	}

	@Override
	public Utilisateur ajouterUtilisateur(Utilisateur utilisateur) {
		return utilisateurDao.save(utilisateur);
	}
	

}
