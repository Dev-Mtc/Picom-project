package fr.open.picom.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.open.picom.business.Arret;
import fr.open.picom.business.TrancheHoraire;

public interface TrancheHoraireDao extends JpaRepository<TrancheHoraire, Long> {

	List<TrancheHoraire> findAll();
	
	List<TrancheHoraire> findAllByArret(Arret arret);
	
	Optional<TrancheHoraire> findById(Long id);
	
	
}
