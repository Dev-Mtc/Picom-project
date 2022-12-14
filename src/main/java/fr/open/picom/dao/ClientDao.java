package fr.open.picom.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.open.picom.business.Client;
import fr.open.picom.business.Utilisateur;

public interface ClientDao extends JpaRepository<Client, Long> {
	@Query("SELECT u FROM Utilisateur u WHERE u.email = :email AND u.motDePasse = :password ")
    Utilisateur findUserByEmailPassword(@Param("email") String email, @Param("password") String password);
	
}
