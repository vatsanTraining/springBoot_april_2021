package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Customer;
import com.example.demo.model.Product;

@Configuration
public class ApplicationConfig {

	@Bean
	public Customer suresh() {
		
		return new Customer(3001,"Suresh");
	}

	@Bean
	public Customer magesh() {
		
		return new Customer(3002,"Magesh");
	}
	
	@Bean()
	public Product laptop() {
		
		return new Product(106,"Dell",39000.00);
	}
	
	@Bean()
	public Product printer() {
		
		return new Product(109,"epson",9000.00);
	}
	

}
