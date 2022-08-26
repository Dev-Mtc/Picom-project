package fr.open.picom.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class PicomAuthSecurity {
	private UserDetailsService userDetailsService;
	private PasswordEncoder passwordEncoder;

	@Bean
	SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.csrf().disable().authenticationManager(new AuthManager(userDetailsService, passwordEncoder))
		.formLogin().loginPage("/index")
        .loginProcessingUrl("/login")
        .defaultSuccessUrl("/picom")
        .failureForwardUrl("/index?notification=Email%20ou%20mot%20de%20passe%20incorrect")
        .and()
        .logout()
        .logoutUrl("/deconnexion")
        .logoutSuccessUrl("/index?notification=Au%20revoir")
        .and()

        .authorizeRequests()
        .antMatchers("/h2-console").permitAll()  
        .antMatchers("/tarif").authenticated()
        .antMatchers("/tarifs").authenticated()
        .antMatchers("/annonce").authenticated()
        .antMatchers("/annonces").authenticated()
        .antMatchers("/diffusions").authenticated()
        .antMatchers("/diffusion").authenticated()
        .antMatchers("/utilisateurs").authenticated()

        
        // Pour la console H2 (à ne pas utiliser en prod)
        .and()
        .headers().frameOptions().disable();
		//http.authorizeRequests().anyRequest().permitAll();
        
       return http.build();
		

	}

}
