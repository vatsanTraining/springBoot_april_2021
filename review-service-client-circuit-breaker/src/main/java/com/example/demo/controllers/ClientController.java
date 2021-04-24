package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class ClientController {

	
	
	@Autowired
	private RestTemplate template;
	
	@GetMapping(path = "/client")
	@CircuitBreaker(name="reviewService",fallbackMethod = "fallBack")
	public ResponseEntity<String> getReviews() {
		
		String resp =template.getForObject("http://REVIEW-SERVICE/reviews", String.class);
		
		return new ResponseEntity(resp,HttpStatus.OK);
	}
	
	
	
	public ResponseEntity<String> fallBack(Exception e){
		
		return new ResponseEntity("Item Service is Down",HttpStatus.OK);

		
	}
}
