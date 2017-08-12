package com.theironyard.com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/calculate")

public class CalculateController {

	
	@GetMapping("")
	public String justShowTheForm() {
	//because message-form is not an HTML (it is a snippet)
	// we need to use a form, therfor creating a new one 
		return "calculation/calculation-form-holder";
		
	}
	
		@PostMapping("")
	//inputs are left and right
		public String returnsTheSum(double right, double left, Model model) {
			double result = left + right;
			model.addAttribute("result", result);
			
//			the file path to the template we want to render (see {{> in the form)
			return "calculation/calculation-result";
		}
}

