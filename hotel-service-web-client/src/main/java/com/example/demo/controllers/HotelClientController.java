package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/v1/client")
public class HotelClientController {

	
	
	private WebClient client ;

	public HotelClientController() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@GetMapping(path = "/hotels")
	public Flux<String> getAllHotels(){
		
		
		return client.get()
		   .uri("lb://HOTEL-SERVICE/api/v1/hotels")
		    .retrieve()
		     .bodyToFlux(String.class);
		     
	}
}
