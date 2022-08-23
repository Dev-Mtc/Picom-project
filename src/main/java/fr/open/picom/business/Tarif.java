package fr.open.picom.business;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Tarif {
	@Id
	private Long id;

	@NotBlank(message="Merci de préciser le prix en euros")
	private double prixEnEuros;
	
	//to ask
	@OneToOne
	private Zone zone;
	
	
	@OneToOne
	private TrancheHoraire trancheHoraire;

}
