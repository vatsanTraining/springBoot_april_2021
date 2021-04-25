package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {

	
	 @GetMapping("/")
	    public String home() {
	        return "home";
	    }

	@GetMapping(path = "/reviews")
	public String getReviews() {
		
		return "Average rating 4.5 out of 1230";
	}
}
