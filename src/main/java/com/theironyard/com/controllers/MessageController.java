package com.theironyard.com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//anything starting with /message will be going to this Controller
@RequestMapping("/message")

public class MessageController {
	
	// note that the method we put in the message-form form is POST
	// by default the method is GET if not specified
	
	
	@GetMapping("")
	public String justShowTheForm() {
	//because message-form is not an HTML (it is a snippet)
	// we need to use a form, therfor creating a new one 
		return "messages/message-form-holder";
		
	}
	@PostMapping("")
	public String handleUserWords(String words, String action, Model model) {
		if (action.equals("shout") ) {
			String result = words.toUpperCase();
			model.addAttribute("result", result);
			
	//the word "result" in blue above refers to HTML
		} else {
			String result = words.toLowerCase();
			model.addAttribute("result", result);
		}
		return "messages/message-result";

	}
}
