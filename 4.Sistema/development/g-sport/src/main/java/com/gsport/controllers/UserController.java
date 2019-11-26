package com.gsport.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping("/createUser")
	public String createUser(){
		return "user/createUserForm";
	}
}
