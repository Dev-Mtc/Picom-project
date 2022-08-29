package fr.open.picom.service;

import java.util.List;

import fr.open.picom.business.Tarif;
import fr.open.picom.dto.TarifDto;

public interface TarifService {

	List<Tarif> recupererTarifs();
	
	Tarif recupererTarif(Long id);
	
	Tarif ajouterTarif(TarifDto tarif);

	boolean supprimerTarif(Long id);
	
	Tarif mettreAJourTarif(Long id, double prixEnEuros);
}
