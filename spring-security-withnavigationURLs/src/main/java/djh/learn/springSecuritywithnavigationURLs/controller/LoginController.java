package djh.learn.springSecuritywithnavigationURLs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/loginPage")
	public String loginPage() {
		return "fancy-login";
	}
	

}
