package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/client")
public class HotelClientController {

	
	
	private WebClient client ;

	
	
	public HotelClientController(WebClient client) {
		super();
		this.client = client;
	}



	@GetMapping(path = "/hotels")
	public Flux<String> getAllHotels(){
		
		
		return client.get()
		   .uri("lb://HOTEL-SERVICE/api/v1/hotels")
		    .retrieve()
		     .bodyToFlux(String.class);
		     
	}
	
	
	@GetMapping(path = "/hotels/{id}")
	public Mono<String> getHotelById(@PathVariable("id") int id){
		
		
		return client.get()
		   .uri("lb://HOTEL-SERVICE/api/v1/hotels/{id}",101)
		    .retrieve()
		     .bodyToMono(String.class);
		     
	}
}
