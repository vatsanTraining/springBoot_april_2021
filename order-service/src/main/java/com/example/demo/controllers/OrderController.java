package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	
	
	@GetMapping(path = "/api/v1/orders")
	public String getOrder() {
		
		return "101,ramesh,2020-04-21,67000";
	}
}
