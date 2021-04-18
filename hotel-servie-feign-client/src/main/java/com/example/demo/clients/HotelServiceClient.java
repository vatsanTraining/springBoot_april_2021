package com.example.demo.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;
@FeignClient(name = "HOTEL-SERVICE")
public interface HotelServiceClient {

	
	@GetMapping(path = "/api/v1/hotels")
	public String getAllHotels();
}
