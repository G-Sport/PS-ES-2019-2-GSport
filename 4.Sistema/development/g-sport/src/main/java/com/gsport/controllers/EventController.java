package com.gsport.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventController {
	
	@RequestMapping("/createEvent")
	public String form() {
		return "sportEvent/createEventForm";
	}
}
