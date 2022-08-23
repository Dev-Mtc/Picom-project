package fr.open.picom.business;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public abstract class Utilisateur {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message="Merci de préciser un nom")
	private String nom;
	
	@NotBlank(message="Merci de préciser un prenom")
	private String prenom;
	
	@Email(message="Merci de préciser une adresse email au bon format")
	@NotBlank(message="Merci de préciser une adresse email")
	@Column(unique=true)
	@Pattern(regexp="^([A-Za-z0-9-])+(.[A-Za-z0-9-]+)*@orsys.fr$", message="Votre adresse doit faire partie du nom de domaine orsys.fr")
	private  String email;
	
	@NotBlank(message="Merci de préciser un mot de passe")
	private String motDePasse;

}
