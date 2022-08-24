package fr.open.picom.initialisation;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import fr.open.picom.dao.AdministrateurDao;
import fr.open.picom.dao.ArretDao;
import fr.open.picom.dao.ClientDao;
import fr.open.picom.dao.TrancheHoraireDao;
import fr.open.picom.dao.ZoneDao;
import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class AjoutDonneesInitiales implements CommandLineRunner {

	private final ZoneDao zoneDao;
	private final ArretDao arretDao;
	private final TrancheHoraireDao trancheHoraireDao;
	private final ClientDao clientDao;
	private final AdministrateurDao administrateurDao;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		ajouterZones();
		ajouterArrets();
		ajouterHoraires();
		ajouterClient();
		ajouterAdmin();

	}

	private void ajouterZones() {

	}

	private void ajouterArrets() {

	}

	private void ajouterHoraires() {

	}

	private void ajouterClient() {

	}

	private void ajouterAdmin() {

	}

}
