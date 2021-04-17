package com.example.demo.services;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Hotel;

@RestController
@RequestMapping(path = "/api/v1")
public class HotelController {

	
	private HotelService service;

	public HotelController(HotelService service) {
		super();
		this.service = service;
	}
	
	
	@GetMapping(path = "/hotels")
	public List<Hotel> getAllHotels(){
		
		return this.service.getHotels();
	}
}
