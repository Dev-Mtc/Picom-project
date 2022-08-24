package fr.open.picom.business;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class TrancheHoraire {
	@Id
	private Long id;
	
	private int debut;
	
	@ManyToMany
	private List<Annonce> annonce;
	
	@ManyToOne
	private Arret arret;
	
	public TrancheHoraire(int debut) {
		this.debut = debut;
	}
	
}
