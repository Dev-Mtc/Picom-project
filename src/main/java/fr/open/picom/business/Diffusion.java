package fr.open.picom.business;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@AllArgsConstructor
@Data
public class Diffusion {
	
	@Id
	private Long id;
	private LocalDateTime dateHeureDiffusion;
	
	//to ask
	@OneToOne
	private Annonce annonce;
	
	//to ask
	@OneToOne
	private Arret arret;
}
