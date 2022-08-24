package fr.open.picom.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.open.picom.business.Annonce;

public interface AnnonceDao extends JpaRepository<Annonce, Long> {
	
	List<Annonce> findAll();
	
	
}
