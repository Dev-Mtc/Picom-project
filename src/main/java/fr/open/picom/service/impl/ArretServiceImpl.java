package fr.open.picom.service.impl;

import java.util.List;

import fr.open.picom.business.Arret;
import fr.open.picom.business.Zone;
import fr.open.picom.dao.ArretDao;
import fr.open.picom.service.ArretService;

public class ArretServiceImpl implements ArretService{

	ArretDao arretDao;
	
	@Override
	public Arret enregistrerArret(Arret arret) {
		return arretDao.save(arret);
	}

	@Override
	public Arret recupererArret(Zone zone, Long id) {
		return null;
	}

	@Override
	public Arret modifierArret() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<Arret> recupererArrets() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean supprimerArret(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
