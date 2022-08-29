package fr.open.picom.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import fr.open.picom.business.Administrateur;
import fr.open.picom.business.Client;
import fr.open.picom.business.Utilisateur;
import fr.open.picom.dao.ClientDao;
import fr.open.picom.dao.UtilisateurDao;
import fr.open.picom.dto.ClientDto;
import fr.open.picom.exception.UtilisateurExistantException;
import fr.open.picom.service.UtilisateurService;
import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class UtilisateurServiceImpl implements UtilisateurService, UserDetailsService{

	private final UtilisateurDao utilisateurDao;
	private final ClientDao clientDao;

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
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		if(username.trim().isEmpty()) {
			throw new UsernameNotFoundException("username is empty");
		}
		
		Utilisateur userFind = utilisateurDao.findByEmail(username);
		
		if(userFind == null) 
			throw new UsernameNotFoundException("user " + username + " not found");
			
	 
		
   	 	List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
   	 	
        if(userFind instanceof Administrateur) authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        
        else if (userFind instanceof Client) authorities.add(new SimpleGrantedAuthority("ROLE_CLIENT"));
        
        
       	User user = new User(userFind.getEmail(), userFind.getMotDePasse(), authorities);
       	System.out.println(user);

       	return user;
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
			throw new UtilisateurExistantException("Email déjà utilisé !");
		}
		client.setMotDePasse(passwordEncoder.encode(client.getMotDePasse()));
		utilisateurDao.save(client);
		return client;
	}
	
	
	public ClientDto getInfoUserByEmail(String email) {
		
		Client clientFind= clientDao.findUserByEmail(email);
		ClientDto clientSend = new ClientDto();
		
		clientSend.setEmail(clientFind.getEmail());
		clientSend.setNom(clientFind.getNom());
		clientSend.setNumeroDeTelephone(clientFind.getNumeroDeTelephone());
		clientSend.setPrenom(clientFind.getPrenom());
		
		
		return clientSend;
		
	}
	
}
