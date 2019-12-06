package com.gsport.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	/**** First Page ****/
	@GetMapping("/")
    public String root() {
        return "index";
    }
	
	/**** Login Page ****/
    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }
    
    /**** Create User Page ****/
    @GetMapping("/signup")
    public String userIndex() {
        return "user/signup";
    }
    
    /**** Alter Profile ****/
    @GetMapping("/profile")
    public String showProfile() {
        return "user/editProfile";
    }
    
    /**** Show Event Data ****/
    @GetMapping("/event")
    public String showEvent() {
        return "consultEvent";
    }
    
    /**** Show Event Data ****/
    @GetMapping("/home")
    public String goToHome() {
        return "home";
    }
}
