package fr.open.picom.service;

import java.util.List;

import fr.open.picom.business.Arret;
import fr.open.picom.business.Zone;

public interface ArretService {

	Arret enregistrerArret(Arret arret);
	
	Arret recupererArret(Zone zone, Long id);
	
	List<Arret> recupererArrets();

	Arret modifierArret();
	
	boolean supprimerArret(Long id);
	
	
	
	

}
