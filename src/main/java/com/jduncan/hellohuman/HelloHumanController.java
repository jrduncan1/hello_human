package com.jduncan.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHumanController {
	
	@RequestMapping("/")
		
		public String index(@RequestParam(value="fname", required=false) String first_name,
							@RequestParam(value="lname", required=false) String last_name) {
			if(first_name == null && last_name == null) {
				return "Hello Human";
			} else if(first_name != null && last_name == null) {
			return "Hello " + first_name;
			}
			return "Hello " + first_name + " " + last_name;
		}

}
