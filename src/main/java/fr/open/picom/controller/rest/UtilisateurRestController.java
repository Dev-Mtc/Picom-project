package fr.open.picom.controller.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import fr.open.picom.business.Client;
import fr.open.picom.business.Utilisateur;
import fr.open.picom.dto.ClientDto;
import fr.open.picom.exception.UtilisateurExistantException;
import fr.open.picom.service.UtilisateurService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600)
@RestController
@RequestMapping("api/utilisateurs/")
@Validated
public class UtilisateurRestController {
	
	UtilisateurService utilisateurService;
	
	//TODO create ClientDto object
	
	@GetMapping("utilisateurs")
	public List<Utilisateur> utilisateursGet() {
		return utilisateurService.recupererUtilisateurs();
	}
	
	@PostMapping("utilisateur")
	@ResponseStatus(HttpStatus.CREATED)
	public Utilisateur utilisateurPost(@RequestBody Utilisateur utilisateur) {
		return utilisateurService.ajouterUtilisateur(utilisateur);
	}
	
	
	@PostMapping(value = "clientsDto")
	@ResponseStatus(code = HttpStatus.CREATED)
	public ClientDto ajouterUtilisateur(@Valid @RequestBody ClientDto clientDto, BindingResult result) {

		Client client = new Client();
		client.setNom(clientDto.getNom());
		client.setPrenom(clientDto.getPrenom());
		client.setEmail(clientDto.getEmail());
		client.setMotDePasse(clientDto.getMotDePasse());
		client.setNumeroDeTelephone(clientDto.getMotDePasse());
		utilisateurService.ajouterClient(clientDto);
		return clientDto;
	}
	
	@ExceptionHandler(UtilisateurExistantException.class)
	@ResponseStatus(code=HttpStatus.CONFLICT)
	public String traiterUtilisateurDejaExistant(Exception exception) {
		return exception.getMessage();
	}
	
}
