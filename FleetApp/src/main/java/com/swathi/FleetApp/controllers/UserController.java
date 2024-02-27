package com.swathi.FleetApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController { 
	
	@GetMapping("/User")
	public String getUser(){ 
		return "User";
		
	}

}
