package com.tcs.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.tcs.service.MyUserDetailService;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
	@Autowired
	private MyUserDetailService userDetlsService;
	

	@Autowired
	public void configureUser(AuthenticationManagerBuilder auth)  throws Exception {
		auth.userDetailsService(userDetlsService).
		passwordEncoder(NoOpPasswordEncoder.getInstance());

	}

	@Bean
	public SecurityFilterChain securityConfig(HttpSecurity http) throws Exception {

		http.authorizeHttpRequests((req) -> req.antMatchers("/contact").permitAll().anyRequest().authenticated())
				.formLogin();

		return http.build();
	}

}
