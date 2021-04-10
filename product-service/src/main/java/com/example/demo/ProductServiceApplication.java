package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.example.demo.config.ApplicationConfig;
import com.example.demo.model.Customer;
import com.example.demo.model.Invoice;
import com.example.demo.model.OrderBook;
import com.example.demo.model.Product;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class ProductServiceApplication {

	@Autowired
	public ApplicationConfig config;
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(ProductServiceApplication.class, args);
	
		
		
	//	Product tv = ctx.getBean(Product.class);
		
		// Use the overloaded getBean Method which takes the id and also the type of Bean
		
//		Product tv = ctx.getBean("fridge",Product.class);
//		
//		log.info(tv.toString());
//		
//		log.info("IoC Container -Reference"+ctx.getClass().getName());
		
		
//		Invoice inv1 = ctx.getBean("inv1",Invoice.class);
//		
//		
//		
//		log.info(inv1.toString());
//	
		
//		Invoice inv2 = ctx.getBean("rameshInvoice",Invoice.class);
//		log.info(inv2.toString());
//		
		
//		Invoice inv2 = ctx.getBean("sureshInvoice",Invoice.class);
//		log.info(inv2.toString());
//		
//		System.out.println("Is Singleton:="+ ctx.isSingleton("sureshInvoice"));
//		System.out.println("Is Prototype:="+ ctx.isPrototype("sureshInvoice"));
//		
		
		OrderBook orderList = ctx.getBean(OrderBook.class);
		
		 orderList.getInvoiceList().forEach(System.out::println);
		 
		
		//ctx.close();
	}
	
	// Create a Factory Method to register Bean 
	
	@Bean()
	public Product tv() {
		
		System.out.println("TV Bean Initialized");
		return new Product(101,"Sony Tv",34000.00);
	}
	
	@Bean
	@Primary
	public Product fridge() {
		System.out.println("Fridge Bean Initialized");

		return new Product(102,"Samsung",24000.00);
	}
	
	@Bean
	public Customer ramesh() {
		
		return new Customer(2001,"Ramesh");
	}
	
	
	@Bean
	public Invoice rameshInvoice() {
		
		return new Invoice(ramesh(),fridge());
	}
	
	@Bean
	public Invoice rameshSecondInvoice() {
		
		return new Invoice(ramesh(),tv());
	}
	
	
	@Bean
	//@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	//@Lazy
	public Invoice sureshInvoice(@Qualifier("magesh") Customer customer,@Qualifier("printer")  Product prod) {
		
		System.out.println("Suresh Bean Initialized");

		return new Invoice(customer,prod);
		
	}
	
//	@Bean
//	public Invoice sureshInvoice() {
//		
//		return new Invoice(config.magesh(),config.laptop());
//		
//	}
}
