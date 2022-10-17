package com.gl.caseStudy17102022.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.gl.caseStudy17102022.bean.MyUsers;
import com.gl.caseStudy17102022.dao.MyUsersRepository;


@Service
public class MyUsersService implements UserDetailsService{
	@Autowired
	private MyUsersRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		return repository.findById(username).get();
	}
	public void save(MyUsers users) {
		repository.save(users);
	}

}
