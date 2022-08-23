package fr.open.picom.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.open.picom.business.Arret;

public interface ArretDao extends JpaRepository<Arret, Long> {

}
