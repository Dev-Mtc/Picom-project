package fr.open.picom.business;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@AllArgsConstructor
@Data
public class Annonce {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDateTime dateHeureCreation;
	private LocalDateTime dateHeureDebut;
	private LocalDateTime dateHeureFin;
	private String contenu;
	
	
	@NotBlank(message="Merci de préciser un numero de carte")
	private String numeroCarte;
	
	@NotBlank(message="Merci de préciser l'annee de l'expiration")
	private int anneeExpiration;
	
	@NotBlank(message="Merci de préciser une adresse email")
	private byte moisExpiration;
	
	@NotBlank(message="Merci de préciser le CIV")
	private String cryptoGramme;
	
	@NotBlank(message="Merci de préciser le montant")
	private double montantRegleEnEuros;
	
	//todo utilsateur annonce non necessaire
	@ManyToOne
	private Client client;
	
	// verifier l'attribut mappedby
	@ManyToMany
	private List<TrancheHoraire> trancheHoraires;
	
	@ManyToMany
	private List<Zone> zones;
	
	
}
