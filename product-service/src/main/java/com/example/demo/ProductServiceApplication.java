package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

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
	
		ctx.close();
	}
	
	// Create a Factory Method to register Bean 
	
	@Bean()
	public Product tv() {
		
		return new Product(101,"Sony Tv",34000.00);
	}
	
	@Bean
	public Product fridge() {
		
		return new Product(102,"Samsung",24000.00);
	}
	
}
