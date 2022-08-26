package fr.open.picom.service;

import java.time.LocalDateTime;
import java.util.List;

import fr.open.picom.business.Diffusion;

public interface DiffusionService {

	List<Diffusion> recupererDiffusions();
	
	Diffusion recupererDiffusion(Long id);
	
}
