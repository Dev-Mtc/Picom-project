package fr.open.picom.service;

import java.util.List;

import fr.open.picom.business.Annonce;
import fr.open.picom.dto.AnnonceDto;

public interface AnnonceService {
	List<Annonce> findAnnonces();
	Annonce ajouterAnnonce(AnnonceDto annonce);
}
