package fr.open.picom.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

public class PicomAuthSecurity  {
	private UserDetailsService userDetailsService;
	private PasswordEncoder passwordEncoder;
    
    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		return null;
  
    }

}
