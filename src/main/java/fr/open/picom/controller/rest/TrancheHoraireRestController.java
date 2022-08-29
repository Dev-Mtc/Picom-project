package fr.open.picom.controller.rest;

import java.util.List;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.open.picom.business.TrancheHoraire;
import fr.open.picom.service.TrancheHoraireService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600)
@RestController
@RequestMapping("api/tranchehoraire/")
@Validated
public class TrancheHoraireRestController {
	
	TrancheHoraireService trancheHoraireService;
	
	
	
	@GetMapping("all")
	public List<TrancheHoraire> utilisateursGet() {
		return trancheHoraireService.findAllTrancheHoraire();
	}
	
	
	
}
