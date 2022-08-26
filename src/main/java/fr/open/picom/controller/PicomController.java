package fr.open.picom.controller;
//
//import javax.servlet.http.HttpSession;
//import javax.validation.Valid;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//
//import fr.open.picom.business.Annonce;
//import fr.open.picom.business.Client;
//import fr.open.picom.business.Utilisateur;
//import fr.open.picom.service.TrancheHoraireService;
//import fr.open.picom.service.UtilisateurService;
//import fr.open.picom.service.ZoneService;
//import lombok.AllArgsConstructor;
//
//
//@Controller
//@AllArgsConstructor
public class PicomController {
//	
//	private UtilisateurService utilisateurService; 
//	private final HttpSession httpSession;
//	private final ZoneService zoneService;
//	private final TrancheHoraireService trancheHoraireService;
//	
//	@RequestMapping(value = { "/index"}, method = { RequestMethod.GET, RequestMethod.POST })
//	public ModelAndView picom() {
//		ModelAndView mav = new ModelAndView();
//		
//		mav.setViewName("index");
//
//		return mav;
//	}
//	@GetMapping("inscription")
//	public ModelAndView inscriptionGet(@ModelAttribute Client client) {
//
//		return new ModelAndView("inscription");
//	}
//	
//	@PostMapping("inscription")
//	public ModelAndView inscriptionPost(@Valid @ModelAttribute Utilisateur utilisateur, BindingResult result) {
//		if (result.hasErrors()) {
//	
//			return inscriptionGet(client);
//		} else {
//			utilisateurService.enregistrerUtilisateur(utilisateur);
//			return new ModelAndView("redirect:/");
//		}
//	}
//	
//	@GetMapping("connexion")
//	public ModelAndView connexionGet(@ModelAttribute Utilisateur utilisateur) {
//
//		return new ModelAndView("connexion");
//	}
//	
//	@PostMapping("connexion")
//	public ModelAndView connexionPost(@RequestParam("EMAIL") String email,
//			@RequestParam("MOT_DE_PASSE") String motDePasse) {
//		
//		Client clientAuth = utilisateurService.recupererUtilisateur(utilisateur);
//		
//		if (clientAuth == null) {
//	
//			return connexionGet(clientAuth);
//			
//		} else {
//			System.out.println("Connected");
//			httpSession.setAttribute("utilisateur", clientAuth);
//			return new ModelAndView("redirect:/");
//		}
//	}
//	
//
//
//	@GetMapping("annonces")
//	public ModelAndView annonceGet(@ModelAttribute Annonce annonce) {
//		ModelAndView mav =new ModelAndView("annonce");
//		mav.addObject("zones", this.zoneService.findAllZones());
//		mav.addObject("trancheHoraire", this.trancheHoraireService.findAllTrancheHoraire());
//		return mav;
//	}	
}
