package com.example.demo.clients;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

	
	@Autowired
	private HotelServiceClient service;
	
	@GetMapping(path = "/client/hotels")
	public String getAll() {
		
		return this.service.getAllHotels();
	}
}
