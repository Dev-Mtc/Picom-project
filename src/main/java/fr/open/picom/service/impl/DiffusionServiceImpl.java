package fr.open.picom.service.impl;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import fr.open.picom.business.Diffusion;
import fr.open.picom.service.DiffusionService;
import lombok.AllArgsConstructor;

@Component // Spring va déduire que cette classe est un service
@AllArgsConstructor
public class DiffusionServiceImpl implements DiffusionService {

	@Override
	public Diffusion recupererDiffusion(LocalDateTime dateHeureDiffusion, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
