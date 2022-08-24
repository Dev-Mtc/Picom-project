package fr.open.picom.business;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
public class Client extends Utilisateur {

	@NotBlank(message="Merci de préciser un numero de telephone")
	private String numeroDeTelephone;
	
	@OneToMany
	private List<Annonce> annonces;
	
	
	public Client(String nom, String prenom, String email, String password, String numeroDeTelephone) {
		super(nom, prenom, email, password);
		this.numeroDeTelephone = numeroDeTelephone;
	}
	
}
