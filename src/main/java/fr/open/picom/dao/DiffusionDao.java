package fr.open.picom.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.open.picom.business.Diffusion;

public interface DiffusionDao extends JpaRepository<Diffusion, Long> {

}
