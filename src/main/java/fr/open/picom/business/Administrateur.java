package fr.open.picom.business;

import javax.persistence.Entity;

import lombok.EqualsAndHashCode;

@Entity
@EqualsAndHashCode(callSuper = true)
public class Administrateur extends Utilisateur {
	public Administrateur( String nom, String prenom, String email, String motDePasse) {
		super(nom, prenom, email, motDePasse);

	}
	
	
}
