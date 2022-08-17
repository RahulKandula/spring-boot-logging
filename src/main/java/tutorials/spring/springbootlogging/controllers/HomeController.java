package tutorials.spring.springbootlogging.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	private Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@GetMapping("/")
	public String hello() {
		log.trace("Hello executed.");
		return "Hello";
	}
	
}
