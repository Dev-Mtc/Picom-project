package fr.open.picom.initialisation;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import fr.open.picom.business.Administrateur;
import fr.open.picom.business.Client;
import fr.open.picom.business.Zone;
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
		
		zoneDao.save(new Zone("Republique"));
		zoneDao.save(new Zone("Avenue kennedy"));
		zoneDao.save(new Zone("Open"));
		zoneDao.save(new Zone("Developpeur"));
		zoneDao.save(new Zone("LA MEL"));
		
	}

	private void ajouterArrets() {

	}

	private void ajouterHoraires() {

	}

	private void ajouterClient() {
		Client clientTest = new Client();
		clientTest.setNom("Testeur");
		clientTest.setPrenom("Dev");
		clientTest.setEmail("client1@orsys.fr");
		clientTest.setMotDePasse("12345678");
		clientDao.save(clientTest);
	}

	private void ajouterAdmin() {
		Administrateur admin = new Administrateur("Admin", "Test", "admin1@orsys.fr", "12345678");
		administrateurDao.save(admin);
	}

}
