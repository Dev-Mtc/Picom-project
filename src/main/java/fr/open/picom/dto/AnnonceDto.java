package fr.open.picom.dto;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Lob;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.micrometer.core.lang.Nullable;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@Data
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
public class AnnonceDto {

	private LocalDateTime dateHeureCreation;
	private LocalDateTime dateHeureDebut;
	private LocalDateTime dateHeureFin;
	
	@Lob
	private String contenu;
	
	
	//@NotBlank(message="Merci de préciser un numero de carte")
	private String numeroCarte;
	
	//@NotBlank(message="Merci de préciser l'annee de l'expiration")
	@Nullable
	private int anneeExpiration;
	
	//@NotBlank(message="Merci de préciser un mois d'expiration")
	@Nullable
	private byte moisExpiration;
	
	//@NotBlank(message="Merci de préciser le CIV")
	private String cryptoGramme;
	
	//@NotBlank(mesObjectMapper  sage="Merci de préciser le montant")
	@Nullable
	private double montantRegleEnEuros;
	
	
	@JsonIgnore
	private String clientEmail;
	
	
	private List<Long> trancheHorairesId;
	
	private List<Long> zonesId;

	
}
