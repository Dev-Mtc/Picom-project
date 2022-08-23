package fr.open.picom.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.open.picom.business.Administrateur;

public interface AdministrateurDao extends JpaRepository<Administrateur, Long> {

}
