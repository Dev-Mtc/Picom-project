package fr.open.picom.security.event;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.fasterxml.jackson.databind.ObjectMapper;

import fr.open.picom.service.UtilisateurService;

public class AuthSuccess implements AuthenticationSuccessHandler {

	private ObjectMapper serializer = new ObjectMapper();
	@Autowired
	private UtilisateurService userservice;
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			Authentication authentication) throws IOException, ServletException {
				
		
		Map<String, Object> body = new HashMap<>();
		if(authentication.getAuthorities().contains(new SimpleGrantedAuthority("ROLE_ADMIN"))) {
			body.put("username", authentication.getName());
			body.put("role", authentication.getAuthorities());
		}else {
			body.put("user", userservice.getInfoUserByEmail(authentication.getName()));	
			body.put("role", authentication.getAuthorities());
		}
		
		
		response.setStatus(HttpStatus.ACCEPTED.value());

		response.getOutputStream().println(serializer.writeValueAsString(body));
		
	}

}
