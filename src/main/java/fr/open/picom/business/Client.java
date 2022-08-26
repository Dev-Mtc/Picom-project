package fr.open.picom.business;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Entity
@Getter
@Setter
@AllArgsConstructor
public class Client extends Utilisateur {

	@NotBlank(message="Merci de préciser un numero de telephone")
	private String numeroDeTelephone;
	
	@JsonIgnore
	@OneToMany(mappedBy = "client")
	private List<Annonce> annonces;
	
	
	public Client(String nom, String prenom, String email, String password, String numeroDeTelephone) {
		super(nom, prenom, email, password);
		this.numeroDeTelephone = numeroDeTelephone;
	}
	
}
