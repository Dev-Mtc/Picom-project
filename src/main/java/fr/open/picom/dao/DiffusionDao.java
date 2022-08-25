package fr.open.picom.dao;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.open.picom.business.Annonce;
import fr.open.picom.business.Arret;
import fr.open.picom.business.Diffusion;

public interface DiffusionDao extends JpaRepository<Diffusion, Long> {

	Diffusion findByDateHeureDiffusionAndArret(LocalDateTime dateHeureDiffusion, Arret arret);
	
	Optional<Diffusion> findById(Long id);
	
	List<Diffusion> findAll();
	
	Diffusion findByAnnonce(Annonce annonce);
	
	Diffusion findByArret(Arret arret);
	
}
