package com.theironyard.com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")

public class HomeController {
	@GetMapping("")
	
	public String showHomePage() {
		return "home/default";
		 //this is a file inside template/home directory
	}


}
