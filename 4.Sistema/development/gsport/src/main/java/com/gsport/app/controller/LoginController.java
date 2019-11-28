package com.gsport.app.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gsport.app.models.User;

@Controller
public class LoginController {
	
	//to get login form
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String getLoginForm() {
		//return html page name
			return "login";
	}
	
	//check for login credentials
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@ModelAttribute (name="loginForm") User user, Model model) {
		String email = user.getEmail();
		String password = user.getPassword();
		
		if("g-sport@gmail.com".equals(email) && "admin".equals(password)) {
			return"home";
		}
			//if username or password is wrong
			model.addAttribute("invalidCredentials", true);
			return "login";
		}
	}
