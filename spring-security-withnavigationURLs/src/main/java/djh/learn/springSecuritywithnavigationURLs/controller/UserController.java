package djh.learn.springSecuritywithnavigationURLs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/leaders")
	public String leaders() {
		return "leaders";
	}
	@RequestMapping("/systems")
	public String systems() {
		return "systems";
	}
	
	@RequestMapping("/regular")
	public String regular() {
		return "regular";
	}
}
