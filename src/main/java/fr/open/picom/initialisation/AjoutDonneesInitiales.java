package fr.open.picom.initialisation;

import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;


import fr.open.picom.business.Arret;
import fr.open.picom.business.TrancheHoraire;

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
	private final PasswordEncoder passwordEncoder;

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
		if (arretDao.count() == 0) {
		arretDao.save(new Arret("Invalides1", 1D, 1D));
		arretDao.save(new Arret("Invalides2", 2D, 2D));
		arretDao.save(new Arret("Invalides3", 3D, 3D));
		arretDao.save(new Arret("Invalides4", 4D, 4D));
		arretDao.save(new Arret("Invalides5", 5D, 5D));
		arretDao.save(new Arret("Invalides6", 6D, 6D));
		arretDao.save(new Arret("Invalides7", 7D, 7D));
		arretDao.save(new Arret("Invalides8", 8D, 8D));
		arretDao.save(new Arret("Invalides9", 9D, 9D));
		arretDao.save(new Arret("Invalides10", 10D, 10D));
		arretDao.save(new Arret("Invalides11", 11D, 11D));
		arretDao.save(new Arret("Invalides12", 12D, 12D));
		arretDao.save(new Arret("Invalides13", 13D, 13D));
		arretDao.save(new Arret("Invalides14", 14D, 14D));
		arretDao.save(new Arret("Invalides15", 15D, 15D));
		arretDao.save(new Arret("Invalides16", 16D, 16D));
		arretDao.save(new Arret("Invalides17", 17D, 17D));
		arretDao.save(new Arret("Invalides18", 18D, 18D));
		arretDao.save(new Arret("Invalides19", 19D, 19D));
		arretDao.save(new Arret("Invalides20", 20D, 20D));

		}

	}

	private void ajouterHoraires() {
		if (trancheHoraireDao.count() == 0) {
			trancheHoraireDao.save(new TrancheHoraire(6));
			trancheHoraireDao.save(new TrancheHoraire(7));
			trancheHoraireDao.save(new TrancheHoraire(8));
			trancheHoraireDao.save(new TrancheHoraire(9));
			trancheHoraireDao.save(new TrancheHoraire(10));
			trancheHoraireDao.save(new TrancheHoraire(11));
			trancheHoraireDao.save(new TrancheHoraire(12));
			trancheHoraireDao.save(new TrancheHoraire(13));
			trancheHoraireDao.save(new TrancheHoraire(14));
			trancheHoraireDao.save(new TrancheHoraire(15));
			trancheHoraireDao.save(new TrancheHoraire(16));
			trancheHoraireDao.save(new TrancheHoraire(17));
			trancheHoraireDao.save(new TrancheHoraire(18));
			trancheHoraireDao.save(new TrancheHoraire(19));

		}


	}

	private void ajouterClient() {
		Client clientTest = new Client();
		clientTest.setNom("Testeur");
		clientTest.setPrenom("Dev");
		clientTest.setEmail("client1@orsys.fr");
		clientTest.setMotDePasse(passwordEncoder.encode("12345678"));
		clientTest.setNumeroDeTelephone("079");
		clientDao.save(clientTest);
	}

	private void ajouterAdmin() {
		Administrateur admin = new Administrateur("Admin", "Test", "admin1@orsys.fr", passwordEncoder.encode("12345678"));
		administrateurDao.save(admin);
	}

}
