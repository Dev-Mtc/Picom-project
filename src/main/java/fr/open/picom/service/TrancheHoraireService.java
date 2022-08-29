package fr.open.picom.service;

import java.util.List;

import fr.open.picom.business.TrancheHoraire;

public interface TrancheHoraireService {
	List<TrancheHoraire> findAllTrancheHoraire();
	
	TrancheHoraire findById(Long id);
}
