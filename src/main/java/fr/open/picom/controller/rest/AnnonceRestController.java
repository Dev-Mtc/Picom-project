package fr.open.picom.controller.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.open.picom.business.Annonce;
import fr.open.picom.service.AnnonceService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600)
@RestController
@RequestMapping("api/annonces/")
public class AnnonceRestController {
	
	
	private AnnonceService annonceService;

	@GetMapping("/")
	public List<Annonce> annonceGet() {
		return annonceService.findAnnonces();
	}
	
	@PostMapping("new/annonce")
	@ResponseStatus(code=HttpStatus.CREATED)
	public Annonce annoncePost(@Valid @RequestBody Annonce annonce, BindingResult result) {
		
		return annonceService.ajouterAnnonce(annonce);		
	}
	
}
