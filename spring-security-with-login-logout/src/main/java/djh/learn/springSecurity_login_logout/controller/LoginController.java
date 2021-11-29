package djh.learn.springSecurity_login_logout.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("/loginPage")
	public String home() {
		return "plain-login";
	}
}
