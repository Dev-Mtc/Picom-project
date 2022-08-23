package fr.open.picom.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.open.picom.business.Tarif;

public interface TarifDao extends JpaRepository<Tarif, Long> {

}
