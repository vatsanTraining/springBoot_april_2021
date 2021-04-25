package com.example.demo.controllers;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {

	
	 @GetMapping("/")
	    public String home() {
	        return "home";
	    }

	@GetMapping(path = "/reviews")
	public String getReviews(Principal principal) {
		
		System.out.println(principal.getName());
		System.out.println(principal.toString());
		return "Average rating 4.5 out of 1230";
	}
}
