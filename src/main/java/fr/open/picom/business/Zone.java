package fr.open.picom.business;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@AllArgsConstructor
@Data
public class Zone {
	@Id
	private Long id;
	
	@NotBlank(message="Merci de le nom de la zone")
	private String nom;
	
	@ManyToMany
	private List<Annonce> annonces;
	
	@OneToMany
	private List<Arret> arrets;
}
