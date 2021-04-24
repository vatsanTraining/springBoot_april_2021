package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {

	
	
	@Autowired
	private RestTemplate template;
	
	@GetMapping(path = "/client")
	public String getReviews() {
		
		return template.getForObject("http://REVIEW-SERVICE/reviews", String.class);
		
		
	}
}
