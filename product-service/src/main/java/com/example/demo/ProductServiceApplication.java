package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.example.demo.model.Customer;
import com.example.demo.model.Invoice;
import com.example.demo.model.Product;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class ProductServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(ProductServiceApplication.class, args);
	
		
		
	//	Product tv = ctx.getBean(Product.class);
		
		// Use the overloaded getBean Method which takes the id and also the type of Bean
		
		Product tv = ctx.getBean("fridge",Product.class);
		
		log.info(tv.toString());
		
		log.info("IoC Container -Reference"+ctx.getClass().getName());
		
		
		Invoice inv1 = ctx.getBean("inv1",Invoice.class);
		
		
		log.info(inv1.toString());
	
		ctx.close();
	}
	
	// Create a Factory Method to register Bean 
	
	@Bean()
	public Product tv() {
		
		return new Product(101,"Sony Tv",34000.00);
	}
	
	@Bean
	@Primary
	public Product fridge() {
		
		return new Product(102,"Samsung",24000.00);
	}
	
	@Bean
	public Customer ramesh() {
		
		return new Customer(2001,"Ramesh");
	}
	
	
//	@Bean
//	public Invoice rameshInvoice() {
//		
//		return new Invoice(ramesh(),fridge());
//	}
//	
//	@Bean
//	public Invoice rameshSecondInvoice() {
//		
//		return new Invoice(ramesh(),tv());
//	}
	
}
