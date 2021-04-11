package com.example.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Invoice;
import com.example.demo.repos.InvoiceRepository;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Product Service"))
public class InvoiceServiceApplication {

	public static void main(String[] args) {
		
		String port =System.getProperty("server.port");
		
		System.out.println("PoRT :="+ port);
		
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
