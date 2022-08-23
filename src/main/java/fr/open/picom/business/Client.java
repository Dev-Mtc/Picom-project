package fr.open.picom.business;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Client extends Utilisateur {

	@NotBlank(message="Merci de préciser un numero de telephone")
	private String numeroDeTelephone;
	
	@OneToMany
	private List<Annonce> annonces;
	
}
