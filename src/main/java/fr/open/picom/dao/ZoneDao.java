package fr.open.picom.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.open.picom.business.Zone;

public interface ZoneDao extends JpaRepository<Zone, Long> {
	
	List<Zone> findAll();
	
	Zone findZoneByid(Long id);
	
	Zone findZoneByNom(String nom);

}
