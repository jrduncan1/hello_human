package com.jduncan.hellohuman;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloHumanController {
	
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}

}
