package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Patient;
import com.example.demo.repos.PatientRepository;

@RestController
@RequestMapping(path = "/api/v1")
public class PatientController {

	
	
	@Autowired
	private PatientRepository repo;
	
	
	@GetMapping(path = "/patients/{id}")
	public Patient getPatientById(@PathVariable("id") int id) {
		
		return this.repo.findById(id).get();
	}
}
