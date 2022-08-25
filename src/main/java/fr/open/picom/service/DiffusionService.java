package fr.open.picom.service;

import java.time.LocalDateTime;

import fr.open.picom.business.Diffusion;

public interface DiffusionService {

	Diffusion recupererDiffusion(LocalDateTime dateHeureDiffusion, Long id);
	
}
