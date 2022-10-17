package com.gl.caseStudy17102022.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gl.caseStudy17102022.bean.Offer;
import com.gl.caseStudy17102022.service.MyUsersService;
import com.gl.caseStudy17102022.service.RechargeService;

//import com.gl.databaseAuthentication.service.MyService;

@RestController
public class LoginController {
	@Autowired
	private MyUsersService service;

	
	
	@GetMapping(value="/login")
	 public ModelAndView showLoginPage() {
		 return new ModelAndView("loginPage");
	 }
	
	@GetMapping(value="/loginerror")
	 public ModelAndView showErrorPage() {
		 return new ModelAndView("errorPage");
	 }

}
