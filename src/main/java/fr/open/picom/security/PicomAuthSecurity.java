package fr.open.picom.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import fr.open.picom.security.event.AuthFail;
import fr.open.picom.security.event.AuthSuccess;
import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
public class PicomAuthSecurity {

	private UserDetailsService userDetailsService;
	private PasswordEncoder passwordEncoder;

	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

		http.csrf().disable()
				.formLogin().successHandler(authSuccess()).failureHandler(authFail())
				.and().httpBasic()		
				.and()
				.cors()
				.and()
				.authenticationManager(new AuthManager(userDetailsService, passwordEncoder)).authorizeRequests()
				.antMatchers("/h2-console/**").permitAll()
				.antMatchers("/api/annonces/**").hasAuthority("CLIENT")
				.antMatchers("/api/**").authenticated()
//				.antMatchers("/api/tarifs/**").hasRole("ADMIN")
				.antMatchers("/").authenticated()
				.and()
				.headers().frameOptions().disable();
		return http.build();

	}
	
	@Bean
	AuthenticationSuccessHandler authSuccess() {
		return new AuthSuccess();
	}
	@Bean
	AuthenticationFailureHandler authFail() {
		return new AuthFail();
	}
	
	

}
