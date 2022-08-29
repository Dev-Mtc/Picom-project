package fr.open.picom.business;

import javax.persistence.Entity;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Entity
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Administrateur extends Utilisateur {
	public Administrateur( String nom, String prenom, String email, String motDePasse) {
		super(nom, prenom, email, motDePasse);

	}
	
	
}
