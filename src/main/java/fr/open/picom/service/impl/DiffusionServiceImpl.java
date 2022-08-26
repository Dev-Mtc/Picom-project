package fr.open.picom.service.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import fr.open.picom.business.Diffusion;
import fr.open.picom.dao.DiffusionDao;
import fr.open.picom.service.DiffusionService;
import lombok.AllArgsConstructor;

@Component // Spring va déduire que cette classe est un service
@AllArgsConstructor
public class DiffusionServiceImpl implements DiffusionService {

	DiffusionDao diffusionDao;
	
	@Override
	public List<Diffusion> recupererDiffusions() {
		return diffusionDao.findAll();
	}

	@Override
	public Diffusion recupererDiffusion(Long id) {
		return diffusionDao.findById(id).orElse(null);	}


}
