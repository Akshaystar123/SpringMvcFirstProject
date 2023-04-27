package com.Bikkadit.SpringMvcFirstApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	@GetMapping("/welcomeMessage")
	public String welcome(Model model) {
		
		String welmsg="Welcome to Vishwaindu Mandap & Decorator's Sambhajinagar";
		
		model.addAttribute("MSG", welmsg);
		return "wel";
		
	}
}
