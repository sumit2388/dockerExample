package com.example.docker.dockerExample;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog")
public class Controller {
	@RequestMapping("/{userId}")
	public String getcatalog(@PathVariable("userId") String userId){
		
		return "TESTING";
		
	}
}
