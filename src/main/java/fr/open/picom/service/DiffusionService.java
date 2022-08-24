package fr.open.picom.service;

import java.time.LocalDateTime;

import fr.open.picom.business.Arret;
import fr.open.picom.business.Diffusion;
import fr.open.picom.business.Zone;

public interface DiffusionService {

	Diffusion recupererDiffusion(LocalDateTime dateHeureDiffusion, Long id);
	
}
