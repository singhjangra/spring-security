package djh.learn.springSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContentController {

	@RequestMapping("/")
	public String home() {
		return "home";
	}
}
