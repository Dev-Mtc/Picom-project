package fr.open.picom.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.open.picom.business.TrancheHoraire;

public interface TrancheHoraireDao extends JpaRepository<TrancheHoraire, Long> {

}
