package fr.open.picom.controller.rest;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.open.picom.business.Tarif;
import fr.open.picom.service.TarifService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600)
@RestController
@RequestMapping("api/tarifs")
public class TarifRestController {

	private final TarifService tarifService;
	
	/**
	 * 
	 * @return
	 */
	@GetMapping("")
	public List<Tarif> emotionsGet() {
		return tarifService.recupererTarifs();
	}
	
	@GetMapping("tarif/{id}")
	public Tarif tarifsGet(@PathVariable Long id) {
		return tarifService.recupererTarif(id);
	}
	
	@PostMapping("tarif")
	@ResponseStatus(HttpStatus.CREATED)
	public Tarif tarifsPostUtilisantLeCorpsDeLaRequete(@RequestBody Tarif tarif) {
		return tarifService.ajouterTarif(tarif);
	}
	
	@PutMapping("tarif")
	public Tarif tarifsPut(@RequestBody Tarif tarif) {
		return tarifService.mettreAJourTarif(tarif.getId(), tarif.getPrixEnEuros());
	}
	
	@DeleteMapping("tarif/{id}")
	public boolean tarifsDelete(@PathVariable Long id) {
		return tarifService.supprimerTarif(id);
	}
	
}
