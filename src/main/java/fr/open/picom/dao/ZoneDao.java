package fr.open.picom.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.open.picom.business.Zone;

public interface ZoneDao extends JpaRepository<Zone, Long> {

}
