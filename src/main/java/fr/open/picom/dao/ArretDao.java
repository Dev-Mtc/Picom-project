package fr.open.picom.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.open.picom.business.Arret;
import fr.open.picom.business.Zone;

public interface ArretDao extends JpaRepository<Arret, Long> {
	
	List<Arret> findAll();
	
	List<Arret> findAllByZone(Zone zone);
	
	Arret findByNom(String nom);
	
	Optional<Arret> findById(Long id);
	
	Arret findByLongitudeAndLatitude(double longitude, double latitude);

}
