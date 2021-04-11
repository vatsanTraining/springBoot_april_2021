package com.example.demo;

import java.time.LocalDate;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.repos.DoctorRepository;

@SpringBootApplication
public class HateoasServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HateoasServiceApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner runner() {
		
		return new CommandLineRunner() {
			
			@Autowired
			DoctorRepository repo;
			@Override
			public void run(String... args) throws Exception {
		
				Patient ram = new Patient(101,"Ram","flu");
				Patient shyam = new Patient(102,"shyam","fever");
				
			     HashSet<Patient> patientList = new HashSet<>();
			       patientList.add(ram);
			       patientList.add(shyam);
			       
			       Doctor kanna = new Doctor(899,"Rajesh Kanna",patientList);
			       
			       repo.save(kanna);
				
			}
		};
	}

}
