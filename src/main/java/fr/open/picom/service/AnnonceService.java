package fr.open.picom.service;

import java.util.List;

import fr.open.picom.business.Annonce;

public interface AnnonceService {
	List<Annonce> findAnnonces();
	Annonce ajouterAnnonce(Annonce annonce);
}
