package fr.open.picom.service.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import fr.open.picom.business.Zone;
import fr.open.picom.dao.ZoneDao;
import fr.open.picom.service.ZoneService;
import lombok.AllArgsConstructor;


@Component // Spring va déduire que cette classe est un service
@AllArgsConstructor
public class ZoneServiceImpl implements ZoneService {
	
	private ZoneDao zoneDao;
	
	@Override
	public List<Zone> findAllZones() {
		return zoneDao.findAll();
	}

	@Override
	public Zone findById(Long id) {
	
		return zoneDao.findById(id).orElse(null);
	}

}
