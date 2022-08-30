package fr.open.picom.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import fr.open.picom.business.Annonce;
import fr.open.picom.business.TrancheHoraire;
import fr.open.picom.business.Zone;
import fr.open.picom.dao.AnnonceDao;
import fr.open.picom.dto.AnnonceDto;
import fr.open.picom.service.AnnonceService;
import fr.open.picom.service.TrancheHoraireService;
import fr.open.picom.service.UtilisateurService;
import fr.open.picom.service.ZoneService;
import lombok.AllArgsConstructor;


@Component // Spring va déduire que cette classe est un service
@AllArgsConstructor
public class AnnonceServiceImpl implements AnnonceService {
	
	private final AnnonceDao annonceDao;
	private final UtilisateurService utilisateurService;
	private final ZoneService zoneService;
	private final TrancheHoraireService thService;
	@Override
	public List<Annonce> findAnnonces() {
		
		return annonceDao.findAll();
	}

	@Override
	public Annonce ajouterAnnonce(AnnonceDto annonce) {
		Annonce annonceSave = new Annonce();
		
		List<Zone> zones = new ArrayList<>();
		System.out.println(annonce.getZonesId());
		System.out.println(annonce.getTrancheHorairesId());
		
		for(Long zoneId : annonce.getZonesId()) zones.add(zoneService.findById(zoneId));
		
		List<TrancheHoraire> tranchesHoraires = new ArrayList<>();
		
		for(Long thId : annonce.getTrancheHorairesId()) tranchesHoraires.add(thService.findById(thId));
		
		
		annonceSave.setDateHeureCreation(annonce.getDateHeureCreation());
		annonceSave.setDateHeureDebut(annonce.getDateHeureDebut());
		annonceSave.setDateHeureFin(annonce.getDateHeureFin());
		annonceSave.setContenu(annonce.getContenu());
		annonceSave.setNumeroCarte(annonce.getNumeroCarte());
		annonceSave.setAnneeExpiration(annonce.getAnneeExpiration());
		annonceSave.setCryptoGramme(annonce.getCryptoGramme());
		annonceSave.setMontantRegleEnEuros(annonce.getMontantRegleEnEuros());
		annonceSave.setClient(utilisateurService.getClientByUserName(annonce.getClientEmail()));
		annonceSave.setZones(zones);
		annonceSave.setTrancheHoraires(tranchesHoraires);
		
		return annonceDao.save(annonceSave);
	}
	
	
	
	
}