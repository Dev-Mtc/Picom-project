package fr.open.picom.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.open.picom.business.Administrateur;

public interface AdministrateurDao extends JpaRepository<Administrateur, Long> {

	List<Administrateur> findAll();
	
	Optional<Administrateur> findById(Long id);
	
	Administrateur findByEmail(String email);
	
	Administrateur findByNomAndPrenom(String nom, String prenom);
	
	
	
	
	
}
