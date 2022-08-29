package fr.open.picom.controller.rest;

import java.util.List;

import javax.annotation.security.RolesAllowed;
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
import fr.open.picom.dto.AnnonceDto;
import fr.open.picom.service.AnnonceService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600)
@RestController
@RequestMapping("api/annonces/")
public class AnnonceRestController {
	
	//Déclaration des service utilisé 
	private AnnonceService annonceService;

	/**
	 * Methode qui renvoi la liste des annonces disponnible dans la base de données
	 * @return listes d'annonces
	 */
	@GetMapping(path="all")
	@RolesAllowed("CLIENT")
	public List<Annonce> annonceGet() {
		return annonceService.findAnnonces();
	}

	/** 
	 * Cette méthode renvoie une page d'utilisateur
	 * @param annonce contient le corp de l'annonce 
	 * @return l'annonce crée
	 */
	@PostMapping("new/annonce")
	@RolesAllowed("CLIENT")
	@ResponseStatus(code=HttpStatus.CREATED)
	public Annonce annoncePost(@Valid @RequestBody AnnonceDto annonce, BindingResult result) {
		return annonceService.ajouterAnnonce(annonce);		
	}
	
}
