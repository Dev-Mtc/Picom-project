package fr.open.picom.security.event;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import com.fasterxml.jackson.databind.ObjectMapper;

public class AuthFail implements AuthenticationFailureHandler {

	private ObjectMapper serializer = new ObjectMapper();
	

	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException exception) throws IOException, ServletException {
		
		response.setStatus(HttpStatus.FORBIDDEN.value());
		Map<String, Object> body = new HashMap<>();

		body.put("error", "Echec de l'authentification");
		
		response.getOutputStream().println(serializer.writeValueAsString(body));
	}

}
