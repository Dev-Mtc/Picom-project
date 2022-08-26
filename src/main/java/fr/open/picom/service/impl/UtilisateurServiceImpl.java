package fr.open.picom.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import fr.open.picom.business.Client;
import fr.open.picom.business.Utilisateur;
import fr.open.picom.dao.UtilisateurDao;
import fr.open.picom.dto.ClientDto;
import fr.open.picom.exception.UtilisateurExistantException;
import fr.open.picom.service.UtilisateurService;
import lombok.AllArgsConstructor;


@Component
@AllArgsConstructor
public class UtilisateurServiceImpl implements UtilisateurService, UserDetailsService{

	private final UtilisateurDao utilisateurDao;
	private final PasswordEncoder passwordEncoder;

	@Override
	public List<Utilisateur> recupererUtilisateurs() {
		return utilisateurDao.findAll();
	}

	@Override
	public Utilisateur ajouterUtilisateur(Utilisateur utilisateur) {
		return utilisateurDao.save(utilisateur);
	}


	@Override
	public Client ajouterClient(ClientDto clientDto) {
		Client client = new Client();
		client.setNom(clientDto.getNom());
		client.setPrenom(clientDto.getPrenom());
		client.setEmail(clientDto.getEmail());
		client.setMotDePasse(clientDto.getMotDePasse());
		client.setNumeroDeTelephone(clientDto.getMotDePasse());
		return ajouterClient(client);
		
	}
	
	@Override
	public Client ajouterClient(Client client) {
		if (utilisateurDao.findByEmail(client.getEmail())!=null) {
			throw new UtilisateurExistantException();
		}
		client.setMotDePasse(passwordEncoder.encode(client.getMotDePasse()));
		utilisateurDao.save(client);
		return client;
	}
	

	/*
	 * Cette méthode aurait pu faire appel à un serveur externe (OAuth2)
	 * (alternative JWT)
	 * 
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		if (username.trim().isEmpty()) {
			throw new UsernameNotFoundException("username is empty");
		}

		Utilisateur utilisateur = utilisateurDao.findByEmail(username);
		if (utilisateur == null) {
			throw new UsernameNotFoundException("user " + username + " not found");
		}
		List<GrantedAuthority> grantedAuthorities = getGrantedAuthorities(utilisateur);
		User user = new User(utilisateur.getEmail(), utilisateur.getMotDePasse(), grantedAuthorities);
		System.out.println(user);
		return user;
	}

	

	private List<GrantedAuthority> getGrantedAuthorities(Utilisateur utilisateur) {
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
//        Set<Role> roles = utilisateur.getRoles();
//        for (Role role : roles) {
//        	authorities.add(new SimpleGrantedAuthority(role.getNom()));	
//		}
        return authorities;
    }
	

}
