package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

import com.example.demo.entity.Hotel;
import com.example.demo.repos.HotelRepository;

@Service
public class HotelService {

	private HotelRepository  repo;

	
	public HotelService(HotelRepository repo) {
		super();
		this.repo = repo;
	}
	
	public List<Hotel> getHotels(){
		return this.repo.findAll();
	}
	
	public Hotel getHotelById(int id) {
		
		return this.repo.findById(id).get();
	}
}
