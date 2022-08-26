package fr.open.picom.controller.rest;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.open.picom.business.Diffusion;
import fr.open.picom.service.DiffusionService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600)
@RestController
@RequestMapping("api/")
public class DiffusionRestController {
	
	
	private final DiffusionService diffusionService;
	
	/**
	 * 
	 * @return
	 */
	@GetMapping("diffusions")
	public List<Diffusion> tarifsGet() {
		return diffusionService.recupererDiffusions();
	}

	@GetMapping("diffusion/{id}")
	public Diffusion tarifsGet(@PathVariable Long id) {
		return diffusionService.recupererDiffusion(id);
	}
	
}
