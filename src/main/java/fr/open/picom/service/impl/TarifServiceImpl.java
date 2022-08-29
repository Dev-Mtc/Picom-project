package fr.open.picom.service.impl;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import fr.open.picom.business.Tarif;
import fr.open.picom.dao.TarifDao;
import fr.open.picom.dto.TarifDto;
import fr.open.picom.service.TarifService;
import fr.open.picom.service.TrancheHoraireService;
import fr.open.picom.service.ZoneService;
import lombok.AllArgsConstructor;


@Component // Spring va déduire que cette classe est un service
@AllArgsConstructor
public class TarifServiceImpl implements TarifService{
	
	TarifDao tarifDao;
	ZoneService zoneService;
	TrancheHoraireService trancheHoraireService;
	
	@Override
	public List<Tarif> recupererTarifs() {
		return tarifDao.findAll();
	}

	@Override
	public Tarif recupererTarif(Long id) {
		return tarifDao.findById(id).orElse(null);
	}

	@Override
	public Tarif ajouterTarif(TarifDto tarif) {
		Tarif tarifSave = new Tarif();
		tarifSave.setPrixEnEuros(tarif.getPrixEnEuros());
		//tarifSave.setTrancheHoraire(trancheHoraireService.));
		//tarifSave.setZone(zoneService.find);
		return tarifDao.save(tarifSave);
	}

	@Transactional
	@Override
	public boolean supprimerTarif(Long id) {
		Tarif tarif = recupererTarif(id);
		if (tarif==null) {
			return false;
		} else {
			tarifDao.delete(tarif);
			return true;
		}
	}

	@Override
	public Tarif mettreAJourTarif(Long id, double prixEnEuros) {
		Tarif tarif = recupererTarif(id);
		tarif.setPrixEnEuros(prixEnEuros);
		return tarifDao.save(tarif);
	}

}
