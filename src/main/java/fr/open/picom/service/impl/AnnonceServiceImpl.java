package fr.open.picom.service.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import fr.open.picom.business.Annonce;
import fr.open.picom.dao.AnnonceDao;
import fr.open.picom.service.AnnonceService;
import lombok.AllArgsConstructor;


@Component // Spring va déduire que cette classe est un service
@AllArgsConstructor
public class AnnonceServiceImpl implements AnnonceService {
	
	private final AnnonceDao annonceDao;

	@Override
	public List<Annonce> findAnnonces() {
		
		return annonceDao.findAll();
	}

	@Override
	public Annonce ajouterAnnonce(Annonce annonce) {
		// TODO Auto-generated method stub
		return annonceDao.save(annonce);
	}
	
	
	
	
}