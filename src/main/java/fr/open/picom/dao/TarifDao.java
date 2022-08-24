package fr.open.picom.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.open.picom.business.Tarif;
import fr.open.picom.business.TrancheHoraire;
import fr.open.picom.business.Zone;

public interface TarifDao extends JpaRepository<Tarif, Long> {

	Tarif findByZone(Zone zone);
	
	List<Tarif> findAll();
	
	Tarif findByTrancheHoraire(TrancheHoraire trancheHoraire);
	
	Tarif findByPrixEnEuros(double prixEnEuros);
	
}
