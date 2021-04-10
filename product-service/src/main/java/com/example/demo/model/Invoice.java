package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component(value = "inv1")
public class Invoice {

//	public Customer getCustomer() {
//		return customer;
//	}
//	
//	@Autowired
//	public void setCustomer(Customer customer) {
//		this.customer = customer;
//	}
//	public Product getProduct() {
//		return product;
//	}
//	@Autowired
//	public void setProduct(Product product) {
//		this.product = product;
//	}
	
	//@Autowired
	Customer customer;
	
	//@Autowired
	Product product;
	
//	@Autowired
//	public Invoice(Customer customer,@Qualifier("tv") Product product) {
//		super();
//		this.customer = customer;
//		this.product = product;
//	}

	
	
}
