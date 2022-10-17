package com.gl.caseStudy17102022.bean;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;


@Entity
public class MyUsers extends User {
	@Id
	private String userName;
	private String password;
	public MyUsers() {
		super("Marigold","Mango",new ArrayList<>());
	}

	
	public MyUsers(String username, String password, Collection<? extends GrantedAuthority> authorities,String username2,String password2) {
		super(username, password, authorities);
		username=username2;
		password=password2;
		
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	}