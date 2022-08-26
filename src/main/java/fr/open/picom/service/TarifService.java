package fr.open.picom.service;

import java.util.List;

import fr.open.picom.business.Tarif;

public interface TarifService {

	List<Tarif> recupererTarifs();
	
	Tarif recupererTarif(Long id);
	
	Tarif ajouterTarif(Tarif tarif);

	boolean supprimerTarif(Long id);
	
	Tarif mettreAJourTarif(Long id, double prixEnEuros);
}
