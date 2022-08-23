package fr.open.picom.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.open.picom.business.Client;

public interface ClientDao extends JpaRepository<Client, Long> {

}
