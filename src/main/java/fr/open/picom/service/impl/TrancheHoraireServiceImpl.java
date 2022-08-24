package fr.open.picom.service.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import fr.open.picom.business.TrancheHoraire;
import fr.open.picom.dao.TrancheHoraireDao;
import fr.open.picom.service.TrancheHoraireService;
import lombok.AllArgsConstructor;


@Component // Spring va déduire que cette classe est un service
@AllArgsConstructor
public class TrancheHoraireServiceImpl implements TrancheHoraireService{
	
	private TrancheHoraireDao trancheHoraireDao;
	
	
	@Override
	public List<TrancheHoraire> findAllTrancheHoraire() {

		return trancheHoraireDao.findAll();
	}

}
