package com.tcs.service;

import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tcs.config.SecurityConfiguration;

@Service
public class MyUserDetailService implements UserDetailsService{
	private Logger logger=LoggerFactory.getLogger(SecurityConfiguration.class);


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		logger.info(" loadUserByUsername method is ccalled ");
		
		return new User ("shasha","root",Collections.emptyList());
	}

}
