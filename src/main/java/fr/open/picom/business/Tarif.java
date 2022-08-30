package fr.open.picom.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import io.micrometer.core.lang.NonNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tarif {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	
	
	@NonNull
	//@NotBlank(message = "Merci de préciser le prix en euros")
	private double prixEnEuros;

	@NonNull
	@OneToOne
	private Zone zone;
	
	@NonNull
	@ManyToOne
	private TrancheHoraire trancheHoraire;

}
