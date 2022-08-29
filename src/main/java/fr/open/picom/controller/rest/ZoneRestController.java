package fr.open.picom.controller.rest;

import java.util.List;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.open.picom.business.Zone;
import fr.open.picom.service.ZoneService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600)
@RestController
@RequestMapping("api/zones/")
@Validated
public class ZoneRestController {
	
	ZoneService zoneService;
	
	
	
	@GetMapping("all")
	public List<Zone> utilisateursGet() {
		return zoneService.findAllZones();
	}
	
	
	
}
