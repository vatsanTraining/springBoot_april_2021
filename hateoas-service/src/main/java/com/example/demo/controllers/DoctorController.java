package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import com.example.demo.entity.*;
import com.example.demo.repos.DoctorRepository;
@RestController
public class DoctorController {

	
	
	@Autowired
	private DoctorRepository repo;
	
	@GetMapping(path = "/doctors")
	public CollectionModel<Doctor> getAllDoctors(){
		
		List<Doctor> docList = repo.findAll();
		
		 for (Doctor eachDoctor : docList) {
	           Set<Patient> patientList = eachDoctor.getPatientList();
	            for(Patient eachPatient : patientList) {
	              Link selfLink = WebMvcLinkBuilder.linkTo(PatientController.class)
	                  .slash("patients/"+eachPatient.getPatientId()).withSelfRel();
	              eachDoctor.add(selfLink);
	        	  
	            }
	               
	         }
	     
		 Link link = WebMvcLinkBuilder.linkTo(DoctorController.class)
				 .withSelfRel();
				       CollectionModel<Doctor> result =
				        CollectionModel.of(docList, link);
				       
				       return result;

		
	}
}
