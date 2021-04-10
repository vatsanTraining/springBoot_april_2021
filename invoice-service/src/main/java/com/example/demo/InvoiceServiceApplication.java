package com.example.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Invoice;
import com.example.demo.repos.InvoiceRepository;

@SpringBootApplication
public class InvoiceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvoiceServiceApplication.class, args);
	}

	
	@Bean
	public CommandLineRunner runner() {
		
		return new CommandLineRunner() {
			
			@Autowired
			InvoiceRepository repo;
			@Override
			public void run(String... args) throws Exception {
		
				repo.save(new Invoice(101,"Ramesh",LocalDate.of(2021, 4, 8),6000));
				repo.save(new Invoice(102,"Suresh",LocalDate.of(2021, 3, 28),7000));
				
			}
		};
	}
}
