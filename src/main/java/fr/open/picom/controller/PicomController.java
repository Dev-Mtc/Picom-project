package fr.open.picom.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import fr.open.picom.business.Client;
import fr.open.picom.business.Utilisateur;
import fr.open.picom.service.ClientService;




@Controller
public class PicomController {
	
	private ClientService clientService; 
	
	@RequestMapping(value = { "/index"}, method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView picom() {
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("index");

		return mav;
	}
	@GetMapping("inscription")
	public ModelAndView inscriptionGet(@ModelAttribute Utilisateur utilisateur) {

		return new ModelAndView("inscription");
	}
	
	@PostMapping("inscription")
	public ModelAndView inscriptionPost(@Valid @ModelAttribute Client utilisateur, BindingResult result) {
		if (result.hasErrors()) {
	
			return inscriptionGet(utilisateur);
		} else {
			clientService.enregistrerUtilisateur(utilisateur);
			return new ModelAndView("redirect:/");
		}
	}
	
	@GetMapping("connexion")
	public ModelAndView connexionGet(@ModelAttribute Utilisateur utilisateur) {

		return new ModelAndView("connexion");
	}
	
}
