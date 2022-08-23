package fr.open.picom.business;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@AllArgsConstructor
@Data
public class Arret {
	
	@Id
	private Long id;
	
	@NotBlank(message="Merci de préciser le nom de l'arret")
	private String nom;
	
	private double longitude;
	
	private double latitude;

	@ManyToOne
	private Zone zone;


}
